import java.security.SecureRandom;

public class PrintTask implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final int sleepTime;
    private final String taskName;

    public PrintTask(String taskName) {
        this.taskName = taskName;
        sleepTime = generator.nextInt(5000);
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s going to sleep for %d milliseconds.%n",
                taskName, sleepTime);
            Thread.sleep(sleepTime);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.printf("%s done sleeping%n", taskName);
    }
}