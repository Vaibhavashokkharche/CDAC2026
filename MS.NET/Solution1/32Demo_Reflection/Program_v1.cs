//using System.Reflection;

//namespace _32Demo_Reflection
//{
//    internal class Program_v1
//    {
//        static void Main(string[] args)
//        {

//            string assembleypath = @"C:\Users\IET\source\repos\Solution1\31Demo_MyLib\bin\Debug\net8.0\31Demo_MyLib.dll"; 

//            Assembly assembly=Assembly.LoadFrom(assembleypath);

//        Type [] alltypes=assembly.GetTypes();

//            for (int i = 0; i < alltypes.Length; i++)
//            {
//                Type type = alltypes[i];
//                #region Type_Properties

//                // Console.WriteLine(type.IsPublic);
//                // Console.WriteLine(type.Name);
//                //Console.WriteLine(type.Namespace);
//                // Console.WriteLine(type.FullName);
//                // Console.WriteLine(type.IsSealed);
//                // Console.WriteLine(type.IsGenericType);

//                #endregion

//              MethodInfo [] allmethods=  type.GetMethods();

//                for(int j = 0; j < allmethods.Length; j++)
//                {
//                   MethodInfo method= allmethods[j];

//                    //Console.WriteLine(method.Name);
//                    //Console.WriteLine(method.ReturnType.ToString());
//                  ParameterInfo[] allparameter=  method.GetParameters();
//                    for (int k = 0; k < allparameter.Length; k++) { 
                    
//                    ParameterInfo currentparamerter= allparameter[k];
//                       Console.WriteLine(currentparamerter.Name +" "+ currentparamerter.ParameterType.ToString());
                    
//                    }
//                }





//            }


//        }
//    }
//}
