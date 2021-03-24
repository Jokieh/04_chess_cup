package com.codecool.chessopen;

import java.io.*;
import java.util.*;

public class ChessResults {

    public List<String> getCompetitorsNamesFromFile(String fileName) {

        List<String> resultsList = new ArrayList<String>();

        try {
            File results = new File("src/resources/results.txt");
            Scanner myReader = new Scanner(results);

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                resultsList.add(line);
            }
            myReader.close();

        } catch (FileNotFoundException e ) {
            System.out.print("File not found!");
        }


        return resultsList;
    }

}
