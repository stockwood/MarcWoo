package phys.implementations;

import phys.PhysBoundingBox;
import phys.PhysPoint;
import phys.PhysShape;
import phys.PhysVector;
import java.awt.Graphics2D;

/**
 *
 * @author Benjamin Kahlau
 */
abstract class PhysAbstractShape implements PhysShape {

    private String name;
    private PhysPoint position;
    private PhysVector speed;
    private Double coefficientOfFriction;
    private PhysBoundingBox boundingBox;

    public void moveTo(PhysPoint point) {
    }

    public void move(PhysVector vector) {
    }

    public String getName() {
        return this.name;
    }

    public PhysPoint getPosition() {
        return this.position;
    }

    public PhysVector getSpeed() {
        return this.speed;
    }

    public Double getCoefficientOfFriction() {
        return this.coefficientOfFriction;
    }

    public void setCoefficientOfFriction(Double coefficientOfFriction) {
        this.coefficientOfFriction = coefficientOfFriction;
    }

    public PhysBoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public abstract void draw(Graphics2D frame);
}
