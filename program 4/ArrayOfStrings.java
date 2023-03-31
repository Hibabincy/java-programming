import java.util.Scanner;
import java.util.Arrays;
 
 class ArrayOfStrings{
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the number of strings:");
     int size=sc.nextInt();
     String[] strings = new String[size];
     System.out.println("enter the strings:");
      for(int i=0;i<size;i++){
        strings[i]=sc.next();
       }
System.out.println("Choose \n 1.Built-in method \n 2.User Defined method");
System.out.print("\n opt:");
int opt=sc.nextInt();
  switch(opt){
       
        case 1: System.out.println("Built-in method");
                System.out.println("-------------------");
                Arrays.sort(strings);
                 break;
 
        case 2: System.out.println("User Defined method");
                System.out.println("-------------------");
                String temp;
                for(int i=0;i<size;i++)
                  {
              for(int j=i+1;j<size;j++)
                  {
        if(strings[i].compareTo(strings[j])>0)
            {
               temp=strings[i];
             strings[i]=strings[j];
             strings[j]=temp;
          }
         }
         }
break;
default:
System.out.println("invalid option!");
break;
}
 
  for(int i=0;i<size;i++){
   
    System.out.println(strings[i]);
}
}
}

