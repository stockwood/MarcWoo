package phys;

/**
 *
 * @author Benjamin Kahlau
 */
public interface PhysCombined extends PhysShape {

    public PhysShape getLeft();

    public PhysShape getRight();

    public void setLeft(PhysShape left);

    public void setRight(PhysShape right);
}
