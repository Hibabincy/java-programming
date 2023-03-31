import java.util.Scanner;
class product{
   int pCode,price;
   String pName;
     product(int pCode,String pName,int price){
       this.pCode=pCode;
       this.pName=pName;
       this.price=price;
}}
 public class Products{
         public static void main(String[]args)
               {
           Scanner sc=new Scanner(System.in);
           System.out.print("enter the Pcode:");
           int pCode=sc.nextInt();
           System.out.print("enter the PName:");
           String pName=sc.next();
           System.out.print("enter the Price:");
           int price=sc.nextInt();
           product[]ps=new product[3];
  
           ps[0]=new product(pCode, pName, price);
           ps[1]=new product(101,"notebook",40 );
           ps[2]=new product(102,"scale",10);
            int minprice=ps[0].price;
            System.out.println("pCode \t pName \t price ");
             for (product p:ps){
              System.out.println(p.pCode+"\t"+p.pName+"\t"+p.price);
               if( minprice > p.price) {              
                 minprice=p.price;
                 }}
                System.out.println("LOWEST COST PRODUCT:");
                for (product p:ps)
                {
                 if (minprice==p.price)
                 {
                 System.out.println("product Code: "+p.pCode);
                 System.out.println("product Name: "+p.pName);
                 System.out.println("product price: "+p.price);
                }
            }
   
}
}        


         
