package abstraction;

abstract class Shape {
    abstract void calaculatearea();
}
class Circle extends Shape{

    @Override
    void calaculatearea() {
        System.out.println("cicle area calaculated");
    }
}
class Rectange extends Shape{

    @Override
    void calaculatearea() {
        System.out.println("rectangle area calaculated");
    }
}
class Triangle extends Shape{

    @Override
    void calaculatearea() {
        System.out.println("triangle calaculated");
    }
}
class test{
    public static void main(String[]args){
        Shape s = new Circle();
        s.calaculatearea();
        Shape sr = new Rectange();
        sr.calaculatearea();
        Shape st = new Triangle();
        st.calaculatearea();

    }
}
