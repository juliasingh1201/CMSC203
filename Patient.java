/*
 * Class: Patient
 * Description: Represents a patient's personal information, address,
 * phone number, and emergency contact information.
 * Course: CMSC203
 */

public class Patient {

    // Patient personal information
    private String firstName;
    private String middleName;
    private String lastName;

    // Patient address
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    // Patient contact information
    private String phoneNumber;

    // Emergency contact information
    private String emergencyContactName;
    private String emergencyContactPhoneNumber;


    // No-argument constructor
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhoneNumber = "";
    }


    // Constructor using first, middle, and last name
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhoneNumber = "";
    }


    // Constructor using all patient attributes
    public Patient(String firstName, String middleName, String lastName,
                    String streetAddress, String city, String state,
                    String zipCode, String phoneNumber,
                    String emergencyContactName,
                    String emergencyContactPhoneNumber) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
    }


    // Getter for first name
    public String getFirstName() {
        return firstName;
    }


    // Setter for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    // Getter for middle name
    public String getMiddleName() {
        return middleName;
    }


    // Setter for middle name
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    // Getter for last name
    public String getLastName() {
        return lastName;
    }


    // Setter for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    // Getter for street address
    public String getStreetAddress() {
        return streetAddress;
    }


    // Setter for street address
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }


    // Getter for city
    public String getCity() {
        return city;
    }


    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }


    // Getter for state
    public String getState() {
        return state;
    }


    // Setter for state
    public void setState(String state) {
        this.state = state;
    }


    // Getter for ZIP code
    public String getZipCode() {
        return zipCode;
    }


    // Setter for ZIP code
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    // Getter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }


    // Setter for phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    // Getter for emergency contact name
    public String getEmergencyContactName() {
        return emergencyContactName;
    }


    // Setter for emergency contact name
    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }


    // Getter for emergency contact phone number
    public String getEmergencyContactPhoneNumber() {
        return emergencyContactPhoneNumber;
    }


    // Setter for emergency contact phone number
    public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
    }


    // Builds the patient's full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }


    // Builds the patient's complete address
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }


    // Builds the emergency contact information
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhoneNumber;
    }


    // Checks whether the patient's phone number is valid
    public boolean isValidPhoneNumber() {
        return phoneNumber != null && phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
    }


    // Checks whether the emergency contact phone number is valid
    public boolean isValidEmergencyPhoneNumber() {
        return emergencyContactPhoneNumber != null
                && emergencyContactPhoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
    }


    // Returns the last name followed by first and middle names
    public String getLastFirstMiddle() {
        return lastName + ", " + firstName + " " + middleName;
    }


    // Checks whether the patient's city and state match the given values
    public boolean hasSameCityState(String city, String state) {
        return this.city.equalsIgnoreCase(city)
                && this.state.equalsIgnoreCase(state);
    }


    // Updates the patient's address
    public void updateAddress(String street, String city, String state, String zip) {
        this.streetAddress = street;
        this.city = city;
        this.state = state;
        this.zipCode = zip;
    }


    // Returns a summary of the patient's contact information
    public String getContactSummary() {
        return "Patient Phone: " + phoneNumber
                + ", Emergency Contact: " + emergencyContactName
                + " " + emergencyContactPhoneNumber;
    }


    // Returns all patient information as a formatted string
    @Override
    public String toString() {
        return "Name: " + buildFullName()
                + "\nAddress: " + buildAddress()
                + "\nPhone: " + phoneNumber
                + "\nEmergency Contact: " + buildEmergencyContact();
    }
}