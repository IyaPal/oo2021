public class Car {
    int weight;
    int doors;
    int maxSpeed;
    boolean driving;
    
    public Car(int weight, int doors, int maxSpeed){
        this.weight = weight;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
        this.driving = false;

    }
    public void setDrive(){
        driving = true;

    }
    public void stopDrive(){
        driving = false;
    }
    public void drive(){
        setDrive();
        
        System.out.println("auto soidab");
    
    }
    
}
