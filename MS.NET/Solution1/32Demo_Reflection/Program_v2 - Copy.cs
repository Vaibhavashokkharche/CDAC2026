//using System.Reflection;

//namespace _32Demo_Reflection
//{
//    internal class Program_v1
//    {
//        static void Main(string[] args)
//        {

//            string assembleypath = @"C:\Users\IET\source\repos\Solution1\31Demo_MyLib\bin\Debug\net8.0\31Demo_MyLib.dll"; 

//           Assembly assembly = Assembly.LoadFrom(assembleypath);

//            Type[] alltypes= assembly.GetTypes();

//            String methodsignature = "";
//            for (int i = 0; i < alltypes.Length; i++)
//            {  

//             Type type = alltypes[i];

//                MethodInfo [] allmethod =type.GetMethods();

//                for (int j = 0; j < allmethod.Length; j++) { 
//                MethodInfo method = allmethod[j];
//                    methodsignature = method.ReturnType.ToString() + " " + method.Name + "(";

//                   ParameterInfo [] allparameter= method.GetParameters();

//                    for (int k = 0; k < allparameter.Length; k++) { 
//                    ParameterInfo currentparameter = allparameter[k];
//                        methodsignature = methodsignature + currentparameter.ParameterType + " " + currentparameter.Name + ",";

                    
                    
                 
//                    }
//               methodsignature=methodsignature.TrimEnd(',') + ");" ;
//                    Console.WriteLine(methodsignature);




//                }



//            }


           





//        }
//    }
//}
