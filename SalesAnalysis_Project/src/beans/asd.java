package beans;

public class asd {
	
	public static void main(String[] args) {
		print_NewYear_Message();
	}
	
	
public static String print_NewYear_Message() {
		
		
		String msg = "hApPy nEW YeAr!";
		
		
		//task1
		//add code here return
		
		msg = msg.toLowerCase();
		
		msg = msg.substring(0, 1).toUpperCase();
		
		msg = msg.substring(6,7).toUpperCase();
		
		msg = msg.substring(10,11).toUpperCase();
		
		
		
		
	
		
		//"Happy New Year!";
		
		
		
		
		System.out.println(msg);
		
		return msg;
	}	

}
