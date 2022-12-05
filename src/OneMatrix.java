import java.util.Random;

public class OneMatrix {

    static Random rn = new Random();
    static int[][] matrix = new int[3][3];

    public static void main(String[] args){

        int regula = rn.nextInt(3); //1 - liczby  2 - ksztalt  3 - kolor

        suma();
    }

    public static void liczby(){

        if(rn.nextInt(2) == 0)
            ciagAretmetyczny();
        if (rn.nextInt(2) == 1)
            ciagGeometryczny();

        //Reguly
        //mnozenie
        //podneszenie do potegi



    }

    public static void ciagAretmetyczny(){

        for (int i = 0; i < 3; i++) {
            matrix[i][0] = rn.nextInt(100);
        }

        for (int i = 0; i < 3; i++) {
            int dodawanie = rn.nextInt(-15, 15);
            for (int j = 0; j < 3; j++) {
                if(j != 0){
                    matrix[i][j] = matrix[i][j - 1] + dodawanie;
                }
            }
        }
    }

    public static void ciagGeometryczny(){

        for (int i = 0; i < 3; i++) {
            matrix[i][0] = rn.nextInt(20);
        }

        for (int i = 0; i < 3; i++) {
            int q = rn.nextInt(-10, 10);

            while (q == 0)
                q = rn.nextInt(-10, 10);

            for (int j = 0; j < 3; j++) {
                if(j != 0){
                    matrix[i][j] = matrix[i][j - 1] * q;
                }
            }
        }
    }

    public static void suma(){

        int suma = rn.nextInt(50, 100);

        for (int i = 0; i < 3; i++) {
            matrix[i][0] = rn.nextInt(suma-2);
            matrix[i][1] = rn.nextInt(suma - matrix[i][0]);
            matrix[i][2] = suma - matrix[i][0] - matrix[i][1];
        }

        System.out.println(suma);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
