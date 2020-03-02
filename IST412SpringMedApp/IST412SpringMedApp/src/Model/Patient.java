package Model;

import java.util.ArrayList;
import java.util.Date;

public class Patient {
    protected String firstName;
    protected String lastName;
    protected Date birthDate;
    protected String sex;
    protected String bloodType;
    protected String patientID;
    protected String SSN;
    protected String patientInsuranceNumber;
    protected String creditCard;
    protected String emergencyContactNumber;
    protected String phoneNumber;
    protected String email;
    protected ArrayList<MedicalRecord> Records;
    protected String relative;
    protected String address;
    protected String billingAddress;
    protected ArrayList<Prescription> prescriptions;

    /**
     * This is the default constructor for the Patient class
     * @param firstName sets the first name of the Patient
     * @param lastName sets the last name of the Patient
     * @param birthDate sets the birth date of the Patient
     * @param sex sets the sex of the Patient
     * @param bloodType sets the blood type of the Patient
     * @param patientID sets the ID of the Patient
     * @param SSN sets the social security number of the Patient
     * @param patientInsuranceNumber sets the insurance number of the Patient
     * @param creditCard sets the credit card number of the Patient
     * @param emergencyContactNumber sets the emergency contact number of the Patient
     * @param phoneNumber sets the phone number of the Patient
     * @param email sets the email of the Patient
     * @param Records sets the array of records of the Patient
     * @param relative sets a relative of the Patient
     * @param address sets the home address of the Patient
     * @param billingAddress sets the billing address of the Patient
     * @param prescriptions sets the array of prescriptions of the Patient
     */
    
    public Patient(String firstName, String lastName, Date birthDate, String sex, String bloodType, String patientID, String SSN, String patientInsuranceNumber, String creditCard, String emergencyContactNumber, String phoneNumber, String email, ArrayList<MedicalRecord> Records, String relative, String address, String billingAddress, ArrayList<Prescription> prescriptions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.sex = sex;
        this.bloodType = bloodType;
        this.patientID = patientID;
        this.SSN = SSN;
        this.patientInsuranceNumber = patientInsuranceNumber;
        this.creditCard = creditCard;
        this.emergencyContactNumber = emergencyContactNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.Records = Records;
        this.relative = relative;
        this.address = address;
        this.billingAddress = billingAddress;
        this.prescriptions = prescriptions;
    }

    
    /**
     * @return the first and last name of the object
     */
    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the bloodType
     */
    public String getBloodType() {
        return bloodType;
    }

    /**
     * @param bloodType the bloodType to set
     */
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    /**
     * @return the patientID
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * @param patientID the patientID to set
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    /**
     * @return the SSN
     */
    public String getSSN() {
        return SSN;
    }

    /**
     * @param SSN the SSN to set
     */
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    /**
     * @return the patientInsuranceNumber
     */
    public String getPatientInsuranceNumber() {
        return patientInsuranceNumber;
    }

    /**
     * @param patientInsuranceNumber the patientInsuranceNumber to set
     */
    public void setPatientInsuranceNumber(String patientInsuranceNumber) {
        this.patientInsuranceNumber = patientInsuranceNumber;
    }

    /**
     * @return the creditCard
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * @param creditCard the creditCard to set
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * @return the emergencyContactNumber
     */
    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    /**
     * @param emergencyContactNumber the emergencyContactNumber to set
     */
    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the Records
     */
    public ArrayList<MedicalRecord> getRecords() {
        return Records;
    }

    /**
     * @param Records the Records to set
     */
    public void setRecords(ArrayList<MedicalRecord> Records) {
        this.Records = Records;
    }

    /**
     * @return the relative
     */
    public String getRelative() {
        return relative;
    }

    /**
     * @param relative the relative to set
     */
    public void setRelative(String relative) {
        this.relative = relative;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the billingAddress
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * @param billingAddress the billingAddress to set
     */
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * @return the prescriptions
     */
    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    /**
     * @param prescriptions the prescriptions to set
     */
    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
}