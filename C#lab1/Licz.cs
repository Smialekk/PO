public class Licz
{
    private double number = 4.9;

    public Licz(double number)
    {
        this.number = number;
    }

    public double Dodaj(double x)
    {
        return this.number + x;
    }

    public double Odejmij(double x)
    {
        return this.number - x;
    }

    public void Show()
    {
        Console.WriteLine("Liczba wynosi " + this.number);
    }
}