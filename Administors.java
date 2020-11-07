/**
 * @author Fatih OGUZ
 */

import java.util.Arrays;

/**
 * Administors anage all sub branches of systems
 * Admistors add and delete branch,branch employee ,tranportation personnel.
 * And it arrice every data.
 * branch,branch employee ,tranportation personnel arrays.
 * customers creative reference them.
 * they are size = 0
 * adding and deleting methods change sizes.
 * and organize arrays again.
 */
public class Administors {

    private Branches [] branches ;
    private BranchEmployees[] branchEmployees ;
    private TransportationPersonnel [] transportationPersonnels ;
    private int branchesSize = 0;
    private int brancheEmployeesSize = 0;
    private int transportationPersonnelsSize = 0;

    public Administors() {     /* no parameter constructor */
        this.branches =new Branches[this.getBranchesSize()];
        this.branchEmployees = new BranchEmployees[this.getBrancheEmployeesSize()];
        this.transportationPersonnels = new TransportationPersonnel[this.getTransportationPersonnelsSize()];
            for(int i = 0; i<this.getBrancheEmployeesSize();i++){
                this.branches[i] = new Branches();
            }
            for(int i = 0 ; i <this.brancheEmployeesSize; i++)
            {
                this.branchEmployees[i] = new BranchEmployees();
            }
           for(int i = 0; i< this.getTransportationPersonnelsSize();i++)
           {
               this.transportationPersonnels[i] = new TransportationPersonnel();
           }
       }

    /**
     *
     * @return quantity of transportationPersonnel
     */
    public int getTransportationPersonnelsSize() {
        return transportationPersonnelsSize;
    }

    /**
     *
     * @param transportationPersonnelsSize change quantity transportation personnel
     */
    public void setTransportationPersonnelsSize(int transportationPersonnelsSize) {
        this.transportationPersonnelsSize = transportationPersonnelsSize;
    }

    /**
     *
     * @return quantity of brench employee
     */

    public int getBrancheEmployeesSize() {
        return brancheEmployeesSize;
    }

    /**
     *
     * @param brancheEmployeesSize change quantity of brench employee
     */
    public void setBrancheEmployeesSize(int brancheEmployeesSize) {
        this.brancheEmployeesSize = brancheEmployeesSize;
    }

    /**
     *
     * @return quantity of branch
     */
    public int getBranchesSize() {
        return branchesSize;
    }

    /**
     *
      * @param branchesSize change quantity of branch
     */
    public void setBranchesSize(int branchesSize) {
        this.branchesSize = branchesSize;
    }

    /**
     *
     * @return is branch array.admin manage to branches
     */
    public Branches[] getBranches() {
        return branches;
    }

    /**
     *
     * @param branches change information branches
     */
    public void setBranches(Branches[] branches) {
        this.branches = branches;
    }

    /**
     *
     * @return is branch employee array. admin manage them
     */
    public BranchEmployees[] getBranchEmployees() {
        return branchEmployees;
    }

    /**
     *
     * @param branchEmployees change information branch employees
     */
    public void setBranchEmployees(BranchEmployees[] branchEmployees) {
        this.branchEmployees = branchEmployees;
    }

    /**
     *
     * @return is transportation personnel array . admin manage them
     */
    public TransportationPersonnel[] getTransportationPersonnels() {
        return transportationPersonnels;
    }

    /**
     *
     * @param transportationPersonnels change information transportation personnel
     */
    public void setTransportationPersonnels(TransportationPersonnel[] transportationPersonnels) {
        this.transportationPersonnels = transportationPersonnels;
    }

    /**
     *
     * @param branchEmployees admin add transportation personnel .
     * @param transportationPersonnel go shipments .
     */
    public void addTransportationPersonnel(BranchEmployees branchEmployees, TransportationPersonnel transportationPersonnel) {
        branchEmployees.addTransportationPersonnel(branchEmployees.getTransportationPersonnel(), transportationPersonnel);

    }

