import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Doc on 2/21/16.
 */
public class MyStringUtilsTest {

    @Test
    public void testCombine() throws Exception {
        String[] array = {"Hello", "World"};
        String expected = "Hello); World";
        assertEquals("Not as expected", expected, MyStringUtils.combine(array));
    }

    @Test
    public void testToStringArray() throws Exception {
        String input = "Hello\nWorld\nI\nam\nthe\nbest\ncoder";
        String[] expected = {"Hello","World","I","am","the","best","coder"};
        assertArrayEquals(expected, MyStringUtils.toStringArray(input));
    }

    @Test
    public void testReverseCase() throws Exception {
        String input = "hello World This Is A Test";
        String expected = "HELLO wORLD tHIS iS a tEST";
        assertEquals(expected, MyStringUtils.reverseCase(input));
    }

    @Test
    public void testReverse() throws Exception {
        String input = "my name is francisco alberto castellanos";
        String expected = "ym eman si ocsicnarf otrebla sonalletsac";
        assertEquals(expected, MyStringUtils.reverse(input));
    }

    @Test
    public void testSeparateWords() throws Exception {
        String input = "My name is francisco castellanos";
        String expected = "My\nname\nis\nfrancisco\ncastellanos";
        assertEquals(expected, MyStringUtils.separateWords(input));

    }

    @Test
    public void testPossibleSubStrings() throws Exception {
        String input = "This is a test of my code";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("T");expected.add("Th");expected.add("Thi");expected.add("This");expected.add("This ");expected.add("This i");expected.add("This is");expected.add("This is ");expected.add("This is a");expected.add("This is a ");
        expected.add("This is a t");expected.add("This is a te");expected.add("This is a tes");expected.add("This is a test");expected.add("This is a test "); expected.add("This is a test o");
        expected.add("This is a test of"); expected.add("This is a test of "); expected.add("This is a test of m"); expected.add("This is a test of my"); expected.add("This is a test of my ");
        expected.add("This is a test of my c");expected.add("This is a test of my co");expected.add("This is a test of my cod");expected.add("This is a test of my code");
        assertEquals(expected, MyStringUtils.possibleSubStrings(input));
    }
}