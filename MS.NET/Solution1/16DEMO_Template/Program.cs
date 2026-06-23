using _16DEMO_Template.Logics;

namespace _16DEMO_Template
{
    internal class Program
    {
        static void Main(string[] args)
        {
           Employee e= new Employee();
            Console.WriteLine("Enter the empid");
            e.EID = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("ENter the name ");
            e.Ename = Console.ReadLine();
            Console.WriteLine("enter the age");
            e.Age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the gender");
            e.Gender =Console.ReadLine();
            Console.WriteLine($"Empid = {e.EID} Ename={e.Ename} Age = {e.Age} Gender={e.Gender}");
        }
    }
}
