package com.company;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int convertedMegaBytes;
        int convertedKiloBytes;

        if (kiloBytes >= 0) {

            convertedMegaBytes = kiloBytes / 1024;
            convertedKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + convertedMegaBytes + " MB and " +
                    convertedKiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
