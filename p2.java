interface Shape{
    abstract void draw(); 
}
class Circle implements Shape{
   public void draw(){
    System.out.println("Drawing a circle");
   } 
}
class Rectangle implements Shape{
    public void draw(){
     System.out.println("Drawing a rectangle");
    } 
    public static void main(String x[]){
        Circle obj=new Circle();
        obj.draw();
        Rectangle obj2=new Rectangle();
        obj2.draw();

    }

 }
