import java.util.Objects;

public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle(float height, float base, String color) {
        this.height = height;
        this.base = base;

    }

    public float getArea() {
        return (height * base) / 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Verifică dacă este același obiect
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Verifică dacă obiectul este null sau de alt tip
        }
        Triangle triangle = (Triangle) obj;
        return Float.compare(triangle.height, height) == 0 &&
                Float.compare(triangle.base, base) == 0;

    }
}
