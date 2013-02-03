package add-mkStringWith

object mkStringWithTest extends App {

  val l = List(1,2,3,4)

  println(l.mkStringWith("a" + _.mkString + "b"))

}
