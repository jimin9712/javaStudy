package objectTest;

public class Student {
   private static int sequence;
   private int id;
   private String name;
   private int score;

//   static 블록
//   최초 생성자가 호출될 때만 실행할 문장 작성
   static {
      sequence = 0;
   }
   
//   초기화 블록
//   생성자가 호출될 때마다 실행할 문장 작성
   {
      this.id = ++sequence;
   }

   public Student() {
      ;
   }

   public Student(String name, int score) {
      super();
      this.name = name;
      this.score = score;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getScore() {
      return score;
   }

   public void setScore(int score) {
      this.score = score;
   }

   @Override
   public String toString() {
      return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
   }

   
}














