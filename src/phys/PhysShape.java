package phys;

import phys.properties.PhysWithBoundingBox;
import phys.properties.PhysWithSpeed;
import phys.properties.PhysWithPosition;
import phys.properties.PhysWithFriction;

/**
 *
 * @author Benjamin Kahlau
 */
public interface PhysShape extends PhysWithPosition, PhysWithSpeed, PhysWithFriction, PhysWithBoundingBox {
    String getName();
}
