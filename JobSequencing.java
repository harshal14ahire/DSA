import java.util.*;

class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {
    public static void printJobSchedule(ArrayList<Job> jobs) {
        int n = jobs.size();

        // Sort jobs based on profit in descending order
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find the maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        // Initialize result array
        char[] result = new char[maxDeadline];
        boolean[] slot = new boolean[maxDeadline];

        // Fill result array
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(maxDeadline - 1, jobs.get(i).deadline - 1); j >= 0; j--) {
                if (!slot[j]) {
                    result[j] = jobs.get(i).id;
                    slot[j] = true;
                    break;
                }
            }
        }

        // Print the result
        System.out.print("Job sequence: ");
        for (int i = 0; i < maxDeadline; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many Jobs:");
        int n = s.nextInt();
        
        ArrayList<Job> jobs = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter DeadLine of J" + (i + 1) + ":");
            int deadline = s.nextInt();
            System.out.println("Enter Profit of J" + (i + 1) + ":");
            int profit = s.nextInt();
            jobs.add(new Job((char)('a' + i), deadline, profit));
        }

        System.out.println("Jobs before scheduling:");
        for (Job job : jobs) {
            System.out.println("Job " + job.id + ": Deadline = " + job.deadline + ", Profit = " + job.profit);
        }

        printJobSchedule(jobs);
        
        s.close();
    }
}