fun main(args: Array<String>) {
    //question 1 = What is the color of the planet Mercury?
    var ans1 = "grey"
    //question 2 = What is the color of the planet Mars?
    var ans2 = "red"
    //question 3 = what is the color of the planet Saturn?
    var ans3 = "yellow-brown"
    //question 4 = What is the color of the planet Uranus?
    var ans4 = "grey"
    //question 5 = What is the color of the planet Neptune?
    var ans5 = "blue"

    var correct = 0

    var q1 = print("What is the color of the planet Mercury?: ").toString()
    q1 = readLine()!!
    var result1 = q1.compareTo(ans1, true)
    if(result1 == 0)
        println("$q1, that is the correct answer!")
    else
        println("The correct answer is grey, you entered $q1.")

    var q2 = print("What is the color of the planet Mars?: ").toString()
    q2 = readLine()!!
    var result2 = q2.compareTo(ans2, true)
    if (result2 == 0)
        println("$q2, that is the correct answer!")
    else
        println("The correct answer is red, you entered $q2.")

    var q3 = print("What is the color of the planet Saturn?: ").toString()
    q3 = readLine()!!
    var result3 = q3.compareTo(ans3, true)
    if (result3 == 0)
        println("$q3, that is the correct answer!")
    else
        println("The correct answer is yellow-brown, you entered $q3.")

    var q4 = print("What is the color of the planet Uranus?: ").toString()
    q4 = readLine()!!
    var result4 = q4.compareTo(ans4, true)
    if (result4 == 0)
        println("$q4, that is the correct answer!")
    else
        println("The correct answer is grey, you entered $q4.")

    var q5 = print("What is the color of the planet Neptune?: ").toString()
    q5 = readLine()!!
    var result5 = q5.compareTo(ans5, true)
    if (result5 == 0)
        println("$q5, that is the correct answer!")
    else
        println("The correct answer is blue, you entered $q5.")

    correct += if (result1 == 0)
        1
    else
        0
    correct += if (result2 == 0)
        1
    else
        0
    correct += if (result3 == 0)
        1
    else
        0
    correct += if (result4 == 0)
        1
    else
        0
    correct += if (result5 == 0)
        1
    else
        0


    println("You got $correct questions right!")
}

