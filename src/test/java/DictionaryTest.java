import org.junit.*;
import static org.junit.Assert.*;

public class DictionaryTest {
  
  Dictionary testDictionary;

  @Before
  public void setUp() {
    testDictionary = new Dictionary();
  }

  @Test
  public void getRandomWord_returnsAWord() {
    assertTrue(testDictionary.getRandomWord(1) instanceof java.lang.String);
  }
}
