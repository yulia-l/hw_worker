public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listenerDone = System.out::println;
        OnTaskErrorListener listenerErr = System.out::println;

        Worker worker = new Worker(listenerDone, listenerErr);
        worker.start();
    }
}
