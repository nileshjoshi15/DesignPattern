using System;
namespace CoreFacotryPattern.Factory
{
    public class HondaFactory : IAutoFactory
    {
        public IAuto CreateAuto()
        {
            return new Honda();
        }
    }
}
