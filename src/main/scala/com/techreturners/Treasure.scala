package com.techreturners
class Treasure(treasureBox:List[Int]){
  val treasureBoxGems:List[Int]=treasureBox
  val treasureSize:Int=treasureBox.length
  private val value:Int=treasureValue(treasureBoxGems)
  def  maxHunters:Int=treasureSize
  def  treasureValue:Int=value
  def treasure:List[Int]=treasureBoxGems

  def treasureValue(gems:List[Int]):Int={
    var sum:Int=0
    for (i<-gems){
      sum+=i
    }
    sum
  }
}
