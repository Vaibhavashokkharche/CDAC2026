using System.Collections;
using System.Numerics;
using System.Reflection.Metadata;
using System.Runtime.Intrinsics.X86;

namespace _22Demo_Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Array
            //int[] arr = new int[3];
            //arr[0] = 10;
            //arr[1] = 20;
            //arr[2] = 30;

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Console.WriteLine(arr[i]);

            //}
            #endregion
            #region StringArrayManipulation
            //string[] arr = new string[5];
            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Console.WriteLine("Enter the name of family member");

            //    arr[i] = Console.ReadLine();

            //}
            //// extarcting the data from array
            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Console.WriteLine(arr[i]);
            //}
            #endregion
            #region EmployeeObjectManipulation

            //ct obj = emparr[i];
            //    Employee emp = (Employee)obj; // Type casting 
            //    Console.WriteLine($"Eid = {emparr[i].Eid} Ename = {emparr[i].Ename} Address = {emparr[i].Address}");
            //    Console.Write //Employee[] emparr = new Employee[2];
            //for (int i = 0; i < emparr.Length; i++)
            //{
            //    Employee emp = new Employee();
            //    Console.WriteLine("Enter the eid");
            //    emp.Eid = Convert.ToInt32(Console.ReadLine());
            //    Console.WriteLine("Enter the ename");
            //    emp.Ename = Console.ReadLine();
            //    Console.WriteLine("Enter the Add");
            //    emp.Address = Console.ReadLine();
            //    if (emp != null)
            //    {
            //        emparr[i] = emp;
            //    }

            //}

            ////extracting the employee data

            //for (int i = 0; i < emparr.Length; i++)
            //{
            //    objeLine($"Eid = {emp.Eid} Ename = {emp.Ename} Address = {emp.Address}");
            //}
            #endregion

            #region BoxingUnBoxingTypeCasting
            //Employee emp = new Employee();
            //// so these is an Object class array so its hold all entities in Object from
            //// Boxing and TypeCasting will done as per data;
            //Object[] arr = new object[5];

            //arr[0] = 100;  //Boxing
            //arr[1] = "Vaibhav"; //TypeCast // upCasting
            //arr[2] = 10.20; //Boxing
            //arr[3] = true; //Boxing
            //arr[4] = emp;  //type Cast


            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Console.WriteLine(arr[i]);
            //    if (arr[i] is Employee)
            //    {
            //        Console.WriteLine(arr[i].ToString());
            //    }
            //}

            #endregion


      //Collection is an framwork in that we store the elements in form of object only 
      //Collection is an internally use a array and it growable not fixed;
            #region Collection/ArrayList
            ArrayList obj = new ArrayList();

            obj.Add(10);
            obj.Add(20);
            obj.Add(30);
            obj.Add(50);
            //obj.Reverse; 

            int pos = obj.BinarySearch(30);
            Console.WriteLine(pos);
            foreach (var item in obj)
            {
                Console.WriteLine(item);
            }
            #endregion

            //Stack Data structure LIFO

            #region QueueDataStructure
            #region StackDataStructure
            //Stack stack = new Stack();
            //stack.Push(100);
            //stack.Push(200);
            //stack.Push(300);
            //stack.Push(400);
            //Console.WriteLine(stack);
            //int len = stack.Count;
            //for (int i = 0; i < len; i++)
            //{



            //    Console.WriteLine(stack.Pop());



            //} 
            #endregion

/*            Queue queue = new Queue();
            queue.Enqueue(100);
            queue.Enqueue(200);
            queue.Enqueue(300);
            queue.Enqueue(500);

            int qlength = queue.Count;

            for (int i = 0; i < qlength; i++)
            {

                Console.WriteLine(queue.Dequeue());

            } */
            #endregion
        }
    public class Employee
    {
        private int _Eid;
        private String _EName;
        private String _Address;

        public int Eid
        {
            set { _Eid = value; }
            get { return _Eid; }
        }

        public String Ename
        {
            set { _EName = value; }
            get { return _EName; }

        }
        public String Address
        {
            set { _Address = value; }
            get { return _Address; }
        }

        public override string ToString()
        {
            return $"Id= {this.Eid}, Name={this.Ename} ,Address ={this.Address}";
        }





    }
}