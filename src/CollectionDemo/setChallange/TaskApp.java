package CollectionDemo.setChallange;


import java.util.*;

public class TaskApp {
    public static void main(String[] args) {
        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annTasks = TaskData.getTasks("ann");
        sortAndPrint("Ann tasks", annTasks, sortByPriority);

        Set<Task> bobsTask = TaskData.getTasks("bob");
        Set<Task> carolsTask = TaskData.getTasks("carol");
        List<Set<Task>> sets = List.of(annTasks, bobsTask, carolsTask);

        Set<Task> assignedTask = getUnion(sets);
        sortAndPrint("Assigned Task", assignedTask);

        Set<Task> everyTask = getUnion(List.of(tasks, assignedTask));
        sortAndPrint("The true all Task", everyTask);

        Set<Task> missingTask = getDifference(everyTask, tasks);
        sortAndPrint("The Missing Task", missingTask);

        Set<Task> unassignedTask = getDifference(tasks, assignedTask);
        sortAndPrint("The Unassigned Task", unassignedTask);

        Set<Task> overlap = getUnion(List.of(
                getIntersect(annTasks, bobsTask),
                getIntersect(bobsTask, carolsTask),
                getIntersect(carolsTask, annTasks)
        ));
        sortAndPrint("Assigned to multiples", overlap, sortByPriority);

        List<Task> overlapping = new ArrayList<>();
        for (Set<Task> set : sets) {
                Set<Task> dups = getIntersect(set, overlap);
                overlapping.addAll(dups);
        }

        Comparator<Task> priorityNatural = sortByPriority.thenComparing(
                Comparator.naturalOrder()
        );
        sortAndPrint("Overlapping", overlapping, priorityNatural);

    }

    public static void sortAndPrint(String header , Collection<Task> collection){
        sortAndPrint(header, collection,null);
    }
    public static void sortAndPrint(String header , Collection<Task> collection, Comparator<Task> sorter){

        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);
        List<Task> tasks = new ArrayList<>(collection);
        tasks.sort(sorter);
        tasks.forEach(System.out::println);
    }

    public static Set<Task> getUnion(List<Set<Task>> sets) {
        Set<Task> union = new HashSet<>();
        for (var taskSet: sets){
            union.addAll(taskSet);
        }
        return union;
    }

    public static Set<Task> getIntersect(Set<Task> a, Set<Task> b) {
        Set<Task> intersect = new HashSet<>(a);
        intersect.retainAll(b);
        return intersect;
    }

    public static Set<Task> getDifference(Set<Task> a, Set<Task> b) {
        Set<Task> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }
}
