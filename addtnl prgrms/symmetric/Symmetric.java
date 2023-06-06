Q)Symmetric
-----------

import java.util.Scanner;
class Symmetric{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the square matrix: ");
int s = sc.nextInt();
int[][] mat1 = new int[s][s];
System.out.println("Enter the Matrix: ");
for(int i=0; i<s;i++){
for(int j=0; j<s; j++){
mat1[i][j] = sc.nextInt();
}
}
System.out.println("Matrix: ");
for(int i=0; i<s;i++){
for(int j=0; j<s; j++){
System.out.print(mat1[i][j]+ "\t");
}
System.out.println();
}
for(int i=0; i<s;i++){
for(int j=0; j<s; j++){
if (mat1[i][j] != mat1[j][i]){
System.out.println("Matrices are not symmetric :(");
return;
}
}
}
System.out.println("Matrices are symmetric :)");
}
}


output
------
Enter the size of the square matrix: 3
Enter the Matrix: 
1 2 3
1 3 4
2 4 5
Matrix: 
1	2	3	
1	3	4	
2	4	5	
Matrices are not symmetric :(

Enter the size of the square matrix: 3 
Enter the Matrix: 
1 2 3
2 3 1
3 1 2
Matrix: 
1	2	3	
2	3	1	
3	1	2	
Matrices are symmetric :)

