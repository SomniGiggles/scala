object PatternMatching {

	def main(args: Array[String]) {
		println(matchTest(1))
		println(matchTest(3))
		println(matchTest(2))
		println(matchTest(1))


		val alice = new Person("Alice", 25)
		val bob = new Person("Bob", 32)
		val charlie = new Person("Charlie", 32)

		for(person <- List(alice, bob, charlie)) {
			person match {
				case Person("Alice", 25) => println("Hi Alice!")
				case Person("Bob", 32) => println("Hi Bob!")
				case Person(name, age) => println("Age: " + age + " year, name: " + name + "?")
			}
		}
	}

	case class Person(name: String, age: Int)

	def matchTest(x: Int): String = x match {
		case 1 => "one"
		case 2 => "two"
		case _ => "many"
	}

}