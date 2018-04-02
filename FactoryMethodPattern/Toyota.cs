using System;
namespace CoreFacotryPattern
{
    public class Toyota : IAuto
    {
        public void TurnOff()
        {
            Console.WriteLine("Toyota started ");
        }

        public void TurnOn()
        {
            Console.WriteLine("Toyota Stoped ");
        }
    }
}
