object ScalaIterators {
	
	def main(args:Array[String]) {
		val it = Iterator("a", "number", "of", "words")
		val itNum1 = Iterator(20, 40, 2, 50, 69, 90)
		val itNum2 = Iterator(20, 40, 2, 50, 69, 90)
		val itNum3 = Iterator(20, 40, 2, 50, 69, 90)
		val itNum4 = Iterator(20, 40, 2, 50, 69, 90)

		while(it.hasNext) {
			println(it.next())
		}

		//Can only be traversed once so need two lists
		println("Maximum valued element " + itNum1.max)
		println("Minimum valued element " + itNum2.min)

		//Again can only be traversed once
		println("Value of itNum.size: " + itNum3.size)
		println("Value of itNum.length: " + itNum4.length)
	}

}