package testejson;

import java.util.Iterator;
import java.util.Set;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import net.minidev.json.parser.ParseException;

public class TesteJSON {
	
	
	public static void main(String[] args) {
		String s = "[" + "{" + "\"SQ_EXTRATO\" : \"123456\"," + "\"cdOperacao\" : \"A\"," + "\"colecaoNotaFiscal\" : ["
		         +"{"
		          +  "\"NU_PROT\":\"123\","
		           + "\"SQ_REG\":\"456\","
		            +"\"TP_REG\":\"1\""
		         +"},"

		         +"{"
		          +  "\"NU_PROT\":\"852\","
		           + "\"SQ_REG\":\"963\","
		            +"\"TP_REG\":\"6\""
		         +"}"
		      +"]"
		   +"},"

		   +"{"
		   +"\"SQ_EXTRATO\" : \"654\","
		   +"\"cdOperacao\" : \"D\","
		    +  "\"colecaoNotaFiscal\" : ["
		     +    "{"
		      +      "\"NU_PROT\":\"852\","
		       +     "\"SQ_REG\":\"963\","
		        +    "\"TP_REG\":\"6\""
		         +"}"
		      +"]"
		   +"},"

		+"]";
		
		TesteJSON t = new TesteJSON();
		t.jsonParse(s);
		
		/*try {
			
			t.jsonParseStrict(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	}
	
	
	public void jsonParse(String pString){
		
		Object obj 		=  JSONValue.parse(pString);		
		JSONArray array = (JSONArray)obj;
		
		for (int i = 0; i < array.size(); i++) {
			Object obj2 = JSONValue.parse(array.get(i).toString());
			JSONObject jObj = (JSONObject)obj2;
			
			System.out.println(jObj);
			
			Set<String> keySet = jObj.keySet();
			
			Iterator<String> key = jObj.keySet().iterator();
			Iterator<String> key2 = jObj.keySet().iterator();
			
			while (key.hasNext()) {
				System.out.println("Chave: " + key.next() + "");
			}
			
			
			while (key2.hasNext()) {
				System.out.println("Valor: " + jObj.get(key2.next()) + "");
			}
			
		}
		
	}


}
