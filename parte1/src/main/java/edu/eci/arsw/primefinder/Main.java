package edu.eci.arsw.primefinder;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Date startDate = new Date();
                int seconds =0;
		PrimeFinderThread pft=new PrimeFinderThread(0, 10000000);
                PrimeFinderThread pft1=new PrimeFinderThread(10000001, 20000000);
                PrimeFinderThread pft2=new PrimeFinderThread(20000001, 30000000);
		pft.start();
                pft1.start();
                pft2.start();
                while(seconds!=5){
                    Date endDate = new Date();
                    seconds = (int)(endDate.getTime()-startDate.getTime())/1000;
                }
                pft.setSuspend(true);
                pft1.setSuspend(true);
                pft2.setSuspend(true);
                
                System.out.println("Press enter to continue...");
                Scanner scaner = new Scanner(System.in);
                String in= scaner.nextLine();
                
                
                if(in.equals("")){
                    pft.resumeThread();
                    pft1.resumeThread ();
                    pft2.resumeThread();
                }
                
                
                
                
		
		
	}
	
}
