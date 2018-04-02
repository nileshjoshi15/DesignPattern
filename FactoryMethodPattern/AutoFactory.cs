using System;
namespace CoreFacotryPattern
{
    public static class AutoFactory
    {
        public static IAuto CreateAutoInstance(string autoName){
            
            Type autoType = Type.GetType("CoreFacotryPattern." +autoName);
            object autoInstance = Activator.CreateInstance(autoType);
            IAuto auto = autoInstance as IAuto;
            return auto;
        }
    }
}
