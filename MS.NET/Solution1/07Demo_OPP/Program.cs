using static _07Demo_OPP.Cmath;

namespace _07Demo_OPP
{
    internal class Program
    {
        static void Main(string[] args)
        {

            
            Cmath cmath = new Cmath();
            cmath.Add(10, 20);
            cmath.Add(20, 30);
            cmath.Sub(20, 30);
            cmath.Sub(30, 20);
            iMath imath = new MyMath();
            imath.Add(10, 20);
            imath.Add(20, 30);
            imath.Sub(30, 20);
            imath.multi(6,2);




        }
    }

    public interface iMath {
        void Add(int x, int y);
        void Sub(int x,int y);
        void multi(int x, int y);
    
    }

    public interface jmath {
        void Add(int x, int y);
        void multi(int x, int y);

    }

    public class Cmath : iMath

    {

        public void Add(int x, int y)
        {

            Console.WriteLine($" Add = {x + y}");
        }

        public void multi(int x, int y)
        {

            Console.WriteLine(x * y);
        }

        public void Sub(int x, int y)
        {
            Console.WriteLine($"Sub ={x - y}");

        }
        public class MyMath : iMath
        {
            public void Add(int x, int y)
            {
                Console.WriteLine($" Add = {x + y} from mymath");
            }

            public void multi(int x, int y)
            {
                Console.WriteLine($"Sub ={x * y} from mymath");
            }

            public void Sub(int x, int y)
            {
                Console.WriteLine($"Sub ={x - y} from mymath");
            }
        }





    } 

}
