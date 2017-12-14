import java.io._
import scala.io.StdIn

object ScalaIO {
	def main(args:Array[String]) {
		val writer = new PrintWriter(new File("testingOutput.txt"))

		writer.write("Hello Scala")
		writer.close()

		print("Please enter your input: ")
		val line = StdIn.readLine
		println("Thanks, you just typed: " + line)
	}
}
