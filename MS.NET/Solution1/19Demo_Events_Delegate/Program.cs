using Microsoft.VisualBasic;

namespace _19Demo_Events_Delegate
{
    public delegate void ResultHandler(int marks);
    internal class Program
    {
        static void Main(string[] args)
        {
            #region UsingDelegateOnly
            //Student stu = new Student();
            //Console.WriteLine("Enter the marks");
            //int marks = Convert.ToInt32(Console.ReadLine());
            //stu.Result(marks);


            //ResultHandler handler = new ResultHandler(stu.Result);

            //handler.Invoke(marks);  
            #endregion

            #region UsingEventandDelegate
            //  Student stud = new Student();
            //  stud._Pass += new ResultHandler(stud.Pass_Student);
            //  stud._Fail += new ResultHandler(stud.Fail_Student);
            //  Console.WriteLine("Enter the marks");

            //int mark = Convert.ToInt32(Console.ReadLine());
            //  stud.Result(mark); 
            #endregion


            #region UsingEventDelegateOnSetterMethod //Most safe way
            Student stu = new Student();

            stu._Pass += new ResultHandler(stu.Pass_Student);
            stu._Fail += new ResultHandler(stu.Fail_Student);

            stu.marks = Convert.ToInt32(Console.ReadLine()); 
            #endregion

        }
    }



    public class Student {
        public event ResultHandler _Result;


        public event ResultHandler _Pass;
        public event ResultHandler _Fail;

        private int _marks;

        public int marks
        {
            set { _marks = value;

                if (value > 40)
                {
                    _Pass.Invoke(value);
                }
                else { 
                _Fail.Invoke(value);
                }
            }
            get { return _marks; }
        }
    
    

    public void Result(int mark) {
            if (mark >= 40)
            {
                _Pass.Invoke(mark);

            }
            else {
                _Fail.Invoke(mark);
            }
        }
        public void Pass_Student(int mark) {


            Console.WriteLine($"Congratulation your are pass with {mark}");
        }

        public void Fail_Student(int mark)
        {

          Console.WriteLine($"Opps!! your are Failed with {mark}");

        }


    }

}
