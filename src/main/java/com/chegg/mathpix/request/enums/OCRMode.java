package com.chegg.mathpix.request.enums;

import java.util.ArrayList;
import java.util.List;

public enum OCRMode {

  MATH("math"),TEXT("text");
  
  private String ocrType;
  
  private OCRMode(String value) {
    this.ocrType = value;
  }
  
  public OCRMode getOCRMode(String ocrMode) {
    switch (ocrMode) {
      case "math" : return MATH;
      case "text" : return TEXT;
      
      default : return MATH;
    } 
  }
  
  public List<OCRMode> getAllModes(){
    List<OCRMode> modes = new ArrayList<>();
    modes.add(MATH);
    modes.add(TEXT);
    return modes;
  }
  
  public String getOCRMode() {
    return this.ocrType;
  }
}
