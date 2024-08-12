package test240709.object2;

public class Run {

    public static void main(String[] args) {
        // Product 객체 생성
        Product product = new Product();

        // 필드 값 설정
        product.setpName("아쿠아제로");
        product.setPrice(2000);
        product.setBrand("롯데");

        // 정보 출력
        product.information();
    }

}
