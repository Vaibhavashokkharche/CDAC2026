import java.util.Scanner;

class Test2{
     public void myfunction(){
        System.out.println("in my function");
        
     }

     public static void printTable(int num){ //print table of the number
         for(int j=1;j<=10;j++){
          System.out.println(num+" * "+ j+" = "+(num*j));
				}
     } 
     public static int factorial(int num){
  				//calculate factorial
          int f=1; 
          for(int j=1;j<=num;j++){
                f*=j;
				}
         return f; 
     }
     public static void main(String[] args){
				//calling non static function then use object
				Test2 ob=new Test2();
				ob.myfunction();

         Scanner sc=new Scanner(System.in);
         System.out.println("enter number");
         int num=sc.nextInt();
         //calling static function with class name
         //using class name is not mandatory, because both functions are in same class
         int f=Test2.factorial(num); 
         System.out.println("Factorial: "+f);
         printTable(num); 
         
         sc.close();
     }

}