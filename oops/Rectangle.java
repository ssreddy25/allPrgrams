package oops;

public class Rectangle {
  private float lenght;
  private float width;
   public Rectangle(float lenght,float width){
	   this.lenght=lenght;
	   this.width=width;
   }
   public float getLenght(){
	   return this.lenght;
   }
   public float getWidth(){
	   return this.width;
   }
   public void setLenght(float lenght){
	   this.lenght=lenght;
   }
   public void setWidth(float width){
	   this.width=width;
   }
   public double getAera(){
	   return (this.lenght*this.width);
   }
   public double getPerimeter(){
	   return (2*(this.lenght+this.width));
   }
   
}
