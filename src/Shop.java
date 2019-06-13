import java.util.*;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int items1=153, item2=75, item3=500;
		int number1, number2, number3, number4, number5, number6, number7, number8;
		double price;
		int result;
		Scanner number_array = new Scanner(System.in);
		
		do
		{
			System.out.println("Input numbers1:");
			number1 = number_array.nextInt();
			System.out.println("Input numbers2:");
			number2 = number_array.nextInt();
			System.out.println("Input numbers3:");
			number3 = number_array.nextInt();
			System.out.println("Input numbers:4");
			number4 = number_array.nextInt();
			System.out.println("Input numbers:5");
			number5 = number_array.nextInt();
			System.out.println("Input numbers:6");
			number6 = number_array.nextInt();
			System.out.println("Input numbers:7");
			number7 = number_array.nextInt();
			System.out.println("Input numbers:8");
			number8 = number_array.nextInt();
			
			// TO DO: Compute on numbers
			
			if(number1>number2)
			{
				System.out.println("number1>number2");
			}
			else
			{
				System.out.println("num 2 greater");
			}
			System.out.println("Any more numbers? (Y/N)");
		result = number_array.nextInt();
				
		}while(result==1);
		
	
	}

}
