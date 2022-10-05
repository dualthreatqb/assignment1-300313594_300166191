package design2;

public class PointCP2 {
  // private char typeCoord;
  private double xOrRho;
  private double yOrTheta;

  public PointCP2(char type, double xOrRho, double yOrTheta) {
    if (type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    if (type == 'C') {
      System.out.println("Your Cartesian coordinates: ("+xOrRho+","+yOrTheta+")");
      this.yOrTheta = Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
      this.xOrRho = (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
    } else {
      this.xOrRho = xOrRho;
      this.yOrTheta = yOrTheta;
    }
  }

  public double getX() {
    return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }

  public double getY() {
    return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }

  public double getRho() {
    return xOrRho;
  }

  public double getTheta() {
    return yOrTheta;
  }

  public double getDistance(PointCP2 pointB) {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();

    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }
  public String toString() {
    return "Stored as Polar [" + getRho() + "," + getTheta() + "]" + "\n";
  }
}
