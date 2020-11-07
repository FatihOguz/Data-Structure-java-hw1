/**
@author Fatih OGUZ
 */

/**
 * Systems has a adminostor, branchs, brach employees, shipments, customers, and trasportation personnels.
 * Administers manage all sub branches of system.
 */
public class Systems {

    private Administors administors;

    /**
     *  creative administor
     */
    public Systems() {               /* no parameter constructor */
        this.administors = new Administors();

    }

    /**
     *
     * @return Administers manage all sub branches of systems
     */
    public Administors getAdministors() {
        return administors;
    }

    /**
     *
     * @param administors manage all sub branches of systems
     */
    public void setAdministors(Administors administors) {
        this.administors = administors;
    }
}
