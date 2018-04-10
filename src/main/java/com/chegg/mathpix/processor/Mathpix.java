package com.chegg.mathpix.processor;

import com.chegg.mathpix.processor.exceptions.MathpixException;
import com.chegg.mathpix.request.MathpixRequestHeaderDecorator;
import com.chegg.mathpix.request.OCRRequest;
import com.chegg.mathpix.request.batch.OCRBatchRequest;
import com.chegg.mathpix.response.OCRRequestResponse;
import com.chegg.mathpix.response.batch.BatchDetailsResponse;
import com.chegg.mathpix.response.batch.OCRBatchRequestResponse;

public final class Mathpix {
    
  private MathpixProcessor processor;
  
  private MathpixRequestHeaderDecorator headerDecorator;
  
  public Mathpix(String appId, String appKey) {
    this.headerDecorator = new MathpixRequestHeaderDecorator(appId,appKey);
  }
  
  public OCRRequestResponse execute(OCRRequest request) {
    return null;
  }
  
  public BatchDetailsResponse executeBatchAsync(OCRBatchRequest request) {
    return null;
  }
  
  public OCRBatchRequestResponse executeBatchSync(OCRBatchRequest request) 
      throws MathpixException {
    return null;
  }
  
}
