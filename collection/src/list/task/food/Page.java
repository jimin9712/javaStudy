package list.task.food;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
//      음식 추가
		Food 짜장면 = new Food("짜장면", 9000, "중식");
		Food 불고기 = new Food("불고기", 9900, "한식");
		Food 돈까스 = new Food("돈까스", 11000, "양식");
		Food 마늘빵 = new Food("마늘빵", 4500, "양식");

		Restaurant restaurant = new Restaurant();
		ArrayList<Food> foods = null;

		if (restaurant.checkFoodName("짜장면") == null) {
			restaurant.add(짜장면);
		}
		if (restaurant.checkFoodName("불고기") == null) {
			restaurant.add(불고기);
		}
		if (restaurant.checkFoodName("돈까스") == null) {
			restaurant.add(돈까스);
		}
		if (restaurant.checkFoodName("마늘빵") == null) {
			restaurant.add(마늘빵);
		}

		System.out.println(DBConnecter.foods);

		System.out.println(restaurant.checkFoodName("마늘빵").getKind());

		foods = restaurant.selectAll();

//      foods.get(0).setName("짬뽕");
//      System.out.println(foods);
//      System.out.println(DBConnecter.foods);

		Food food = restaurant.checkFoodName("돈까스");
		if (food != null) {
			food.setKind("한식");
			restaurant.update(food); // 수정 완료버튼을 눌렀을 때 실행되는 코드
		}

		System.out.println(DBConnecter.foods);

		System.out.println(restaurant.findByKind("한식"));
	}

}
