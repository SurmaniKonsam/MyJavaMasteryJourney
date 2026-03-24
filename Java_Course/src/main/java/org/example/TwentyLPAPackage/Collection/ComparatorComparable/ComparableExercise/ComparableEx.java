package org.example.TwentyLPAPackage.Collection.ComparatorComparable.ComparableExercise;


import java.util.ArrayList;
import java.util.List;

/*
Implement natural ordering using Comparable such that:

Higher priority first
(priority = 1 should come before 2, 3, …)
If priority is same →
Earlier deadline first
If deadline is same →
Lower estimatedTime first
If everything same →
fallback to taskId lexicographically
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

    @Override
    public int compareTo(Task tsk){
        if(this.priority!=tsk.priority){
            return this.priority - tsk.priority;
        }else if(this.deadline!=tsk.deadline){
            return Math.toIntExact(this.deadline - tsk.deadline);
        }else if(this.estimatedTime!= tsk.estimatedTime){
            return this.estimatedTime - tsk.estimatedTime;
        }else{
            return this.taskId.compareTo(tsk.taskId);
        }
    }
}

public class ComparableEx {
    public static void main(String[] args) {
        List<Task> lstTask = new ArrayList<>();
        //new Task("",
    }
}
