import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < input.length; i++){
            ints.add(Integer.parseInt(input[i]));
        }

        ints.removeIf(number -> number % 2 != 0);
        ints.forEach(number -> System.out.println(number + " "));
        System.out.println();
        ints.sort(Integer::compareTo);
        ints.forEach(number -> System.out.println(number + " "));


        //for(int i = 0; i < ints.size(); i++)
        //{
        //    if(ints.get(i) % 2 == 0)
        //    {
        //        System.out.print(ints.get(i) + ", ");
        //    }
        //}
//
        //System.out.println();
        //Collections.sort(ints);
//
        //for(int i = 0; i < ints.size(); i++)
        //{
        //    if(ints.get(i) % 2 == 0)
        //    {
        //        System.out.print(ints.get(i) + " ");
        //    }
        //}


    }

}
