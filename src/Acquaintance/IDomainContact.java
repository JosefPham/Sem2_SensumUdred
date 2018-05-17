package Acquaintance;

import java.util.Date;
import java.util.List;

public interface IDomainContact {

    public void createCaseRequest(String citizenCPR, String citizenName, char citizenGender,
            String citizenBirthdate, String citizenAddress, Integer citizenPhoneNr, String citizenMail
            , String desc, boolean isMessageClear, String[] carePackage, String rehousingPackage,
            String requestPerson, boolean isCitizenInformed);

    public void createCase(int caseRequestID, String nextAppointment, String guardianship,
            String personalHelper, String personalHelperPowerOfAttorney, String citizenRights,
            boolean citizenInformedElectronic, boolean consent, String consentType,
            String[] collectCitizenInfo, String specialCircumstances, String differentCommune, String state);

    public void saveEditedCase(int caseID, int employeeID, int caseRequestID, String nextAppointment, String guardianship,
            String personalHelper, String personalHelperPowerOfAttorney, String citizenRights,
            boolean citizenInformedElectronic, boolean consent, String consentType,
            String[] collectCitizenInfo, String specialCircumstances, String differentCommune, String state, Date dateCreated);

    public void addEmployee(String CPR, String name, char gender, String birthdate, String Address,
            Integer phoneNr, String mail, String username, String password, int positionNumber);

    public void deleteEmployee(int employeeID);

    public boolean login(String username, String password);

    public void logout();

    public void resetTimer();

    public boolean authorizeCommand(String command);

    public ICase editCase(int caseID);

    public IPerson getPerson(String CPR);
    
    public List<ICaseObject> getCaseObject(String citizenCPR);
}
