package eu.descry.dudeutils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DudeUtils {

    private static final List<String> QUOTES = Arrays.asList(
            "Well, sir, it's this rug I had. It really tied the room together",
            "Careful, man, there's a beverage here!",
            "Well, you know, the Dude abides",
            "Obviously, you're not a golfer",
            "Oh, nice marmot"
    );

    /**
     * Returns a random Dude's quote from The Big Lebowski.
     *
     * @return Dude's quote
     */
    public String dudeMe() {
        return QUOTES.get(new Random().nextInt(QUOTES.size()));
    }
}
