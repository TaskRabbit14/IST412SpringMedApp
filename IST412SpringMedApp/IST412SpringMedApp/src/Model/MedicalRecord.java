package Model;

import java.util.Date;

public class MedicalRecord {
    protected String recordID;
    protected String recordName;
    protected String patientID;
    protected int privacyRating;
    protected Date fileCreated;
    protected String filePath;
    
    /**
     * This is the default constructor for the Medical Record class
     * @param recordID sets the ID of the record
     * @param recordName sets the name of the record
     * @param patientID sets the ID of the patient that the record is about
     * @param privacyRating sets the privacy rating (protection level) of the record
     * @param fileCreated sets the date that the record was created
     * @param filePath sets the path where the record file can be found
     */
    
    public MedicalRecord(String recordID, String recordName, String patientID, int privacyRating, Date fileCreated, String filePath) {
        this.recordID = recordID;
        this.recordName = recordName;
        this.patientID = patientID;
        this.privacyRating = privacyRating;
        this.fileCreated = fileCreated;
        this.filePath = filePath;
    }

    
    
    /**
     * @return the recordID
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * @param recordID the recordID to set
     */
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    /**
     * @return the recordName
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * @param recordName the recordName to set
     */
    public void setRecordName(String recordName) {
        this.recordName = recordName;
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
     * @return the privacyRating
     */
    public int getPrivacyRating() {
        return privacyRating;
    }

    /**
     * @param privacyRating the privacyRating to set
     */
    public void setPrivacyRating(int privacyRating) {
        this.privacyRating = privacyRating;
    }

    /**
     * @return the fileCreated
     */
    public Date getFileCreated() {
        return fileCreated;
    }

    /**
     * @param fileCreated the fileCreated to set
     */
    public void setFileCreated(Date fileCreated) {
        this.fileCreated = fileCreated;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    
}
