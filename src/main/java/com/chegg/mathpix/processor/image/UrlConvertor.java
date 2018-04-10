package com.chegg.mathpix.processor.image;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Base64;
import javax.imageio.ImageIO;
import com.chegg.mathpix.processor.exceptions.MathpixException;

public class UrlConvertor implements ImageConvertor<String>{

  @Override
  public String base64(String inputImage) throws MathpixException {
    
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    BufferedImage image = null;
    
    try
    {  
        URL url = new URL(inputImage);  
        image = ImageIO.read(url);
        
        ImageIO.write(image, "png", os);
        return Base64.getEncoder().encodeToString(os.toByteArray());
                         
    } catch (IOException e) {  
      
        throw new MathpixException("Unable to retrieve Image.");
        
    }  
    
  }

}
