public class Main {
    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();

        Thread t1 = new Thread(new CountThread(commonResource));
        Thread t2 = new Thread(new CountThread(commonResource));
            t1.setName("Thread 1");
            t2.setName("Thread 2");
            t1.start();
            t2.start();

    }
}
