package test_02_04_25;

import java.util.Scanner;

public class ArmStrongOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int temp=num;
		int temp2=num;
		int count = 0;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		int sum = 0;
		while(temp2>0)
		{
			int ld = temp2%10;
			int mul = 1;
			for(int i=1;i<=count;i++)
			{
				mul *= ld;
			}
			sum += mul;
			temp2/=10;
		}
		if(num==sum)
			System.out.println("ArmStrong NUmber");
		else
			System.out.println("Not a ArmStrong Number");
	}
}
