package com.press3.CreateCampaign;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonArray;

public class JsonData1 {
	static String s;
	
	public static void main(String[] args) {
		
		//System.out.println(passingData("displayName"));
		
		
	}
	
	
	public static JSONArray getJsonData(){
		JSONParser parser = new JSONParser();
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=null;
		try {
    	   Object object = parser.parse(new FileReader("D:\\Selenium\\Press3\\src\\main\\java\\com\\press3\\CreateCampaign\\data1.json"));
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
