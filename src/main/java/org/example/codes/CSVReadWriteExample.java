package org.example.codes;

import java.io.*;
import java.util.*;

public class CSVReadWriteExample {
    public static void main(String[] args) {
        String inputFile = "input.csv";
        String outputFile = "output.csv";

        try {
            // Reading data from CSV file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Processing data (e.g., filtering or aggregation)

            // Writing data to output CSV file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (String outputLine : lines) {
                writer.write(outputLine);
                writer.newLine();
            }
            writer.close();

            System.out.println("Data written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
