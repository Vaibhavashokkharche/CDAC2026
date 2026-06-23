using System.Security.Cryptography.X509Certificates;

namespace _18Demo_Delegate
{
    // this delegate pointer capable to calling all method that return type is Int and takiong 2 Int parameter
    public delegate int AddSubDelegate(int x, int y);
    // this delegate pointer capable to calling all method that return type is Int and takiong 1 Int parameter
    public delegate int SquareDelegte(int x);
  
    internal class Program
    {
        //Deleagte isnothing but the function pointer and its type safe 
        // this delegate pointer capable to calling all method that return type is void and no parameter
        public delegate void MyDelegate();
        // this delegate pointer capable to calling all method that return type is void and Taking 1 String parameter
        public delegate void MyDelegate2(string nms); 
        static void Main(string[] args)
        {
          
        MyDelegate showpointer = new MyDelegate(Show);
        MyDelegate displaypointer = new MyDelegate(Display);
            MyDelegate2 GreetPointer= new MyDelegate2(Greet);
            showpointer(); // we can directly pointer also
            displaypointer.Invoke(); // or we can use the invoke() method Both are same
            GreetPointer("vaibhav");
            Cmath cmath=new Cmath();
            AddSubDelegate del = new AddSubDelegate(cmath.Add);
            Console.WriteLine($"Addtion from deletegate = {del.Invoke(10, 20)}");
            AddSubDelegate del1= new AddSubDelegate(cmath.Sub);
            Console.WriteLine($"Substraction from deletegate = {del.Invoke(40, 20)}");
            SquareDelegte sqr = new SquareDelegte(cmath.square);
            Console.WriteLine($"Sqaure from of deletegate = {sqr.Invoke(5)}");





            static void Show()
        {

            Console.WriteLine("In show Method");
        }

            static void Display() {
                Console.WriteLine("In Display method");
            }

            static void Greet(String nm) { 
            
            Console.WriteLine($"Hello {nm} !!");
            }



    }
        public class Cmath
        {
           



            public int Add(int x, int y)
            {

                return x + y;
            }

            public int Sub(int x, int y)
            {
                return (x - y);
            }
            public int square(int x)
            {
                return x * x;
            }

        }
    }
    }

