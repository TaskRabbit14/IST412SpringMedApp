package Tests;
import Controller.*;
import Model.*;
import java.util.ArrayList;

/**
 *
 * @author Angel Wu
 */
public class Test {
    public void testAll(){
        AccessPrescriptionUIControllerTest();
        DoctorTest();
    }
    
    public void AccessPrescriptionUIControllerTest(){
        try {
//            int expectedValue = 0;
            AccessPrescriptionUIController test = new AccessPrescriptionUIController();
            test.displayPrescriptions("000000");
            System.out.println("Passed: " + "displayPrescriptions" + " returned void");
            
        } catch (Exception e) {
            System.out.println("Failed: " + "displayPrescriptions" + " returned void");
        }
    }
    
    public void DoctorTest(){
        try {
            Doctor test = new Doctor("", "", "", new ArrayList<String>(), 0, "", "");
            test.setFirstName("firstName");
            test.setLastName("lastName");
            test.setDoctorID("doctorID");
            test.setSpecialties(new ArrayList());
            test.setPhoneNumber(999999);
            test.setEmail("email");
            test.setEmploymentLocation("employmentLocation");
            
            System.out.println("\nTesting Doctor class");
            if(test.getFirstName().equals("firstName")){
                System.out.println("Passed: " + "test.setFirstName" + "test.getFirstName" + " returned " + test.getFirstName());
            }else{
                System.out.println("Failed: " + "test.setFirstName" + "test.getFirstName" + " returned " + test.getFirstName());
            }
            
            if(test.getLastName().equals("lastName")) {
                System.out.println("Passed: " + "test.setLastName" + "test.getFirstName" + " returned" + test.getLastName());
            }else{
                System.out.println("Failed: " + "test.setLastName" + "test.getFirstName" + " returned" + test.getLastName());
            }
            
            if(test.getDoctorID().equals("doctorID")) {
                System.out.println("Passed: " + "test.setDoctorID" + "test.getDoctorID" + " returned" + test.getDoctorID());
            }else{
                System.out.println("Failed: " + "test.setDoctorID" + "test.getDoctorID" + " returned" + test.getDoctorID());
            }
            
            if(test.getSpecialties().equals(new ArrayList())) {
                System.out.println("Passed: " + "test.setSpecialties" + "test.getSpecialties" + " returned" + test.getSpecialties());
            }else{
                System.out.println("Failed: " + "test.setSpecialties" + "test.getSpecialties" + " returned" + test.getSpecialties());
            }
            
            if(test.getPhoneNumber() == 999999) {
                System.out.println("Passed: " + "test.setPhoneNumber" + "test.getPhoneNumber" + " returned" + test.getPhoneNumber());
            }else{
                System.out.println("Failed: " + "test.setPhoneNumber" + "test.getPhoneNumber" + " returned" + test.getPhoneNumber());
            }
            
            if(test.getEmail().equals("email")) {
                System.out.println("Passed: " + "test.setEmail" + "test.getEmail" + " returned" + test.getEmail());
            }else{
                System.out.println("Failed: " + "test.setEmail" + "test.getEmail" + " returned" + test.getEmail());
            }
            
            if(test.getEmploymentLocation().equals("employmentLocation")){
                System.out.println("Passed: " + "test.setEmploymentLocation" + "test.getEmploymentLocation" + " returned" + test.getEmploymentLocation());
            }else{
                System.out.println("Passed: " + "test.setEmploymentLocation" + "test.getEmploymentLocation" + " returned" + test.getEmploymentLocation());
            }
            
            if(test.getFullName().equals(test.getFirstName() + " " + test.getLastName())){
                System.out.println("Passed: " + "test.setFirstName" + "test.getFirstName" + " returned" + test.getFullName());
            }else{
                System.out.println("Failed: " + "test.setFirstName" + "test.getFirstName" + " returned" + test.getFullName());
            }
            System.out.println("\n\n");
            
        } catch (Exception e) {
            System.out.println("\nFailed: Testing Doctor class");
        }
    }
}


