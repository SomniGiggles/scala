object Closures {
	
	def main(args:Array[String]) {
		println("Multiplier(1) value = " + multiplier(1))
		println("Multiplier(2) value = " + multiplier(2))
	}

	var factor = 3
	val multiplier = (i:Int) => i * factor

}