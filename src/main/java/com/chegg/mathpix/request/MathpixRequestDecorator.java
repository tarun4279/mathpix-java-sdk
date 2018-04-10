package com.chegg.mathpix.request;


public abstract class MathpixRequestDecorator {
  
  public abstract OCRRequest decorate(OCRRequest request);
    
}