    /**
     *
     * @param branch admin delete transportation personnel .transportation personnel work with branch employee
     * @param transportationPersonnelName is name of transportation personnel
     */
    public void deleteTransportationPersonnel(BranchEmployees branch,String transportationPersonnelName)
    {
        int flag=0;

        TransportationPersonnel [] source = new TransportationPersonnel[branch.getTransportationPersonnelSize()];

        for(int i = 0; i < branch.getTransportationPersonnelSize();i++)
        {
            source[i] = branch.getTransportationPersonnel()[i];
        }
        branch.setTransportationPersonnel(new TransportationPersonnel[branch.getTransportationPersonnelSize()-1]);
        for(int j = 0; j < branch.getTransportationPersonnelSize() - 1 ; j++)
        {
            if(source[j].getName()!= transportationPersonnelName)
            {
                branch.getTransportationPersonnel()[j] = source[j] ;
            }
            else if(flag==1)
            {
                branch.getTransportationPersonnel()[j-1] = source[j] ;
            }
            else
            {
                branch.getTransportationPersonnel()[j] = source[j + 1] ;
                j++;
                flag=1;
            }
        }
        branch.setTransportationPersonnelSize(branch.getTransportationPersonnelSize()-1);


    }

    /**
     *
     * @param source is branch array before adding
     * @param b is branch to be added
     */
    public void addBranches(Branches[] source, Branches b)
    {
        int k;
        this.branches = new Branches[branchesSize+1];
        for ( k= 0; k < branchesSize; k++)
        {
            this.branches[k] = source[k];

        }
        branchesSize++;
        this.branches[k] = b;
    }

    /**
     *
     * @param source is branch array before deleting
     * @param branchName is name of  branch to be deleting
     */
    public void deleteBranches(Branches[] source,String branchName)
    {
        int k;
        int flag = 0;
        this.branches = new Branches[branchesSize-1];
        for ( k= 0; k < branchesSize; k++)
        {
            if(source[k].getName() ==  branchName)
            {
                this.branches[k] = source[k+1];
                k++;
                flag=1;
            }
            else if(flag==1)
            {
                this.branches[k-1] = source[k];
            }
            else
            {
                this.branches[k] = source[k];
            }
        }
        branchesSize--;
    }

    /**
     *
     * @param source is branch employee array before adding
     * @param b is branch empoyee to be adding
     */
    public void addBrancheEmployees(BranchEmployees[] source,BranchEmployees b)
    {
        int k;
        this.branchEmployees  = new BranchEmployees[brancheEmployeesSize+1];
        for (k = 0; k < brancheEmployeesSize; k++)
        {
            this.branchEmployees[k] = source[k];

        }
        brancheEmployeesSize++;
        this.branchEmployees[k] = b;
    }


    /**
     *
     * @param source is branch employee array before deleting
     * @param BranchEmployeeName is name of branch employee to be deleting
     * @param BranchEmployeeSurname is surname of branch employee to be deleting
     */
    public void deleteBranchEmployees(BranchEmployees [] source,String BranchEmployeeName,String BranchEmployeeSurname)
    {
        int k;
        int flag = 0;
        this.branchEmployees = new BranchEmployees[brancheEmployeesSize-1];
        for ( k= 0; k < brancheEmployeesSize; k++)
        {
            if(source[k].getName() == BranchEmployeeName  && source[k].getSurname() == BranchEmployeeSurname)
            {
                this.branchEmployees[k] = source[k+1];
                k++;
                flag=1;


            }
            else if(flag == 1)
            {
                this.branchEmployees[k-1] = source[k];
            }
            else
            {
                this.branchEmployees[k] = source[k];
            }
        }
        brancheEmployeesSize--;
    }

    /**
     *
     * @return String branch toString , branch employee toString, transportation personnel toString
     */

    @Override
    public String toString() {
        return "Administors{" +
                "branches=" + Arrays.toString(branches) +
                ", branchEmployees=" + Arrays.toString(branchEmployees) +
                ", transportationPersonnels=" + Arrays.toString(transportationPersonnels) +
                '}';
    }
}