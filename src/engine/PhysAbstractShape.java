package engine;

/**
 *
 * @author Benjamin Kahlau
 */
abstract class PhysAbstractShape implements PhysShape {
    private PhysPoint position;
    private PhysVector speed;
    private Double coefficientOfFriction;

    public PhysPoint getPostionVector() {
        return this.position;
    }

    public PhysVector getSpeedVector() {
        return this.speed;
    }

    public Double getCoefficientOfFriction() {
        return this.coefficientOfFriction;
    }

    public void setCoefficientOfFriction(Double coefficientOfFriction) {
        this.coefficientOfFriction = coefficientOfFriction;
    }
}
