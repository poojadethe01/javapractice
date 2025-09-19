package array;

public class MultiDimensional {

    public static void main(String[] args) {
        System.out.println("I am executing the multi dimensional array");
        int[][] a = {
                {90, 8, 90, 75, 5},
                {90, 89, 3, 4, 5}
        };
        runMultiDimension(a);
    }

    public static void runMultiDimension(int[][] a) {
        for (int i = 0; i <= 1; i++)//row
        {
            for (int j = 0; j <= 4; j++)//column
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
    }
}
