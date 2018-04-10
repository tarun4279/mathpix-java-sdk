package com.chegg.mathpix.commons;

public class ImageRegion {

  private double width;
  private double height;
  private double topLeftX;
  private double topLeftY;
  
  public ImageRegion(double w, double h,double tlx, double tly) {
    this.height = h;
    this.width = w;
    this.topLeftX = tlx;
    this.topLeftY = tly;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getTopLeftX() {
    return topLeftX;
  }

  public void setTopLeftX(double topLeftX) {
    this.topLeftX = topLeftX;
  }

  public double getTopLeftY() {
    return topLeftY;
  }

  public void setTopLeftY(double topLeftY) {
    this.topLeftY = topLeftY;
  }
  
}


