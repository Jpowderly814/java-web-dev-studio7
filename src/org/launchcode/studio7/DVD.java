package org.launchcode.studio7;

public class DVD extends BaseDisk implements Spinnable {
    public DVD(double transferRate, String encryptionType, double capacity, String content, double storageUsed) {
        super(transferRate, encryptionType, capacity, content, storageUsed);
    }

    @Override
    public void spinSpeed() {
        System.out.println("DVD spinSpeed works!");
    }

    @Override
    public void storesData() {
        System.out.println("DVD storesData works!");
    }

    @Override
    public void readsData() {
        System.out.println("DVD readsData works!");
    }

    @Override
    public void deletesData() {
        System.out.println("DVD deletesData works!");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
