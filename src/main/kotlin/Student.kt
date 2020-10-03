class Student {
    var name: String = ""
    var surname: String = ""

    constructor(name: String, surname: String){
        this.name = name;
        this.surname = surname;
    }

    fun printStudent(){
        print("Imię: ${name} Nazwisko: ${surname}")
    }
}
