using _41Demo_CrudApp.DAL;
using _41Demo_CrudApp;

namespace _41Demo_CrudApplication
{
    internal class Program
    {
        static void Main(string[] args)
        {


            int choice = 0;
            EmpDao edao = new EmpDao ();
            Console.WriteLine("Empolyee Management System !!!");
            
            do
            {
                Console.WriteLine("1.Add Employee\n2.Update Employee\n 3.Delete Employee\n4.Get All Employee\n 5.Get Employees By address\n6.Get Employees By Name\n7.Get Employee By Id\n8.Exit\n Enter a choice");
                choice=Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {
                    case 1:
                        {
                            Console.WriteLine("Enter the id");
                            int id = Convert.ToInt32(Console.ReadLine());
                            Console.WriteLine("Enter the name");
                            String ? nm = Console.ReadLine();
                            Console.WriteLine("Enter the address");
                            string ? adr = Console.ReadLine();
                            Employee e = new Employee();
                            e.Id = id;
                            e.Name = nm;
                            e.Address = adr;
                          

                            int n = edao.AddNewEmployee(new Employee() { Id = id, Name = nm, Address = adr });
                            if (n > 0)
                            {
                                Console.WriteLine("Employee Added Suceessfully");
                            }
                            else
                            {
                                Console.WriteLine("Not Added");
                            }



                            break;
                        }
                    case 2:
                        {
                            Console.WriteLine("Enter the id");
                            int id = Convert.ToInt32(Console.ReadLine());
                            Console.WriteLine("Enter the name");
                           string ? nm = Console.ReadLine();
                            Console.WriteLine("Enter the address");
                            string ? adr = Console.ReadLine();
                            int n = edao.UpdateEmployee(new Employee() { Id = id, Name = nm, Address = adr });
                            if (n > 0)
                            {
                                Console.WriteLine("Employee Updated Suceessfully");

                            }
                            else
                            {
                                Console.WriteLine("Not Updated");
                            }

                            break;
                        }
                    case 3:
                        {
                            Console.WriteLine("Enter the id which you want to delete");
                            int id = Convert.ToInt32(Console.ReadLine());
                            int n = edao.DeleteEmployeeById(id);
                            Console.WriteLine(((n>0) ? "Employee Deleted Successfully":"Not Deleted "));
                            break;
                        }
                    case 4:
                        {

                            List<Employee> elist = edao.GetEmployees();
                            foreach (var emp in elist)
                            {
                                Console.WriteLine($"Id={emp.Id} Name={emp.Name} Address = {emp.Address}");
                            }
                            break;
                        }
                    case 5:
                        {
                            Console.WriteLine("Enter the address which employees you want");
                            string ? addr = Console.ReadLine();
                            List<Employee> ? elist = edao.GetEmployeeByAdd(addr);
                            foreach (var emp in elist)
                            {
                                Console.WriteLine($"Id={emp.Id} Name={emp.Name} Address = {emp.Address}");
                            }
                            break;
                        }

                    case 6:
                        {
                            Console.WriteLine("Add the employee names that you want");
                            string ? nm = Console.ReadLine();
                            List<Employee> ? elist= edao.GetEmployeesByName(nm);
                            if (elist != null)
                            {
                                foreach (var emp in elist)
                                {
                                    Console.WriteLine($"Id={emp.Id} Name={emp.Name} Address = {emp.Address}");
                                }
                            }
                            else {
                                Console.WriteLine("No employee Found");
                            }
                                break;
                        }


                       
                        

                    case 7:
                        {
                            Console.WriteLine("Enter the id of employee ");
                            int eid= Convert.ToInt32(Console.ReadLine());
                            Employee ? emp = edao.GetEmployeeById(eid);
                            if (emp != null) { 
                            
                           
                            }

                            Console.WriteLine($"Id={emp.Id} Name={emp.Name} Address = {emp.Address}");
                            break;
                        }



     
                    case 8: {
                            Console.WriteLine("Thank you for visting");
                            break;
                        }
                    default:
                        Console.WriteLine("Invalid Choice");
                        break;
                }



            } while (choice!=8);
        }
    }
}
