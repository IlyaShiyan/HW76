import java.util.Scanner;

class CommonResource {

    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();

    synchronized void increment(){
        for (int j = 0; j < 5; j++) {
            i--;
            System.out.printf("%s %d \n", Thread.currentThread().getName(),i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){}
        }
    }


}
