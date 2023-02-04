
	
	package com.upskill.java_6;

	public class MultithreadingRunable extends Thred{
		
		public void run(){
			try{
				System.out.println("Thread Number # " + Thread.currentThread().getId() + " is Running");
			} catch (Exception e){
				System.out.println("Exception is caught");
			}
		}
	}


}
