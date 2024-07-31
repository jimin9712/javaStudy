package anonymousTest;

public class Starbucks {

   public void register(Form form) {
      String[] menu = form.getMenu();
      
      for (int i = 0; i < menu.length; i++) {
         System.out.println(menu[i]);
      }
//      무료 나눔 행사중인 지점에서는 "무료 나눔 행사중"출력
      if (form instanceof FormAdapter) {
         System.out.println("무료 나눔 행사중");
      }else {
//         일반 지점에서는 판매 방식 확인하기
         form.sell("아메리카노");
      }
      
   }
   
   
}
