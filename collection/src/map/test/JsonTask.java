package map.test;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonTask {
	public static void main(String[] args) {
//      상품 클래스 선언
//      상품 번호, 상품 이름, 상품 가격, 상품 재고, 4개의 필드로 구성되어 있다.

//      1. 상품 1개를 직접 선언(제작)하여 JSON 형식으로 변경
		Product product = new Product(1, "안경", 158500, 4);

//      ##################################################
//      메소드로 편하게 사용하기
//      JSONObject productJSON = product.toJSONObject();
//      System.out.println(product.toJSONString());
//      ##################################################

		JSONObject productJSON = new JSONObject(product);
		String json = productJSON.toString();
//      
		System.out.println(json.toString());

//      2. JSON 형식의 상품 정보 중 상품 재고 출력
		try {
//         전달한 key 값이 JSON에 없으면 오류가 나기 때문에
//         try ~ catch 문을 사용해서 오류를 피할 수 있게 강제한다.
			System.out.println(productJSON.get("stock"));
		} catch (JSONException e) {
			System.out.println("존재하지 않는 KEY입니다.");
		}

//      3. 기존 상품 클래스는 변경하지 않고,  
//         전달받은 JSON에 할인율 추가한 뒤 JSON 형식으로 출력
		try {
			productJSON.put("discount", 50);
			System.out.println(productJSON.toString());
		} catch (JSONException e) {
			System.out.println("무언가 잘못됨");
		}
	}
}
