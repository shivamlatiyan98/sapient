package anagramchecker;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    private Application app;
    
    @Before
    public void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testWordCountString() {
         boolean ans = app.isAnagram("silent","lisent");
        assertTrue(ans == true);
    }

    @Test
    public void testWordCountString1() {
         boolean ans = app.isAnagram("shivam","hsivam");
        assertTrue(ans == true);
    }
    
    @Test
    public void testWordCountString2() {
         boolean ans = app.isAnagram("ans","sna");
        assertTrue(ans == true);
    }
    
    @Test
    public void testWordCountString3() {
         boolean ans = app.isAnagram("dna","and");
        assertTrue(ans == true);
    }
    
}

