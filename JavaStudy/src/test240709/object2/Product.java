package test240709.object2;

public class Product {
    private String pName;
    private int price;
    private String brand;

    
    public Product() {
    }

    
    public Product(String pName, int price, String brand) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;
    }

  
    public void information() {
        System.out.println("제품명: " + pName);
        System.out.println("가격: " + price);
        System.out.println("브랜드: " + brand);
        System.out.println(); // 정보 출력 후 개행 추가
    }


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


}

   
