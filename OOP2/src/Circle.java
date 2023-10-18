class Circle extends GeoShape {
    private double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaCalculator() {
        return PI * radius * radius;
    }
}