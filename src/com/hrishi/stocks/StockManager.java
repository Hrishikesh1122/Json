package com.hrishi.stocks;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.JsonMappingException;
import com.hrishikesh.json.JsonHelper;

public class StockManager {
	@JsonProperty("SBIN") 
    public List<SBIN> sbin;
    @JsonProperty("HDFC") 
    public List<HDFC> hdfc;
    @JsonProperty("LT") 
    public List<LT> lt;

	public static void main(String[] args) {
		StockManager m = new StockManager(); 
	    try {
			m=(StockManager) JsonHelper.convertToJava("C:/Users/Hrishikesh/Desktop/Java_assignments/JSON/Stocks.json", m);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int total=0;
		for(int j=0;j<m.sbin.size();j++)
		{
			total=m.sbin.get(j).getNumOfShares()*m.sbin.get(j).getPricePerShare();
			m.sbin.get(j).setTotalValue(total);
		}
		
		for(int j=0;j<m.hdfc.size();j++)
		{
			total=m.hdfc.get(j).getNumOfShares()*m.hdfc.get(j).getPricePerShare();
			m.hdfc.get(j).setTotalValue(total);
		}
		for(int j=0;j<m.lt.size();j++)
		{
			total=m.lt.get(j).getNumOfShares()*m.lt.get(j).getPricePerShare();
			m.lt.get(j).setTotalValue(total);
		}
		
		
		JsonHelper.convertToJson(m);
		System.out.println("File write successfull");
		

		for(int j=0;j<m.sbin.size();j++)
		{
			System.out.println(m.sbin.get(j).toString());
		}
		for(int j=0;j<m.hdfc.size();j++)
		{
			System.out.println(m.hdfc.get(j).toString());
		}
		for(int j=0;j<m.hdfc.size();j++)
		{
			System.out.println(m.hdfc.get(j).toString());
		}
		
	}

}


