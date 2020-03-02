package Model;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew Norris
 */
public class PrescriptionIT {
    
    public PrescriptionIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPrescriptionDate method, of class Prescription.
     */
    @Test
    public void testGetPrescriptionDate() {
        System.out.println("getPrescriptionDate");
        Prescription instance = new Prescription("01/01/2020", null, null, null, null, null, null);
        String expResult = "01/01/2020";
        String result = instance.getPrescriptionDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrescriptionDate method, of class Prescription.
     */
    @Test
    public void testSetPrescriptionDate() {
        System.out.println("setPrescriptionDate");
        String prescriptionDate = "01/01/2020";
        Prescription instance = new Prescription("01/01/2020", null, null, null, null, null, null);
        instance.setPrescriptionDate(prescriptionDate);
        String result = instance.getPrescriptionDate();
        String expResult = prescriptionDate;
        assertEquals(expResult, result);
    }

    /**
     * Test of getMedicine method, of class Prescription.
     */
    @Test
    public void testGetMedicine() {
        System.out.println("getMedicine");
        Prescription instance = new Prescription(null, new ArrayList<>(), null, null, null, null, null);
        ArrayList<String> expResult = new ArrayList<>();
        ArrayList<String> result = instance.getMedicine();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMedicine method, of class Prescription.
     */
    @Test
    public void testSetMedicine() {
        System.out.println("setMedicine");
        ArrayList<String> medicine = null;
        Prescription instance = new Prescription(null, new ArrayList<>(), null, null, null, null, null);
        instance.setMedicine(medicine);
        ArrayList<String> result = instance.getMedicine();
        ArrayList<String> expResult = medicine;
        assertEquals(expResult, result);
    }

    /**
     * Test of getDosage method, of class Prescription.
     */
    @Test
    public void testGetDosage() {
        System.out.println("getDosage");
        Prescription instance = new Prescription(null, null, new ArrayList<>(), null, null, null, null);
        ArrayList<String> expResult = new ArrayList<>();
        ArrayList<String> result = instance.getDosage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDosage method, of class Prescription.
     */
    @Test
    public void testSetDosage() {
        System.out.println("setDosage");
        ArrayList<String> dosage = null;
        Prescription instance = new Prescription(null, null, new ArrayList<>(), null, null, null, null);
        instance.setDosage(dosage);
        ArrayList<String> result = instance.getDosage();
        ArrayList<String> expResult = dosage;
        assertEquals(expResult, result);
    }

    /**
     * Test of getDoctorID method, of class Prescription.
     */
    @Test
    public void testGetDoctorID() {
        System.out.println("getDoctorID");
        Prescription instance = new Prescription(null, null, null, "1234", null, null, null);
        String expResult = "1234";
        String result = instance.getDoctorID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDoctorID method, of class Prescription.
     */
    @Test
    public void testSetDoctorID() {
        System.out.println("setDoctorID");
        String doctorID = "1234";
        Prescription instance = new Prescription(null, null, null, "1234", null, null, null);
        instance.setDoctorID(doctorID);
        String result = instance.getDoctorID();
        String expResult = doctorID;
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatientId method, of class Prescription.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        Prescription instance = new Prescription(null, null, null, null, "1234", null, null);
        String expResult = "1234";
        String result = instance.getPatientID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPatientId method, of class Prescription.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        String patientID = "1234";
        Prescription instance = new Prescription(null, null, null, null, "1234", null, null);
        instance.setPatientID(patientID);
        String result = instance.getPatientID();
        String expResult = patientID;
        assertEquals(expResult, result);
    }
    /**
     * Test of getPrescriptionID method, of class Prescription.
     */
    @Test
    public void testGetPrescriptionID() {
        System.out.println("getPrescriptionID");
        Prescription instance = new Prescription(null, null, null, null, null, "1234", null);
        String expResult = "1234";
        String result = instance.getPrescriptionID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrescriptionID method, of class Prescription.
     */
    @Test
    public void testSetPrescriptionID() {
        System.out.println("setPrescriptionID");
        String PrescriptionID = "1234";
        Prescription instance = new Prescription(null, null, null, null, null, "1234", null);
        instance.setPrescriptionID(PrescriptionID);
        String result = instance.getPrescriptionID();
        String expResult = PrescriptionID;
        assertEquals(expResult, result);
    }

    /**
     * Test of getDoctorNotes method, of class Prescription.
     */
    @Test
    public void testGetDoctorNotes() {
        System.out.println("getDoctorNotes");
        Prescription instance = new Prescription(null, null, null, null, null, null, "test");
        String expResult = "test";
        String result = instance.getDoctorNotes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDoctorNotes method, of class Prescription.
     */
    @Test
    public void testSetDoctorNotes() {
        System.out.println("setDoctorNotes");
        String doctorNotes = "test";
        Prescription instance = new Prescription(null, null, null, null, null, null, "test");
        instance.setDoctorNotes(doctorNotes);
        String result = instance.getDoctorNotes();
        String expResult = doctorNotes;
        assertEquals(expResult, result);
    }
    
}
