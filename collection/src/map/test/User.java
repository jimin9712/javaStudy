package map.test;

import java.util.Objects;

public class User {
   private int id;
   private String userId;
   private String name;
   private int age;
   
   public User() {;}

   public User(int id, String userId, String name, int age) {
      super();
      this.id = id;
      this.userId = userId;
      this.name = name;
      this.age = age;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "User [id=" + id + ", userId=" + userId + ", name=" + name + ", age=" + age + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(id);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      User other = (User) obj;
      return id == other.id;
   }
}










