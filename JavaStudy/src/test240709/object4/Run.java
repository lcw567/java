package test240709.object4;

import test240709.object4.Book;

public class Run {

	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.setTitle("초보자를 위한 리액트");
		book.setPublisher("정보문화사");
		book.setAuthor("이정열");
		book.setPrice(30000);
		book.setDiscountRate(0.4);
		
		book.inform();

	}

} 	
