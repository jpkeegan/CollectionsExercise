import java.util.Comparator;
import java.util.PriorityQueue;

public class Exercise5 {

    static class Person {
        String name;
        int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString(){
            return "Person{" +
                    "Name = " + name + '\'' +
                    ", Age = " + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Person> officeQueue = new PriorityQueue<>(Comparator.comparingInt(p -> p.age));

        officeQueue.offer(new Person("Dwight", 31));
        officeQueue.offer(new Person("Jim", 28));
        officeQueue.offer(new Person("Pam", 25));
        officeQueue.offer(new Person("Michael", 42));

        while(!officeQueue.isEmpty()){
            System.out.println(officeQueue.poll());
        }
    }
}
