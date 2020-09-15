package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        Spinnable myCD = new CD(100, "WPA", 1000, "Music", 50);
        Spinnable myDVD = new DVD(800, "WPA2", 10000, "Jaws", 5000);
        Vinyl myVinyl = new Vinyl(45, "none", 50, "Salt-N-Pepa", 12);
        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.deletesData();
        myCD.readsData();
        myCD.spinSpeed();
        myCD.storesData();

        myDVD.deletesData();
        myDVD.readsData();
        myDVD.spinSpeed();
        myDVD.storesData();

        myVinyl.deletesData();
        myVinyl.readsData();
        myVinyl.spinSpeed();
        myVinyl.storesData();
    }
}
