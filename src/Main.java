import javax.sound.midi.Soundbank;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // 1 task
        //  Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.

        int a = 2;
        int b = 1;
        sum(a, b);
        sum(2, 1);

//        // 2 task
//        // Sukurkite Funkciją kuri vadinasi PISq.
//        // Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.

           System.out.println("Number is " + PISq());

//        // 3 task
//        //Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija gražina skaičių sandaugą.;
//        // Gautą reikšmę atspausdinkite.

        int c = 3;
        int d = 2;
        digits(c,d);
        int multi = digits(c,d);
        System.out.println(multi);
        System.out.println(digits(c,d));

//        // 4 task
//        //   Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą
//        //  ir atspausdina kiekvieną skaičių.

        int [] symbols = {10,20,30,40,50};
        System.out.println(symbols);
        sequence(symbols);

//        // 5 task
//        // Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max
//        // reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų.

        int min = 5;
        int max = 10;
        value(min, max);
        System.out.println(value(min,max));

//        // 6 task
////        Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų.
////        Funkcija priima tris int tipo kintamuosius, min, max ir length reikšmėms nustatyti.

        int min = 3;
        int max = 9;
        int length = 11;
        int[] array = randomized((int)min 2, (int)max 9, (int)length 11);
        randomized(array);

//        // 7 task
//        //   Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.

        int[] array = {3, 9, 11};
        int sum = calculate(array);
        System.out.println("The sum is " + sum);

//        // 8 task
//        // Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).

        int[] array = {3, 9, 11};
        double average = calculateAverage(array);
        calculateAverage(array);
        System.out.println("Average: " + average);

//        // 9 task
////        Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
////        Pirmas int - išoriniam ciklui, antras vidiniam.

        int columns = 5;
        int rows = 10;
        createRectangle(columns, rows);

//        // 10 task
////        Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų.
////        Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)

          String text = "Today it is a beautiful day";
          printSentence(text);

//        // 11 task
////        Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų.
////        Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis “silgaN”.

        String words = "Dolce Vita";
        otherwise(words);
        System.out.println(words);
        System.out.println(otherwise(words));

        // 1 task +
        // Parašykite funkciją,
        // kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje
        // pridedant “---” pradžioje ir gale. PVZ (---labas---)

        String keyword = "Hello";
        symbols(keyword);


        // 2 task +
//        Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių).
//        Atspausdinkite simbolius stulpeliu. Jei tai skaičius apgaubkite “ [ 7 ]”.
//        Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].

    }
    public static void sum(int a, int b) {
        int total = a + b;
        System.out.println(total);
    }
    public static double PISq() {
        return 9.8596 ;
    }
    public static int digits (int c, int d) {
        int multi = c * d;
        return multi;
    }
    public static void sequence(int[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            System.out.println(symbols[i] + " ");
        }
        System.out.println();
    }

    public static int value(int min, int max) {
    return min + (int) Math.round(Math.random() * (max - min));
    }

    public static void randomized(int min, int max, int length) {
        int [] array = new int [length];
        for (int i = 0; i < length; i++) {
            array[i] = min + (int) Math.round(Math.random() * (max - min));
        }
        return array;
    }
    public static int calculate(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (double) sum / array.length;
    }

    public static void createRectangle(int columns, int rows) {
      if (columns <=0 && rows <= 0) {
          System.out.println("Rectangle is not possible");
          return;
      }
      for (int i = 0; i < rows ; i++) {
          for (int c = 0; c < columns; c++) {
              System.out.print("*");
          }
          System.out.println();
      }
    }

    public static void printSentence(String text) {
        int letters = 0;
        int spaces = 0;
        for (char t : text.toCharArray()) {
            if (Character.isLetter(t)) {
                letters++;
            } else if (Character.isWhitespace(t)) {
                spaces++;
            }
        }
        System.out.println("Total amount of letter is " + letters);
        System.out.println("Total amount of spaces is " + spaces);
      }

    public static String otherwise(String words) {
        String reverse = "";
        int length = words.length();
          for (int i = length -1 ; i >= 0 ; i --) {
              reverse = reverse + words.charAt(i);
          }
          return reverse;
      }

    public static void symbols(String keyword) {
        System.out.print("---");
        System.out.print(" " + keyword);
        System.out.print("---");
    }




}



