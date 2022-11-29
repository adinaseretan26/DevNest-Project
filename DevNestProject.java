import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException; 
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;

public class DevNestProject {

	public static void main(String[] args) throws IOException {

		BufferedReader inputFile = new BufferedReader(new FileReader("input_example.csv"));
		PrintWriter outputFile = new PrintWriter("output_example.csv");

        inputFile.readLine(); 
        String inputLine = inputFile.readLine(); 

        HashSet<String> hs = new HashSet<String>();
        List<List<String>> data = new ArrayList<>();
        HashMap<Character, List<String>> group = new HashMap();

        while(inputLine != null)
        {
        	List<String> lineData = Arrays.asList(inputLine.split(", "));
        	data.add(lineData);

        	for (List<String> list : data) {
    		
	        	for (String record : list) {

	        		// Character firstLetter = record.charAt(0);

		        	// if (group.containsKey(firstLetter)) {
		        	// 	group.get(firstLetter).add(record);
		        	// } else {
		        	// 	group.put(firstLetter, Arrays.asList(record));
		        	// }

	        		if (hs.add(record)){
		        		outputFile.println(record);
		        	}

	        	}
        	}

        	inputLine = inputFile.readLine();
              
        }

        outputFile.flush();
       
        inputFile.close();
        outputFile.close();
          
        System.out.println("See the results.");

	}

}