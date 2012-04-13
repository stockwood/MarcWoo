package engine;

/**
 *
 * @author Benjamin Kahlau
 */
interface PhysBoundingBox extends PhysWithPosition {

    Boolean isIn(PhysPoint point);

    //Boolean overlaps(<? implements WithBoundingBox> other);
}
