package engine;

/**
 *
 * @author Benjamin Kahlau
 */
interface PhysVector {

    Double getX();

    Double getY();

    Double getZ();

    void setX(Double x);

    void setY(Double y);

    void setZ(Double z);

    Double length();

    PhysPoint toPoint();

    PhysVector add(PhysVector other);
}