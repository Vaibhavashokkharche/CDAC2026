using System;
using System.IO.Pipes;
using System.Runtime;
using System.Threading.Channels;
using static _38Demo_CsharpFetaures.Program;

namespace _38Demo_CsharpFetaures
{
    internal class Program
    {
        static void Main(string[] args)
        {

            #region NullableTypes
            //int x = 10; // Strictly type
            // in c# the values types is strict type we can not intailaize the null value to value type
            //But specially in database context sometimes we required the null value types also so csharp provide Nullable fetaures
            // int y = null // Not allowed
            //   double d = null //Not allowed
            //String name = null; //Allowed beacause String is refernce type in c#

            //Nullable<int> a = null; // these is the syntax to intalize the nullable to int value type
            // ? these is nullable operater used in c#
            //Short syntax like
            // int? x = null; //

            //bool? flag = null; //allowed
            //double? sal = 23.52;

            //if (sal.HasValue)
            //{
            //    Console.WriteLine($" salary ={sal.Value}");

            //}
            //else
            //{
            //    Console.WriteLine("Salary still null");

            //} 
            #endregion

            #region ObjectIntializer
            // //Overloaded constructor generated as per the paramerter we given implicitly '
            // //No manual constructor need to be right in the class these is the beauty of C#
            //Emp emp = new Emp();
            // Emp emp1 = new Emp() { Eid=101, EName="Vaibhav", City="Pune"}; // these is synatx for intalizing the object thourgh the properties
            // Emp emp2 =new Emp() { Eid = 101 }; //2nd overload constructor 
            // Emp emp3 = new Emp() { EName = "Rushikesh" };
            // Console.WriteLine($"Id = {emp.Eid} Name={emp.EName} City ={emp.City}");

            // Console.WriteLine("Enter the id");
            // int id= Convert.ToInt32( Console.ReadLine() );
            // Console.WriteLine("Enter the city");
            // String cty= Console.ReadLine();
            // // dyamic allocation of object thourgh the overload constructor and the constructor generates implicitly

            // Emp emp4 = new Emp() {Eid=id, City=cty };
            // Console.WriteLine($"Id = {emp4.Eid} Name={emp4.EName} City ={emp4.City}"); 
            #endregion


            #region CollectionIntializer
            //// Same like the objectIntializer 
            //// we can store the n number of object directly in list {}
            //List<Emp> emplist = new List<Emp>() { new Emp() { Eid = 101, EName = "Vaibhav", City = "Pune" }, new Emp() { Eid = 101, EName = "Rushikesh", City = "Malkapur" } };
            //foreach (Emp emp in emplist)
            //{

            //    Console.WriteLine($"Id = {emp.Eid} Name={emp.EName} City ={emp.City}");

            //} 
            #endregion


            #region AutoProperties
            // Auto properties class 
            //Person p = new Person();
            //Person p1=new Person() { Pid=101, PName="Vaibhav", Address="Pune"};
            //Person p2 = new Person() {Pid=102 , PName="Rushikesh" ,Address="Baner" };
            //   Console.WriteLine($"Id = {p1.Pid} Name={p1.PName} City ={p1.Address}"); 
            #endregion

            #region ImplicitType(Var)
            // Can be declared and initialized at local level.
            // We can not only declare var type without intitializing it. Beacuse it gets defination at compile time.
            // We can not declare var as a parameter type for a method
            // var can not be return type of a method

            //int x = 10;
            //Console.WriteLine(x.GetType().ToString());

            //var y = 10.23;
            //Console.WriteLine(y.GetType().ToString());

            //var e1 = new Emp() { Eid = 1, EName = "Peter", City = "Pune" };
            //Console.WriteLine(e1.GetType().ToString());

            //var e2 = new Emp() { Eid = 1, EName = "Peter", City = "Pune" };
            //Console.WriteLine(e2.GetType().ToString());

            ////Demo( var y); Not allowed
            //List<Emp> emps = new List<Emp>() { e1, e2 };

            //foreach (var emp in emps)
            //{
            //    Console.WriteLine($"Id = {emp.Eid} Name={emp.EName} City ={emp.City}");

            //} 
            #endregion

            #region Annomoyous Class
            //// Compiler generates class for you along with private member and getter and setter and parameterized consructor.
            //// If sequence of parameters changes in contructor, compiler creates new class for this new combination

            ////var e1 = new Emp() {Id = 1, Name="Ron", Address="Rome" };
            ////Console.WriteLine(e1.GetType().ToString());

            //var v1 = new { Id = 1, Name = "Ron", Address = "Rome" };
            //Console.WriteLine(v1.GetType().ToString());
            ////Console.WriteLine(v1.Name);

            //var v2 = new { Id = 2, Name = "Bob", Address = "Bombay" };
            //Console.WriteLine(v2.GetType().ToString());

            //var v3 = new { Id = 2, Address = "Bombay",Name = "Bob" };
            //Console.WriteLine(v3.GetType().ToString());

            //var v4 = new { Id = 2, Address = "Bombay", Name = 1234567 };
            //Console.WriteLine(v4.GetType().ToString()); 
            #endregion







        }


        public class Emp
        {


            private int _Eid;
            private String _EName;
            private String _City;

            public String City
            {
                get { return _City; }
                set { _City = value; }
            }


            public String EName
            {
                get { return _EName; }
                set { _EName = value; }
            }

            public int Eid
            {
                get { return _Eid; }
                set { _Eid = value; }
            }




        }




  


        public class Person
        {

            // Auto properties generated by vscode 
            //prop + tab
            public int Pid { get; set; }
            public String PName { get; set; }
            public String Address { get; set; }
        }

        public class MyClass {


            List<int> ConvertToList(int[] arr) { 
            List
            }
        
        }
    }

}