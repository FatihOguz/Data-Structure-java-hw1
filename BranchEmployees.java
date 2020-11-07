/**
@author Fatih OGUZ
 */
import java.util.Arrays;

public class BranchEmployees {
  private String name;
  private String surname;
  private String  branchName;
 private Customer[] customer;
 private Shipments[] shipments;
 private TransportationPersonnel[] transportationPersonnel;
 private  int shipmentSize = 0;
 private int customerSize = 0;
 private int transportationPersonnelSize = 0;

    /**
     * branch employee has a name,surname,branchName is that where work.
     * and custumers,shipments,tranportationPersonnel
     * transportationPersonnel go to receiver shipments and branch employee maanage this stiuation.
     */
  public BranchEmployees()          /* no parameter constructor */
  {
      this.name = new String();
      this.surname = new String();
      this.branchName = new String();
      this.branchName = "not named";
      this.name = "not named";
      this.surname = "not surnamed";
      this.customer = new Customer[customerSize];
      this.shipments = new Shipments[shipmentSize];
      this.transportationPersonnel = new TransportationPersonnel[transportationPersonnelSize];
      for(int i=0;i<this.getShipmentSize();i++)
      {
          this.shipments[i] = new Shipments();
      }
      for(int i=0;i<this.getCustomerSize();i++)
      {
          this.customer[i] = new Customer();
      }
      for(int i=0;i<this.getTransportationPersonnelSize();i++)
      {
          this.transportationPersonnel[i] = new TransportationPersonnel();
      }

  }


    /**
     *
     * @return how much are tranportationPersonnel
     */
    public int getTransportationPersonnelSize() {
        return transportationPersonnelSize;
    }

    /**
     *
     * @param transportationPersonnelSize change quantity of transportationPersonnel
     */

    public void setTransportationPersonnelSize(int transportationPersonnelSize) {
        this.transportationPersonnelSize = transportationPersonnelSize;
    }

    /**
     *
     * @return TransportationPersonnel is array . branch employee manage them
     */
    public TransportationPersonnel[] getTransportationPersonnel() {
        return transportationPersonnel;
    }

    /**
     *
     * @param transportationPersonnel is work with brachEmployee . branch employee has a transportationPersonnel
     */
    public void setTransportationPersonnel(TransportationPersonnel[] transportationPersonnel) {
        this.transportationPersonnel = transportationPersonnel;
    }

    /**
     *
     * @param name is name of branch employee
     * @param surname is surname of branch employee
     * @param branchName is that where branch employee work
     */
    public BranchEmployees(String name, String surname, String branchName)
    {
        this.name = new String();
        this.surname = new String();
        this.branchName = new String();
        this.branchName = branchName;
        this.name = name;
        this.surname = surname;
        this.customer = new Customer[customerSize];
        for(int i=0;i<this.getCustomerSize();i++)
        {
            this.customer[i] = new Customer();
        }

    }

    /**
     *
     * @return how much customer  for branch employee
     */
    public int getCustomerSize() {
        return customerSize;
    }

    /**
     *
     * @param customerSize adding and deleting customer
     */
    public void setCustomerSize(int customerSize) {
        this.customerSize = customerSize;
    }

    /**
     *
     * @return where do branchEmployee work?
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     *
     * @param branchName branch employee change to place of work
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     *
     * @return Shipments[] . it is that branchEmployee manage shipments
     */
    public Shipments[] getShipments() {
        return shipments;
    }

    /**
     *
     * @param shipments is shipments array. branchEmployee manage them
     */
    public void setShipments(Shipments[] shipments) {
        this.shipments = shipments;
    }

    /**
     *
     * @return integer . branchEmployee manage how much shipment
     */
    public int getShipmentSize() {
        return shipmentSize;
    }

    /**
     *
     * @param shipmentSize is that size of shipment that branchEmployee manage them.
     */

    public void setShipmentSize(int shipmentSize) {
        this.shipmentSize = shipmentSize;
    }

    /**
     * @return String name of branchemployee
     */
    public String getName() {
        return name;
    }

    /**
       @param name is name of branchemployee
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
      @return String surname of branchemployee
     */

    public String getSurname() {
        return surname;
    }

    /**
    @return it is Customer Array .Customer is a class
     */
    public Customer[] getCustomer() {
        return customer;
    }
    /**
    @param customer is array . this array has a relation with BranchEmployee

     */
    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }
