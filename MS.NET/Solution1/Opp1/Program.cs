using System.Security.Cryptography.X509Certificates;

namespace Opp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your database choice 1. MYSQL 2.Oracle");
            int dbchoice = Convert.ToInt32(Console.ReadLine());
            DataBaseFactory dataBaseFactory = new DataBaseFactory();
            IDatabase obj = dataBaseFactory.GetSomeData(dbchoice);
            if (obj != null) {
                Console.WriteLine("1.Insert 2.Update 3.Delete");
                int opchoice=Convert.ToInt32(Console.ReadLine());
                switch (opchoice) {
                    case 1:
                        obj.Insert();
                            break;
                    case 2:
                        obj.Update();
                        break;
                    case 3:
                        obj.Delete();
                        break;
                    default:
                        Console.WriteLine("Invalid choice");
                        break;
            }

        }


        }

        public class DataBaseFactory {   //factory design pattern

            public IDatabase GetSomeData(int dbchoice) {
                IDatabase obj = null;
                if (dbchoice == 1)
                {
                    obj = new MySQlServer();

                }
                else { 
                
                obj=new OracaleServer();
                
                }


                    return obj;
            }
        
        
        }







        public interface IDatabase {
            void Insert();
            void Update();
            void Delete();
        
        
        }

        










        public class MySQlServer :IDatabase{

            public void Insert() {

                Console.WriteLine("The insertion deone In MYSQL");

            }
            public void Delete() { 
            
            Console.WriteLine("The Delete operation done In MYSQL");
            }
            public void Update() { 
            Console.WriteLine("The update operation done In MYSQL");
            
            }
        
        
        
        }
        public class OracaleServer:IDatabase {
            public void Insert()
            {

                Console.WriteLine("The insertion deone In Oracale");

            }
            public void Delete()
            {

                Console.WriteLine("The Delete operation done In Oracale");
            }
            public void Update()
            {
                Console.WriteLine("The update operation done In Oracale");

            }





        }




    }
}
