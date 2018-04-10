package com.chegg.mathpix.processor.exceptions;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathpixException extends Exception {

  private List<MathpixErrorEntry> errorEntries; 
  
  private static final Logger LOGGER = LoggerFactory.getLogger(MathpixException.class);
  
  public MathpixException(String message) {
    super(message);
    errorEntries.stream().forEach(e -> e.displayErrorEntry());
  }
  
  public MathpixException addErrorEntry(MathpixErrorEntry entry) {
    
    if(this.errorEntries == null) {
      this.errorEntries = new ArrayList<>();
    }
    
    this.errorEntries.add(entry);
    
    return this;
  }
  
  public List<MathpixErrorEntry> getErrorEntries() {
    return this.errorEntries;
  }
  
   public class MathpixErrorEntry{
    
    private int errorCode;
    private String errorMessage;
    
    public MathpixErrorEntry(String message, int code) {
      this.errorCode = code;
      this.errorMessage = message;
    }
    
    private void displayErrorEntry() {
      LOGGER.error("Error entry :{}: {}",errorCode,errorMessage);
    }
    
  }

  
}
