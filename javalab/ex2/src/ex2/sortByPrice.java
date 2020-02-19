package ex2;

import java.util.Comparator;

public class sortByPrice implements Comparator<bookInfo> {
	
	public int compare(bookInfo a, bookInfo b) {
        return a.price - b.price;
    }
	
}
