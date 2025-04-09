import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5,8};
        String[] names = {"Aline", "Kristy"};
        //Char[] letters = {"A", "B", "C", "D"};
        int[] daysOfTheWeek = new int[7];
        String[] monthsOfTheYear =  new String[12];
        //indices
        numbers [3] = 8;
        //length of the array
        System.out.println(numbers.length);
        for(int i = 1; i < daysOfTheWeek.length;i++){
            System.out.println(daysOfTheWeek[i]);
        }
        //enhanced for loop
        for(int a : numbers){
            System.out.println(a);
        }
        for( String n : names){
            System.out.println(n.toLowerCase());
        }
        Integer[] numbersZ = {5, 3, 8, 1, 2};
        Arrays.sort(numbersZ, (a, b) -> a - b);
        System.out.println("numbersZ = " + Arrays.toString(numbersZ));
    }
}