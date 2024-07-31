package list.task.fruit;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Market {
//   - 과일 이름으로 과일 조회
   public Fruit checkFruitName(String name) {
      Fruit fruit = null;
      for (int i = 0; i < DBConnecter.fruits.size(); i++) {
         if(DBConnecter.fruits.get(i).getName().equals(name)) {
            fruit = DBConnecter.fruits.get(i);
         }
      }
      return fruit;
   }

//   - 과일 추가
   public void add(Fruit fruit) {
      DBConnecter.fruits.add(fruit);
   }

//   - 과일 삭제
   public void remove(Fruit fruit) {
      DBConnecter.fruits.remove(fruit);
   }
   
//   - 과일 가격이 평균 가격보다 낮은 지 검사
   public Fruit checkPrice(Fruit fruit) {
      int total = 0;
      double average = 0.0;
      
      for (int i = 0; i < DBConnecter.fruits.size(); i++) {
         total += DBConnecter.fruits.get(i).getPrice();
      }
      
      average = (double)total / DBConnecter.fruits.size();
      
      return fruit.getPrice() < average ? fruit : null;
   }
   
//   - 과일 전체 조회
   public ArrayList<Fruit> findAll() {
      return (ArrayList<Fruit>) DBConnecter.fruits.clone();
   }
   
}




















