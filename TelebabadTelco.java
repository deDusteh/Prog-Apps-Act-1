import java.util.Scanner;
import java.io.*;

/**
 * 
 * @9/10/2015
 * 	Programmer: Janssen Abat
 * 	Navigator: Shawnie Bitso
 *	
 *	Telebabad Telco 1.0
 */

public class TelebabadTelco extends Subscriber{
	
	private String subscriberFilePath;
	private String callFilePath;
	private Scanner fileReader;
	
	//Scanner FileReader = new FileReader(null);
	
	public void openFile(){
			try{
				fileReader = new Scanner (new File ("subscriberAccountInfo.txt"));
			}
			catch (Exception e){
				System.out.println("The File is not Found");
			}
	}
	
	public void readFile(){
		while(fileReader.hasNext()){
			accNumber = fileReader.nextInt();
			subscriberName = fileReader.next();
			phoneNumber = fileReader.nextInt();
			minServiceFee = fileReader.nextDouble();
			freeMinApp = fileReader.nextDouble();
			excessPerMinRate = fileReader.nextDouble();
			accBalance = fileReader.nextDouble();
			
			System.out.printf("%d %s %d %f %f %f %d", accNumber, subscriberName,
					phoneNumber, minServiceFee, freeMinApp, excessPerMinRate, accBalance);
		}
	}
	
	public void closeFile(){
		fileReader.close();
	}
	
	public static void main(String[] args) {
			
		TelebabadTelco read = new TelebabadTelco();
		read.openFile();
		read.readFile();
		read.closeFile();	
	}
	
}
