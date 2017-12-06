object ScalaTuples {
	
	def main(args:Array[String]) {
		val t = (4, 3, 2, 1)

		/* 
		 * To access elements of a tuple t, you can use method t._1 to access first element, 
		 * t._2 to access second, etc
		 */
		val sum = t._1 + t._2 + t._3 + t._4

		println("Sum of elements: " + sum)
	}

}