package com.vetias.java.workshop.tempdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.vetias.java.workshop.tempdata.beans.Location;

public class TemperatureDataPersistance {

    public static void main(String[] args) {
        Location vetias = new Location();
        vetias.setName("VETIAS");
        vetias.setCity("Erode");
        vetias.setCountry("India");
        // try(ObjectOutputStream outputStream = new ObjectOutputStream(
        //     new FileOutputStream("location.obj")))
        //     {
        //         outputStream.writeObject(vetias);
        //     } catch (IOException exception) {
        //         exception.printStackTrace();
        //         System.out.println("Errpr writing object into file " + exception.getMessage());
        //     }



            try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("location.obj"))) {
                Location readLocation = (Location)inputStream.readObject();
                System.out.println("Location Name " + readLocation.getName());
            } catch (IOException exception) {
                System.out.println("Error Reading Location Object " + exception.getMessage());
            } catch (ClassNotFoundException classNotFoundException) {
                System.out.println("Not able to find the class ");
            }
    }
}
