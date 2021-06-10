package com.hrishikesh.json;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
public class JsonHelper {
	private static ObjectMapper mapper;
	static {
		mapper=new ObjectMapper();
	}
	
	public static String convertToJson(Object object) {
		String result="";
		try {
			result = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return result;
     }
	
	
	public static Object convertToJava(String path,Object object)throws JsonParseException, JsonMappingException, IOException {
	
			return mapper.readValue(new File(path), object.getClass());
	
		
	}	
}
	



