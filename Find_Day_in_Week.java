import java.util.Scanner;
class Week{
	public static void main(String[] args) {
		int i;
		Scanner num = new Scanner(System.in);
		System.out.println("Eneter number between 1 to 7 to Display Week");
	    i = num.nextInt();
	    if(i == 1){
		System.out.println("Go to work because, today is Monday!");
		}			
		else if (i == 2) {
			System.out.println("Today Is Tuesday");
			}
		else if (i == 3) {
			System.out.println("Today Is Wensday");
			}
			else if (i == 4) {
			System.out.println("Today Is Thursday");
			}
		else if (i == 5) {
			System.out.println("Today Is Friday");
			}
		else if (i == 6) {
			System.out.println("Today Is Saturday");
			}
		else if (i == 7) {
			System.out.println("Enjoy weekend because, today is Sunday!");
			}	
		if (i==0) {
			System.out.println("*Wrong Number* -->Enter number between 1 to 7");
			}
		if (i>7) {
			System.out.println("*Wrong Number* -->Enter number between 1 to 7");
			}
		}

	}
