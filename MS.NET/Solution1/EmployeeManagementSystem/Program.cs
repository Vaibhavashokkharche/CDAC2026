using System.Collections;

namespace EmployeeManagementSystem
{
    internal class Program
    {
        static void Main(string[] args)
        {

            ArrayList employees = new ArrayList();

            while (true)
            {
                Console.WriteLine("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
                Console.WriteLine("1. Add Employee");
                Console.WriteLine("2. Display Employees");
                Console.WriteLine("3. Search Employee");
                Console.WriteLine("4. Remove Employee");
                Console.WriteLine("5. Exit");

                Console.Write("Enter Your Choice: ");
                int choice = Convert.ToInt32(Console.ReadLine());

                switch (choice)
                {
                    case 1:
                        Console.Write("Enter Employee Id: ");
                        int id = Convert.ToInt32(Console.ReadLine());

                        Console.Write("Enter Employee Name: ");
                        string name = Console.ReadLine();

                        Console.Write("Enter Designation: ");
                        string designation = Console.ReadLine();

                        Emp emp = new Emp(id, name, designation);

                        employees.Add(emp);

                        Console.WriteLine("Employee Added Successfully");
                        break;

                    case 2:
                        Console.WriteLine("\nEmployee Details");

                        foreach (Emp e in employees)
                        {
                            Console.WriteLine(
                                $"Id: {e.GetEmpId()}, Name: {e.GetEmpName()}, Designation: {e.GetDesignation()}");
                        }
                        break;

                    case 3:
                        Console.Write("Enter Employee Id To Search: ");
                        int searchId = Convert.ToInt32(Console.ReadLine());

                        bool found = false;

                        foreach (Emp e in employees)
                        {
                            if (e.GetEmpId() == searchId)
                            {
                                Console.WriteLine("Employee Found");
                                Console.WriteLine($"Id: {e.GetEmpId()}");
                                Console.WriteLine($"Name: {e.GetEmpName()}");
                                Console.WriteLine($"Designation: {e.GetDesignation()}");

                                found = true;
                                break;
                            }
                        }

                        if (!found)
                        {
                            Console.WriteLine("Employee Not Found");
                        }

                        break;

                    case 4:
                        Console.Write("Enter Employee Id To Remove: ");
                        int removeId = Convert.ToInt32(Console.ReadLine());

                        for (int i = 0; i < employees.Count; i++)
                        {
                            Emp e = (Emp)employees[i];

                            if (e.GetEmpId() == removeId)
                            {
                                employees.RemoveAt(i);
                                Console.WriteLine("Employee Removed Successfully");
                                break;
                            }
                        }

                        break;

                    case 5:
                        Environment.Exit(0);
                        break;

                    default:
                        Console.WriteLine("Invalid Choice");
                        break;
                }
            }



        }
    }
}
