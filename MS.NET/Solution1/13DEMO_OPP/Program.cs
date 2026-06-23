namespace _13DEMO_OPP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Person p = new Person();
            Console.WriteLine("enter the id");
            p.EId = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("enter the Ename");
            p.Ename = Console.ReadLine();
            Console.WriteLine("He? She is active in company");
            p.IsActive = Convert.ToBoolean(Console.ReadLine());
            HR h = new HR();
            h.HrName = "Ravina";
            p.HRProp = h;
            String[] wdays = new string[3];
            wdays[0] = "Sunday";
            wdays[1] = "Friday";
            wdays[2] = "Monday";
            p.Weekdays = wdays;

            Console.WriteLine($"Id: {p.EId} Ename ={p.Ename} IsActive= {p.IsActive} Hr={p.HRProp.HrName} Weekdays={p.Weekdays.ToString()}");

            for (int i = 0; i < p.Weekdays.Length; i++)
            {
                Console.WriteLine(p.Weekdays[i]);
            }

        }   
    }

    public class Person
    {
        private int _EId;
        private String _Ename;
        private bool _IsActive;
        private HR _hr;
        private String[] _Days;

        public int EId
        {
            set
            {
                _EId = value;
            }
            get
            {

                return _EId;

            }


        }


        public string Ename

        {
            set { _Ename = value; }
            get { return _Ename; }
        }


        public bool IsActive
        {
            set { _IsActive = value; }
            get { return _IsActive; }


        }
      public HR HRProp
        {
            set { _hr = value; }
            get { return _hr; }
        
     
        }
        public String[] Weekdays
        {
            set
            {
                _Days = value;
            }
            get { 
            return _Days;
            }
        }



    }
    public class HR
    {

        private String _HRName;


        public String HrName
        {
            set { _HRName = value; }
            get { return _HRName; }
        }



    }
}
