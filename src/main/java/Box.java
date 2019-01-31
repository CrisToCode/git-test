
public class Box {

    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    private void countDim() {

        System.out.println("Dim = " + width * height * length);
    }


    public static void main(String[] args) {

        Box box1 = new Box(2, 3, 4);

        System.out.println(box1);
        box1.countDim();
    }
}
