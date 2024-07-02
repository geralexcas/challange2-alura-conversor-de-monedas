package models;

public class DetallesMoneda {
    private  String base_code;
    private  String target_code;
    private double conversion_rate;

    public DetallesMoneda(String base_code, String target_code, double conversion_result) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getconversion_rate() {
        return conversion_rate;
    }

    public void setconversion_rate(double Conversion_rate) {
        this.conversion_rate = Conversion_rate;
    }
}
