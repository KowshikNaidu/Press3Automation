package com.press3.createAgent;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonArray;

public class JsonData {
	static String s;
	
	public static void main(String[] args) {
		
		//System.out.println(passingData("displayName"));
	}
	
	
	public static JSONArray getJsonData(){
		JSONParser parser = new JSONParser();
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=null;
		try {
    	   Object object = parser.parse(new FileReader("D:\\Selenium\\Press3\\src\\main\\java\\com\\press3\\createAgent\\data.json"));
    	   jsonArray = (JSONArray)object;
    	   
    	   
    	   
    	   //s=(String)jsonObject.get(text);
    	   
       } 
       catch (FileNotFoundException e) {
           e.printStackTrace();
           return null;
       }
       catch(Exception e)
       {
           e.printStackTrace();
           return null;
       }
       return jsonArray;
}
}
