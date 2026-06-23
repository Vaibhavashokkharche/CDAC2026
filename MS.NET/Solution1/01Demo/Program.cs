using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int choice = 0;
            
            Console.WriteLine("Vaibhav ");
            do
            {
                Console.Write("1.Get brother name\n2. Get sister name\n3.Get parent name\n4.Exit enter the choice");
                choice=int.Parse(Console.ReadLine());
                switch (choice) {
                 


                     case 1: {
                            Console.WriteLine("Rushikesh");
                            break;
                        }
                    case 2: {
                            Console.WriteLine("Bhagayashri");

                            break;
                        }

                    case 3: {
                            Console.WriteLine("Ashok");
                            break;

                        }
                    case 4: {
                            Console.WriteLine("Thank you for visiting");
                            break;
                        }
                    default: {
                            Console.WriteLine("Invalid choice");
                            break;
                        }
                        

                
                }
                
            }
            while (choice!=4);



        }
    }
}
