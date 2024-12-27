package rekrutacyjne;

public class Fibonacci {

    //n1=1, n2=1, n3= n1+ n2
    public static void main(String[] args) {
    Fibo(1);
    Fibo(1);
    Fibo(5);
    Fibo(6);
    
    }

    public static void Fibo(int n){
        long n1=1;
        long n2=1;
        for(int i =3; i<n;i++){
        long temp= n1+n2;
        n1=n2;
        n2=temp;
        }
        System.out.println(n2);
    }

}


