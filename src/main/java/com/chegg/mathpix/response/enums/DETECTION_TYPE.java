package com.chegg.mathpix.response.enums;

public enum DETECTION_TYPE {

  IS_NOT_MATH("is_not_math"),
  IS_INVERTED("is_inverted"),
  IS_BLANK("is_blank"),
  IS_PRINTED("is_printed"),
  CONTAINS_CHART("contains_chart"),
  CONTAINS_TABLE("contains_table"),
  CONTAINS_GRAPH("contains_graph"),
  CONTAINS_DIAGRAM("contains_diagram");
  
  String type;
  
  private DETECTION_TYPE(String type) {
    this.type = type;
  }
  
}

