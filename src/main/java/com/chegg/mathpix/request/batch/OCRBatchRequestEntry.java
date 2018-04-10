package com.chegg.mathpix.request.batch;

public class OCRBatchRequestEntry {

  private String entryId;
  private String imageUrl;
  
  public OCRBatchRequestEntry(String entryId, String imageUrl) {
    this.entryId = entryId;
    this.imageUrl = imageUrl;
  }

  public String getEntryId() {
    return entryId;
  }

  public String getImageUrl() {
    return imageUrl;
  }
  
}
