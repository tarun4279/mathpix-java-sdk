package com.chegg.mathpix.request;

import java.awt.image.BufferedImage;

public class MonoOCRRequest extends OCRRequest {
  
  private Callback callback;
  
  BufferedImage image;
  
  public MonoOCRRequest(BufferedImage image) {
    this.image = image;
  }
  
  public void setCallback(Callback callback) {
    this.callback = callback;
  }
  
  public Callback getCallback() {
    return this.callback;
  }
}
