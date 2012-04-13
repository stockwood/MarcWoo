package engine;

import phys.implementations.PhysCubid;
import phys.implementations.PhysSphere;

/**
 *
 * @author Benjamin Kahlau
 */
public class PhysFactory {

    public PhysCubid cubiod() {
        return new PhysCubid();
    }

    public PhysSphere sphere() {
        return new PhysSphere();
    }
}
