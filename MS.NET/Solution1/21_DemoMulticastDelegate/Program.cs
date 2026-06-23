namespace _21_DemoMulticastDelegate

{
    public delegate void MyHandler();
    internal class Program
    {
        static void Main(string[] args)
        {
           AnnualFunction obj = new AnnualFunction();
            MyHandler handler = new MyHandler(obj.Welcome);
            Console.WriteLine("If the special Guest is available");
            bool isThere=Convert.ToBoolean(Console.ReadLine());

            handler += new MyHandler(obj.HostSpeech);
            handler += new MyHandler(obj.GuestSpeech);
            //depedancy if special guest is not available
            // sowe skip the program and move to next activity

            if (isThere)
            {
                handler += new MyHandler(obj.SpecialGuestSpeech);
            }
            else {
                handler -= new MyHandler(obj.SpecialGuestSpeech);
            }

                handler += new MyHandler(obj.Dance);
            handler += new MyHandler(obj.DinnerParty);
            handler += new MyHandler(obj.GoodBye);
            handler += new MyHandler(obj.PackUp);



            handler();





        }
    }








    public class AnnualFunction() {

        public void Welcome() {

            Console.WriteLine("Welcome to our function !!");
        }
        public void HostSpeech() {
            Console.WriteLine("Host: giving some introductory speech !!");

        }
        public void GuestSpeech() {

            Console.WriteLine("Guest: All is well!!");
        }
        public void SpecialGuestSpeech() {

            Console.WriteLine("SpecialGuest: All is well");
        }
        public void Dance() {
            Console.WriteLine("Dance mode On");
        }

        public void DinnerParty() {

            Console.WriteLine("Enjoy your food !!");
        }
        public void GoodBye() { 
        Console.WriteLine("Good Bye the function is over");
        }

        public void PackUp()
        {
            Console.WriteLine("Packed up ... Finally !!!");

        }





    }






}
