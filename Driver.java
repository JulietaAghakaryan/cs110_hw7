import animals.Puppy;
import utils.ArrayUtils;
import utils.Math;

public class Driver {
    public static void main(String[] arg) {
        Puppy Joey = new Puppy("Joey");
        Puppy Chandler = new Puppy("Chandler");
        Puppy Ross = new Puppy("Ross");
        System.out.println(Joey.getName());
        System.out.println(Chandler.getName());
        System.out.println(Ross.getName());

        int[] arr = {9, 20, 3, 44, 88, 300};
        ArrayUtils.reverse(arr);
        System.out.println(ArrayUtils.stringifyArray(arr));

        double forFac = 15.4;
        System.out.println(Math.factorial((int) forFac));
        System.out.println(Math.factorialLoop((int) forFac));
    }
}