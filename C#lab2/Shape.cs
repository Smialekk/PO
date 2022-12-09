using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab2ex1
{

    public class Shape
    {
        private double x, y, height, width;

        public virtual void Draw()
        {
            Console.WriteLine("Rysuje figure");
        }
    }
}
