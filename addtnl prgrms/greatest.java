Q)>Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
------------------------------------------------------------------------------------------------------

import java.util.Scanner;
public class Greatest
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number :");
int x = sc.nextInt();
System.out.println("Enter second number :");
int y = sc.nextInt();
System.out.println("Enter third number :");
int z = sc.nextInt();

if(x<y && y<z)
{
System.out.print("Increasing order ");
}
else if(x>y && y>z)
{
System.out.print("Dereasing order ");
}
else
{
System.out.print("Neithe Increasing order or Dereasing order ");
}
}
}
***************************************************************************

OUTPUT
-------

Enter first number :
123
Enter second number :
432
Enter third number :
12
Neithe Increasing order or Dereasing order

Enter first number :
100
Enter second number :
200
Enter third number :
1900
Increasing order

Enter first number :
12
Enter second number :
11
Enter third number :
5
Dereasing order
