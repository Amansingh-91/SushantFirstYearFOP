import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    private Queue<String> todolist;
    QueueDemo(){
        todolist = new LinkedList<>();
    }
    public void addInQueue(String Data){
        this.todolist.add(Data);
    }
    public String removeInQueue(){
        return this.todolist.remove();
    }
    public boolean checkForEmpty(){
        return this.todolist.isEmpty();
    }
    public static void main(String[] args) {
         QueueDemo newQueue =  new QueueDemo();
//         newQueue.addInQueue("Task1");
//        newQueue.addInQueue("Task2");
//        newQueue.addInQueue("Task3");
//        newQueue.addInQueue("Task4");
//        System.out.println(newQueue.todolist);
//        newQueue.removeInQueue();
//        newQueue.todolist.add("Task5");
//        System.out.println(newQueue);\
        Scanner sc=  new Scanner(System.in);
    out:
        while(true) {
            System.out.println("your todo list" + newQueue);
            System.out.println("press 1 to add,press 2 to remove,press 3 to check for empty,press 4 to exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter the Data");
                    String task = sc.nextLine();
                    newQueue.addInQueue(task);
                    break;
                case 2:
                    System.out.println(newQueue.removeInQueue());
                    break;
                case 3:
                    System.out.println(newQueue.checkForEmpty());
                    break;
                case 4:
                    System.out.println("exit");
                    break out;
                default:
                    System.out.println("wrong input");
            }

        }

    }
    public String toString(){
        return this.todolist.toString();
    }
}
