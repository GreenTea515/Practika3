import java.util.function.ToDoubleFunction

fun main(args: Array<String>)
{
    //#1
    val user: Int = 18;
    val exercies = 13
    var exerciesSolved = 0
    exerciesSolved += 1
    println(user)
    //#2
    val people: Double = 18.0;
    val man: Double = 30.0
    exerciesSolved += 1
    println((user + man) / 2)
    //#3
    val testNumber: Int = 10;
    val evenOdd = testNumber / 2;
    exerciesSolved += 1
    println(evenOdd)
    //#4
    val answer: Int = 0;
    val total = (answer + 1 + 10) * 10;
    exerciesSolved += 1
    println(total shl 3);
    //#5
    var age = 16
    print(age)
    age = 30
    print(age)
    exerciesSolved += 1
    //#6
    val a: Int = 46;
    val b: Int = 10;
    exerciesSolved += 1
    //1
    val answer1: Int = (a * 100) + b
    println(answer1)
    //2
    val answer2: Int = (a * 100) + (b * 100)
    println(answer2)
    //3
    val answer3: Int = (a * 100) + (b / 100)
    println(answer3)
    //#7
    println(5 + 3 - (4 / (2 * 2)))
    exerciesSolved += 1
    //#8
    val a1: Double = 5.0
    val b1: Double = 10.0
    val average = ((a1 + b1) / 2)
    exerciesSolved += 1
    println(average)
    //#9
    println("Введите температуру в F")
    val name = readln()
    val fahrenheit: Double = name.toDouble();
    val celcius = ((fahrenheit - 32) / 1.8)
    exerciesSolved += 1
    println(celcius)
    println(exerciesSolved)
}