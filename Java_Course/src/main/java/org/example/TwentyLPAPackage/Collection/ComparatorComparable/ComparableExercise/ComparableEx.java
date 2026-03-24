package org.example.TwentyLPAPackage.Collection.ComparatorComparable.ComparableExercise;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Implement natural ordering using Comparable such that:

Higher priority : first -> (priority = 1 should come before 2, 3, …)
If priority is same → Earlier deadline first
If deadline is same → Lower estimatedTime first
If everything same → fallback to taskId lexicographically
 */
class Task implements Comparable<Task>{
    String taskId;
    int priority;        // 1 (highest) → 5 (lowest)
    long deadline;       // epoch time
    int estimatedTime;   // in minutes

    public Task(String taskId, int priority, long deadline, int estimatedTime) {
        this.taskId = taskId;
        this.priority = priority;
        this.deadline = deadline;
        this.estimatedTime = estimatedTime;
    }

    /**
     * Refer to Notes -> ComparableNotes.txt
     */
    @Override
    public int compareTo(Task tsk) {
        int cmp = Integer.compare(this.priority, tsk.priority);
        if (cmp != 0) return cmp;
        cmp = Long.compare(this.deadline, tsk.deadline);
        if (cmp != 0) return cmp;
        cmp = Integer.compare(this.estimatedTime, tsk.estimatedTime);
        if (cmp != 0) return cmp;
        return this.taskId.compareTo(tsk.taskId); //used for Strings in lexicographical order.
    }
}

public class ComparableEx {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("T1", 2, 1700000000000L, 60));
        tasks.add(new Task("T2", 1, 1700000000000L, 30));
        tasks.add(new Task("T3", 1, 1690000000000L, 45));
        tasks.add(new Task("T4", 2, 1700000000000L, 30));
        tasks.add(new Task("T5", 1, 1690000000000L, 30));

        // Before sorting
        System.out.println("Before Sorting:");
        tasks.forEach(t -> System.out.println(
                t.taskId + " | P:" + t.priority + " | D:" + t.deadline + " | T:" + t.estimatedTime
        ));

        // Sorting
        Collections.sort(tasks);

        // After sorting
        System.out.println("\nAfter Sorting:");
        tasks.forEach(t -> System.out.println(
                t.taskId + " | P:" + t.priority + " | D:" + t.deadline + " | T:" + t.estimatedTime
        ));
    }
}
