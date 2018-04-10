package com.chegg.mathpix.request;

public class Callback {

  private String callbackUrl;
  
  
  
  public Callback(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public String getCallbackUrl() {
    return callbackUrl;
  }
  
}
