import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Author name: ");
		String authorName = scan.nextLine();
		System.out.print("Input Author email: ");
		String authorEmail = scan.nextLine();
		Author author1 = new Author (authorName,authorEmail);
		System.out.println(author1);
		System.out.println();
		
		System.out.print("Input book titile : ");
		String bookTitile = scan.nextLine();
		System.out.print("Input book page : ");
		int bookPage = scan.nextInt();
		book book1 =new book(bookTitile,author1,bookPage);
		System.out.println(book1);
		
		
	}

}
