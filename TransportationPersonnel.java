/**
 * @author Fatih OGUZ
 */

/**
 * transportation personnel deliver the package to the address
 * transportation personnel have name , surname,shipments and quantity of shipments
 */
public class TransportationPersonnel {
private String name;
private  String surname;
private Shipments[] shipments;
private int shipmentSize  = 0;

    /**
     *  not defined name and surname
     */
    public  TransportationPersonnel()    /* no parameter constructor */
    {
        this.name = "not name";
        this.surname = "not surname";
    }

    /**
     *
     * @param name is name of transportation personnel
     * @param surname is surname of transportation personnel
     * @param shipments is shipments of transportation personnel
     * @param shipmentSize is quantity of shipments
     *                     and allocate these informations
     */
    public TransportationPersonnel(String name,String surname,Shipments[] shipments,int shipmentSize) {
        this.name = name;
        this.surname = surname;
       this.shipmentSize = shipmentSize;
        this.shipments = new Shipments[this.getShipmentSize()];
        for(int i = 0; i<this.getShipmentSize();i++){
            this.shipments[i] = new Shipments();
        }
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
     * @param shipments change information of shipments
     */
    public void setShipments(Shipments[] shipments) {
        this.shipments = shipments;
    }

    /**
     *
     * @return is quantity of shipments array
     */
    public int getShipmentSize() {
        return shipmentSize;
    }

    /**
     *
     * @param shipmentSize changed quantity of shipments array
     */
    public void setShipmentSize(int shipmentSize) {
        this.shipmentSize = shipmentSize;
    }

    /**
     *
     * @return is name of transportation personnel
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name changed name of transportation personnel
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return surname is surname of transportation personnel
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @param surname changed surname of   transportation personnel
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @param trackingNumber is unique number for shipments
     *  this method define that shipment delivered receiver
     *                       or wrong tracking number
     */
    public void DeliveredShipment(String trackingNumber)
    {
        for(int i = 0;i< this.getShipmentSize();i++)
          if(trackingNumber==this.getShipments()[i].getTrackingNumber())
          {
              this.getShipments()[i].setWhere("Delivered");
              System.out.println(this.getShipments()[i]);
          }
        else
          {
              System.out.println("Wrong tracking number...");
              System.out.println(this.getShipments()[i]);
          }


    }

    /**
     *
     * @param source is shipments array before adding
     * @param shipments is shipment to be added
     */
    public void addShipments(Shipments[] source,Shipments shipments)
    {
        int k;
        this.shipments = new Shipments[shipmentSize+1];
        for (k = 0; k < shipmentSize; k++)
        {
            this.shipments[k] = source[k];

        }

        shipmentSize++;
        this.shipments[k] = shipments;
    }

    /**
     *
     * @return is string that are names and surnames of transportation personels
     */
    @Override
    public String toString() {
        return "TransportationPersonnel{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
