internal class Program
{
    private static void Main(string[] args)
    {

        //Ex. 1
        Licz num = new Licz(4.9);
        num.Show();
        Console.WriteLine(num.Dodaj(1.5));
        Console.WriteLine(num.Odejmij(4.8));

        Console.WriteLine();

        //Ex. 2
        double[] tab = { 2, 4, 5, -6, 0, -2 };
        Sumator sum = new Sumator(tab);
        Console.WriteLine(sum.Suma());
        Console.WriteLine(sum.SumaPodziel2());
        sum.show();
        Console.WriteLine();
        sum.printingByIndexes(1, 3);

        Console.WriteLine();

        //Ex. 3
        Date dt = new Date(2022, 11, 30);
        dt.print();
        dt.AddWeek();
        dt.print();

        Console.WriteLine();

        //Ex. 4
        Liczba number = new("4");
        number.Print();
        number.Factorial();
        number.Multiplication(2);
        number.Print();
        number.Factorial();
    }
}