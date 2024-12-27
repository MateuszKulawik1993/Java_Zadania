package Lambda;

public class ItStudent implements Student{
    @Override
    public void sayHello(String name, int age) {
        System.out.println("I am It guy");
        System.out.println("My name is:" + name);
    }



}
