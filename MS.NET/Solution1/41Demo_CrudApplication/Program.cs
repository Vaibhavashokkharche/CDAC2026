using _41Demo_CrudApplication.DAL;
using _41Demo_CrudApplication.Models;

namespace _41Demo_CrudApplication
{
    internal class Program
    {
        static void Main(string[] args)
        {


            int choice = 0;
            EmpDao edao = new EmpDao ();

            
            do
            {
                Console.WriteLine("1.Add Employee\n 2.Update Employee\n 3.Delete Employee\n 4.Get All Employee\n 5.Exit\n Enter a choice");
                choice=Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {
                    case 1:
                        Console.WriteLine("Enter the id");
                        int id = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter the name");
                        String  nm= Console.ReadLine();
                        Console.WriteLine("Enter the address");
                        string  adr= Console.ReadLine();
                        int n = edao.AddNewEmployee(new Employee() { Id =id, Name=nm, Address=adr});
                        if (n > 0)
                        {
                            Console.WriteLine("Employee Added Suceessfully");
                        }
                        else {
                            Console.WriteLine("Not Added");
                        }


                            break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;

                    default:
                        break;
                }



            } while (true);
        }
    }
}
