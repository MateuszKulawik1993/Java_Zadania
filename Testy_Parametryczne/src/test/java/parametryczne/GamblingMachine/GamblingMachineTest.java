package parametryczne.GamblingMachine;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.nio.channels.GatheringByteChannel;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
class GamblingMachineTest {
  private final GamblingMachine gamblingMachine = new GamblingMachine();

   private Set<Integer>convertToSet(String numbers){
       String[] split = numbers.split(",");
       Set<Integer>result =new HashSet<>();
       for(String number: split){
           result.add(Integer.parseInt(number.trim()));
       }
       return result;
   }
   @ParameterizedTest
    @CsvFileSource(resources ="/numbers.csv", numLinesToSkip = 1)
    void shouldReturnCorrectNumberOfWinsForValidNumbers(String numbers)throws InvalidNumbersException{
       Set<Integer> userNumbers =convertToSet(numbers);
       int result = gamblingMachine.howManyWins(userNumbers);
       assertEquals(result>=0 && result <=6, true, "The result should be between 0 and 6");
   }

   @ParameterizedTest
    @CsvSource({
            "1,2,3,4,5", // less then 6 numbers
            "1,2,3,4,5,6,7", // more then 6 numbers
            "1,2,3,4,5", // number out of range
            "1,2,3,4,5,0", // number out of range

    })
    void shouldThrowExceptionForInvalidNumbers(String numbers){
       Set<Integer> userNumbers = convertToSet(numbers);
       assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
   }
  
}