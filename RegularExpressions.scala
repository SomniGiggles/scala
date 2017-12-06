import scala.util.matching.Regex

object RegularExpressions {

	def main(args:Array[String]) {
		val pattern = "(S|s)cala".r
		val pattern2 = new Regex("(S|s)cala")
		val str = "Scala is scalable and cool"

		println(pattern findFirstIn str)
		println((pattern findAllIn str).mkString(","))
		println(pattern replaceFirstIn(str, "Java"))
	}

}