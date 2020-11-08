package model;

public class Thread {
    //    public static int i = 0;
//
//    public static void main(String[] args) {
//
//        new Thread(() -> {
//            System.out.println(Thread.currentThread() + " " + i);
//            if (i < 50) {
//                i++;
//            }
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }, "A").start();
//
//        new Thread(() -> {
//            System.out.println(Thread.currentThread() + " " + i);
//            if (i < 50) {
//                i++;
//            }
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }, "B").start();
//    }
//}

    //A线程类
    public static class ThreadA extends java.lang.Thread {
        private TestThread testThread;

        public ThreadA(TestThread testThread) {
            this.testThread = testThread;
        }

        @Override
        public void run() {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                count++;
                testThread.printStr(count, "A");
            }
            System.out.println("a线程打印完了");
        }
    }

    //B线程类
    public static class ThreadB extends java.lang.Thread {
        private TestThread testThread;

        public ThreadB(TestThread testThread) {
            this.testThread = testThread;
        }

        @Override
        public void run() {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                count++;
                testThread.printStr(count, "B");
            }
            System.out.println("b线程打印完了");
        }
    }

    //测试类
    public static class TestThread {

        public synchronized void printStr(int cnt, String str) {
            String name = java.lang.Thread.currentThread().getName();
            if ("A".equals(str)) {
                System.out.println(name + "-----" + "A");
            } else if ("B".equals(str)) {
                System.out.println(name + "-----" + "B");
            }
            try {
                notify();
                if (cnt != 5) {
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        ThreadA threadA = new ThreadA(testThread);
        ThreadB threadB = new ThreadB(testThread);
        threadA.setName("threadA");
        threadB.setName("threadB");
        threadB.setPriority(2);
        threadB.start();
        threadA.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("交替打印完成");
    }
}
