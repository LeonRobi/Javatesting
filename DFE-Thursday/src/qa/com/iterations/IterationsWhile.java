package qa.com.iterations;

public class IterationsWhile {
	
	public static void whileDemo() {
		int cleanCups = 10;
		
		while(cleanCups > 0) {
			System.out.println("No need to wash up, another cup used");
			cleanCups --;
			System.out.println(" cups left: " + cleanCups);
			
		}
		
	}
	
	public static void countdown() {
		int number = 10;
		while(number > 0) {
			System.out.println(number);
			number--;
			if(number == 0); {
				System.out.println("BANG");
			
			}
		}
	}

//	String colour = "red";
	
//	do {
//		System.out.println("coulour :" + colour); 
//	} while (colour == "blue");
//	
//	
//	public static void scoring() {
//		int score = 0;
//		do {
//			score += 5;
//			System.out.println("Score: " + score);
//		} while (score < 47);
//		
//	}
//}


	public static void forLoop() {
		for (int number = 0; number <= 10; number++) {
			System.out.println(number);
		}
		
	}

	public static void flowLoop() {
		for (int number = 100; number <= 200; number++) {
			System.out.println(number);
			}
			System.out.println("End");
		}
		
//	public static void flowchartLoop() {
//		for (int number = 100; number <= 200; number++) {
//			System.out.println(number);
//			}
//			System.out.println("End");
//		}
	
//	public static void coinchange(float cost, float paymentAmount); {
//		float sum = paymentAmount - cost;		
		
//	}

	

}
