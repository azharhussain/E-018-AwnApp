package app.awn.awn;

public class Message {
   private String MessageId;
   private String Message;
   private String SenderID;
   private String RecieverID;
   private String CriticalityLevel;
   private String MessageStatus;

   public Message(){

   }

    public Message(String messageId, String message, String senderid,String recieverid, String criticalitylevel,String messagestatus) {
        MessageId = messageId ;
        Message = message;
        RecieverID=recieverid;
        SenderID= senderid;
        CriticalityLevel = criticalitylevel;
        MessageStatus= messagestatus;
    }

    public String getMessageId() {
        return MessageId;
    }

    public String getMessage() {
        return Message;
    }

    public String getSenderID() {
        return SenderID;
    }

    public String getRecieverID() {
        return RecieverID;
    }

    public String getCriticalityLevel() {
        return CriticalityLevel;
    }

    public String getMessageStatus() {
        return MessageStatus;
    }

    public void setMessageId(String messageId) {
        MessageId = messageId;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setSenderID(String senderID) {
        SenderID = senderID;
    }

    public void setRecieverID(String recieverID) {
        RecieverID = recieverID;
    }

    public void setCriticalityLevel(String criticalityLevel) {
        CriticalityLevel = criticalityLevel;
    }

    public void setMessageStatus(String messageStatus) {
        MessageStatus = messageStatus;
    }
}
