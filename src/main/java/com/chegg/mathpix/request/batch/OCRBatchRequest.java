package com.chegg.mathpix.request.batch;

import java.util.List;
import com.chegg.mathpix.request.Callback;
import com.chegg.mathpix.request.OCRRequest;

public class OCRBatchRequest extends OCRRequest{

  private Callback callback;
  
  private List<OCRBatchRequestEntry> batchEntries;
  
  public void addBatchEntry(OCRBatchRequestEntry entry) {
    this.batchEntries.add(entry);
  }
  
  public List<OCRBatchRequestEntry> getBatchEntries(){
    return this.batchEntries;
  }
  
  public void setCallBackURL(Callback callback) {
    this.callback = callback;
  }
  
  public Callback getCallBackUrl() {
    return this.callback;
  }
  
}
