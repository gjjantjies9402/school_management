package za.ac.cput.Domain;

public class EmployeeAddress {
    private String staffId;
    private Address address;

    private EmployeeAddress(Builder builder){
        this.staffId = builder.staffId;
        this.address = builder.address;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Builder{
        private  String staffId;
        private Address address;

        public  Builder setStaffId(String staffId){
            this.staffId = staffId;
            return this;
        }

        public Builder setAddress(Address address){
            this.address = address;
            return this;
        }

        public Builder copy(EmployeeAddress empAdd){
            this.staffId = empAdd.staffId;
            this.address = empAdd.address;

            return  this;
        }

        public EmployeeAddress build(){
            return new EmployeeAddress(this);
        }
    }
}
