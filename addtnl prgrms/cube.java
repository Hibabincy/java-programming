Q).Write a program in java to display the cube of the number upto given an integer
----------------------------------------------------------------------------------

import java.util.Scanner;
class Cube
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int num = sc.nextInt();
for(int i=1;i<=num;i++)
{
System.out.println("cube of " +i+ " is : " + (i*i*i));
}
}
}

*************************************************************

OUTPUT
----------

Enter a number :
5
cube of 1 is : 1
cube of 2 is : 8
cube of 3 is : 27
cube of 4 is : 64
cube of 5 is : 125
