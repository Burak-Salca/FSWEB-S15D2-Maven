package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("workintech","dummy desc", "ann", Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2 = new Task("workintech","dummy desc 2", "ann", Status.IN_PROGRESS, Priority.HIGH);

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);

        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("workintech","dummy desc", "bob", Status.IN_PROGRESS, Priority.HIGH);
        Task taskBob2 = new Task("workintech","dummy desc 2", "bob", Status.IN_PROGRESS, Priority.HIGH);

        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);

        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("workintech","dummy desc", "carol", Status.IN_PROGRESS, Priority.HIGH);
        Task taskCarol2 = new Task("workintech","dummy desc 2", "carol", Status.IN_PROGRESS, Priority.HIGH);

        carolsTasks.add(taskCarol);
        carolsTasks.add(taskCarol2);

        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("workintech","dummy desc", null, Status.IN_PROGRESS, Priority.HIGH);
        Task unassignedTask2 = new Task("workintech","dummy desc 2", null, Status.IN_PROGRESS, Priority.HIGH);

        unassignedTasks.add(unassignedTask);
        unassignedTasks.add(unassignedTask2);

        TaskData taskData = new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks);
        System.out.println("annsTasks: "+ taskData.getTasks("ann"));
        System.out.println("bobsTasks: "+ taskData.getTasks("bob"));
        System.out.println("carolsTasks: "+ taskData.getTasks("carol"));
        System.out.println("allTasks: "+ taskData.getTasks("all"));

    }
}