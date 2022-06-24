package com.techreturners

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AppTest extends AnyFlatSpec with Matchers{
"A treasure box "should "have 3 gems and  total value 12 when provided with a value of [4,4,4]" in {
  val newTreasure=new Treasure(List(4,4,4))
  assert (newTreasure.treasureBoxGems==List(4,4,4))
  assert (newTreasure.treasureSize==3)
  assert (newTreasure.treasureValue==12)
}

  "A treasure box "should "have 3 gems and 3 possible hunters with 4 each when provided with a value of [4,4,4]" in {
    val splitTreasure=new SplitTreasure()
    val newTreasure=new Treasure(List(4,4,4))
    assert (newTreasure.treasureBoxGems==List(4,4,4))
    assert (newTreasure.treasureSize==3)
    assert (newTreasure.treasureValue==12)
    assert(splitTreasure.allTreasureHunterCombos(newTreasure)==List(1,2,3))
    assert(splitTreasure.possibleHunters(newTreasure)==List(4,4,4))
  }
  "A treasure box "should "have 3 gems and 3 possible hunters with 4 each when provided with a value of [3,3,3,3,2,2,2,2,2,2,2,2]" in {
    val splitTreasure=new SplitTreasure()
    val newTreasure=new Treasure(List(3,3,3,3,2,2,2,2,2,2,2,2))
    assert (newTreasure.treasureBoxGems==List(3,3,3,3,2,2,2,2,2,2,2,2))
    assert (newTreasure.treasureSize==12)
    assert (newTreasure.treasureValue==28)
    assert(splitTreasure.allTreasureHunterCombos(newTreasure)==List(1,2,4,7))
    splitTreasure.possibleHunters(newTreasure)
  }



}
