import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static <T> List<List<T>> generatePowerSet(List<T> list) {
        List<List<T>> powerSet = new ArrayList<>();

        int setSize = list.size();
        int powerSetSize = (int) Math.pow(2, setSize);

        for (int i = 0; i < powerSetSize; i++) {
            List<T> subset = new ArrayList<>();
            for (int j = 0; j < setSize; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(list.get(j));
                }
            }
            powerSet.add(subset);
        }
        return powerSet;
    }

    public static void printPowerSet(List<List<String>> powerSet) {
        System.out.print("Power Set: {");
        for (int i = 0; i < powerSet.size(); i++) {
            List<String> subset = powerSet.get(i);
            System.out.print(subset);
            if (i < powerSet.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of set elements: ");

        int setSize = scanner.nextInt();
        List<String> inputSet = new ArrayList<>();

        for (int i = 0; i < setSize; i++) {
            System.out.println("Set element " + (i + 1) + ":");
            inputSet.add(scanner.next());
        }
        List<List<String>> powerSet = generatePowerSet(inputSet);
        printPowerSet(powerSet);

        scanner.close();
    }
}
