/**
 * @author Fatih OGUZ
 */

/**
 * Shipments have information  sender,receiver,trackingNumber, and where are shipments(where)
 */
public class Shipments {
    private String sender;
    private String receiver;
    private String trackingNumber;
    private String where;

    /**
     *
     * @return is that where are shipments
     */
    public String getWhere() {
        return where;
    }

    /**
     *
     * @param where is that change place of shipment
     */
    public void setWhere(String where) {
        this.where = where;
    }

    /**
     *
     * @return trackingNumber of shipments.trackingNumber is String and unique number
     */

    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     *
     * @param trackingNumber change trackingNumber
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     *
     * @return name of sender
     */
    public String getSender() {
        return sender;
    }

    /**
     *
     * @param sender is name of sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     *
     * @return is name of receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     *
     * @param receiver is name of receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     *
     * @param sender is name of sender
     * @param receiver is name of receiver
     * @param trackingNumber is tracking number of shipments. tracking number is unique for shipment
     * @param where is that where is place of shipment
     *              these are information of shipments
     */
    public Shipments(String sender,String receiver,String trackingNumber,String where) {
        this.sender = new String();
        this.receiver = new String();
        this.trackingNumber = new String();
        this.where = new String();
        this.sender = sender;
        this.receiver = receiver;
        this.trackingNumber= trackingNumber;
        this.where = where;
    }

    /**
     * sender , receiver, tracking number and where are allocated String.
     * and not defined
     */
    public Shipments() {                            /* no parameter constructor */
        this.sender = new String();
        this.receiver = new String();
        this.trackingNumber = new String();
        this.where = new String();
        this.sender = "no recipient specified";
        this.receiver = "sender not specified";
        this.trackingNumber = "tracking number not specified ";
        this.where = "not defined";
    }

    /**
     *
     * @return is string that names of sender,receiver , tracking number , and place of shipment
     */
    @Override
    public String toString() {
        return "Shipments{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", where='" + where + '\'' +
                '}';
    }
}
