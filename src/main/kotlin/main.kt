const val ITEM_PRICE = 100_00.0
const val STANDARD_DISCOUNT = 100_00.0
const val PREMIUM_DISCOUNT = 0.95
const val MELOMAN_DISCOUNT = 0.99
const val DISCOUNT_START = 1001_00.0
const val PREMIUM_DISCOUNT_START = 10_001_00.0

fun main() {
    print("Введите количество композиций к покупке: ")
    val itemCount = readLine()?.toInt() ?: return
    print("Совершали ли вы покупку в прошлом месяце? Введите \"Да\" или \"Нет\": ")
    val melomanQuestion = readLine()
    val melomanChecker = melomanQuestion?.lowercase() == "да"
    val totalPrice: Double = (ITEM_PRICE * itemCount)
    var result = if (totalPrice >= PREMIUM_DISCOUNT_START)
        (totalPrice * PREMIUM_DISCOUNT)
    else if (totalPrice >= DISCOUNT_START && totalPrice < PREMIUM_DISCOUNT_START)
        (totalPrice - STANDARD_DISCOUNT)
    else totalPrice
    if (melomanChecker)
        result *= MELOMAN_DISCOUNT
    result /= 100
    println("Сумма к оплате: $result руб.")
}