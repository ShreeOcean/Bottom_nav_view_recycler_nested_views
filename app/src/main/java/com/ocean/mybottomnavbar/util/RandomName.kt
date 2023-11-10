package com.ocean.mybottomnavbar.util

data class RandomDb(val name: String, val randomColor: Int)

class RandomName {

    private val itemNames = listOf(
        "Sword",
        "Shield",
        "Potion",
        "Scroll",
        "Ring",
        "Amulet",
        "Staff",
        // Add more item names as needed
    )

    private val colors = listOf(
        android.graphics.Color.RED,
        android.graphics.Color.GREEN,
        android.graphics.Color.BLUE,
        android.graphics.Color.YELLOW,
        android.graphics.Color.CYAN,
        android.graphics.Color.MAGENTA
        // Add more colors as needed
    )

    fun generateRandomData(): RandomDb {
        val randomName = itemNames.random()
        val randomColor = colors.random()
        return RandomDb(randomName, randomColor)
    }

}
/*
fun main() {
    val randomItemName = generateRandomItemName()
    println("Random Item Name: $randomItemName")
}*/
fun main() {
    val randomWordGenerator = RandomName()
    val randomItemName = randomWordGenerator.generateRandomData()
    println("Random Item Name: $randomItemName")
}
