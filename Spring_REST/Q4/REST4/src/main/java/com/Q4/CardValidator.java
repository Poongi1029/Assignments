package com.Q4;

public class CardValidator {
	private String CardNo;

	public String getCardNo() {
		return CardNo;
	}

	public void setCardNo(String cardNo) {
		CardNo = cardNo;
	}
	// Visa - 4929560407292559, 4485585759433997742
	// Master - 2720993348630105, 
	//JCB - 3589280727810526 , 3537534590039017838
	//Discover - 6011390526053656
	
	public String isValidCard(){
        String ans="Not valid";
        String testCard=getCardNo();
        if(testCard.matches("((?:2131|1800|35[0-9]{3})[0-9]{11,14})")){
            ans="JCB";
        }
        else if(testCard.matches("(4[0-9]{12}(?:[0-9]{3})?)"))
            ans="Visa";
        else if(testCard.matches("^(5[1-5][0-9]{14}|2(22[1-9][0-9]{12}|2[3-9][0-9]{13}|[3-6][0-9]{14}|7[0-1][0-9]{13}|720[0-9]{12}))"))
            ans="MasterCard";
        else if(testCard.matches("(6(?:011|5[0-9]{2})[0-9]{12})"))
            ans="Discover";
        return ans;
    }
}
