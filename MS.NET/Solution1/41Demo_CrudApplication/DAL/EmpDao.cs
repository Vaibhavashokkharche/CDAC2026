using _41Demo_CrudApplication.Models;
using Microsoft.Data.SqlClient;
using Microsoft.IdentityModel.Tokens;
using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _41Demo_CrudApplication.DAL
{
    public class EmpDao
    {
        string _connection = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=test;Integrated Security=True";
      

        public int AddNewEmployee(Employee e) {
            SqlConnection conn = new SqlConnection(_connection);

            //string query = "INSERT INTO Emp (Name, Department, Salary) VALUES (@Name, @Dept, @Salary);";
            //cmd.Parameters.AddWithValue("@Name", e.Name);
            //cmd.Parameters.AddWithValue("@Dept", e.Department);
            //cmd.Parameters.AddWithValue("@Salary", e.Salary);
            string query = "insert into emp(Id , Name, Address) values(@Id, @Name, @Address)";
           SqlCommand cmd = new SqlCommand(query, conn);
            cmd.Parameters.AddWithValue("@Id", e.Id);
            cmd.Parameters.AddWithValue("@Name", e.Name);
            cmd.Parameters.AddWithValue("@Address", e.Address);
            conn.Open();
            int n= cmd.ExecuteNonQuery();
            conn.Close();
            return n;
        }
    }
}
