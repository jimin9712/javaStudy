package bank;

public class Bank {
//   Alt + Shift + a : 그리드 모드 전환 / 복귀
//   Shift + ↓ : 커서를 해당 방향으로 늘리기
   
//   *변수
//   예금주
   private String name;
//   계좌번호
   private String account;
//   핸드폰번호
   private String phone;
//   비밀번호
   private String password;
//   잔액(통장)
   private int money;
   
   public Bank() {;}

   public Bank(String name, String account, String phone, String password, int money) {
      super();
      this.name = name;
      this.account = account;
      this.phone = phone;
      this.password = password;
      this.money = money;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAccount() {
      return account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public int getMoney() {
      return money;
   }

   public void setMoney(int money) {
      this.money = money;
   }
   
//   *메소드   
//   계좌번호 중복검사
//   모든 은행 객체가 동일한 기능을 사용하기 때문에 static을 사용하고
//   다른 자식 클래스에서 재정의하여 수정하면 안되기 때문에 final을 붙인다.
   public final static Bank checkAccount(Bank[][] arrBank, int[] arCount,  String account) {
      Bank bank = null;
      
      for (int i = 0; i < arrBank.length; i++) { // 은행 수 만큼 반복
//         for문 안에서 선언하면, 그 영역에서만 사용이 가능하다.
//         하지만 for문 밖에서도 변수를 사용하고 싶다면, 해당 영역에 선언해야 한다.
         int j = 0;
         for (j = 0; j < arCount[i]; j++) { // 각 은행의 고객 수 만큼 반복
            if(arrBank[i][j].account.equals(account)) {
               bank = arrBank[i][j];
               break;
            }
         }
//         위의 for문이 break로 종료되었다면, j가 arCount[i]까지 증가하지 못한다.
//         즉, 위에서 break를 만났다면, 이 for문도 break한다는 뜻이다.
         if (j != arCount[i]) {
            break;
         }
      }
      return bank;
   }
   
//   핸드폰번호 중복검사
   public final static Bank checkPhone(Bank[][] arrBank, int[] arCount,  String phone) {
      Bank bank = null;
      
      for (int i = 0; i < arrBank.length; i++) {
         int j = 0;
         for (j = 0; j < arCount[i]; j++) {
            if(arrBank[i][j].phone.equals(phone)) {
               bank = arrBank[i][j];
               break;
            }
         }
         if (j != arCount[i]) {
            break;
         }
      }
      return bank;
   }
   
//   로그인
//   로그인 성공 시, 로그인된 회원으로 다양한 서비스를 이용해야하기 때문에
//   true 혹은 false를 리턴하는 것보다 로그인된 회원 객체를 리턴하는 것이
//   화면에서 활용하는 데에 훨씬 편하다.
   public static final Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
      Bank user = checkAccount(arrBank, arCount, account);
      if (user != null) {
         if(user.password.equals(password)) {
            return user;
         }
      }
      return null;
   }
   
//   입금
   public void deposit(int money) {
      this.money += money;
   }
   
//   출금
   public void withdraw(int money) {
      this.money -= money;
   }
   
//   잔액 조회
   public int showBalance() {
      return money;
   }
}
















