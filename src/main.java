public class main {
    public static void main(String[] args) {
       String Bagas[] = {
               "Bagas", "Alim", "Santoso", "Belajar Array"
        };

        for (String nama: Bagas) {
            System.out.println(nama);
        }

        sayHelloWorld("Bagong", "Pakle");

        sum(6, 9);
        int nilai[] = {90,80,70,60,95};
        sayCongrats("Pakle", nilai );
        sayCongrats("Paklekkkk", 80,90 );

        System.out.println(factorial(5));
    }
    static void sayHelloWorld(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static int sum(int a, int b) {
        int total = a + b;
        System.out.println(total);
        return total;
    }

    static void sayCongrats(String nama, int... value) {
        int total = 0;
        for (int nilai: value) {
            total += nilai;
        }

        int  finalValue = total / value.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + nama + " Kamu Lulus");
        } else {
            System.out.println("Maaf " + nama + " Kamu mengulang kelas tahun depan");
        }
    }

    static int factorial(int value){
        if (value == 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }

}
