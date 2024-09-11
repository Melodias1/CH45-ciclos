
public class Triangulo {
	
	public static void main(String[] args) {
		int n = 1; 

        for (int i = 5; i >= n; i--) {
            for (int a = 5; a >= i; a--) {
                System.out.print("*");
            }
            System.out.println(); 
        }
	}
}
