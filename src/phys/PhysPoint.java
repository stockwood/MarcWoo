package phys;

/**
 *
 * @author Benjamin Kahlau
 */
public interface PhysPoint {

    Double getX();

    Double getY();

    Double getZ();

    void setX(Double x);

    void setY(Double y);

    void setZ(Double z);

    PhysVector toVector();
}
