package books;

public class Books {

	/**
	 * Author: Craig Ellis
	 * Email: craigdavidellis@gmail.com
	 */
	
	String title;
	String author;
	
}

class BooksTestDrive {
		public static void main(String[] args) {
			
			Books [] myBooks = new Books[3];
			int x = 0;
			myBooks[0] = new Books();
			myBooks[1] = new Books();
			myBooks[2] = new Books();
			
			myBooks[0].title = "Holes";
			myBooks[1].title = "Insomnia";
			myBooks[2].title = "Java Beans";
			
			myBooks[0].author = "Steve Thompson";
			myBooks[1].author = "Ross Ellis";
			myBooks[2].author = "Joe Bloggs";
			
			while (x < 3) {
				System.out.print(myBooks[x].title);
				System.out.print(" by ");
				System.out.println(myBooks[x].author);
				x = x + 1;
			}
		}
}
