package exe01;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Loan> loans;

    public Student() {
        this.name = "Indefinido";
    }
    public Student(int id, String name) {
        this.setId(id);
        this.setName(name);
        this.loans = new ArrayList<Loan>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Loan> getLoans(){
        return loans;
    }
    public void addLoans(Loan loan) {
        this.loans.add(loan);
    }
    public void removerLoan(Loan loan) {
        this.loans.remove(loan);
    }

    public String toString() {
        return "Student{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", loans='" + this.loans.size() + '\'' +
                '}';
    }
}
