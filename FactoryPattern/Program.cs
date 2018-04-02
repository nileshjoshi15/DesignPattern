using System;

namespace CoreFacotryPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            try{
                IAuto auto = AutoFactory.CreateAutoInstance("Toyota");
                auto.TurnOn();
                auto.TurnOff();
            }
            catch(Exception ex){
                Console.WriteLine(ex.Message);
            }

        }
    }
}
