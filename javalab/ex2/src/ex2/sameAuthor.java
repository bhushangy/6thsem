package ex2;

import java.util.Comparator;

public class sameAuthor implements Comparator<bookInfo> {
	public int compare(bookInfo a, bookInfo b) {
        int res = a.author.compareTo(b.author);
        if(res == 1) {
        	mainClass.sameAuthorBooks.add(a);
        	mainClass.sameAuthorBooks.add(b);
        }
        return res;
    }
}
