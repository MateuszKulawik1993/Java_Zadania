package mockito.Calculator;

public class Calculator {
    private final MathService mathService;

    public Calculator(MathService mathService) {
        this.mathService = mathService;
    }
    public int add(int a, int b){
        return mathService.add(a,b);
    }
}