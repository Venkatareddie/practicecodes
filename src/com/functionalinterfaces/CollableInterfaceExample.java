package com.functionalinterfaces;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CollableInterfaceExample{
  
	public static void main(String[] args) throws Exception {
        Callable<String> callable = new Callable<String>() {
            public String call() throws Exception {
                return "Result from callable";
            }
        };
        
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        
        System.out.println(futureTask.get()); 
		}  
		}  
