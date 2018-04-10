package com.chegg.mathpix.processor.image;

import com.chegg.mathpix.processor.exceptions.MathpixException;

public interface ImageConvertor<T> {

  public String base64(T inputImage) throws MathpixException;
  
}
