public class Liczba
{
    private int[] tab;

    public Liczba(string number)
    {
        int[] temp = new int[number.Length];
        for (int i = 0; i < number.Length; i++) temp[i] = (int)Char.GetNumericValue(number[i]);
        this.tab = temp;
    }

    public void Print()
    {
        Console.Write("Liczba to: ");
        for (int i = 0; i < tab.Length; i++) Console.Write(tab[i]);
        Console.WriteLine();
    }

    public void Multiplication(int mult)
    {
        string temp = "";
        for (int i = 0; i < tab.Length; i++) temp += tab[i];

        int nt = (int)int.Parse(temp);

        nt *= mult;

        string newNum = nt.ToString();

        int[] tempTab = new int[newNum.Length];
        for (int i = 0; i < newNum.Length; i++) tempTab[i] = (int)Char.GetNumericValue(newNum[i]);
        this.tab = tempTab;
    }

    public void Factorial()
    {
        string temp = "";
        for (int i = 0; i < tab.Length; i++) temp += tab[i];

        int factorial = 1;
        int nt = (int)int.Parse(temp);

        for (int i = 1; i <= nt; i++) factorial *= i;

        Console.WriteLine("Silnia z " + nt + " wynosi " + factorial);
    }
}