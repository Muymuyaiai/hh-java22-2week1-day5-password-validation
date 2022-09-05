import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PassValidTest {
    @Test
      void lengthTrue (){
      String s = "This is a long text";
      boolean actual = PassValid.passLength(s);
      assertTrue(actual);
    }

    @Test
    void lengthFalse (){
        String s = "short";
        boolean actual = !PassValid.passLength(s);
        assertTrue(actual);
    }

    @Test
    void containsDigitsTrue (){
        String s = "13 is a number";
        boolean actual = PassValid.containsDigits(s);
        assertTrue(actual);
    }

    @Test
    void containsDigitsFalse (){
        String s = "thirteen not";
        boolean actual = !PassValid.containsDigits(s);
        assertTrue(actual);
    }

    @Test
    void containsUpperTrue (){
        String s = "UP, up hurrayyy";
        boolean actual = PassValid.containsUpper(s);
        assertTrue(actual);
    }

    @Test
    void containsUpperFalse (){
        String s = "sooo low";
        boolean actual = !PassValid.containsUpper(s);
        assertTrue(actual);
    }

    @Test
    void containsLowerTrue (){
        String s = "Low, low hurrayy";
        boolean actual = PassValid.containsLower(s);
        assertTrue(actual);
    }

    @Test
    void containsLowerFalse (){
        String s = "NOOO LOW";
        boolean actual = !PassValid.containsLower(s);
        assertTrue(actual);
    }

    @Test
    void containsForbiddenWordTrue (){
        String s = "It's so qwerty";
        boolean actual = PassValid.containsForbiddenWord(s);
        assertTrue(actual);
    }

    @Test
    void containsForbiddenWordFalse (){
        String s = "oihj4234ja";
        boolean actual = !PassValid.containsForbiddenWord(s);
        assertTrue(actual);
    }
}

