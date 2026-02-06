package com.multithreading.problems.threadstatemonitoringsystem;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

//checks and displays thread states
public class StateMonitor extends Thread {
	
	private Thread[] threads;
    private Map<String, Thread.State> lastState = new HashMap<>();

    StateMonitor(Thread[] threads) {
        super("Monitor");
        this.threads = threads;
    }

    @Override
    public void run() {

        boolean allTerminated;

        try {
        	
            do {
                allTerminated = true;

                for(Thread t : threads) {
                    Thread.State currentState = t.getState();
                    Thread.State previousState = lastState.get(t.getName());

                    // print only when state changes
                    if(previousState != currentState) {
                        System.out.println("[Monitor] " + t.getName() + " is in " + currentState + " state at " + LocalTime.now());
                        lastState.put(t.getName(), currentState);
                    }

                    if(currentState != Thread.State.TERMINATED) {
                        allTerminated = false;
                    }
                }
                Thread.sleep(500);

            } while(!allTerminated);

        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[Monitor] All tasks terminated. Monitoring stopped.");
    }
}