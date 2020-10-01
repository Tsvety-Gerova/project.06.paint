package paintingWalls;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	double height;
	double width;
	double lenght = input.nextDouble();
	System.out.println("Enter the height of the walls");
	height = input.nextDouble();
	System.out.println("Enter the width of the walls");
	width = input.nextDouble();
	System.out.println("Enter the lenght of the walls");
	lenght = input.nextDouble(); 
	
	double Plosht = 2*height*width + 2*height*lenght + lenght*width;
	double tsena;
	int buckets30;
	int buckets140;
	if (Plosht <= 30) {
		tsena = 4;
		System.out.println("The needed paint will cost 4$");
	}else if (Plosht > 30 && Plosht <= 120) {
		//tsena = (Plosht/buckes30)
		System.out.println("The needed paint will cost 8$");
		
	
		
	} 
} 
	}


