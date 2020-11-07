/**
 * @author Fatih OGUZ
 */

/**
 *  Customer has name and surname
 */
public class Customer {

    private String name;
    private String surname;
    public Customer(String name,String Surname) {

        this.name = new String();
        this.surname = new String();
        this.surname = Surname;
        this.name = name;
    }

    /**
     * customer has not name and surname
     */
    public Customer() {     /* no parameter constructor */
        this.name = new String();
        this.name = "not named";
        this.surname = new String();
        this.surname = "not named";

    }

    /**
     *
     * @return surname of customer
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
      * @param surname change surname of customer
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @return name of customer
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name change name of customer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param system  has admin, branch,branch employee,transportation personnel,shipments
     * @param trackingNumbers is special number(string) for shipment
     */

    public void SeeingTheSituation(Systems system,String trackingNumbers)
    {
        Administors  a = system.getAdministors();
        BranchEmployees[] b = a.getBranchEmployees();


        for(int i = 0; i < a.getBrancheEmployeesSize();i++)
        {
            for(int j = 0; j < b[i].getTransportationPersonnelSize();j++)
            {
                for(int k = 0; k < b[i].getTransportationPersonnel()[j].getShipmentSize();k++)
                {
                    if( b[i].getTransportationPersonnel()[j].getShipments()[k].getTrackingNumber() == trackingNumbers)
                    {
                       System.out.println(b[i].getTransportationPersonnel()[j].getShipments()[k]);
                    }
                    else
                    {
                        System.out.println("wrong tracking number. Please try again");
                    }
                }
            }
        }
    }

    /**
     *
     * @return name,surname of customer
     */
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
