package com.chegg.mathpix.request.enums;

public enum LATEX_FORMAT {
  
  LATEX_RAW("latex_raw"),
  LATEX_NORMAL("latex_normal"),
  LATEX_SIMPLIFIED("latex_simplified"),
  LATEX_STYLED("latex_styled"),
  LATEX_LIST("latex_list");
  
  private String format;
  
  private LATEX_FORMAT(String format) {
    this.format = format;
  }

  public LATEX_FORMAT getLatexFormat(String format) {
    
    switch(format) {
      case "latex_raw" : return LATEX_RAW;
      case "latex_normal" : return LATEX_NORMAL;
      case "latex_simplified" : return LATEX_SIMPLIFIED;
      case "latex_styled" : return LATEX_STYLED;
      case "latex_list" : return LATEX_LIST;
      
      default : return LATEX_NORMAL;
    }
    
  }
  
  public String getFormat() {
    return this.format;
  }
  
}
