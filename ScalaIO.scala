import java.io._

object ScalaIO {
	def main(args:Array[String]) {
		val writer = new PrintWriter(new File("testingOutput.txt"))

		writer.write("Hello Scala")
		writer.close()
	}
}
