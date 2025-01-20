import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {

    @Test
    public void testLAppearsThreeTimesInHelloWorld(){
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello world");

        //Act
        int actualCount = counter.getFrequency('l');

        //Assert
        assertEquals(3, actualCount);
    }

    @Test
    public void testUpperAndLowerCase(){
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("AadbaA");

        int actualCount = counter.getFrequency('A');

        assertEquals(4, actualCount);

    }

    @Test
    public void testPercentZeroForNonOccurringChar(){
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");

        double actualPercent = counter.getRelativePercentage('z');

        assertEquals(0.0, actualPercent, 0.0001);
    }
    
}