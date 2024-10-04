package hello;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.DataInputStream;
//FileReader -read bytes
//BufferedReader - read line (in java doc)

public class CapitaliseMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Map <String, Integer> uniqueWords = new HashMap <>();
        String inputFile = args [0];
        String outputFile = args [1];

        //open inputFile for reading
        FileReader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //create set of str
        //<> generic
        Set <String> uniqueWords = new HashSet<>();

        //open outputFile for writing
        FileWriter writer = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        //initialise or else will exit loop bc line = null
        String line = "x";
        while (null!= line) {
            //only can read line by line
            //read > process line > write
            //or can read all then process
            line = bufferedReader.readLine();

            //if line is null,end of file
            if (null == line)
            break;

            //System.out.printf(">>> line: %s\n", line.tolowerCase());
            //set take care of duplicates since all lower case
            String transformed = line.replaceAll("\\p{Punct}", "").toLowerCase().trim();
            //dc index j want to add into array
            for (String words : transformed.split(" ")
            //count unique words/words
              if (uniqueWords.containsKey(word))
                 currentCount = uniqueWords.get(word);
              
              currentCount++;

              uniqueWords.put(word, currentCount);
              
              //alt mtd
              //if (uniqueWords.containsKey(word)) {
                //word in list
                //int currentCount = uniqueWords.get(word);
                //currentCount++;
                //uniqueWords.put(word, currentCount);
              //} else {
                //word not in list
                //uniqueWords.put(word, 1);

              //}
            uniqueWords.add(word);
        

            //write to file
            bufferedWriter.write(transformed + "\n");
        }


        //flush remaining data to file bc not all copied to file - so wont hv gap
        //best to flush n close
        bufferedWriter.flush();
        //writer.flush();
        writer.close();
    
        //close file
        reader.close();

        System.out.printf(
        
        
        //no index so hv to use this to get words
        for (String : uniqueWords), args)

        //map to count unique words
    }   
    
}
