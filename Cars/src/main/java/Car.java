public class Car {

    private String brand;
    private String licenseplate;
    private String color;

    public Car(String brand, String licenseplate, String color){
        this.licenseplate = licenseplate;
        this.brand = brand;
        this.color = color;

    }

    public String toString() {
        return ("[" + this.licenseplate + "]" + " " + this.color + " " + this.brand);
    }

    public boolean equals(Car othercar){
        return this.licenseplate.equals(othercar.licenseplate);
    }

    public boolean alike(Car othercar){
        return this.brand.equals(othercar.brand) && this.color.equals(othercar.color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
