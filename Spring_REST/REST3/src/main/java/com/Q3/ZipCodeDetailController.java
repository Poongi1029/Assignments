package com.Q3;

import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipCodeDetailController {
	@RequestMapping(value = "/country", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<ZipCodeDetail> getPincode(){
		ZipCodeDetail zipCodeDetails1 = new ZipCodeDetail();
		zipCodeDetails1.setPincode(99501);
		zipCodeDetails1.setState("AK");
		zipCodeDetails1.setCity("ANCHORAGE");
		zipCodeDetails1.setCountry("US");
		ZipCodeDetail zipCodeDetails2 = new ZipCodeDetail();
		zipCodeDetails2.setPincode(12345);
		ZipCodeDetail zipCodeDetails3 = new ZipCodeDetail();
		zipCodeDetails3.setPincode(23030);
		
		ArrayList<ZipCodeDetail> pinCodeList = new ArrayList<ZipCodeDetail>();
		pinCodeList.add(zipCodeDetails1);
		pinCodeList.add(zipCodeDetails2);
		pinCodeList.add(zipCodeDetails3);
		return pinCodeList;
       
    }
	
	@RequestMapping(value = "/country/{pincode}", method = RequestMethod.GET)
	public ZipCodeDetail getDetails(@PathVariable("pincode") int pincode) {
		
		ZipCodeDetail zipCodeDetail = new ZipCodeDetail();
		zipCodeDetail.setPincode(pincode);
		zipCodeDetail.setState("AK");
		zipCodeDetail.setCity("ANCHORAGE");
		zipCodeDetail.setCountry("US");
		
		return zipCodeDetail;
	}
}
