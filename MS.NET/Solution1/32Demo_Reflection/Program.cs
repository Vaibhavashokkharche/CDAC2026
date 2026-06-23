using System.Reflection;
using System.Security.AccessControl;
using System.Windows.Markup;

namespace _32Demo_Reflection
{
    internal class Program_v1
    {
        static void Main(string[] args)
        {

            string assembleypath = @"C:\Users\IET\source\repos\Solution1\31Demo_MyLib\bin\Debug\net8.0\31Demo_MyLib.dll"; 

           Assembly assembly = Assembly.LoadFrom(assembleypath);

            Type[] alltypes= assembly.GetTypes();

            String methodsignature = "";
            for (int i = 0; i < alltypes.Length; i++)
            {  

             Type type = alltypes[i];

                Object ? dynamicallyCreatedObject=assembly.CreateInstance(type.FullName);

                MethodInfo [] allmethod =type.GetMethods(BindingFlags.Public|BindingFlags.Instance|BindingFlags.DeclaredOnly);

                for (int j = 0; j < allmethod.Length; j++) { 
                MethodInfo method = allmethod[j];
                    methodsignature = method.ReturnType.ToString() + " " + method.Name + "(";

                   ParameterInfo [] allparameter= method.GetParameters();
                    object[] objectargs= new object[allparameter.Length];
                    for (int k = 0; k < allparameter.Length; k++) { 
                    ParameterInfo currentparameter = allparameter[k];
                        Console.WriteLine("Enter the value of" + currentparameter.Name + "  parameter type" + currentparameter.ParameterType);
                        String input=Console.ReadLine();
                        Object? value = Convert.ChangeType(input, currentparameter.ParameterType);
                        objectargs[k] = value;
                 
                    }

                    object? result = type.InvokeMember(method.Name, BindingFlags.InvokeMethod, null, dynamicallyCreatedObject, objectargs);
                    
                    Console.WriteLine($"{method.Name}  = {result} ");



                }



            }


           





        }
    }
}
