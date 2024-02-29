public class Main {
    public static void main(String[] args) {
        int numThreads = 10;
        Thread[] threads = new Thread[numThreads];
        for (int i=0; i<threads.length; i++){
            threads [i] = new Thread(new BreakIt());
            threads[i].start();

        }
        for (int i=0; i<threads.length; i++){
            try{
                threads[i].join();

            }catch (InterruptedException e ){
                throw new RuntimeException();
            }
        }
    }
}