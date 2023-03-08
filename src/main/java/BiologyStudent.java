import java.util.Objects;

public class BiologyStudent implements Citizen {

    public int identityCardNumber;
    public String address;

    public BiologyStudent(){      //DEFAULT CONSTRUCTOR

    }
    public BiologyStudent(int identityCardNumber, String address){
        this.address = address;
        this.identityCardNumber = identityCardNumber;
    }

    public int getIdentityCardNumber(int idNumber) {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getAddress(String addressStudent) {
        return address ;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BiologyStudent that = (BiologyStudent) o;

        if (identityCardNumber != that.identityCardNumber) return false;
        return Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        int result = identityCardNumber;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "identityCardNumber=" + identityCardNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
