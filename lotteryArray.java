package lotteryArray;
import java.util.*;
public class lotteryArray {

	public static void main(String[] args) {
		// Alessio Schiavi Lottery Arrays Question

		Scanner input = new Scanner (System.in);
		Random rng = new Random();
		boolean running = true;
		
		
		int y=0;
		int[]users=new int[6];
		int[]gens=new int[6];
		while (running)
			
			{
			System.out.println("Welcome to lotto 649");
			System.out.println("Your 6 numbers must match all 6 numbers generated in order to recieve the jackpot of $649,000");
			System.out.println("Please input your 6 lottery numbers between 1 and 49");

		for(int i=0; i<users.length; i++)
		{
			{
				users [i]=input.nextInt();
				while(users[i] > 49 || users[i] < 1) {
					System.out.println("Please only input numbers from 1-49. Re-input your numbers please.");
					users [i]=input.nextInt();
				}
			}
			
		}

		System.out.print("Your numbers are: ");
		for(int i=0; i<users.length; i++)
		{
			{
			System.out.print(users[i]+" ");
			}
			
			
		}
		System.out.println(" ");
		System.out.print("The winning numbers are: ");
		for(int i=0; i<gens.length; i++)
		{
			{
				gens [i]=rng.nextInt(49)+1;
				System.out.print(gens[i]+" ");
			}
			
		}
		System.out.println(" ");
		for (int i=0;i<gens.length;i++)
			{
			for (int j=0; j<users.length;j++) {
				if (gens[i]==users[j])
				{
			y++;
				}
		else{
			
			}
				}
		}
		
		if (y==6) 
		{
			System.out.println("Congratulations! You have won the lottery 649 jackpot of $649,000!");
			System.out.println("Please go to your ticket retailer to claim your prize.");
		}
		else
		{
			System.out.println("You have gotten " +y+ " right but unfortunately lost the lottery");
		}
		
		System.out.println("Do you want to play again? y/n");
		String response = input.next();
		
		if(response.equalsIgnoreCase("y")) {
			running = true;
		}
		else if(response.equalsIgnoreCase("n")) {
			running = false;
			System.out.println("Goodbye!");

		}
			}
		
			
		
		
		
	}
		
	}
	


