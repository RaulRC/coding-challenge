/* 
 * @project coding-challenge
 * @author raul.reguillo on 2/9/21
 */

object Lab001 extends App{

  val text = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm " +
    "jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj."


  def translate(item: Char): Char = {
    if (item == 'z')
      'b'
    else if (item == 'y')
      'a'
    else if (Set('.', '(', ')', ' ', '\'').contains(item))
      item
    else
      (item + 2).toChar
  }

  println(
    text.map(x => translate(x))
  )

  val url = "map"

  println(
    "pythonchallenge.com/pc/def/" +
    url.map(x => translate(x)) +
    ".html"

  )

}
