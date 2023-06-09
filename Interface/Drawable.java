package Interface;
@FunctionalInterface
public interface Drawable {
    void shape();
}
class  Circle implements Drawable{

    @Override
    public void shape() {
        System.out.println("circle");
    }
}
class Rectangle implements Drawable{

    @Override
    public void shape() {
        System.out.println("rectangle");
    }
}
class Triangle implements Drawable{

    @Override
    public void shape() {
        System.out.println("triangle");
    }
}
