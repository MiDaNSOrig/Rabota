import kotlin.random.Random

// Класс для представления колоды карт
class Deck {
    private val cards = mutableListOf<Card>()
    init {
        val suits = listOf("Hearts", "Diamonds", "Clubs", "Spades")
        val ranks = listOf("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King")
        for (suit in suits) {
            for (rank in ranks) {
                cards.add(Card(rank, suit))
            }
        }
        cards.shuffle()
    }

    fun drawCard(): Card {
        return cards.removeAt(0)
    }
}

// Класс для представления карты
class Card(val rank: String, val suit: String) {
    fun getValue(): Int {
        return when (rank) {
            "Ace" -> 11
            "Jack", "Queen", "King" -> 10
            else -> rank.toInt()
        }
    }
}

// Основная функция игры
fun main() {
    val deck = Deck()
    val playerHand = mutableListOf<Card>()
    val dealerHand = mutableListOf<Card>()

    // Начальная раздача
    playerHand.add(deck.drawCard())
    playerHand.add(deck.drawCard())
    dealerHand.add(deck.drawCard())
    dealerHand.add(deck.drawCard())

    // Игровая логика
    // ... (Введите игровую логику)
}