package InstrukcjeWarunkowe.If.zadania;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 7.0;
        double wynik=0;
        char znak = '-';

        switch(znak){
            case'+':
                wynik = a + b;
                break;
            case'-':
                wynik = a - b;
                break;
            case'*':
                wynik = a * b;
                break;
            case'/':
                wynik = a / b;
                break;
            default:
                System.out.println("bład");
        }
        System.out.println("Wynik:"+ a + znak + b + " = "+" "+ wynik);

    }
}
