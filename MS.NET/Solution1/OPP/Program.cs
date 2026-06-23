using System.ComponentModel;

namespace OPP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Person Class
            //Person p = new Person();
            //p.empid = 101;
            //p.pname = "Vaibhav";
            //p.pcity =
            //    "Pune";
            //p.GetPersonDetails(); 
            #endregion

            #region RuntimePolymorphismExample
            //Cmath cmath = new Cmath();
            //int a=  cmath.Add(10, 20);
            //int b=   cmath.Sub(20, 30);
            //Console.WriteLine("The addition is " + a);
            //Console.WriteLine("The substraction is " + b);
            //Cmath cmath1= new AdvMath();
            //Console.WriteLine(cmath1.Add(10, 20));
            //Console.WriteLine(cmath1.Sub(20, 30)); 
            #endregion


            #region MethodOfOverloading
            //Calculator calc= new Calculator();
            //Console.WriteLine(calc.Add(10, 20));
            //Console.WriteLine(calc.Add(10.20, 20.20));
            //Console.WriteLine(calc.Add(10.002f, 20.00f)); 
            #endregion




        }



        public class Person { 
        public int empid;
            public String pname;
            public String pcity;
            public Person()
            {
               Console.WriteLine("In the default constructor in employee"); 
            }

            //Methods
            public void GetPersonDetails() {
            
            Console.WriteLine($"Id={empid} Name={pname} city={pcity}");
            
            }


        }
        public class Cmath { 
        
        public  virtual int  Add(int x, int y)
            {

                return x + y;
            }

                    public virtual int Sub(int x, int y) {


                return x - y; }
        
        
        }

        public class AdvMath:Cmath {
            public override int Add(int x, int y)
            {

                return (x + y)*100;
            }

            public override int Sub(int x, int y)
            {


                return (x - y) * 100;
            }




        }

        public class Calculator
        {

            public int Add(int x, int y)
            {

                return x + y;
            }
            public int Add(int x, int y, int z)
            {

                return x + y + z;
            }

            public double Add(double a, double b)
            {

                return (a + b);
            }

            public float Add(float a, float b){

             return a+b;
              }


        }
    }
}
