package Test4;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pd = new Product("갤럭시 s7",563500,3);
		System.out.println(pd.infomation());
		System.out.println("총 구매 가격 : " + (pd.getPrice() * pd.getQuanitity())+"원");
	}

}
