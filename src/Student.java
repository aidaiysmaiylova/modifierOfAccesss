public class Student {
    private String name;
    private String surname;
    private int birthday;
    private String emailAddress;

    public Student(String name, String surname, int birthday, String emailAddress) {
        this.name = name;
        this.surname = surname;
        if(birthday>0) {
            this.birthday = birthday;
        }
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        if(birthday>0){
        this.birthday = birthday;
    }
    else System.out.println("Please,write your correct age");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;

    }
    @Override
    public String toString(){
        return getName()+" "+getSurname()+" "+getBirthday()+" "+getEmailAddress();
    }


}

