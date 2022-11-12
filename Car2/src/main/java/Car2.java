public class Car2 {

    private final int test;
    private String brand;
    private String licenseplate;
    private String color;
    private static int regno = 0;

    public Car2(String brand, String licenseplate, String color){
        this.licenseplate = licenseplate;
        this.brand = brand;
        this.color = color;
        this.test = giveRegno();

    }

    public String toString() {
        return ("[" + this.licenseplate + "]" + " " + this.color + " " + this.brand);
    }

    public boolean equals(Car2 othercar){
        return this.licenseplate.equals(othercar.licenseplate);
    }

    public boolean alike(Car2 othercar){
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

    public static int giveRegno(){
        regno += 1;
        return regno;
    }
    public int getRegno(){
        return this.test;
    }

    public static int getNextRegno(){
        return regno += 1;
    }

}