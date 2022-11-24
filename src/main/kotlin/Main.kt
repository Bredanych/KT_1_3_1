fun main() {
    val time: Int = 26000


    println(agoToText(time))
}

fun agoToText(time: Int): String {

    return when {
        (time in 1..60) ->  "Только что"
        (time in 61..60 * 60) ->  minuteText(time)
        (time in 60 * 60 + 1..60 * 60 * 24) ->  hourText(time)
        (time in 60 * 60 * 24 + 1..60 * 60 * 24 * 2) ->  "Вчера"
        (time in 60 * 60 * 24 * 2 + 1..60 * 60 * 24 * 3) ->  "Позавчера"
        (time > 60 * 60 * 24 * 3 + 1) ->  "Давно"
        else -> " Не было вобще"

    }

}

fun minuteText(time: Int): String {

    return when {
        time % 60 % 10 == 1 && time % 60 != 11 -> (time/60).toString()+" Минуту назад"
        else -> (time/60).toString()+" Минут назад"
    }

}

fun hourText(time: Int): String {

    return when {
        time % (60*60) % 10 == 1 && time % (60*60) != 11 -> (time/60).toString()+" Час назад"
        else -> (time/(60*60)).toString()+" Часов назад"
    }

}