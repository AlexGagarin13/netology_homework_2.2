const val ITEM_PRICE = 10_000
const val STANDARD_DISCOUNT = 10_000
const val PREMIUM_DISCOUNT = 0.05
const val MELOMAN_DISCOUNT = 0.01
const val DISCOUNT_START = 100_000
const val PREMIUM_DISCOUNT_START = 1_000_000

fun main() {
    print("Введите количество композиций к покупке: ")
    val itemCount = (readLine()?.toDouble()?.times(100)) ?: return
    print(itemCount)
    print("Совершали ли вы покупку в прошлом месяце? Введите \"Да\" или \"Нет\": ")
    val melomanQuestion = readLine()
    val melomanChecker = false
    if (melomanQuestion == "Да") melomanChecker
    val totalPrice = (ITEM_PRICE * itemCount)
    var result = 0
    if (totalPrice < DISCOUNT_START)
        result = totalPrice
    else if (totalPrice > DISCOUNT_START && totalPrice < PREMIUM_DISCOUNT_START)
        result = totalPrice * STANDARD_DISCOUNT
    else if (totalPrice > PREMIUM_DISCOUNT_START)
        result = (totalPrice * PREMIUM_DISCOUNT)

}