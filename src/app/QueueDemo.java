package app;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    Scanner scan;
    Queue<Integer> queue;
    int n;

    public void insert() {
        scan = new Scanner(System.in);
        queue = new LinkedList<Integer>();

        System.out.println("Integer Queue - Insert & Delete");
        System.out.println("\nEnter 'n' value: ");

        n = scan.nextInt();
        System.out.println("Enter the elements");

        for (int i = 0; i < n; i++) {
            queue.add(scan.nextInt());
        }

    }

    public void delete() {
        System.out.println("\nIn the queue");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        QueueDemo qD = new QueueDemo();
        qD.insert();
        qD.delete();
    }
}