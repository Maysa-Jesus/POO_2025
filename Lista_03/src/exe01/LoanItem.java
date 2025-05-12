package exe01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoanItem {
    private int id, daysLoaned;
    private Book book;
    private Date returnDate;
    private boolean devolvido;

    public LoanItem() {
    }
    public LoanItem(int id, int daysLoaned, Book book, Date returnDate) {
        this.setId(id);
        this.setDaysLoaned(daysLoaned);
        this.setBook(book);
        this.setReturnDate(returnDate);
        this.setDevolvido(false);
    }

    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getDaysLoaned() {
        return daysLoaned;
    }
    public void setDaysLoaned(int daysLoaned) {
        this.daysLoaned = daysLoaned;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public boolean isDevolvido() {
        return devolvido;
    }
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public void devolver() {
        this.devolvido = true;
        System.out.println("\nDevolvido: " + this.id);
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "\nLoanItem{" +
                "id=" + this.id +
                ", daysLoaned=" + this.daysLoaned +
                ", book=" + this.book +
                ", entrega=" + sdf.format(returnDate) +
                ", devolvido=" + this.devolvido +
                '}';
    }
}
