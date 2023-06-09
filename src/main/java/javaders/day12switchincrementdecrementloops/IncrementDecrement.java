package javaders.day12switchincrementdecrementloops;

public class IncrementDecrement
{
    public static void main(String[] args)
    {

/*
            1)"Increment" artirmak demektir, "Decrement" azaltmak demektir.
            2)"Increment" toplama ve carpma ile, "Decrement" cikarma ve bolme ile yapilabilir
            3)"Increment" ve "Decrement" 3 yolla yapilabilir
               i) int i = 12; ==> i = i + 5;
               ii) int i = 12; ==> i += 5;
               iii) int i = 12; ==> i++;
                    Note: 3. yol sadece 1 artirmak icin kullanilabilir.
               iiii) int i = 12; ==> i *= 5; "Carpma"

               i) int i = 12; ==> i = i - 5;
               ii) int i = 12; ==> i -= 5;
               iii) int i = 12; ==> i--;
                    Note: 3. yol sadece 1 azaltmak icin kullanilabilir.
               iiii) int i = 12; ==> i /= 5; "Bolme"
         */

        //-------------------INCREMENT-------------------

        int age = 12;

        age = age + 1 ;
        age += 1;
        age++;//sadece 1 arttirmak icin

        int salary = 120000;

        salary = (int) (salary * 1.1);
        salary *= 1.1;

        //-------------------DECREMENT-------------------

        int price = 12;

        price = price - 3;
        price -= -3;
        price --;//sadece 1 eksiltme icin

        int salary2 = 1200;

        salary2 = salary /3;
        salary2 /= 3;

        age = age++; //Post increment
        age = ++age; //pre increment

        salary = salary--; //post decrement
        salary = --salary; //pre decrement

    }
}
