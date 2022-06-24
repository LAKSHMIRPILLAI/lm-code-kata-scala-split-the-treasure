package com.techreturners

import scala.collection.mutable. ListBuffer
class SplitTreasure(){

   def possibleHunters(treasure:Treasure):Unit={
      //val maxHunterCrew:Int=treasure.maxHunters
      val treasureWorth:Int=treasure.treasureValue
      var sortedGems: List[Int] = treasure.treasure.sorted(Ordering[Int].reverse)
      val huntersPossibleValues:List[Int]=allTreasureHunterCombos(treasure)
      val soloValue:ListBuffer[List[Int]]=new ListBuffer[List[Int]]()
      val groupValue:ListBuffer[Int]=new ListBuffer[Int]()
      println(sortedGems)

      for(i<-huntersPossibleValues){
         if(treasureWorth %i==0){
            val maxSplit:Int=treasureWorth/i
            println("Hunters"+" " +i+" "+ maxSplit)
          for (k<-1 to i) {
             val arrayGem:Array[sortedGems]
             for (gem<-sortedGems){
               var sum:Int=0
                if(sum!=maxSplit && sum<=maxSplit){
                  sum+=gem
                  groupValue+=gem
               }
             }
            soloValue+=groupValue.toList
          }
           println(soloValue)
           soloValue
         }
      }
   }




   def allTreasureHunterCombos(treasure: Treasure):List[Int]={
      val maxHunterCrew:Int=treasure.maxHunters
      val treasureWorth:Int=treasure. treasureValue
      val hunterNumbers:ListBuffer[Int]=new ListBuffer[Int]()
         for(i<-1 to maxHunterCrew){
            if(treasureWorth %i==0){
               hunterNumbers+=i
            }
         }
      //println(hunterNumbers.toList)
      hunterNumbers.toList
   }

}
