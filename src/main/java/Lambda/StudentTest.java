package Lambda;

public class StudentTest {
    public static void main(String[] args) {
        Student it = new ItStudent();
            sayHello("John", it,22);

        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is:" + name);

            }
        };
        sayHello("Matt", med,25);

        Student noStudent =(name, age)-> System.out.println("I will be a doctor, My name is:" + name+ "I am"+ age);
        sayHello("Tom", noStudent,31);
    }

    public static void sayHello(String name, Student student, int age) {
       student.sayHello(name, age);
    }

}