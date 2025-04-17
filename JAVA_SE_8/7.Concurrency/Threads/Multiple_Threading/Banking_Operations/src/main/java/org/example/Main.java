//package org.example;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//       // String filePath = "/Users/VamshiNallavalli/Downloads/src/src/main/resources/accountData/accounts.csv";
//        String filePath = "/Training/Vamshi_Learning_Updates.xlsx";
//        BufferedReader br = new BufferedReader(new FileReader(filePath));
//        String line;
//
//        while ((line = br.readLine()) != null) {
//            // Split the line into values
//            String[] values = line.split(",");
//            // Print values for debugging
////            for (String value : values) {
////                System.out.print(value.toString() + " ");
////            }
//            for(int i=0;i<values.length;i++) {
//                System.out.println(values[i]);
//                System.out.println();
//            }
//        }
//        br.close();
//    }
//}

package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Training/Vamshi_Learning_Updates.xlsx";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.println(value.trim());
                }
                System.out.println(); // Add a blank line between lines for clarity
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

