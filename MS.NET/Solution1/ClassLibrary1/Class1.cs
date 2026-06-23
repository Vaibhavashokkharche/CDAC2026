namespace ClassLibrary1
{
    public class Cmath
    {
     //Accesible in within same assembly and as well as outside asseembly
        public void Add(int x, int y) {
            Console.WriteLine($"Add= {x + y}");
        }
        //Accessible within same class only.
        private void Sub(int x, int y)
        {
            Console.WriteLine($"Sub= {x - y}");
        }
        // Accessible within the assembly and outside assembly but inheritance betwween is must
        protected void  Multi(int x, int y)
        {
            Console.WriteLine($"Multiplication = {x * y}");
        }
        //Accessible only within assembly its acts oublic only for same assembly;
        internal void Div(int x, int y) {
            Console.WriteLine(x / y);
        }
        //Accessible within same assembly like internal and outside assembly as protected
        protected internal void Square(int x)
        {
            Console.WriteLine($"Sqaure is = {x + x}");
        }





    }
}
