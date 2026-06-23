using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeManagementSystem
{
    internal class Emp
    {
        private int empId;
        private string empName;
        private string designation;

        public Emp(int id, string name, string desig)
        {
            empId = id;
            empName = name;
            designation = desig;
        }

        // Setters
        public void SetEmpId(int id)
        {
            empId = id;
        }

        public void SetEmpName(string name)
        {
            empName = name;
        }

        public void SetDesignation(string desig)
        {
            designation = desig;
        }

        // Getters
        public int GetEmpId()
        {
            return empId;
        }

        public string GetEmpName()
        {
            return empName;
        }

        public string GetDesignation()
        {
            return designation;
        }







    }
}
