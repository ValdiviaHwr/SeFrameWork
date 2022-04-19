package FrameWork;


import TestCase.TestCase1;
import Utilities.Browser;


import java.io.*;
import java.io.IOException;
import com.opencsv.*;


public class App 
{
	
	
    public static void main( String[] args ) throws InterruptedException
    {
	  
	//Code to read info from a CSV file
    FileReader archCSV = null;
    CSVReader csvReader = null;
    
    try {
      //Leo el archivo con el separador estándar ","
      archCSV = new FileReader("C:\\Users\\71993\\Documents\\pruebas.csv");
      csvReader = new CSVReader(archCSV);
      String[] fila = null;
      while((fila = csvReader.readNext()) != null) {
          System.out.println(fila[0]
                    + " | " + fila[1]
                    + " |  " + fila[2]
                    + " |  " + fila[3]
                    + " |  " + fila[4]);
      }

      //Ahora leo el archivo con el separador ";"
    	//archCSV = new FileReader("data/ISO-Codes-puntoycoma.csv");
    	//CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
    	//csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).build();
    	//String[] fila = null;
    	//while((fila = csvReader.readNext()) != null) {
    	//System.out.println(fila[0]
    	//           + " | " + fila[1]
    	//           + " |  " + fila[2]);
    	//}

    }
    catch(IOException e) {
      System.out.println(e);
    }
    catch(Exception e) {
      System.out.println(e);
    }
    finally {
      try { 
        archCSV.close();
        csvReader.close();
      }
      catch(IOException e) {
        System.out.println(e);
      }
    }
    
    
    // Data read done at this point
    
    TestCase1.Execute(Browser.Chrome,"http://automationpractice.com/index.php","");
    
    
    }
}
