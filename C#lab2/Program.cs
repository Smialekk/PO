using lab2ex1;
using System.Drawing;

class Program
{
    public static void Main(string[] args)
    {
        var r = new Rectangle();
        var c = new Circle();
        var t = new Triangle();

        var list = new List<Shape>();

        list.Add(r);
        list.Add(c);
        list.Add(t);

        for (int i = 0; i < 3; i++)
        {
            list[i].Draw();
        }
    }
}