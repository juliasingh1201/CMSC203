/*
 * Class: Procedure
 * Description: Represents a medical procedure including its name,
 * date, practitioner, and charges.
 * Course: CMSC203
 */

public class Procedure {

    // Procedure information
    private String procedureName;
    private String date;
    private String practitionerName;
    private double charges;


    // No-argument constructor
    public Procedure() {
        procedureName = "";
        date = "";
        practitionerName = "";
        charges = 0.0;
    }


    // Constructor using procedure name and date
    public Procedure(String procedureName, String date) {
        this.procedureName = procedureName;
        this.date = date;
        practitionerName = "";
        charges = 0.0;
    }


    // Constructor using all attributes
    public Procedure(String procedureName, String date,
                     String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.date = date;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }


    // Getter for procedure name
    public String getProcedureName() {
        return procedureName;
    }


    // Setter for procedure name
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }


    // Getter for date
    public String getDate() {
        return date;
    }


    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }


    // Getter for practitioner name
    public String getPractitionerName() {
        return practitionerName;
    }


    // Setter for practitioner name
    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }


    // Getter for charges
    public double getCharges() {
        return charges;
    }


    // Setter for charges
    public void setCharges(double charges) {
        this.charges = charges;
    }


    // Determines whether the procedure is expensive
    public boolean isExpensiveProcedure() {
        return charges >= 1000.00;
    }


    // Applies a discount to the procedure charges
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            charges = charges - (charges * percent / 100);
        }
    }


    // Returns the charge category
    public String getChargeCategory() {
        if (charges < 500) {
            return "Low";
        } else if (charges < 1000) {
            return "Medium";
        } else {
            return "High";
        }
    }


    // Checks whether the procedure was performed by the given practitioner
    public boolean isPerformedBy(String practitionerName) {
        return this.practitionerName.equalsIgnoreCase(practitionerName);
    }


    // Returns the charge formatted as a dollar amount
    public String getFormattedCharge() {
        return String.format("$%,.2f", charges);
    }


    // Returns all procedure information
    @Override
    public String toString() {
        return procedureName + " " + date + " "
                + practitionerName + " " + getFormattedCharge();
    }
}