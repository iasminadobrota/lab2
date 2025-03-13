public class Circle extends Form {
    private float radius;
    public Circle(float radius, String color) {
        this.radius = radius;

    }

    @Override
    public float getArea() {
        return (float)(Math.PI+radius*radius);

    }
}
