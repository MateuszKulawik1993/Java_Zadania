package Abstrakcje.zadanie3;

public abstract class Job {
    int salary;
    String responsibility;

    public Job(int salary, String responsibility) {
        this.salary = salary;
        this.responsibility = responsibility;
    }
    public abstract void earnMoney();
    public abstract void whatResposibleFor();

}
