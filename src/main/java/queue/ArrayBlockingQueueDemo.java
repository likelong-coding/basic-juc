package queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo {

    public static void main(String[] args) {
        test1();
    }

    /**
     * 抛出异常
     */
    public static void test1() {
        //队列的大小
        ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(arrayBlockingQueue.add("a"));
        System.out.println(arrayBlockingQueue.add("b"));
        System.out.println(arrayBlockingQueue.add("c"));


//        try {
//            // 队列满，阻塞
//            arrayBlockingQueue.put("d");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //java.lang.IllegalStateException: Queue full 抛出异常
//        System.out.println(arrayBlockingQueue.add("d"));

        System.out.println("**************");
        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());

//        try {
//            // 队列空，阻塞
//            arrayBlockingQueue.take();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //java.util.NoSuchElementException 抛出异常
//        System.out.println(arrayBlockingQueue.remove());
    }

}
