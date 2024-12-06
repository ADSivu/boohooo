import java.util.*;
import java.io.*;

public class DayOne {
    public static void main(String args[]) {
        String file = "Numbers.txt";

        try {
            Scanner sc = new Scanner(new File(file));
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();

            while (sc.hasNextLine()) {
                String input = sc.nextLine();
                String[] parts = input.split("\\s+");
                list.add(Integer.parseInt(parts[0]));
                list2.add(Integer.parseInt(parts[1]));
            }
            sc.close();
            Collections.sort(list);
            Collections.sort(list2);
            int totalDistance = 0;
            for (int i = 0; i < list.size(); i++) {
                totalDistance += Math.abs(list.get(i) - list2.get(i));
            }
            System.out.println(totalDistance);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
