/* 
 * @project coding-challenge
 * @author raul.reguillo on 2/10/21
 */

import scala.io.Source

object Lab003 extends App{

  val URL = "http://www.pythonchallenge.com/pc/def/"
  val HTML = ".html"

  val pattern = "[^A-Z]+[A-Z]{3}([a-z])[A-Z]{3}[^A-Z]+".r

  println(
    URL +
      pattern.findAllIn(
        Source.fromFile("resources/lab003.txt").getLines().reduce(_ + _)
      ).matchData.map(m => m.group(1)).reduce(_+_) +
    HTML
  )

}
