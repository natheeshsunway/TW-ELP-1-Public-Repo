class TwelveDays {

    String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
            "eleventh", "twelfth" };

    String[] verse = { "a Partridge in a Pear Tree.", "two Turtle Doves, ", "three French Hens, ",
            "four Calling Birds, ", "five Gold Rings, ", "six Geese-a-Laying, ", "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ", "nine Ladies Dancing, ", "ten Lords-a-Leaping, ", "eleven Pipers Piping, ",
            "twelve Drummers Drumming, " };

    String verse(int songLine) {
        StringBuilder result = new StringBuilder();
        result.append("On the " + days[songLine - 1] + " day of Christmas my true love gave to me: ");

        for (int index = songLine - 1; index >= 0; index--) {
            if (index == 0 && songLine != 1)
                result.append("and ");
            result.append(verse[index]);
        }
        return result.append("\n").toString();
    }

    String verses(int startLine, int endLine) {

        StringBuilder result = new StringBuilder();
        for (int index = startLine; index <= endLine; index++) {
            result.append(verse(index)).append("\n");
        }
        return result.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}