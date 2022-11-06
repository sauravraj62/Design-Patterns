public class ShapeFactory {
    public Shape getShape(string shapeType) {
        if(shapeType == "Rectangle") {
            return new Rectange();
        }

        switch(shapeType) {
            case : "Rectangle"
                    return new Rectange();
            case : "Square"
                return new Square();
            case : "Circle"
                return new Circle();
            default:
                retuen null;
        }
    }
}