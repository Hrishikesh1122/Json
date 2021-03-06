package com.hrishi;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import java.io.IOException;
import com.hrishikesh.json.JsonHelper;
public class Inventory {	
	public List<Rice> rice;
    public List<Pulses> pulses;
    public List<Wheat> wheats;
	public static void main(String[] args) {
		Inventory i = new Inventory(); 
	    try {
			i=(Inventory) JsonHelper.convertToJava("C:/Users/Hrishikesh/Desktop/Java_assignments/JSON/json1.json", i);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    
		int total=0;
		for(int j=0;j<i.rice.size();j++)
		{
			total=i.rice.get(j).getWeight()*i.rice.get(j).getPricePerKg();
			i.rice.get(j).setTotalPrice(total);
		}
		
		for(int j=0;j<i.pulses.size();j++)
		{
			total=i.pulses.get(j).getWeight()*i.pulses.get(j).getPricePerKg();
		    i.pulses.get(j).setTotalPrice(total);
		}
		for(int j=0;j<i.wheats.size();j++)
		{
			total=i.wheats.get(j).getWeight()*i.wheats.get(j).getPricePerKg();
			i.wheats.get(j).setTotalPrice(total);
		}
		
		String jsonString =JsonHelper.convertToJson(i);
		System.out.println(jsonString);
		System.out.println("File write successfull");
		

	}

}
