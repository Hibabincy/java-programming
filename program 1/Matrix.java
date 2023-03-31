import java.util.Scanner;
public class Matrix{
             public static void main (String[]args)
               {
               Scanner sc=new Scanner(System.in);
               System.out.println("enter the rows:");
               int m=sc.nextInt();
               System.out.println ("enter the cols:");
               int n=sc.nextInt();
               int i,j;
               int[][] mat1=new int[m][n];
               int[][] mat2=new int[m][n];
               int[][] summat=new int[m][n];
               System.out.println("enter the 1st matrix:");

               for(i=0;i<m;i++)
                 {
               for(j=0;j<n;j++)
                 {
                  mat1[i][j]=sc.nextInt();
                 }
                 }

               System.out.println("enter the 2nd matrix:");
               for(i=0;i<m;i++)
                     {
               for(j=0;j<n;j++)
                {
               mat2[i][j]=sc.nextInt();
                }
                }

               for(i=0;i<m;i++)
               {
              for(j=0;j<n;j++)
              {
             summat[i][j]=mat1[i][j]+mat2[i][j];
              }}

 	     System.out.println("sum of matrix:");
              for(i=0;i<m;i++)
               {
              for(j=0;j<n;j++){
             System.out.print(summat[i][j]+"\t");
             }
             System.out.println();
}
             }
             
             }
