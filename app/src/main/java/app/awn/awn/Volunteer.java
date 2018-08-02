package app.awn.awn;

public class Volunteer {
    private String VolunteerId;
    private String VolunteerPhoneNumber;
    private String VolunteerAge;
    private String VolunteerNationality;
    private String VolunteerPrimaryLanguageID;
    private String VolunteerEmailAddress;
    private String VolunteerName;
    private String VolunteerBlockStatus; // is he active in app
    private String VolunteerMessageCount;
    private String VolunteerRating;
    private String VolunteerStatus; // available , Busy , Sign-out


    public Volunteer() {

    }

    public Volunteer(String volunteerid, String volunteerphonenumber, String volunteerage, String volunteernationality, String volunteerprimarylanguageid, String volunteeremailaddress, String volunteername, String volunteerblockstatus, String volunteermessagecount, String volunteerrating, String volunteerstatus) {

        VolunteerId = volunteerid;
        VolunteerPhoneNumber = volunteerphonenumber;
        VolunteerAge = volunteerage;
        VolunteerNationality = volunteernationality;
        VolunteerPrimaryLanguageID = volunteerprimarylanguageid;
        VolunteerEmailAddress = volunteeremailaddress;
        VolunteerName = volunteername;
        VolunteerBlockStatus = volunteerblockstatus; // is he active in app
        VolunteerMessageCount = volunteermessagecount;
        VolunteerRating = volunteerrating;
        VolunteerStatus = volunteerstatus; // available , Busy , Sign-out

    }

    public String getVolunteerId() {
        return VolunteerId;
    }

    public String getVolunteerPhoneNumber() {
        return VolunteerPhoneNumber;
    }

    public String getVolunteerAge() {
        return VolunteerAge;
    }

    public String getVolunteerNationality() {
        return VolunteerNationality;
    }

    public String getVolunteerPrimaryLanguageID() {
        return VolunteerPrimaryLanguageID;
    }

    public String getVolunteerEmailAddress() {
        return VolunteerEmailAddress;
    }

    public String getVolunteerName() {
        return VolunteerName;
    }

    public String getVolunteerBlockStatus() {
        return VolunteerBlockStatus;
    }

    public String getVolunteerMessageCount() {
        return VolunteerMessageCount;
    }

    public String getVolunteerRating() {
        return VolunteerRating;
    }

    public String getVolunteerStatus() {
        return VolunteerStatus;
    }

    public void setVolunteerId(String volunteerId) {
        VolunteerId = volunteerId;
    }

    public void setVolunteerPhoneNumber(String volunteerPhoneNumber) {
        VolunteerPhoneNumber = volunteerPhoneNumber;
    }

    public void setVolunteerAge(String volunteerAge) {
        VolunteerAge = volunteerAge;
    }

    public void setVolunteerNationality(String volunteerNationality) {
        VolunteerNationality = volunteerNationality;
    }

    public void setVolunteerPrimaryLanguageID(String volunteerPrimaryLanguageID) {
        VolunteerPrimaryLanguageID = volunteerPrimaryLanguageID;
    }

    public void setVolunteerEmailAddress(String volunteerEmailAddress) {
        VolunteerEmailAddress = volunteerEmailAddress;
    }

    public void setVolunteerName(String volunteerName) {
        VolunteerName = volunteerName;
    }

    public void setVolunteerBlockStatus(String volunteerBlockStatus) {
        VolunteerBlockStatus = volunteerBlockStatus;
    }

    public void setVolunteerMessageCount(String volunteerMessageCount) {
        VolunteerMessageCount = volunteerMessageCount;
    }

    public void setVolunteerRating(String volunteerRating) {
        VolunteerRating = volunteerRating;
    }

    public void setVolunteerStatus(String volunteerStatus) {
        VolunteerStatus = volunteerStatus;
    }
}