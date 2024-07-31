package list.task.user;

public class User {
//   User의 필드 구성
   private String name;
   private String userId;
   private String password;
   private String phone;
   
//   기본 생성자
   public User() {;}
   
//   얕은 복사
   public User(User user) {
//      아래에 있는 
//      User(String name, String userId, String password, String phone) 
//      생성자 호출
      this(user.getName(), user.getUserId(), user.getPassword(), user.getPhone());
   }
   
//   초기화 생성자
   public User(String name, String userId, String password, String phone) {
      super();
      this.name = name;
      this.userId = userId;
      this.password = password;
      this.phone = phone;
   }


//   getter, setter
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

//   toString
   @Override
   public String toString() {
      return "User [name=" + name + ", userId=" + userId + ", password=" + password + ", phone=" + phone + "]";
   }

//   eqauls
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      User other = (User) obj;
      return userId.equals(other.userId);
   }
}










