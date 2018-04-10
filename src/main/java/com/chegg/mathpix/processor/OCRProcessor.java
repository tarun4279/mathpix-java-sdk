package com.chegg.mathpix.processor;

import com.chegg.mathpix.response.OCRRequestResponse;
import com.chegg.mathpix.response.batch.BatchDetailsResponse;
import com.chegg.mathpix.response.batch.OCRBatchRequestResponse;

final class MathpixProcessor {
  
  public static final String API_BASE_URL = "https://api.mathpix.com/";
  public static final String API_VERSION = "v3";
  public static final String API_PARAM_REQUEST = "latex";
  public static final String API_PARAM_BATCH = "batch";

  public String getVersion() {
    return String.valueOf("v3");
  }

  public OCRRequestResponse process() {
    // TODO Auto-generated method stub
    return null;
  }

  public OCRBatchRequestResponse processBatchSync() {
    // TODO Auto-generated method stub
    return null;
  }

  public BatchDetailsResponse processBatchAsync() {
    // TODO Auto-generated method stub
    return null;
  }  
  
}
