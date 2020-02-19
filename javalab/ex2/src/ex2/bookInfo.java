package ex2;

public class bookInfo {

	String title, author, publisher;
    int price;

    bookInfo(String t, String aut, String pub, int pr) {
        title = t;
        author = aut;
        publisher = pub;
        price = pr;
    }

    int getPrice() {
        return price;
    }

    public String toString() {
        return "Title: " + title + "\n Author: " + author + "\n" + " Publisher: " + publisher + "\n"
                + "Price: " + price;
    }	
	
	
	
}
