package za.ac.cput.Domain;

public class city {
     public String cityId;
     public String cityName;
   //Country country = new Country;

   //Constructor
   private city(Builder builder){
      this.cityId = builder.cityId;
      this.cityName = builder.cityName;
  }

  //Getters and Setters
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    //Tostring
    @Override
    public String toString() {
        return "city{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    //Builder Pattern Class
    public static class Builder{
        private String cityId;
        private String cityName;

        public Builder setCityId(String cityId){
            this.cityId = cityId;
            return this;
        }

        public  Builder setCityName(String cityName){
            this.cityName = cityName;
            return this;
        }

        public Builder copy(city citi){
            this.cityId = citi.cityId;
            this.cityName = citi.cityName;

            return this;
        }

        public city build(){
            return new city(this);

        }
    }
}
