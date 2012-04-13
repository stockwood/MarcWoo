package engine;

/**
 *
 * @author Benjamin Kahlau
 */
abstract class PhysAbstractShape implements PhysShape {
    private PhysPoint position;
    private PhysVector speed;
    private Double coefficientOfFriction;
    private PhysBoundingBox boundingBox;

    public PhysPoint getPostion() {
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
}
