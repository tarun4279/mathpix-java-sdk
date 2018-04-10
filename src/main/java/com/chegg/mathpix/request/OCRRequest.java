package com.chegg.mathpix.request;

import java.util.List;
import com.chegg.mathpix.request.enums.LATEX_FORMAT;
import com.chegg.mathpix.request.enums.OCRMode;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class OCRRequest {
    
  private String appId;
  
  private String appKey;
  
  @JsonProperty("ocr")
  private List<OCRMode> ocrModes;
  
  @JsonProperty("confidence_threshold")
  private double confidenceThreshold;
  
  @JsonProperty("confidence_rate_threshold")
  private double confidenceRateThreshold;
  
  @JsonProperty("format")
  private List<LATEX_FORMAT> formats;

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }
}
