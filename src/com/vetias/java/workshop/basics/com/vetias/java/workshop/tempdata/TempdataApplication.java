package com.vetias.java.workshop.tempdata;

import com.vetias.java.workshop.tempdata.beans.Location;
import com.vetias.java.workshop.tempdata.beans.Sensor;
import com.vetias.java.workshop.tempdata.beans.TemperatureSensor;

public class TempdataApplication {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor(18.5f);
        float reading = temperatureSensor.getReading();
        System.out.println(reading);
 

    }
}
