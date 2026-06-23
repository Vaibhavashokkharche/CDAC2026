using ClassLibrary1;
using System.ComponentModel;
using _16DEMO_Template.Logics;
namespace _15DEMO_OPP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Cmath cmath = new Cmath();
            cmath.Add(10, 10);


            TestMath tmath= new TestMath();
            tmath.WrapperMethod();

            Employee e = new Employee();
            Console.WriteLine("Enter the empid");
            e.EID = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("ENter the name ");
            e.Ename = Console.ReadLine();
            Console.WriteLine("enter the age");
            e.Age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the gender");
            e.Gender = Console.ReadLine();
            Console.WriteLine($"Empid = {e.EID} Ename={e.Ename} Age = {e.Age} Gender={e.Gender}");








        }
    }



    public class TestMath:Cmath{

        public void WrapperMethod() {

            Add(22,20);// public
            Multi(5, 2); //protected

            Square(5); // protected internal
          // DiV(20,10);//Internal
        
        
        }
    
    }
}
