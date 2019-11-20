using System;
using System.Collections.Generic;
using System.Text;

namespace CodeWars
{
    public static class VowelCount
    {
        public static int GetVowelCount(string str)
        {
            int vowelCount = 0;
            str = str.ToUpper();
            vowelCount = (str.Length - str.Replace("A","").Length) +
                (str.Length - str.Replace("E","").Length) +
                (str.Length - str.Replace("I","").Length) +
                (str.Length - str.Replace("O","").Length) +
                (str.Length - str.Replace("U","").Length);
            return vowelCount;
            
        }

    }
}
