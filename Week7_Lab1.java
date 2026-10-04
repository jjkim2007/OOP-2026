/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
class VacuumRobot {
    private String name;
    private int x; //x coordinate
    private int y; //y
    private boolean status;
    
    public VacuumRobot() {
        name = "DeviceX";
        x = y = 0;
        status = false;
    }
    //overloaded constructor with parameter
public VacuumRobot(String n, int x, int y, boolean s){
        name = n;
        this.x = x; // x = int x
        this.y = y;
        status = s; //off status
    }
    //getter
    public String getName(){
        return name;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    //setter
    public void setName(String n) {
        name = n;
    }
    
    public void setX(int _x) {
        x = _x ;
    }
    
    public void setY(int _y){
        y = _y ;
    }
    
    public void setStatus(boolean s) {
        status = s;
    }
    
    public void moveLeft() {
        x--;
    }
    
    public void moveRight() {
        x++;
    }
    
    public void moveTop() {
        y--;
    }
    
    public void moveBottom() {
       y++;
    }
    

public void print(){
System.out.printf("%s is located at (%d,%d) \n",name,x,y);
        String power = (status)?"On" : "Off";
        System.out.println("Status: " + power);
}
}
public class Week7_Lab1 {
    public static void main (String args[]) {
        //create the 1st vacuum robot
        
        VacuumRobot vr1 = new VacuumRobot ();
        VacuumRobot vr2 = new VacuumRobot ("Maria", 50 ,50, true);
        
        System.out.println("VacuumRobot Status");
        vr1.print();
        vr2.print();
        
       vr1.setName("HeroX");
       vr1.setX(100);
       vr1.setY(250);
       vr1.setStatus(true);
       
       for (int i = 0; i < 50; i++)
           vr1.moveLeft();
       
       for (int i = 0; i<20; i++)
           vr1.moveBottom();
       
        System.out.println("The VacuumRobot vr1 status changed...");
        vr1.print();
    }
}