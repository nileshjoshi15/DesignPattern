using System;
namespace CoreFacotryPattern
{
    public class Honda : IAuto
    {
        public void TurnOff()
        {
            Console.WriteLine("Honda started ");
        }

        public void TurnOn()
        {
            Console.WriteLine("Honda Stoped ");
        }
    }
}
