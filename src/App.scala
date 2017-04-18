/**
  * Created by martin on 18/04/17.
  */
object App {

  def main(args: Array[String]): Unit = {

    val input = (for {n <- 1 to 1; line = Console.readLine()} yield line)
    print("input is " + input.head.toInt)

  }

}
