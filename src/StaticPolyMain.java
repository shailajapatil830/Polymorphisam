import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class StaticPolyMain {
	
	public static void main(String[] args) {
		
		// This is static polymorphisam or also called method overloading
		StaticPoly staticp = new StaticPoly();
		staticp.print();
		staticp.print("Sunil");
		staticp.print("Shailaja", 75);
		staticp.print("Sakshi", 13);
		
		BookStaticPoly book = new BookStaticPoly();
		book.print();
		book.print("Harry Potter");
		
		String bookName = "Tom gates";
		LocalDate pubDate = LocalDate.of(2017, 11, 10);
		book.print(bookName, pubDate);
		
		book.print("Goast Town", LocalDate.of(2010, 10, 10));
		
		
		
		
		// Create date objects with two different overloaded constructors
		//LocalDate date1 = LocalDate.of(2010, 10, 10);		
		//LocalDate date2 = LocalDate.of(2010, Month.DECEMBER, 10);
	}

}
