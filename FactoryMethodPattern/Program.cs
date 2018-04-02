using System;
using CoreFacotryPattern.Factory;

namespace CoreFacotryPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            try{
                IAutoFactory autoFactory = LoadFactory();
                IAuto auto = autoFactory.CreateAuto();
                auto.TurnOn();
                auto.TurnOff();
            }
            catch(Exception ex){
                Console.WriteLine(ex.Message);
            }

        }

        static IAutoFactory LoadFactory(){
            Type autoFactoryType = Type.GetType("CoreFacotryPattern.Factory.ToyotaFactory");
            object autoFactory = Activator.CreateInstance(autoFactoryType);
            IAutoFactory factory = autoFactory as IAutoFactory;
            return factory;
        }
    }
}
