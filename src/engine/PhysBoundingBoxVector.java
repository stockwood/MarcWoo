package engine;

/**
 *
 * @author Benjamin Kahlau
 */
public class PhysBoundingBoxVector implements PhysBoundingBox {

    private PhysPoint position;
    private PhysVector x;
    private PhysVector y;
    private PhysVector z;

    public PhysBoundingBoxVector(PhysPoint position, PhysVector x, PhysVector y, PhysVector z) {
        this.position = position;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Boolean isIn(PhysPoint point) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public PhysPoint getPostion() {
        return position;
    }
    

}
