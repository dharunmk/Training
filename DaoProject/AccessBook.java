import com.dao.BookDao;
import com.daoimpl.BookDaoImpl;
import com.models.Books;

public class AccessBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDao bd=new BookDaoImpl();
		
		
		for(Books b:bd.getAllBooks()){
			System.out.println("Books name:"+b.getName());
		}
		
		
		
		/*System.out.println(".................");
		Books b=bd.getAllBooks().get(2);
		b.setName("SAHANA");
		bd.saveBook(b);
		for(Books b1:bd.getAllBooks()){
			System.out.println("Books name:"+b1.getName());
		}*/
		
		
		/*System.out.println(".................");
		Books b1=bd.getAllBooks().get(3);
		bd.deleteBook(b1);
		for(Books b2:bd.getAllBooks()){
			System.out.println("Books name:"+b2.getName());
		}
		*/
		
		System.out.println(".................");
		Books b3=bd.getBooksById(11);		
			System.out.println("Book with id=11 is :"+b3.getName());
		
	}

}
