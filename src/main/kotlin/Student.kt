class Student {
    var name = ""
    var surname = ""
    constructor(name: String, surname: String){
        this.name = name
        this.surname = surname
    }
    fun printStudent(){
        println("Imię: ${name}");
        println("Nazwisko: ${surname}")
    }
}
