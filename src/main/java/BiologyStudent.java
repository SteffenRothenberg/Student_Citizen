import java.util.Objects;

public class BiologyStudent extends Student  implements Citizen {

    public int identityCardNumber;
    public String address;

    public BiologyStudent(){      //DEFAULT CONSTRUCTOR

    }
    public BiologyStudent(int identityCardNumber, String address, String name){               //CONSTRUCTOR (all args[arguments] constructor)
        super(name);
        this.address = address;
        this.identityCardNumber = identityCardNumber;
    }
    public String areaOfExpertise() {
        return "Biology";
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber() {
        this.identityCardNumber = identityCardNumber;
    }

    public String getAddress() {
        return address ;
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
        if (!(o instanceof BiologyStudent that)) return false;
        if (!super.equals(o)) return false;

        if (identityCardNumber != that.identityCardNumber) return false;
        return Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + identityCardNumber;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "identityCardNumber=" + identityCardNumber +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
