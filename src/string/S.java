package string;

public class S {
    public static void main(String[] args) {
        String elu = "i love my india";
        String[] test = elu.split(" ");

        for(int i=0;i<=test.length-1;i++)
        {
            System.out.println(test[i]);

        }
        System.out.println();
        String dem = test[3];
        test[3] = dem.replace("india","canda");
        for(int i=0;i<=test.length-1;i++)
        {
            System.out.println(test[i]);

        }


    }
}
