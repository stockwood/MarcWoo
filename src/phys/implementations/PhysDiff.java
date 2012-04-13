package phys.implementations;

import phys.PhysCombined;
import phys.PhysShape;
import java.awt.Graphics2D;

/**
 *
 * @author Benjamin Kahlau
 */
public class PhysDiff extends PhysAbstractShape implements PhysCombined {
    private PhysShape left;
    private PhysShape right;
    
    public void draw(Graphics2D frame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public PhysShape getLeft() {
        return this.left;
    }

    public PhysShape getRight() {
        return this.right;
    }

    public void setLeft(PhysShape left) {
        this.left = left;
    }

    public void setRight(PhysShape right) {
        this.right = right;
    }
}
