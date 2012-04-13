package phys.implementations;

import phys.PhysPoint;
import phys.PhysVector;

/**
 *
 * @author Benjamin Kahlau
 */
class PhysTriple implements PhysPoint, PhysVector {

    private Double x;
    private Double y;
    private Double z;

    public PhysTriple(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double length() {
        return Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }

    // TODO nicht toll
    public PhysVector add(PhysVector other) {
        return new PhysTriple(this.getX() + other.getX(), this.getY() + other.getY(), this.getZ() + other.getZ());
    }
    
    // TODO nicht toll
    public void move(PhysVector vector) {
        this.moveTo(this.add(vector).toPoint());
    }
    
    // TODO nicht toll
    public void moveTo(PhysPoint point) {
        this.setY(point.getX());
        this.setY(point.getY());
        this.setZ(point.getZ());
    }

    public PhysPoint toPoint() {
        return this;
    }

    public PhysVector toVector() {
        return this;
    }

    public Double getX() {
        return this.x;
    }

    public Double getY() {
        return this.y;
    }

    public Double getZ() {
        return this.z;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setZ(Double z) {
        this.z = z;
    }
}