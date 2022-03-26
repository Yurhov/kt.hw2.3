fun main() {
    while (true) {
        print("\nВведите сумму покупки в рублях или \"0\" для выхода: ")
        val amount = readLine()?.toInt() ?: return
        if (amount == 0) break
        print("Введите сумму покупок за предыдущий период: ")
        val preAmount = readLine()?.toInt() ?: return
        val finalPrice = if (preAmount > 10000) amount * 0.95 * 0.99
        else if (amount > 1000 && preAmount > 1000) (amount - 100) * 0.99
        else amount
        val discount = amount - finalPrice.toInt()
        println("К оплате ${finalPrice.toInt()} рублей\nВаша скидка составила $discount рублей")
    }
    println("Удачи!")
}