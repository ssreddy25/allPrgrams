package oops;

public class Cricle {
 private double radiues;

//public Cricle(double r) {	
//	double r=34.5;
//	this.radiues = radiues;
//}

public double getRadiues() {
	return radiues;
}

public void setRadiues(double radiues) {
	this.radiues = radiues;
}
public double getAera(){
	return (Math.PI*this.radiues*this.radiues);
}
public double getCircum(){
	return (2*Math.PI*this.radiues);
	
}
 
 
 
}
