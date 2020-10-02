fun main(){
    var a:Int = 2
    var b = 5

    val add = a+b
    println("Suma liczb $a i $b wynosi: $add")
    println("${a}+${b}=${a+b}")

    println((1..10).map{a->a*a})
    println((1..10).map{it*it})

    println((1..10).map{it*it}.filter{ it<100 }.map{it*it*it})
}
