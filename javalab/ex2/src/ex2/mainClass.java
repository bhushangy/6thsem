package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class mainClass {
	static ArrayList<bookInfo> sameAuthorBooks= new ArrayList<bookInfo>();
	public static void main(String args[]) {
		
		ArrayList<bookInfo> bookList= new ArrayList<bookInfo>();
		ArrayList<bookInfo> bookListSorted= new ArrayList<bookInfo>();
		 
		HashMap<Integer,bookInfo> bookData = new HashMap<Integer,bookInfo>();
		bookInfo b1 = new bookInfo("ced", "wer", "lmn", 12345);
		bookInfo b2 = new bookInfo("qqq", "xyz", "mmm", 22222);
		bookInfo b3 = new bookInfo("abc", "xyz", "pqr", 123);
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		bookData.put(1,b1);
		bookData.put(2,b2);
		bookData.put(3,b3);
		
		//Sorting based on price 
		
//		Collections.sort(bookList,new sortByPrice());
//		
//		for(bookInfo b : bookList) {
//			System.out.println(b);
//			bookListSorted.add(b);
//		}
		
		
		// list books with same author name
		
		Collections.sort(bookList,new sameAuthor());
		for(bookInfo b : sameAuthorBooks) {
			System.out.println(b);
			
		}
		
	}

}
