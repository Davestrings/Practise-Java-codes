package chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AirlineReservation {
	private Scanner scan = new Scanner(System.in);
	private boolean[] seat = new boolean[10];
	private byte sectionChoice;
	private int firstMonitor;
	private int economyMonitor;
	
	public void assignSeat(byte sectionChoice) {
		if(sectionChoice == 1) {
			for(int i = 0; i < seat.length/2; i++) {
				//int safe = getFirstMonitor() - 1;
				if(seat[i] == false) {
					seat[i] = true;
					break;
				}else {
					
				}
			}
		}else if(sectionChoice == 2) {
			for(int i = 5; i < seat.length; i++) {
				if(seat[i] == false) {
					seat[i] = true;
					break;
				}
			}
		}
		
	}

	public int getSectionChoice() {
		return sectionChoice;
	}

	public void setSectionChoice() {
		System.out.println("Enter your choice. 1 for First class, 2 for Economy class");
		byte sectionChoice = 0;
		try {
			sectionChoice = scan.nextByte();
		}catch(InputMismatchException ex){
			System.out.println(ex);
			System.out.println("Invalid entry");
		}
		
		this.sectionChoice = sectionChoice;
	}

	public int getFirstMonitor() {
		return firstMonitor;
	}

	public void setFirstMonitor() {
		if(sectionChoice == 1)
		++firstMonitor;
	}

}
