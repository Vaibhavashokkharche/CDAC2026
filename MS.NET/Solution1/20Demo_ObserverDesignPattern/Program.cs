using System.Data.SqlTypes;

namespace _20Demo_ObserverDesignPattern
{
    public delegate void Alerthandler();
    internal class Program
    {
        static void Main(string[] args)

        {
            Publisher publisher1 = new Publisher(); //observer with subscriber
            Subscriber subscriber1 = new Subscriber();
            Subscriber subscriber2 = new Subscriber();

            //Alerthandler handler = new Alerthandler(subscriber1.SmsServices);
            //Alerthandler handler1 = new Alerthandler(subscriber2.EmailServices);


            //coupling to the publisher
            publisher1.NotifyChange += new Alerthandler(subscriber1.EmailServices);
            publisher1.NotifyChange += new Alerthandler(subscriber2.SmsServices);
            WeatherStation weatherStation = new WeatherStation();
            Console.WriteLine("Does any change in Weather true/false");
            bool Ischange = Convert.ToBoolean(Console.ReadLine());
            if (weatherStation.Alert(Ischange))
            {
                publisher1.RaiseNotification();
            }
            else { 
            
            Console.WriteLine("No any change in Weather");
            
            }
            






        }
    }

    public class WeatherStation() {

        public bool Alert(bool Ischange) {


            return Ischange;
        } 
    
    
    }

    public class Publisher() {     //observer
        public event Alerthandler NotifyChange;




        public void RaiseNotification() {

            NotifyChange();
        }
    
    }









    public class Subscriber {

        public void SmsServices() {

            Console.WriteLine("SMS sent because of data change");
        }
        public void EmailServices()
        {

            Console.WriteLine("Email sent because of data change");
        }
        public void WhatsappServices()
        {

            Console.WriteLine("WMessage sent because of data change");
        }
        

    }
}