/**
    @param surname is surnama of branchEmployee

 */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**
        @param shipments  is array shipments
        @param trackingNumber is shipment of tracking Number
        @param where is that where are shipment

     */
    public void ShippingStatus(Shipments[] shipments, String trackingNumber, String where)
    {
        for(int i = 0; i < this.getShipmentSize();i++)
        {
            if(shipments[i].getTrackingNumber()==trackingNumber)
            {
                shipments[i].setWhere(where);
            }
        }


    }
    /**
        @param source is customer array before adding
        @param c  is adding customer

     */
    public void addCustomer(Customer[] source,Customer c)  /* source is array custome right now */
    {
        int k;
        this.customer = new Customer[customerSize+1];
        for (k = 0; k < customerSize; k++)
        {
            this.customer[k] = source[k];

        }
        customerSize++;

        this.customer[k] = c;
    }
        /**
            @param source is customer array before deleting
            @param CustomerName is  deleting name of customer
            @param CustomerSurname is deleting surname of customer

         */
    public void deleteCustomer(Customer[] source,String CustomerName,String CustomerSurname)  /* source is array custome right now */
    {
        int k;
        int flag=0;
        this.customer = new Customer[customerSize-1];
        for (k = 0; k < customerSize; k++)
        {
            if(( source[k].getName() == CustomerName ) && source[k].getSurname()==CustomerSurname)
            {
                this.customer[k] = source[k+1];
                k++;
                flag=1;
            }
            else if(flag==1)
            {
                this.customer[k-1] = source[k];
            }
            else
            {
                this.customer[k] = source[k];
            }


        }
        customerSize--;

    }
    /**
    @param source is branchEmployees's shipments before
    @param sender is sender of shipment
    @param receiver is receiver of shipment
    @param trackingNumber is trackingNumber of shipment

     */
    public void deleteShipments(Shipments[] source, String sender, String receiver,String trackingNumber)
    {
        int k;
        int flag=0;
        this.shipments = new Shipments[shipmentSize-1];
        for (k = 0; k < shipmentSize; k++)
        {
            if((source[k].getTrackingNumber() == trackingNumber   && source[k].getSender() == sender ) && source[k].getReceiver()==receiver)
            {
                this.shipments[k] = source[k+1];
                k++;
                flag=1;
            }
            else if(flag==1)
            {
                this.shipments[k-1] = source[k];
            }
            else
            {
                this.shipments[k] = source[k];
            }


        }
        shipmentSize--;

    }
    /**
    @param source is branchEmployees's shipments before
    @param s is adding shipment
    @param transportationPersonnel will go  this s shipment

     */
    public void addShipments(Shipments [] source,Shipments s,TransportationPersonnel transportationPersonnel)
    {

        int k;
        this.shipments = new Shipments[shipmentSize+1];
        for (k = 0; k < shipmentSize; k++)
        {
            this.shipments[k] = source[k];

        }

        shipmentSize++;
        this.shipments[k] = s;
        transportationPersonnel.addShipments(transportationPersonnel.getShipments(),this.shipments[k]);
    }
/**
Adminoster add branchEmployee and transportationPersonnel.
However tranportationPersonnel work under the branchEmployees
So branchEmployees has a transportationPersonnel.
transportationPersonnel has a shipments.
So this method is helping to Administor addTransportationPersonnel method
@param source This array transportation personnel of  branch employees before adding.
@param transportationPersonnel It is adding element

 */
 public void addTransportationPersonnel(TransportationPersonnel[] source,TransportationPersonnel transportationPersonnel)
 {
     int i = 0;
     this.transportationPersonnel = new TransportationPersonnel[this.getTransportationPersonnelSize() + 1];
     for(i =0 ; i< this.getTransportationPersonnelSize() ; i++)
     {
         this.getTransportationPersonnel()[i] = source[i];
     }
     this.getTransportationPersonnel()[i] = transportationPersonnel;
     transportationPersonnelSize++;
 }
/**
    name,surname, work in branch name, and see customers

   @return String
 */
    @Override
    public String toString() {
        return "BranchEmployees{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", branchName='" + branchName + '\'' +
                ", customer=" + Arrays.toString(customer) +
                '}';
    }
}
