
public class Bateau extends Thread {


    public void run() {

        Bateau b = new Bateau();
        b.start();

        System.out.println("Thread lancé");

        int n = 0;
        while (n++ < 100) {
            System.out.println("Je vogue !");
            try {

                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }


}
