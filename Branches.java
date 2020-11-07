/**
 * @author Fatih OGUZ
 */

import java.util.Arrays;

/**
 *  Branches has a Shipments . Shipments allocate transportation personnel of branchEmployee
 */
public class Branches {

    private Shipments[] shipments ;
    private String name;
    private int shipmentSize = 0;

    /**
     * shipments is reference and shipsmentSize is quantity of shipment
     * Constructor create shipments array . this array size is shipmentSize
     */
    public Branches() {                  /* no parameter constructor */
        this.shipments = new Shipments[shipmentSize];
        for(int i=0;i<this.getShipmentSize();i++)
        {
            this.shipments[i] = new Shipments();
        }
        this.name = "not named";
    }

    /**
     *
     * @param name is name of branch
     */
    public Branches(String name)
    {
        this.name = name;
    }

    /**
     *
     * @return is size of shipments array
     */
    public int getShipmentSize() {
        return shipmentSize;
    }

    /**
     *
     * @param shipmentSize is size of shipments array
     */

    public void setShipmentSize(int shipmentSize) {
        this.shipmentSize = shipmentSize;
    }

    /**
     *
     * @return is shipments array
     */

    public Shipments[] getShipments() {
        return shipments;
    }

    /**
     *
     * @param shipments is shipments array
     */
    public void setShipments(Shipments[] shipments) {
        this.shipments = shipments;
    }

    /**
     *
     * @return is name of branch
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name change name of branch
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return is string . shipments and name
     */

    @Override
    public String toString() {
        return "Branches{" +
                "shipments=" + Arrays.toString(shipments) +
                ", name='" + name + '\'' +
                '}';
    }
}
