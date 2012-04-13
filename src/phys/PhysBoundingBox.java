package phys;

import phys.properties.PhysWithPosition;

/**
 *
 * @author Benjamin Kahlau
 */
public interface PhysBoundingBox extends PhysWithPosition {

    Boolean isIn(PhysPoint point);

    //Boolean overlaps(<? implements WithBoundingBox> other);
}
