using _41Demo_CrudApp;
using Microsoft.Data.SqlClient;
using Microsoft.IdentityModel.Tokens;
using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Security.Cryptography;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace _41Demo_CrudApp.DAL
{
    public class EmpDao
    {
        string _connection = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=test;Integrated Security=True";


        public int AddNewEmployee(Employee e)
        {
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
            int n = cmd.ExecuteNonQuery();
            conn.Close();
            return n;
        }



        public int UpdateEmployee(Employee e)
        {
            SqlConnection conn = new SqlConnection(_connection);

           // string query = $"Insert into Emp values('{e.Id}', '{e.Name}','{e.Address}')";
            string query = $"Update  emp set Name='{e.Name}', Address='{e.Address}' where Id={e.Id}";

            SqlCommand cmd = new SqlCommand(query, conn);

            conn.Open();
            int n = cmd.ExecuteNonQuery();
            conn.Close();
            return n;
        }




        public List<Employee> GetEmployees()
        {

            SqlConnection conn = new SqlConnection(_connection);
            SqlCommand cmd = new SqlCommand("Select * from emp", conn);
            conn.Open();
            List<Employee> emplist = new List<Employee>();
            SqlDataReader reader = cmd.ExecuteReader();

            while (reader.Read())
            {

                Employee? e = new Employee();
                e.Id = Convert.ToInt32(reader["Id"]);
                e.Name = Convert.ToString(reader["Name"]);
                e.Address = Convert.ToString(reader["Address"]);
                emplist.Add(e);

            }
            conn.Close();
            return emplist;

        }

        public int DeleteEmployeeById(int id)
        {

            SqlConnection conn = new SqlConnection(_connection);
            string query = "Delete from emp where id=@Id";
            SqlCommand cmd = new SqlCommand(query, conn);
            cmd.Parameters.AddWithValue("@Id", id);
            conn.Open();
            int n = cmd.ExecuteNonQuery();
            conn.Close();

            return n;


        }

        public List<Employee> GetEmployeeByAdd(String addr)
        {
            List<Employee> elist = new List<Employee>();
            using (SqlConnection conn = new SqlConnection(_connection))
            {
                string query = $"Select * from emp where Address='{addr}'";

                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandText = query;
                    cmd.CommandType = System.Data.CommandType.Text;
                    cmd.Connection = conn;
                    conn.Open();
                    SqlDataReader reader = cmd.ExecuteReader();


                    while (reader.Read())
                    {
                        Employee e = new Employee();
                        e.Id = Convert.ToInt32(reader["Id"]);
                        e.Name = Convert.ToString(reader["Name"]);
                        e.Address = Convert.ToString(reader["Address"]);
                        elist.Add(e);

                    }



                }


            }
            return elist;
        }


        public List<Employee> GetEmployeesByName(string nm) {
            List<Employee> elist = new List<Employee>();
            using (SqlConnection conn = new SqlConnection(_connection)) {

                string query = $"Select * from emp where Name='{nm}'";

                using (SqlCommand cmd = new SqlCommand()) {
                    cmd.CommandText = query;
                    cmd.CommandType = System.Data.CommandType.Text;

                    cmd.Connection = conn;
                    conn.Open();

                    SqlDataReader reader = cmd.ExecuteReader();


                    while (reader.Read())
                    {
                        Employee e = new Employee();
                        e.Id = Convert.ToInt32(reader["Id"]);
                        e.Name = Convert.ToString(reader["Name"]);
                        e.Address = Convert.ToString(reader["Address"]);
                        elist.Add(e);

                    }
                }
            }

            return elist;
        }





        public Employee GetEmployeeById(int eid)
        {
            Employee emp = new Employee();
            string query = $"Select * from emp where Id={eid}";
            using (SqlConnection conn = new SqlConnection(_connection))
            {
                using (SqlCommand cmd = new SqlCommand())
                {

                    cmd.CommandText = query;
                    cmd.CommandType = System.Data.CommandType.Text;
                    cmd.Connection = conn;
                    conn.Open();
                    SqlDataReader reader = cmd.ExecuteReader();
                    while (reader.Read())
                    {
                        emp.Id = Convert.ToInt32(reader["Id"]);
                        emp.Name = Convert.ToString(reader["Name"]);
                        emp.Address = Convert.ToString(reader["Address"]);
                    }

                }
            }

            return emp;
        }
    }
    }

