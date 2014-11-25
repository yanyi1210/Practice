package yy.practice.json;

import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.junit.Test;

public class TestJason {
	
	
	public static final ObjectMapper MAPPER = new ObjectMapper();
	static{
		MAPPER.setSerializationInclusion(Inclusion.NON_NULL);
	}
	
	@Test
	public void testConvertJsonToString(){
		
		TestObjectJson object = new TestObjectJson();
		object.setAcquisitionDate(new Date());
		object.setCaliber("Test Caliber");
		object.setCoregistered(false);
		object.setManufacturer("test manufacturer");
		object.setManufacturer(null);

		System.out.println(this.convertJsonToString(object));
		
	}
	
	@Test
	public void testConvertStringToJson(){
		
		TestObjectJson object = new TestObjectJson();
		object.setAcquisitionDate(new Date());
		object.setCaliber("Test Caliber");
		object.setCoregistered(false);
		object.setManufacturer("test manufacturer");
		object.setManufacturer(null);
		String jsonString = this.convertJsonToString(object);
		
		Object outputObj = this.convertStringToJson(jsonString);
		
		System.out.println(outputObj);
		
	}
	

	private String convertJsonToString(Object objectJson){
		
		String jsonString = null;
		
		try {
			jsonString = MAPPER.writeValueAsString(objectJson);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonString;
		
	}
	
	
	private TestObjectJson convertStringToJson(String string){
		
		TestObjectJson jsonObj = null;
		
		try {
			jsonObj = MAPPER.readValue(string, TestObjectJson.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return jsonObj;
		
	}

}
