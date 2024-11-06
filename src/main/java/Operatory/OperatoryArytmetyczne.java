package Operatory;

public class OperatoryArytmetyczne {
    public static void main(String[] args) {
        //ang. arithmetic operators

        System.out.println(3+5);
        System.out.println(5-3);
        System.out.println(2*4);
        System.out.println(4/2);
        System.out.println(10%2);

        int a = 10;
        int b= 2;

        int dodawanie = a+b;
        System.out.println("Dodwanie:"+ dodawanie);

        int odejmowanie = a-b;
        System.out.println("Odejmowanie:"+ odejmowanie);

        int mnozenie = a*b;
        System.out.println("Mnozenie:"+ mnozenie);

        int dzielenie = a/b;
        System.out.println("Dzielenie:"+ dzielenie);

        int resztaZDzielenia = a%b;
        System.out.println("resztaZDzielenia:"+ resztaZDzielenia);

        a+=b;//inaczej: a = a + b;
        System.out.println("a = a + b:"+ a);

        a-=b;//inaczej: a = a - b;
        System.out.println("a = a - b:"+ a);

        a*=b;//inaczej: a = a * b;
        System.out.println("a = a * b:"+ a);

        a/=b;//inaczej: a = a / b;
        System.out.println("a = a / b:"+ a);

        a%=b;//inaczej: a = a % b;
        System.out.println("a = a % b:"+ a);

        System.out.println("a:" +a +" b:"+ b);
        b-=b;//inaczej: b = b-a;
        System.out.println("b = b-a:"+ b);

        a = a+1;
        System.out.println("a = a +1" + a);
        a +=1;
        System.out.println("a +=1" + a);

        //inkrementacja
        a++;
        System.out.println("a++:"+a);

        //dekrementacja
        a--;
        System.out.println("a--:"+a);

        ++a;
        System.out.println("++a:"+a);
        --a;
        System.out.println("--a:"+a);




    }
}
