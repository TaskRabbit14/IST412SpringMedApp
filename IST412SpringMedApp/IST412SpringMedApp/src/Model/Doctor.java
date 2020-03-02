package Model;

import java.util.ArrayList;

public class Doctor {
    protected String firstName;
    protected String lastName;
    protected String doctorID;
    protected ArrayList<String> specialties;
    protected int phoneNumber;
    protected String email;
    protected String employmentLocation;

    /**
     * This is the default constructor for the Doctor class
     * @param firstName sets the first name of the Doctor
     * @param lastName sets the last name of the Doctor
     * @param doctorID sets the ID of the Doctor
     * @param specialties sets the specialties (qualifications, titles, etc) of the Doctor
     * @param phoneNumber sets the phone number of the Doctor
     * @param email sets the email of the Doctor
     * @param employmentLocation sets the location of employment (ex: which hospital) of the Doctor
     */
    
    public Doctor(String firstName, String lastName, String doctorID, ArrayList<String> specialties, int phoneNumber, String email, String employmentLocation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.doctorID = doctorID;
        this.specialties = specialties;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.employmentLocation = employmentLocation;
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
     * @return the doctorID
     */
    public String getDoctorID() {
        return doctorID;
    }

    /**
     * @param doctorID the doctorID to set
     */
    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    /**
     * @return the specialties
     */
    public ArrayList<String> getSpecialties() {
        return specialties;
    }

    /**
     * @param specialties the specialties to set
     */
    public void setSpecialties(ArrayList<String> specialties) {
        this.specialties = specialties;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
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
     * @return the employmentLocation
     */
    public String getEmploymentLocation() {
        return employmentLocation;
    }

    /**
     * @param employmentLocation the employmentLocation to set
     */
    public void setEmploymentLocation(String employmentLocation) {
        this.employmentLocation = employmentLocation;
    }
    
    
}
