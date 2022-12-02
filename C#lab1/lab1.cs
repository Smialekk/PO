internal class lab1
{
    static void Main(string[] args)
    {
        //Ex. 9
        int number = 0;

        do
        {
            Console.WriteLine("\nWpisz liczbe od 1 do 9, aby wyswietlic dane zadanie. Wpisz 0, aby zakonczyc");
            number = int.Parse(Console.ReadLine());

            switch (number)
            {
                case 0:
                    break;
                case 1:
                    ex1();
                    break;
                case 2:
                    ex2();
                    break;
                case 3:
                    ex3();
                    break;
                case 4:
                    ex4();
                    break;
                case 5:
                    ex5();
                    break;
                case 6:
                    ex6();
                    break;
                case 7:
                    ex7();
                    break;
                case 8:
                    ex8();
                    break;
                case 9: //zad10
                    ex10();
                    break;
                default:
                    Console.WriteLine("Nie ma takiego zadania.");
                    break;
            }
        } while (number != 0);

        

        Console.WriteLine("\n\nSee Ya!");
    }

    static void ex1()
    {
        string id = "007997";
        Console.WriteLine(id);
    }

    static void ex2()
    {
        Console.Write("\nPodaj liczbe: ");
        int number = int.Parse(Console.ReadLine());

        if (number % 2 == 0) Console.WriteLine("Liczba "+ number + " jest parzysta");
        else Console.WriteLine("Liczba " + number + " jest niaparzysta.");
    }

    static void ex3()
    {
        Console.Write("\nWprowadz 1. liczbe: ");
        double a = double.Parse(Console.ReadLine());
        Console.Write("Wprowadz 2. liczbe: ");
        double b = double.Parse(Console.ReadLine());

        if (a > b) Console.WriteLine("Liczba " + a + " jest wieksza.");
        else if (b > a) Console.WriteLine("Liczba " + b + " jest wieksza");
        else Console.WriteLine("Liczby sa rowne.");
    }

    static void ex4()
    {
        Console.Write("\nPodaj 4 liczby: ");
        double number1 = double.Parse(Console.ReadLine());
        double number2 = double.Parse(Console.ReadLine());
        double number3 = double.Parse(Console.ReadLine());
        double number4 = double.Parse(Console.ReadLine());

        double sr = (number1 + number2 + number3 + number4) / 4;

        Console.WriteLine("Srednia tych liczb wynosi: " + sr);
    }

    static void ex5()
    {
        Console.Write("\nPodaj Liczbe");
        double a = double.Parse(Console.ReadLine());
        Console.Write("Wprowadz znak dzialania: ");
        char z = char.Parse(Console.ReadLine());
        Console.Write("Podaj 2 liczbe");
        double b = double.Parse(Console.ReadLine());
        double result;

        switch (z)
        {
            case '+':
                result = a + b;
                Console.WriteLine("Wynik: " + result);
                break;
            case '-':
                result = a - b;
                Console.WriteLine("Wynik: " + result);

                break;
            case '*':
                result = a * b;
                Console.WriteLine("Wynik: " + result);
                break;
            case '/':
                result = a / b;
                Console.WriteLine("Wynik: " + result);
                break;
            default:
                Console.WriteLine("Nie ma takiego dzialania.");
                break;
        }
    }

    static void ex6()
    {
        Console.Write("\nWprowadz liczbe: ");
        int x = int.Parse(Console.ReadLine());

        int i = 0;
        for (i = 0; i < x; i++) Console.Write(i + " ");

        Console.WriteLine();

        i = 0;
        while (i < x)
        {
            Console.Write(i + " ");
            i++;
        }

        Console.WriteLine();

        i = 0;
        do
        {
            Console.Write(i + " ");
            i++;
        } while (i < x);
    }

    static void ex7()
    {
        Console.Write("\nWprowadz liczbe: ");
        int x = int.Parse(Console.ReadLine());
        Boolean prime = true;

        for (int i = 2; i < x; i++) if (x % i == 0) prime = false;

        if (prime) Console.WriteLine(x + " to liczba pierwsza.");
        else Console.WriteLine(x + " to nie liczba pierwsza.");
    }

    static void ex8()
    {
        Console.WriteLine("\nTysiac liczb pierwszych: ");
        int counter = 0;
        int i, j;

        for (i = 2; counter < 1000; i++)
        {
            Boolean prime = true;

            for (j = 2; j < i; j++)
            {
                if (i % j == 0) prime = false;
            }

            if (prime)
            {
                Console.Write(i + " ");
                counter++;
            }
        }

        Console.WriteLine();

        i = 2;
        j = 2;
        counter = 0;
        while (counter < 1000)
        {
            Boolean prime = true;

            for (j = 2; j < i; j++)
            {
                if (i % j == 0) prime = false;
            }

            if (prime)
            {
                Console.Write(i + " ");
                counter++;
            }

            i++;
        }

        Console.WriteLine();

        i = 2;
        j = 2;
        counter = 0;
        do
        {
            Boolean prime = true;

            for (j = 2; j < i; j++)
            {
                if (i % j == 0) prime = false;
            }

            if (prime)
            {
                Console.Write(i + " ");
                counter++;
            }

            i++;
        } while (counter < 1000);
    }

    static void ex10()
    {
        Console.Write("\nWprowadz wielkosc piramidy: ");
        int n = int.Parse(Console.ReadLine());

        for (int i = 1; i <= n; i++)
        {
            int g = (int)Math.Pow(2, i);
            Console.Write(g + ", ");

            for (int j = 1; j <= i - 1; j++)
            {
                Console.Write((g + j) + ", ");
            }

            Console.WriteLine();
        }
    }
}

