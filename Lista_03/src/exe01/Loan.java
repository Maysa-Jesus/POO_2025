package exe01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Loan {
    private int id;
    private Date date;
    private Student student;
    private List<LoanItem> loanItems;

    public Loan() {
        this.date = new Date();
        this.loanItems = new ArrayList<LoanItem>();
    }
    public Loan(int id, Student student) {
        this.setId(id);
        this.date = new Date();
        this.student = student;
        this.loanItems = new ArrayList<LoanItem>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public List<LoanItem> getLoanItems() {
        return loanItems;
    }

    public void addLoanItem(int id, int daysLoaned, Book book, Date returnDate) {
        this.loanItems.add(new LoanItem(id, daysLoaned, book, returnDate));
    }

    public void devolverItem(int idItem) {
        Iterator<LoanItem> iterator = loanItems.iterator();
        while (iterator.hasNext()) {
            LoanItem item = iterator.next();
            if (item.getId() == idItem) {
                System.out.println("Item " + item.getId() + " devolvido.");
                iterator.remove();

                if (loanItems.isEmpty() && student != null) {
                    System.out.println("Empréstimo " + id + " removido do estudante " + student.getName());
                    student.removerLoan(this);
                }
                return;
            }
        }
        System.out.println("Item não encontrado para devolução.");
    }

    public void exibirStatusItem(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        double multaTotal = 0.0;
        boolean atraso = false;
        for(LoanItem obj: this.loanItems){
            if(obj.isDevolvido()){
                continue;
            }

            Date returnDate = obj.getReturnDate();
            if(today.after(returnDate)){
                long diferencaMillis = today.getTime() - returnDate.getTime();
                long diasAtraso = diferencaMillis / (1000 * 60 * 60 * 24);
                double multaDiaria = 2.0f;
                multaTotal += multaDiaria * diasAtraso;
                System.out.println("\nLoan: " + this.id + " ; Item: " + obj.getId() + " ; Devolução: " + sdf.format(returnDate) +
                        " ; Status: Atrasado ; Multa: R$ " + String.format("%.2f", multaTotal) +
                        " ; Student: " + this.student);
                atraso = true;
            }
        }
        if(!atraso){
            System.out.println("\nLoan: " + this.id + " ; Sem atrasos");
        }
    }

    public String toString() {
        return "\nLoan{" +
                "id=" + this.id +
                ", date=" + this.date +
                ", student=" + this.student +
                ", loanItems=" + this.loanItems +
                "}";
    }
}
