using System.Reflection.Metadata.Ecma335;

namespace _06Demo_OPP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Choose your drink 1.Hot 2.Cold");
            int dchoice=Convert.ToInt32(Console.ReadLine());    
            DrinkFactory drinkFactory = new DrinkFactory();
            IDrinK dr = drinkFactory.getSomeDrink(dchoice);
            if (dr != null) {
              
               Console.WriteLine($"Enjoy your drink={dr.GetDrink()}");

            }
         


        }
    }




    public interface IDrinK {

        public String GetDrink();
    
    }

    public class DrinkFactory {

        public IDrinK getSomeDrink(int dchoice) {
            IDrinK dr = null;

            switch (dchoice) {
                case 1:
                    dr = new HotDrink();
            break;
                case 2:
                    dr = new ColdDrink();
                    break;
                default:

                    Console.WriteLine("Currently Not available");
                    break;
            }


            return dr;
        }
    
    
    
    }


    public class ColdDrink:IDrinK{


        public String GetDrink() {

            return "Cola";
        }
    }
        public class HotDrink:IDrinK{

            public String GetDrink() {


                return "Tea";
            }
        
        }
    
    }





