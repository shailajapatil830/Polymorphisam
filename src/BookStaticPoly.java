import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class BookStaticPoly {
	
	public void print() {
		System.out.println("My favourite book ");
	}
    public void print(String name) {
    	System.out.println("My favourite book is " + name);
    }
    
    public void print(String name, LocalDate publicationDate) {
    	System.out.println("My favourite book is " + name);
    	System.out.println("Publication date : " + publicationDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}
