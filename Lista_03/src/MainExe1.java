import exe01.Book;
import exe01.Loan;
import exe01.LoanItem;
import exe01.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainExe1 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Book book1 = new Book(1, "Sun Tzu", "A Arte da Guerra");
        Book book2 = new Book(2, "Neil Gaiman", "Mitologia Nórdica");
        Book book3 = new Book(3, "Neil Gaiman", "Mitologia Nórdica");
        Book book4 = new Book(4, "Neil Gaiman", "Mitologia Nórdica");
        //LoanItem li1 = new LoanItem(11, 5, book1);
        //LoanItem li2 = new LoanItem(12, 10, book2);
        //System.out.println(li1.toString());
        //System.out.println(li2.toString());

        Student student1 = new Student(11, "João Paulo");
        Student student2 = new Student(12, "Hugo Sanches");

        Loan loan1 = new Loan(111, student1);
        loan1.addLoanItem(11, 5, book1, sdf.parse("22/03/2025"));
        loan1.addLoanItem(12, 10, book2, sdf.parse("30/03/2025"));
        student1.addLoans(loan1);
        System.out.println(loan1.toString());
        loan1.devolverItem(12);
        loan1.exibirStatusItem();
        System.out.println(loan1.toString());

        Loan loan2 = new Loan(112, student2);
        loan2.addLoanItem(14, 25, book3, sdf.parse("28/03/2025"));
        student2.addLoans(loan2);
        System.out.println(loan2.toString());
        loan2.exibirStatusItem();

        Loan loan3 = new Loan(113, student2);
        loan3.addLoanItem(15, 8, book4, sdf.parse("03/04/2025"));
        student2.addLoans(loan3);
        System.out.println(loan3.toString());
        loan2.devolverItem(14);
        loan2.exibirStatusItem();
        loan3.exibirStatusItem();
        System.out.println(loan2.toString());
        System.out.println(loan3.toString());


    }
}
