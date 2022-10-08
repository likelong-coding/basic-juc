package cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CASDemo2 {

    //CAS  compareAndSet：比较并交换！
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2021);


        //期望、更新
        //public final boolean compareAndSet(int expect, int update)
        //如果我期望的值达到了，就更新，否则，就不更新，CAS 是CPU的并发原语！
        // ======================= 捣乱的线程 ==============================
        System.out.println(atomicInteger.compareAndSet(2021, 2022));
        System.out.println(atomicInteger.get());

        System.out.println(atomicInteger.compareAndSet(2022, 2021));
        System.out.println(atomicInteger.get());
        // ======================= 捣乱的线程 ==============================

        //======================== 期望的线程 ==============================
        System.out.println(atomicInteger.compareAndSet(2021, 6666));
        System.out.println(atomicInteger.get());
    }
}
