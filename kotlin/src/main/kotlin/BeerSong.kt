class BeerSong {

    companion object {

        fun verse(bottleCount: Int): String {
            return "$bottleCount bottles of beer on the wall, " +
                    "$bottleCount bottles of beer.\n" +
                    "Take one down and pass it around, " +
                    "${bottleCount-1} bottle${if (bottleCount>2) "s" else ""} " +
                    "of beer on the wall.\n"
        }

    }


}