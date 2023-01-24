import java.util.concurrent.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class execut  {
    public void execut(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();


        watek w1 = new watek();
        watek w2 = new watek();
        executorService.submit(w1);
        executorService.submit(w2);

        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException ex) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
        System.out.println((w1.result + w2.result)/2);

    }



}
