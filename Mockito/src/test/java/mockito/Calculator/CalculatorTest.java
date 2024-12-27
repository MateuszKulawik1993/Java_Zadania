package mockito.Calculator;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void additionalInteraction() {

        MathService mathServiceMock = Mockito.mock(MathService.class);

        Calculator calculator =new Calculator(mathServiceMock);
        calculator.add(2,3);
        Mockito.verify(mathServiceMock).add(2,3);



}

}