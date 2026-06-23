using System.Diagnostics.Contracts;

namespace _12DEMO_OPP
{
    internal class Program
    {
        static void Main(string[] args)
        {
        //Person p = new HR();
        //    p.Display();
        }
    }

    public class Person {
        public String ename;
        public virtual void Display()
        {

            Console.WriteLine("Person: Display");

        }
    }


    public class Employee:Person {

        public override void Display() {
            Console.WriteLine("Employee : Display");
        } 
    
    }
    public sealed class HR  {
        public  void Display()
        {
            Console.WriteLine("HR : Display");
        }

       


    }


    public class Demo { 
   public void WrapperMethod (){ 
        
        HR obj = new HR();
            obj.Display();
        
        }
    
    
    }




}
