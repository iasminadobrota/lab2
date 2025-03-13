public class Square extends Form {
    private float side;
    public Square(float side, String color){
        this.side = side;
    }
    public float getArea(){
        return side * side;
    }

}
