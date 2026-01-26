package PackageImpl.ShapeImpl;

import PackageImpl.Shape.Square;

public class SquareImpl implements Square {
    @Override
    public void Area(int a, int b) {
        System.out.println("The area of Square is "+(a*b));
    }
}
