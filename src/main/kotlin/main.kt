fun main(){
    var a : Double = 2.0
    var b = 5.0

    b = 1.toDouble()

    val const1 = 5.233434234
    //const1 = 23433.0
    //a+b = 10

    val add = add(a,b)
    val sub = a-b

    println("Suma liczb "+a+" i "+b+" wynosi "+add)
    println("Suma liczb ${a} i ${b} wynosi ${add}")
    println("${a}+${b}=${add}")
    println("${a}-${b}=${sub}")
    //2+5=10

    var array = mutableListOf(1,2,3,4,5,6,7,8,9,10)

    println(array.map{a->a*a}.filter{it%2==0})
    println(array.map{2*it})

    var array1 = (1..10).map{it*it}

    val student = Student("Przemysław","Stokłosa")
    student.weight = 72.0
    student.printStudent()

    val student1 = Student("Przemysław","Stokłosa",73.0)
    student1.printStudent()
}

fun add(a: Double, b: Double):Double{
    return a+b;
}
