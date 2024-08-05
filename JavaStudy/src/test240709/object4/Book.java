package test240709.object4;
/*
 * title : String
- publisher : String
- author : String
- price : int
- discountRate : double

+ Book()
+ Book(title:String, publisher:String, author:String)
+ Book(title:String, publisher:String, author:String,
price:int, discountRate:double)

실행용 메소드로 기본 생성자와 매개변수 3개인 생성자,
매개변수 5개인 생성자들을 통해 각각의 객체 생성 후
inform()을 통해 출력

 */

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		
	}
	 public Book (String title, String publisher, 
			 String author, int price, double discountRate  ) {
		 this.title = title;
		 this.publisher = publisher;
		 this.author = author;
		 this.price = price;
		 this.discountRate = discountRate;
		 
	 }
	    
	 
	public void inform() {
		System.out.println("제목: " + title);
		System.out.println("출판사: " + publisher);
		System.out.println("작가: " + author);
		System.out.println("가격: " + price);
		System.out.println("할인율" + discountRate);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
	


}



