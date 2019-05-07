
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        var scheduledList = new ArrayList<Task>();
        var tasks = List.of(
                new Task(1, 3, 40),
                new Task(2, 1, 35),
                new Task(3, 1, 30),
                new Task(4, 3, 25),
                new Task(5, 2, 20));
        var maxTime = tasks.stream().max(Comparator.comparing(Task::getTime)).get().getTime();
        tasks.stream().sorted(Comparator.comparing(Task::getInterest).reversed())
                .forEach(task -> {
                    System.out.println(task);
                    if(scheduledList.size() <= maxTime) {
                        scheduledList.add(task);
                        scheduledList.sort(Comparator.comparing(Task::getTime));
                        for (int i = 0; i < scheduledList.size(); i++) {
                            if(!(scheduledList.get(i).getTime() > i)){
                                scheduledList.remove(task);
                            }
                        }
                    }
                });
        System.out.println( scheduledList + " = " + scheduledList.stream().mapToInt(Task::getInterest).sum());
    }
}
