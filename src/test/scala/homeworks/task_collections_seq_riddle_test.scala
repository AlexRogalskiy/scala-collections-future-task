package homeworks

import homeworks.task_collections_seq_riddle.{funSeq, nextLine}
import org.scalatest.flatspec.AnyFlatSpec


class task_collections_seq_riddle_test extends AnyFlatSpec {

  "nextLine" should "produce next line" in {
    assert(nextLine(List(1, 2, 1, 1)) === List(1, 1, 1, 2, 2, 1))
    assert(nextLine(List(1, 1, 1, 2, 2, 1)) === List(3, 1, 2, 2, 1, 1))
    assert(nextLine(List(3, 1, 2, 2, 1, 1)) === List(1, 3, 1, 1, 2, 2, 2, 1))
  }

  "funSeq" should "produce next line" in {
    assert(funSeq(5) === List(3, 1, 2, 2, 1, 1))
  }

}

