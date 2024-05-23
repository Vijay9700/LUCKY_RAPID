package demo;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		Random random=new Random();
		int randomNumbers = random.nextInt(5000);
		System.out.println(randomNumbers);
		System.out.println("vj"+randomNumbers+"@gmail.com");
	}

}
