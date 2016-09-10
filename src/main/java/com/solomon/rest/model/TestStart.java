package com.solomon.rest.model;

import java.io.BufferedReader;
import java.io.FileReader;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestStart {

	public static void main(String[] args) {
       
        
        ObjectMapper mapper=new ObjectMapper();
        BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("//Users//gauravdiwanji//Documents//test.json"));
			SolomonRecord solomonObj = mapper.readValue(br, SolomonRecord.class);
			System.out.println("Object:"+solomonObj.toString());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
