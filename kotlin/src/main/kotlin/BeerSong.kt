class BeerSong {

    companion object {

        fun verse(bottleCount: Int): String {
            when (bottleCount) {
                0 -> return "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
                1 -> return "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
                2 -> return "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n"
                else -> return "$bottleCount bottles of beer on the wall, $bottleCount bottles of beer.\nTake one down and pass it around, ${bottleCount-1} bottles of beer on the wall.\n"
            }
        }

        fun verses(to: Int, from: Int): String {
            return (from..to)
                    .reversed()
                    .map({ verse(it) })
                    .joinToString("\n")
        }

    }


}