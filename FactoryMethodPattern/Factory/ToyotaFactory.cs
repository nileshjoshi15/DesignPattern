using System;
namespace CoreFacotryPattern.Factory
{
    public class ToyotaFactory : IAutoFactory
    {
        public IAuto CreateAuto()
        {
            return new Toyota();
        }
    }
}
