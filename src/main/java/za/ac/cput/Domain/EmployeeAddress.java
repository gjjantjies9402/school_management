package za.ac.cput.Domain;

public class EmployeeAddress {
    public String staffId;
    //Address address = new Address;

    private EmployeeAddress(Builder builder){
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

        public Builder copy(EmployeeAddress empAdd){
            this.staffId = empAdd.staffId;

            return  this;
        }

        public EmployeeAddress build(){
            return new EmployeeAddress(this);
        }
    }
}
