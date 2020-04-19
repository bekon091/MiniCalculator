/**
 * @author Kevin Uy
 * @version 1.0.0
 * @since 4/18/2020
 *
 */
public abstract class Calculator implements Multiplier, Divider{
    protected int total;

    public Calculator(){
        total = 1;
    }

    @Override
    public void multiply(int y) {
        total = total * y;
    }

    @Override
    public void divide(int y){
        total = total/y;
    }

    public abstract int calculate();
}
