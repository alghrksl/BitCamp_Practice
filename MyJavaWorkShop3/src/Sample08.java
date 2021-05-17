import java.util.Scanner;

public class Sample08 {
	public static void main(String[] args) {
//      15:30 ~ 15:50 (20) => 
//		¹ØÀÇ È­¸éÀ» Ãâ·ÂÇÏ°í ÇØ´ç ¸Ş´º ¹øÈ£¸¦ ´©¸£´Â °æ¿ì
//		¸Ş¼¼Áö¸¦ Ãâ·ÂÇÏ½Ã¿À.
//		##########################
//		# 1. µ¡¼À
//		# 2. »¬¼À
//		# 3. °ö¼À
//		# 4. ³ª´°¼À
//		# 5. Á¾·á
//		##########################	
//		# ¸Ş´º ¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä. : 
//		1 => µ¡¼ÀÀÔ´Ï´Ù.
		System.out.println("##########################");
		System.out.println("# 1. µ¡¼À");
		System.out.println("# 2. »¬¼À");
		System.out.println("# 3. °ö¼À");
		System.out.println("# 4. ³ª´°¼À");
		System.out.println("# 5. Á¾·á");
		System.out.println("##########################");
		System.out.printf("¸Ş´º ¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä. :");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();		
//		if(num.equals("1")) {
//		System.out.println("µ¡¼ÀÀÔ´Ï´Ù.");
//		}
		int num2 = Integer.parseInt(num);
		if(num2 == 1){
			System.out.println("µ¡¼ÀÀÔ´Ï´Ù.");
		} else if(num2 == 2){
			System.out.println("»¬¼ÀÀÔ´Ï´Ù.");
		} else if(num2 == 3){
			System.out.println("°ö¼ÀÀÔ´Ï´Ù.");
		} else if(num2 == 4){
			System.out.println("³ª´°¼ÀÀÔ´Ï´Ù.");
		} else if(num2 == 5) {
			System.out.println("Á¾·á.");
		} else {
			System.out.println("´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		}

		
		
		
		
		
		
		
		
		
	}
}
