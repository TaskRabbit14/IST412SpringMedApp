package Tests;
import Model.*;
import java.util.Date;

/**
 *
 * @author kelliacockerill
 */
public class kelliaTest 
{
    
    public void testAll(){
        
        MedicalRecordTest();
    }

    private void MedicalRecordTest() 
    {
        try
        {
        Date x = new Date();
        MedicalRecord test = new MedicalRecord("x", "x", "x", 10, x, "x");
        test.setRecordID("recordID");
        test.setRecordName("recordName");
        test.setPatientID("patientID");
        test.setPrivacyRating(10);
        test.setFileCreated(x);
        test.setFilePath("fileMath");
        
        
        if(test.getRecordID().equals("recordID"))
        {
            System.out.println("PASSED: test.getRecordID & test.setRecordID returns: " + test.getRecordID());
        }
        else
        {
            System.out.println("FAILED: test.getRecordID & test.setRecordID returns: " + test.getRecordID());
        }
        
        if(test.getRecordName().equals("recordName"))
        {
           System.out.println("PASSED: test.getRecordName & test.setRecordName returns: " + test.getRecordName());
        }
        else
        {
           System.out.println("FAILED: test.getRecordName & test.setRecordName returns: " + test.getRecordName());
        }
        
        if(test.getPatientID().equals("patientID"))
        {
           System.out.println("PASSED: test.getPatientID & test.setPatientID returns: " + test.getPatientID());
        }
        else
        {
           System.out.println("FAILED: test.getPatientID & test.setPatientID returns: " + test.getPatientID());
        }
        
        if(test.getPrivacyRating() == 10)
        {
           System.out.println("PASSED: test.getPrivacyRating & test.setPrivacyRating returns: " + test.getPrivacyRating());
        }
        else
        {
           System.out.println("FAILED: test.getPrivacyRating & test.setPrivacyRating returns: " + test.getPrivacyRating());
        }
        
        if(test.getFilePath().equals("file"))
        {
           System.out.println("PASSED: test.getFilePath & test.setFilePath returns: " + test.getFilePath());
        }
        else
        {
           System.out.println("FAILED: test.getFilePath & test.setFilePath returns: " + test.getFilePath());
        }
        
        }
        catch(Exception e)
        {
            System.out.println("Failed: Testing Medical Record Class");
        }
        
        
    }
    
    
    
}
