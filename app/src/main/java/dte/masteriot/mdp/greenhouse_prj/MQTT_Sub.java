package dte.masteriot.mdp.greenhouse_prj;

import android.util.Log;

public class MQTT_Sub implements Runnable {
    String logTag; // to clearly identify logs

    @Override
    public void run() {

        // Thread name and Class name
        logTag = "Thread = " + Thread.currentThread().getName() + ", Class = " +
                this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1);

        Log.d(logTag, "run()"); // log the start of this task
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.d(logTag, i+1 + " seconds later"); // log each second after sleeping
        }
    }
}
