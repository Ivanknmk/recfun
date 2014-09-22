package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def loop(c: Int, r: Int): Int =
      if (r == 0 || c == 0 || r == c) 1
      else loop(c-1, r-1) + loop(c, r-1)
    loop(c,r)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(flag: Int, chars: List[Char]): Boolean =
      if (flag < 0 ) false
      else if (chars.isEmpty) flag == 0
      else if ( '('.equals(chars.head) ) loop(flag+1, chars.tail)
      else if ( ')'.equals(chars.head) ) loop(flag-1, chars.tail)
      else loop(flag, chars.tail)
    loop(0,chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    
  }
}
