object PatternMatchingWithExtractors {

	/*
	 * When an instance of a class is followed by parentheses with a list of zero or more parameters, 
	 * the complier invokes the apply method on that instance.
	 *
	 * When comparing an extractor object using the match statement the unapply method will be
	 * automatically executed.
	 */

	def main(args:Array[String]) {
		val x = Test(5)

		//Apply is invoked... the value 10 is returned
		println(x)

		x match {
			case Test(num) => println(x + " is bigger two times than " + num)
			//Unapply is invoked
			case _ => println("I cannot calculate")
		}
	}

	def apply(x:Int) = x * 2
	def unapply(z:Int):Option[Int] = if(z % 2 == 0) Some(z / 2) else None

}