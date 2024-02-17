/*
 There are two ways to implement Thread in Java
  ---> By extending Thread Class
  ---> By Implementing Runnable Interface

  MultiThreading
  Process as Restaurants and Threads as Waiters

  Concurrency --> At the same time
  Parallelism --> Simultaneously

  Multi Threading achieves concurrency
 */

/*
 Life Cycle of a Thread
 ------------------------------------------------

 New
 -------
 Instance of thread is created ,but it is not started by invoking start() method in it

 Runnable
 ---------
After invocation of start() and before it is selected to be run by scheduler

 Running
 ----------
After Thread Scheduler has selected it

NonRunnable / Blocked
-----------------------
Thread Alive, but not eligible to run

 Terminated
 --------------

Run() Method has Exited
 */


/*
Thread Methods

Thread.sleep()
Thread.getPriority()
Thread.setPriority()
Thread.currentThread()
Thread.getState()
Thread.getName()
 */

class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }
    @Override
    public void run() {
        int a = 0;
        while(a < 10) {
            System.out.println("Thread 1 is running");
            a += 1;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int a = 0;
        while(a < 10) {
            System.out.println("Thread 2 is running");
            a += 1;
        }
    }
}

class MyThreadRunnable implements Runnable {
    public void run() {
        System.out.println("I am a thread");
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Swapnil");
        MyThread2 t2 = new MyThread2();
        System.out.println(t1.getName());
        t1.start();

//        t2.start();
        MyThreadRunnable bullet = new MyThreadRunnable();
        Thread gun = new Thread(bullet);
        gun.start();

//       Thread Constructors

    }
}
