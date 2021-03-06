package com.ai2s_lab.gnss_dr.util;

public class Settings {

    private static int gps_choice = -1;
    private static boolean gps = false;
    private static int update_frequency = 100;

    public Settings(){

    }

    public static boolean getGPS(){
        return gps;
    }

    public static void toggleGPS(){
        gps = !gps;
    }

    public static int getGpsChoice(){
        return gps_choice;
    }

    public static void setGpsChoice(int choice){
        gps_choice = choice;
    }


    public static int getUpdateFrequency() {
        return update_frequency;
    }

    public static void setUpdateFrequency(int choice) {
        update_frequency = choice;
    }
}
