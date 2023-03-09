import java.util.Objects;

public class ComputerScienceStudent extends Student implements Citizen {

    public int identityCardNumber;
    public String address;
    public ComputerScienceStudent(){                //DEFAULT CONSTRUCTOR
    }
    public ComputerScienceStudent(int identityCardNumber, String address, String name){   //CONSTRUCTOR (all args[arguments] constructor)
        super(name);
        this.address = address;
        this.identityCardNumber = identityCardNumber;
    }
    public String areaOfExpertise() {
        return "ComputerScience";
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber() {
        this.identityCardNumber = identityCardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public String getNameAndAddress(){
        return name + address;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerScienceStudent that)) return false;
        if (!super.equals(o)) return false;

        if (identityCardNumber != that.identityCardNumber) return false;
        return address.equals(that.address);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + identityCardNumber;
        result = 31 * result + address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "identityCardNumber=" + identityCardNumber +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
