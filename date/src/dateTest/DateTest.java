//package dateTest;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;
//
//public class DateTest {
//	public static void main(String[] args) {
////      번외: 고급 과정
//      LocalDate localDate = LocalDate.parse("2024-12-04");
//      System.out.println(localDate);
////      
//      System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
////      
//      LocalDateTime localDateTime = LocalDateTime.of(2024, 12, 4, 10, 10, 20);
//      System.out.println(localDateTime);
////      
//      System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")));
//
////      기본으로 알아야할 날짜 타입(Date, Calendar)
//      Date date = new Date(124, 0, 1);
//      Calendar calendar = Calendar.getInstance();
//      System.out.println(calendar.get(Calendar.YEAR));
//      System.out.println(calendar.get(Calendar.MONTH) + 1);
//      System.out.println(calendar.get(Calendar.DATE));
//
////      화면 출력 예시
////      2022년 12월 04일
//      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
//      System.out.println(dateFormat.format(date));
//
//      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
//      System.out.println(dateFormat.format(calendar.getTime()));
////      
//      try {
//         System.out.println(dateFormat.parse("2024년 12월 04일"));
//      } catch (ParseException e) {
//         System.out.println("형식이 잘못되었습니다.");
////      }
//	}
//}
