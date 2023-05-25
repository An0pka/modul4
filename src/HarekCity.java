import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }
    public void changeElectResult(String[] results) {
        String first = results[0];
        String last = results[results.length - 1];
        results[0] = last;
        results[results.length - 1] = first;
    }
//        String [] ffffinal = Arrays.copyOf(results, results.length);
//        ffffinal[ffffinal.length - 1] = results [0];
//        ffffinal[0] = results [results.length - 1];
//        System.out.println(Arrays.toString(ffffinal));



    public static void main(String[] args) {
        String[] results = new String[]{"miho", "hut"};
        new HarekCity().changeElectResult(results);
        System.out.println(Arrays.toString(results));
    }
}