
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        Scanner sc = new Scanner(System.in);
        List<String> colorArrayList = new ArrayList<>();
        String newColor = "";
        while(!newColor.equals("exit")){
            System.out.println("Enter a new color or type exit: ");
            newColor = sc.next();
            if(!newColor.equals("exit")) colorArrayList.add(newColor);
        }
        System.out.println("\n");
        System.out.println(colorArrayList);
        System.out.println("\n");

        // Exercise 2
        Iterator<String> iterator = colorArrayList.iterator();
        while(iterator.hasNext()){
            String color = iterator.next();
            System.out.println(color);
        }
        System.out.println("\n");

        // Exercise 3
        Set<Integer> numTree = new TreeSet<>();
        for(int i = -5; i <= 40; i++) numTree.add(i);
        for(int num: numTree) if(num < 7) System.out.println(num);
        System.out.println("\n");

        // Exercise 4
        Queue<String> colorPriority = new PriorityQueue<>();
        colorPriority.add("Lavender");
        colorPriority.add("Cyan");
        colorPriority.add("Orange");
        colorPriority.add("Purple");
        while(!colorPriority.isEmpty()){
            System.out.println(colorPriority.poll());
        }
    }
}