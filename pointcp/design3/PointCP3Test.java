package design3;

import java.io.*;

public class PointCP3Test {
    public static void main(String[] args) {
        PointCP3 point1 = new PointCP3('C', 5, 5);
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            point1.getRho();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Time elapsed for getRho(CP3): " + (end1 - start1) * 0.001);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            point1.getTheta();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time elapsed for getTheta(CP3): " + (end2 - start2) * 0.001);

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            point1.getX();
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Time elapsed for getX(CP3): " + (end3 - start3) * 0.001);

        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            point1.getY();
        }
        long end4 = System.currentTimeMillis();
        System.out.println("Time elapsed for getY(CP3): " + (end4 - start4) * 0.001);

        long start5 = System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            point1.getDistance(point1);
        }
        long end5 = System.currentTimeMillis();
        System.out.println("Time elapsed for getDistance(CP3): " + (end5 - start5) * 0.001);
    }

    private static PointCP3 getInputRandom() throws IOException {
        // Information to be passed to the constructor
        char coordType = 'A'; // Temporary default, to be set to P or C
        double a = 0.0;
        double b = 0.0;

        // Allow the user to enter the three different arguments

        int sign = (int) (Math.random() * 2);
        if (sign > 0) {
            coordType = 'C';
        } else {
            coordType = 'P';
        }
        a = (double) (Math.random() * 100);
        b = (double) (Math.random() * 100);
        // Return a new PointCP object
        return (new PointCP3(coordType, a, b));
    }

    private static PointCP3 getInput() throws IOException {
        byte[] buffer = new byte[1024]; // Buffer to hold byte input
        boolean isOK = false; // Flag set if input correct
        String theInput = ""; // Input information

        // Information to be passed to the constructor
        char coordType = 'A'; // Temporary default, to be set to P or C
        double a = 0.0;
        double b = 0.0;

        // Allow the user to enter the three different arguments
        for (int i = 0; i < 3; i++) {
            while (!(isOK)) {
                isOK = true; // flag set to true assuming input will be valid

                // Prompt the user
                if (i == 0) // First argument - type of coordinates
                {
                    System.out.print("Enter the type of Coordinates you "
                            + "are inputting ((C)artesian / (P)olar): ");
                } else // Second and third arguments
                {
                    System.out.print("Enter the value of "
                            + (coordType == 'C'
                                    ? (i == 1 ? "X " : "Y ")
                                    : (i == 1 ? "Rho " : "Theta "))
                            + "using a decimal point(.): ");
                }

                // Get the user's input

                // Initialize the buffer before we read the input
                for (int k = 0; k < 1024; k++)
                    buffer[k] = '\u0020';

                System.in.read(buffer);
                theInput = new String(buffer).trim();

                // Verify the user's input
                try {
                    if (i == 0) // First argument -- type of coordinates
                    {
                        if (!((theInput.toUpperCase().charAt(0) == 'C')
                                || (theInput.toUpperCase().charAt(0) == 'P'))) {
                            // Invalid input, reset flag so user is prompted again
                            isOK = false;
                        } else {
                            coordType = theInput.toUpperCase().charAt(0);
                        }
                    } else // Second and third arguments
                    {
                        // Convert the input to double values
                        if (i == 1)
                            a = Double.valueOf(theInput).doubleValue();
                        else
                            b = Double.valueOf(theInput).doubleValue();
                    }
                } catch (Exception e) {
                    System.out.println("Incorrect input");
                    isOK = false; // Reset flag as so not to end while loop
                }
            }

            // Reset flag so while loop will prompt for other arguments
            isOK = false;
        }
        // Return a new PointCP object
        return (new PointCP3(coordType, a, b));
    }
}
