import java.util.Scanner;
public class Price{
	public static void main(String []args){
		int amount,price;
		Scanner in=new Scanner(System.in);
		System.out.println("Please input an amount :");
		amount=in.nextInt();
		System.out.println("Please input a price :");
		price=in.nextInt();
		System.out.println("The left one is "+(amount-price));
	}
}