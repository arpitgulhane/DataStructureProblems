package day16_17;
import java.util.*;


    public class TaskScheduling_11 {

        static class Task {
            int deadline, duration;

            public Task(int deadline, int duration) {
                this.deadline = deadline;
                this.duration = duration;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of test cases");
            int t = scanner.nextInt(); // number of test cases

            while (t-- > 0) {
                System.out.println("Enter number of tasks in the list");
                int n = scanner.nextInt(); // number of tasks in the list
                Task[] tasks = new Task[n];

                for (int i = 0; i < n; i++) {
                    System.out.println("Enter deadline for the task");
                    int d = scanner.nextInt(); // deadline for the task
                    System.out.println("Enter duration of the task");
                    int m = scanner.nextInt(); // duration of the task
                    tasks[i] = new Task(d, m);
                }

                // sort tasks in increasing order of deadline
                Arrays.sort(tasks, (a, b) -> a.deadline - b.deadline);

                // calculate the maximum amount by which a task's completion time overshoots its deadline
                int maxOvershoot = 0;
                int currTime = 0;

                for (int i = 0; i < n; i++) {
                    currTime += tasks[i].duration;
                    maxOvershoot = Math.max(maxOvershoot, currTime - tasks[i].deadline);
                }

                System.out.println(maxOvershoot);
            }

            scanner.close();
        }
    }

