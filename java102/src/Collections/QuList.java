package Collections;

import java.util.LinkedList;

public class QuList {
    public static void main(String[] args) {
        LinkedList<String> que = new LinkedList<>();
        que.add("Deniz");
        que.add("Berna");
        que.offer("Volkan");
        que.offer("Çağlar");
        que.add(null);

        System.out.println("remove(): " + que.remove());
        System.out.println("element(): " + que.element());
        System.out.println("poll(): " + que.poll());
        System.out.println("peek(): " + que.peek());
    }
}
