/* 
 * @project coding-challenge
 * @author raul.reguillo on 2/10/21
 */

import scala.io.Source

object Lab002 extends App{

  val URL = "http://www.pythonchallenge.com/pc/def/"
  val HTML = ".html"

  val toRemove = "()!&@[]{}*#_^$+<>-%".toSet

  println(
    URL +
    Source.fromFile("resources/lab002.txt").getLines()
      .map(x => x.filterNot(toRemove))
      .reduce(_ + _) +
    HTML
  )

}
