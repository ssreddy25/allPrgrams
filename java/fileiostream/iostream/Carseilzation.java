package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car implements Serializable{
	public String carId;
	public String carBrand;
	public String carName;
	public String carCc;
	public double carSpeed;
	public Car(String carId, String carBrand, String carName, String carCc, double carSpeed) {
		this.carId = carId;
		this.carBrand = carBrand;
		this.carName = carName;
		this.carCc = carCc;
		this.carSpeed = carSpeed;
	}
	public String toString(){
		return carId+"\t"+carBrand+"\t"+carName+"\t"+carCc+"\t"+carSpeed;
	}
	
	
}
public class Carseilzation {
	
	public void serilaizationMethod(Object obj){
		try {
			FileOutputStream fos=new FileOutputStream("car.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("serilazation completed");
		
	}
	
	public Object deseralizationMethod(){
		Object obj=null;
		try {
			FileInputStream fos=new FileInputStream("car.txt");
			ObjectInputStream oos=new ObjectInputStream(fos);
			obj =oos.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("deseralization completed");
		return obj;
		
	}
	public static void main(String[] args) {
		Carseilzation carseilzation=new Carseilzation();
		Car car= new Car("bmw143","bmw","bmwred","22cc",300); 
		carseilzation.serilaizationMethod(car);
		car =(Car) carseilzation.deseralizationMethod();
		System.out.println(car);
		
	}

}
