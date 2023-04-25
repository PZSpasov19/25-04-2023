import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<String, Integer> parseToInt = e -> Integer.parseInt(e);
        List<Integer> ints = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();

        System.out.println("Count = " + ints.size());


        int sum = ints.stream().mapToInt(e -> Integer.valueOf(e)).sum();
        System.out.println("Sum = " + sum);



        //String[] input = scanner.nextLine().split(", ");
        //Function<String, Integer> parseInt = Integer::parseInt;
        //System.out.println("Count: " + input.length);
        //Function<String, Integer> parseToInt = e -> Integer.parseInt(e);
        //int sum = 0;
        //for(String num : input){
        //    sum += parseInt.apply(num);
        //}
        //System.out.println("Sum " + sum);
    }
}