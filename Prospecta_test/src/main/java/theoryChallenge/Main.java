package theoryChallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		String csv = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader("input.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        csv+=line;
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		Map<String,Integer> map = new HashMap<>();
		
		calculate(csv,map);
		
	}
	
	public static void calculate(String csv, Map<String,Integer> map) {
		String[] inp = csv.split(",");
		
		outerLoop:for(String val : inp) {
			String[] keyValue = val.split(":");
			
			String key = keyValue[0].trim();
			String value = keyValue[1].trim();
			
			if(value.matches("\\d+")) {
				map.put(key, Integer.parseInt(value));
			}
			else {
				value = value.substring(1,value.length());
				String[] cal = value.split("\\+");
				int sum = 0;
				for(String c : cal) {

					if(c.matches("\\d+")) {
						sum+=Integer.parseInt(c);
					}
					else {
						if(map.get(c)==null) {
							System.err.println("Not able to find value for "+c+" in Key "+key);
							continue outerLoop;
						}
						sum+=map.get(c);
					}
				}
				map.put(key, sum);	
			}
		}
		
		File csvFile = new File("output.csv");
		
		if (!csvFile.exists()) {
            try {
				csvFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
           
            writer.write("Key:Value");
            writer.newLine();

           
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }

            System.out.println("Data has been written to " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
