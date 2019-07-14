package aslanherseyburadaPACKAGE;

public class ForLoopSUNDAY {
public static void main(String[] args) {
	for (int i = 1; i <7 ; i++) {          // STUDY FOR LOOPS EXERCISE
		for (int j = 0; j <i ; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i = 0; i < 10; i++) {
		if(i==5) {
			//break;  // 5 oldugunda duracak !
			//System.out.println("bu 5");
			continue;  // 5 haric hepsini yazacak.
		}
		System.out.println(i);
	}
	System.out.println("==================================================");
	System.out.println("==================================================");
	System.out.println("==================================================");
	
	L:for (int i = 0; i < 6; i++) {
		for (int j = 0; j < 6; j++) {
			if(j==3) {
				continue L ; // j=3 oldugunda ilk for loop a geri donecek.
							// L koymadigimiz zaman ne oluyor DENE !! 
							// this is labeling ! it means go to that label(L)
			}
			System.out.println("#");
		}
		System.out.println("ARA");
	}
}
}
