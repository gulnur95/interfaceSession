package task1;

public interface PhoneInterface {

    String turnOn(Phone phone,String command);
    Contact call(long phoneNumber);
    Contact call(String name);
    Contact[] updateContact(String oldName,String newName);
    Contact[] getAllContacts();

}
