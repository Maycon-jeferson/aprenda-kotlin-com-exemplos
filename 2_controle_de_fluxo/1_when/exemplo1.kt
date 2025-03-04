/**
 * When Statement.
 *
 * @see [When](https://play.kotlinlang.org/byExample/02_control_flow/01_When)
 */
// a fun cria condicoes para o whem
fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}
//ira verificar as condicoes dos prametros apresentados
fun cases(obj: Any) {                                
    when (obj) {                                     // 1 
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6 o else seria o defout em outras liguagens, nao sendo obrigatorio
    }   
}

class MyClass
