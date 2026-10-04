/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
class Music {
    private String name;
    private String artist;
    private String type;
    private int year;

//constructor
public Music() {
    name = artist = type = "";
    year = 1900;
}

public Music(String n,String a,String t, int y){
    name = n;
    artist = a;
    type = t;
    year = y;
}

public String getName() {return name;}

public String getArtist(){
    return artist;
}

public String getType(){
    return type;
}

public int getYear(){
    return year;
}

public void setName(String n){
    name = n;
}
public void setAtrist(String a){
    artist = a;
}
public void setType(String t){
    type = t;
}
public void setYear(int y){
    year = y;
}

public void print(){
    System.out.printf("%25s%25s%15s%10s\n", name, artist, type, year);
    
}
}
public class Week7_Lab2 {
    public static void main(String args[]){
        Music m1 = new Music("Die with a smile", "Lady Gaga", "Pop", 2024);
        Music m2 = new Music("First Love", "Hikaru Utada", "R&B", 1999);
        Music m3 = new Music("Thriller", "Michael Jackson", "Disco", 1982);
        Music m4 = new Music("Go", "BlackPlank", "Dance", 2026);
        
        printMusic(m1, m2, m3, m4);
    }
    public static void printMusic(Music m1, Music m2, Music m3, Music m4){
            System.out.printf("%-25s%-25s%-15s%-10s\n", "Name", "Artist", "Type","Year");
            drawline(80);
            m1.print();
            m2.print();
            m3.print();
            m4.print();
    }
}
