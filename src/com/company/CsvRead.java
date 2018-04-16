package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvRead {

    public static ArrayList<Integer> readCSV() {
        ArrayList<Integer> test = new ArrayList<Integer>();
        String line = "";
        String cvsSplitBy = ",";


        try (BufferedReader br = new BufferedReader(new FileReader("src/com/company/legosets.csv"))){

            while((line = br.readLine()) != null) {

                String[] number = line.split(cvsSplitBy);

                String next = rmFirLas(number[0]);
                if(isInt(next)) {
                    test.add(Integer.parseInt(next));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return test;
    }


    private static String rmFirLas(String s) {
        s = s.substring(1);
        s = s.substring(0, s.length()-1);
        return s;
    }

    private static boolean isInt(String s) {
        try {
            int y = Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

}