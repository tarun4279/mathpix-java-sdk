package com.chegg.mathpix.request;

import java.util.Arrays;
import java.util.List;

public class MathpixRequestHeaderDecorator extends MathpixRequestDecorator{
  
  List<String> headers;
  
  public MathpixRequestHeaderDecorator(String ... headers) {
    this.headers = Arrays.asList(headers);
  }
  
  // TODO: is this good should we take a list or a map what , then we need to define constants and 
  // and that would make dependency between classes.
  @Override
  public OCRRequest decorate(OCRRequest request) {
    request.setAppId(this.headers.get(0));
    request.setAppKey(this.headers.get(1));
    
    return request;
  }

}
