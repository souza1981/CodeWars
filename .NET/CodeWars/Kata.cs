using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CodeWars
{
    class Kata
    {
        public static IEnumerable<T> UniqueInOrder<T>(IEnumerable<T> iterable)
        {
            var result = new List<T>();
            foreach (var elemento in iterable)
            {
                if (result.Count == 0)
                {
                    result.Add(elemento);
                    continue;
                }
                if (!result.Last().Equals(elemento))
                {
                    result.Add(elemento);
                }
            }

            return result;
        }
    }
}
