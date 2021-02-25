import java.time.LocalDateTime;

public class Demo {
	
	
	

	public static void main(String[] args) {
		
		
		LocalDateTime today =  LocalDateTime.now();     //Today
		LocalDateTime tomorrow = today.plusDays(1);     //Plus 1 day
		LocalDateTime yesterday = today.minusDays(1);   //Minus 1 day
		 
		System.out.println(today);          //2018-07-14
		System.out.println(tomorrow);       //2018-07-15
		System.out.println(yesterday);      //2018-07-13
		 
		
		 
		}
	}
	


