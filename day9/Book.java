package days200;

public class Book {
	
	public Book() {
		System.out.println("book");
	}

	class page{
		public page() {
			System.out.println("page of book");
		}
	}
	
	public static void main(String[] args) {
		
		Book b=new Book();
		Book.page p=b.new page();
		
	}

}
