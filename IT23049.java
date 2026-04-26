class vehicle{
      // two private variable
      private String brand;
      private String color;
      
      // public constractor
      public vehicle(String b, String c){
             this.brand = b;
             this.color = c;
      }
      public void start(){
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle is starting...");
        System.out.println(); 
        }
}
public class IT23049{
       // main class
       public static void main(String[] args){
       // command line input
       for(int i=0;i<args.length;i++){
           vehicle v = new vehicle(args[i],args[++i]);
           v.start();
           }
         }
    }