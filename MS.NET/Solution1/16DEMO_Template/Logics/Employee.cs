using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _16DEMO_Template.Logics
{
    public class Employee
    {
        private int _EId;
        private string _Ename;
        private int _Age;
        private String _Gender;


        public int EID
        {
            set { _EId = value; }
            get { return _EId; } 

        }
        public string Ename
        {
            set {  _Ename = value; }
            get { return _Ename; }
        }
        public int Age { 
        set { _Age = value; }
            get { return _Age; }
        }
        public String Gender { 
        set { _Gender = value; }
            get { return _Gender; }
        }

    }
}
