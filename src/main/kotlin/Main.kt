fun main(args: Array<String>) {
    val amount = 20000 //сумма покупки
    val regular = true // признак постоянного покупателя
    val regularSale = 0.01 // размер скидки для регуляров
    val maxSale = 0.05 // размер скидки при покупке больше 10 000
    val sale = if (amount <= 1000) 0.0 else if (1000 < amount && amount <= 10_000) 100.0 else (amount * maxSale)
    val result = if (regular) (amount - sale) * (1 - regularSale) else (amount - sale) // (1 - regularSale) - для корректного расчета вычета 1 %
    println("Покупка - $amount")
    println("После применения скидки - $result")
}