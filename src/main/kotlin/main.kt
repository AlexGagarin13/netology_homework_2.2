const val ITEM_PRICE = 10_000.00
const val STANDARD_DISCOUNT = 10_000.00
const val PREMIUM_DISCOUNT = 0.95
const val MELOMAN_DISCOUNT = 0.99
const val DISCOUNT_START = 100_100.00
const val PREMIUM_DISCOUNT_START = 1_000_100.00

fun main() {
    while (true) {
        print("Введите количество композиций к покупке: ")
        val itemCount = readLine()?.toInt() ?: return
        print("Совершали ли вы покупку в прошлом месяце? Введите \"Да\" или \"Нет\": ")
        val melomanQuestion = readLine()
        var melomanChecker = false
        if (melomanQuestion?.lowercase() == "да") melomanChecker = true

        val totalPrice: Double = (ITEM_PRICE * itemCount)
        var result = 0.0
        if (totalPrice < DISCOUNT_START)
            result = totalPrice
        else if (totalPrice > DISCOUNT_START && totalPrice < PREMIUM_DISCOUNT_START)
            result = (totalPrice - STANDARD_DISCOUNT)
        else if (totalPrice > PREMIUM_DISCOUNT_START)
            result = (totalPrice * PREMIUM_DISCOUNT)
        if (melomanChecker)
            result = (result * MELOMAN_DISCOUNT)
        result /= 100
        println("Сумма к оплате: $result руб.")
    }
}