package Abstrakcje.zadanie3;

public class Doctor extends Job {
    public Doctor(int salary, String responsibility) {
        super(salary, responsibility);
    }

    @Override
    public void whatResposibleFor() {
        System.out.println("I am resposible for"+ responsibility);
    }

    @Override
    public void earnMoney() {
        System.out.println("I earn"+salary);
    }
}
