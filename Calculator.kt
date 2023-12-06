package com.example.myapplication

fun main() {
    println("숫자와 연산기호, 숫자를 순서대로 입력하세요.")
    Calculator().Operation()

}

class Calculator() {

    var num1 = readLine()!!.toInt()
    var operator = readLine()!!.toString()
    var num2 = readLine()!!.toInt()

    val addOperation = AddOperation()
    val result = addOperation.operate(num1, num2)

    val subtractOperation = SubtractOperation()
    val resultt = subtractOperation.operate(num1, num2)

    val multiplyOperation = MultiplyOperation()
    val resulttt = multiplyOperation.operate(num1, num2)

    val divideOperation = DivideOperation()
    val resultttt = divideOperation.operate(num1, num2)




    fun Operation() {
        val result = when (operator) {
            "+" -> { println("$num1 + $num2 결과는 : $result")
                num1 + num2
            }

            "-" ->  { println("$num1 - $num2 결과는 : $resultt")
                num1 - num2
            }

            "*" -> { println("$num1 * $num2 결과는 : $resulttt")
                num1 * num2
            }
            "/" -> { println("$num1 / $num2 결과는 : $resultttt")
                num1 / num2
            }
            "%" -> num1 % num2
            else -> {
                println("잘못 입력 하셨습니다.")
                return
            }
        }
        println(result)
    }

}