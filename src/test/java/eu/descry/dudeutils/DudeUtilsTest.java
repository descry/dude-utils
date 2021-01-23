package eu.descry.dudeutils;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.api.RepeatedTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class DudeUtilsTest {

    private static final Logger log = LoggerFactory.getLogger(DudeUtilsTest.class);

    DudeUtils dudeUtils = new DudeUtils();

    @RepeatedTest(3)
    void dudeMe() {
        //given

        //when
        String quote = dudeUtils.dudeMe();

        //then
        assertNotNull(quote);
        assertTrue(isGoodQuote(quote));
    }

    private boolean isGoodQuote(String quote) {
        log.debug(quote);
        return Stream.of("man", "rug", "Dude", "golfer", "marmot").anyMatch(quote::contains);
    }
}
