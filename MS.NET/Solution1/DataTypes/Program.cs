using System.Reflection.PortableExecutable;

namespace DataTypes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Datatypes in C#
            /*int x = 10;
              int y = 20;
             short a = 10;
              byte b= 10;
              char c = 'A';
              bool status = false ;
              Console.WriteLine(status.GetType());
              Console.WriteLine(b.GetType());
              Console.WriteLine("the datatypes of x is "+x+x.GetType());
              Console.WriteLine(c.GetType());
              Console.WriteLine(c);*/
            #endregion
            //the Readkey method is return the key net key press by users 
            //eg do you want to continoue Y/N if press Y its return y
            //it doesnt wait for user to  press the enter key as soons as you press the the key its return the value
            Console.WriteLine("Do you want to Continoue y/n");
            ConsoleKeyInfo info= Console.ReadKey();
            
            if (info.Key.Equals('y')){
                Console.WriteLine("Succesfully routed");
            }
            else {
                Console.WriteLine("Thank you for visiting");
            
            }

                ConsoleKeyInfo c = Console.ReadKey();
            Console.WriteLine(c.KeyChar);

            Console.WriteLine("enter the char");


            //its accepect the first char and return the asscii value 
           // for eg anish= a=97
           //its requires enter key to press 
            int asscivalue = Console.Read();
            Console.WriteLine(asscivalue);



        }
    }
}
