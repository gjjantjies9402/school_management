package za.ac.cput.Domain;

public class employeeAddress {
    public String staffId;
    //Address address = new Address;

    private employeeAddress(Builder builder){
        this.staffId = builder.staffId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "employeeAddress{" +
                "staffId='" + staffId + '\'' +
                '}';
    }

    public static class Builder{
        private  String staffId;

        public  Builder setStaffId(String staffId){
            this.staffId = staffId;
            return this;
        }

        public Builder copy(employeeAddress empAdd){
            this.staffId = empAdd.staffId;

            return  this;
        }

        public employeeAddress build(){
            return new employeeAddress(this);
        }
    }
}
