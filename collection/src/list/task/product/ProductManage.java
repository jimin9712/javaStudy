package list.task.product;

//import java.util.ArrayList;

import list.task.DBConnecter;

public class ProductManage {

	public void add(Product product) {
//		추가
		DBConnecter.products.add(product);
	}

	public Product findProdectById(String productId) {
		// DBConnecter의 products 리스트를 순회
		for (int i = 0; i < DBConnecter.products.size(); i++) {
			// 현재 인덱스의 상품 ID와 조회할 상품의 ID가 같은지 확인
			if (DBConnecter.products.get(i).getProductId().equals(productId)) {
				// 일치하는 상품을 찾으면 해당 상품 반환
				return DBConnecter.products.get(i);
			}
		}
		// 일치하는 상품이 없으면 null 반환
		return null;
	}

		//		삭제
	public void deleteProduct(Product product) {
		DBConnecter.products.remove(product);
	}

	public void updateProduct(Product product) {
		// DBConnecter의 products 리스트를 순회
		for (int i = 0; i < DBConnecter.products.size(); i++) {
			// 현재 인덱스의 상품 ID와 업데이트할 상품의 ID가 같은지 확인
			if (DBConnecter.products.get(i).getProductId().equals(product.getProductId())) {
				// 일치하는 상품을 새로운 상품 정보로 업데이트
				DBConnecter.products.set(i, new Product(product));
				// 업데이트 후 메서드 종료
				return;
			}
		}
	}

//	public ArrayList<Product> listAllProducts() {
//		ArrayList<Product> products = new ArrayList<>();
////		DBC 리스트 돌기
//		for (int i = 0; i < DBConnecter.products.size(); i++) {
////			현재 상품을 새로운 리스트에 추가
//			products.add(new Product(DBConnecter.products.get(i)));
//		}
////		상품 리스트 반환
//		return products;
//	}

}