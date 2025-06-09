
package ces;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RelatorioDAO {
    static String filepath = "CESlog.csv";
    
    
    
     public void writeCsv(String text){//default filepath, writes a line to the csv file
        try{
        FileWriter writer = new FileWriter(filepath,StandardCharsets.ISO_8859_1,true); //true allows us to append text, which is what we want
        text = text + "\n";
        writer.write(text);
            System.out.println("wrote" +text);
            writer.close();
        }catch(IOException e){System.out.println(e.getMessage());}
    }
    
    public String readCsv(){//default filepath, this returns a string to the text area
        try{
            FileReader reader = new FileReader(filepath);
            Scanner scanner = new Scanner(reader);
            String readLine = "";
                while (scanner.hasNextLine()){
                    readLine = readLine +"\n"+ scanner.nextLine();
                }
                scanner.close();
            if (readLine != null){return readLine;}
        }catch(IOException e){System.out.println(e.getMessage());}
            return null;
    }
    
    public void openFile(){ //default filepath
        File csv = new File(filepath);
        if (csv.exists()){
        try{Desktop.getDesktop().open(csv);}catch(IOException e){System.out.println(e.getMessage());}
        }
    }
}

