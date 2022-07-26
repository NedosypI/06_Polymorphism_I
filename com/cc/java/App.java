package com.cc.java;

public class App {
    
    public static void main(String[] args) {

// Da diese typen von Honeybee überschrieben werden, dürfen wir dies ändern 
// Worker worker = new Worker();
// Queen queen = new Queen();
// Drone drone = new Drone();

/* Honeybee = Referenztyp
 * worker = Referenzvariable
 * new Worker = Konstruktor fault 
 */
Honeybee worker = new Worker();
Honeybee queen = new Queen();
Honeybee drone = new Drone();


output(worker.doYourJob());
output(queen.doYourJob());
output(drone.doYourJob());

// Das sollte eigentlich nicht gehen 
Honeybee bee = new Honeybee();
output(bee.doYourJob());


output("--------------------------");

output(worker.fly());
output(queen.fly());
output(drone.fly());


    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

