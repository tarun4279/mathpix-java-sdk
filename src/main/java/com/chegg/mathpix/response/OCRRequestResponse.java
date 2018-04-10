package com.chegg.mathpix.response;

import java.util.List;
import com.chegg.mathpix.commons.ImageRegion;
import com.chegg.mathpix.response.enums.DETECTION_TYPE;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OCRRequestResponse {
  
  public OCRRequestResponse() {}
  
  @JsonProperty("latex")
  private String latex;
  
  @JsonProperty("latex_confidence_rate")
  private double latexConfidenceRate;
  
  @JsonProperty("latex_confidence")
  private double latexConfidence;
  
  @JsonProperty("detection_list")
  private List<DETECTION_TYPE> detectionTypes;
  
  @JsonProperty("error")
  private String error;
  
  @JsonProperty("position")
  private ImageRegion region;
  
}