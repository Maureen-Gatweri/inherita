fun main() {
oddNumbers()


    serveDrinks(6)

product(50)
    product(101)

    println(myNAme(arrayOf("Maureen","Ivy", "Rehema", "Gatweri")))



}
fun oddNumbers() {
    for (num1 in 1 ..100) {
        if (num1 % 2 != 0) {
            println(num1)
        }

    }

}
fun serveDrinks(age:Int){
    if (age<=6){
        println("Serve Milk")
    }
    else if (age <= 15 && age>6){
        println(" Serve Fanta Orange")
    }
    else
        println("Serve Cocacola")
}
fun product(num:Int){
    for (num in 1..100){
        when{
            (num%3==0 && num%5 ==0)->
                println("FizzBuzz")
                (num %3 ==0)->
            println("Fizz")
                (num % 5==0)->
            println("Buzz")
            else->
                ( println(num))
        }
    }

}
fun myNAme (name: Array <String>):Int{
    return name.count {it.length>5}
}