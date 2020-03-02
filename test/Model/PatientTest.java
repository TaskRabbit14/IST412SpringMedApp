/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew Norris
 */
public class PatientTest {
    
    public PatientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getFullName method, of class Patient.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Patient instance = new Patient("John", "Doe", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        String expResult = "John Doe";
        String result = instance.getFullName();
        assertEquals(expResult, result);     
    }

    /**
     * Test of getFirstName method, of class Patient.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFullName");
        Patient instance = new Patient("John", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        String expResult = "John";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Patient.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "John";
        Patient instance = new Patient("John", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        instance.setFirstName(firstName);
        String result = instance.getFirstName();
        String expResult = firstName;
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastName method, of class Patient.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Patient instance = new Patient(null, "Doe", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        String expResult = "Doe";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Patient.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Doe";
        Patient instance = new Patient(null, "Doe", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        instance.setLastName(lastName);
        String result = instance.getLastName();
        String expResult = lastName;
        assertEquals(expResult, result);
    }

    /**
     * Test of getBirthDate method, of class Patient.
     */
    @Test
    public void testGetBirthDate() {
        System.out.println("getBirthDate");
        Patient instance = new Patient(null, null, new Date(), null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Date expResult = new Date();
        Date result = instance.getBirthDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBirthDate method, of class Patient.
     */
    @Test
    public void testSetBirthDate() {
        System.out.println("setBirthDate");
        Date birthDate = null;
        Patient instance = new Patient(null, null, new Date(), null, null, null, null, null, null, null, null, null, null, null, null, null, null);        
        instance.setBirthDate(birthDate);
        Date result = instance.getBirthDate();
        Date expResult = birthDate;
        assertEquals(expResult, result);
    }

    /**
     * Test of getSex method, of class Patient.
     */
    @Test
    public void testGetSex() {
        System.out.println("getSex");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "Male";
        String result = instance.getSex();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSex method, of class Patient.
     */
    @Test
    public void testSetSex() {
        System.out.println("setSex");
        String sex = "Female";
        String expResult = sex;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setSex(sex);
        String result = instance.getSex();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBloodType method, of class Patient.
     */
    @Test
    public void testGetBloodType() {
        System.out.println("getBloodType");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "B";
        String result = instance.getBloodType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBloodType method, of class Patient.
     */
    @Test
    public void testSetBloodType() {
        System.out.println("setBloodType");
        String bloodType = "A";
        String expResult = bloodType;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setBloodType(bloodType);
        String result = instance.getBloodType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatientID method, of class Patient.
     */
    @Test
    public void testGetPatientID() {
        System.out.println("getPatientID");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "pID";
        String result = instance.getPatientID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPatientID method, of class Patient.
     */
    @Test
    public void testSetPatientID() {
        System.out.println("setPatientID");
        String patientID = "newID";
        String expResult = patientID;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setPatientID(patientID);
        String result = instance.getPatientID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSSN method, of class Patient.
     */
    @Test
    public void testGetSSN() {
        System.out.println("getSSN");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "Soc";
        String result = instance.getSSN();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSSN method, of class Patient.
     */
    @Test
    public void testSetSSN() {
        System.out.println("setSSN");
        String SSN = "newSSN";
        String expResult = SSN;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setSSN(SSN);
        String result = instance.getSSN();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatientInsuranceNumber method, of class Patient.
     */
    @Test
    public void testGetPatientInsuranceNumber() {
        System.out.println("getPatientInsuranceNumber");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "Insurance";
        String result = instance.getPatientInsuranceNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPatientInsuranceNumber method, of class Patient.
     */
    @Test
    public void testSetPatientInsuranceNumber() {
        System.out.println("setPatientInsuranceNumber");
        String patientInsuranceNumber = "ins";
        String expResult = patientInsuranceNumber;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setPatientInsuranceNumber(patientInsuranceNumber);
        String result = instance.getPatientInsuranceNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCreditCard method, of class Patient.
     */
    @Test
    public void testGetCreditCard() {
        System.out.println("getCreditCard");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "cred";
        String result = instance.getCreditCard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCreditCard method, of class Patient.
     */
    @Test
    public void testSetCreditCard() {
        System.out.println("setCreditCard");
        String creditCard = "card";
        String expResult = creditCard;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setCreditCard(creditCard);
        String result = instance.getCreditCard();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmergencyContactNumber method, of class Patient.
     */
    @Test
    public void testGetEmergencyContactNumber() {
        System.out.println("getEmergencyContactNumber");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "emerg";
        String result = instance.getEmergencyContactNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmergencyContactNumber method, of class Patient.
     */
    @Test
    public void testSetEmergencyContactNumber() {
        System.out.println("setEmergencyContactNumber");
        String emergencyContactNumber = "num";
        String expResult = emergencyContactNumber;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setEmergencyContactNumber(emergencyContactNumber);
        String result = instance.getEmergencyContactNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhoneNumber method, of class Patient.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "phone";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber method, of class Patient.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "610";
        String expResult = phoneNumber;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setPhoneNumber(phoneNumber);
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class Patient.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "email";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Patient.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "e-mail";
        String expResult = email;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setEmail(email);
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRecords method, of class Patient.
     */
    @Test
    public void testGetRecords() {
        System.out.println("getRecords");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        ArrayList<MedicalRecord> expResult = new ArrayList<>();
        ArrayList<MedicalRecord> result = instance.getRecords();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecords method, of class Patient.
     */
    @Test
    public void testSetRecords() {
        System.out.println("setRecords");
        ArrayList<MedicalRecord> Records = new ArrayList<>();
        ArrayList<MedicalRecord> expResult = Records;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setRecords(Records);
        ArrayList<MedicalRecord> result = instance.getRecords();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRelative method, of class Patient.
     */
    @Test
    public void testGetRelative() {
        System.out.println("getRelative");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "relative";
        String result = instance.getRelative();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRelative method, of class Patient.
     */
    @Test
    public void testSetRelative() {
        System.out.println("setRelative");
        String relative = "Jane";
        String expResult = relative;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setRelative(relative);
        String result = instance.getRelative();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAddress method, of class Patient.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "address";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Patient.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "Ardmore";
        String expResult = address;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setAddress(address);
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBillingAddress method, of class Patient.
     */
    @Test
    public void testGetBillingAddress() {
        System.out.println("getBillingAddress");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        String expResult = "billing";
        String result = instance.getBillingAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBillingAddress method, of class Patient.
     */
    @Test
    public void testSetBillingAddress() {
        System.out.println("setBillingAddress");
        String billingAddress = "Bryn Mawr";
        String expResult = billingAddress;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setBillingAddress(billingAddress);
        String result = instance.getBillingAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrescriptions method, of class Patient.
     */
    @Test
    public void testGetPrescriptions() {
        System.out.println("getPrescriptions");
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        ArrayList<Prescription> expResult = new ArrayList<>();
        ArrayList<Prescription> result = instance.getPrescriptions();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrescriptions method, of class Patient.
     */
    @Test
    public void testSetPrescriptions() {
        System.out.println("setPrescriptions");
        ArrayList<Prescription> prescriptions = new ArrayList<>();
        ArrayList<Prescription> expResult = prescriptions;
        Patient instance = new Patient("John", "Doe", new Date(), "Male", "B", "pID", "Soc", "Insurance", "cred", "emerg", "phone", "email", new ArrayList<>(), "relative", "address", "billing", new ArrayList<>());
        instance.setPrescriptions(prescriptions);
        ArrayList<Prescription> result = instance.getPrescriptions();
        assertEquals(expResult, result);
    }
    
}
