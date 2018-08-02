package app.awn.awn;

public class Haji {private String HajiId;
    private String PhoneNumber;
    private String Age;
    private String Nationality;
    private String PrimaryLanguageID;
    private String EmailAddress;
    private String HajiName;
    private String HajiStatus;

    public Haji(){

    }

    public Haji(String hajiId, String phoneNumber, String age, String nationality, String primaryLanguageID, String emailAddress, String hajiName, String hajiStatus) {
        HajiId = hajiId ;
        PhoneNumber = phoneNumber;
        Age = age;
        Nationality = nationality;
        PrimaryLanguageID = primaryLanguageID;
        EmailAddress = emailAddress;
        HajiName = hajiName;
        HajiStatus = hajiStatus;
    }

    public String getHajiId() {
        return HajiId;
    }


    public String getPhoneNumber() {
        return PhoneNumber;
    }


    public String getAge() {
        return Age;
    }
    public String getNationality() {
        return Nationality;
    }
    public String getPrimaryLanguageID() {
        return PrimaryLanguageID;
    }
    public String getEmailAddress() {
        return EmailAddress;
    }
    public String getHajiName() {
        return HajiName;
    }
    public String getHajiStatus() {
        return HajiStatus;
    }

    public void setHajiId(String hajiId) {
        HajiId = hajiId;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public void setPrimaryLanguageID(String primaryLanguageID) {
        PrimaryLanguageID = primaryLanguageID;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public void setHajiName(String hajiName) {
        HajiName = hajiName;
    }

    public void setHajiStatus(String hajiStatus) {
        HajiStatus = hajiStatus;
    }
}
