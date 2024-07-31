package study.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Study_JSON {
	public static void main(String[] args) {
//    	JSON OBject 2개 생성
		JSONObject json1 = new JSONObject();
		JSONObject json2 = new JSONObject();
		try {
			json1.put("이지민짱", 1);
			json2.put("용호중", 2);

		} catch (JSONException e) {
			e.printStackTrace();
		}
//      JSONArray(배열) 객체 생성
		JSONArray jArray = new JSONArray();
		jArray.put(json1);
		jArray.put(json2);
//      JSONArray(jArray) 출력
		for (int i = 0; i < jArray.length(); i++) {
			try {
				JSONObject obj = jArray.getJSONObject(i);
				System.out.println(obj);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
	}
}
