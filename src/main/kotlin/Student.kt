class Student(var name: String, var surname: String) {

    var weight: Double = 75.0

    constructor(name: String, surname: String, weight: Double)
            :this(name,surname){
        this.weight = weight
    }

    fun printStudent(){
        println("Imię: ${name}")
        println("Nazwisko: ${surname}")
        println("Waga: ${weight}")
    }
}
