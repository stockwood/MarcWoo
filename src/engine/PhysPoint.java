package engine;

/**
 *
 * @author Benjamin Kahlau
 */
interface PhysPoint {

    Double getX();
    Double getY();
    Double getZ();
    void setX(Double x);
    void setY(Double y);
    void setZ(Double z);
    PhysVector toVector();
}
