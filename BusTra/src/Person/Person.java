
package Person;

public abstract class Person {
    private String name,gender,position,username,password,email;
    private long  nationalID;
    private int age;
    
    public Person (){
         this.setName(null);
        this.setAge(0);
        this.setNationalID(0);
        this.setGender(null);
        this.setEmail(null);
        this.setUsername(null);
        this.setPassword(null);
         this. setPosition(null);
    }
public Person(String name, int age, long NationalID,String gender, String position ,String email, String username ,String password){
     this.setName(name);
        this.setAge(age);
        this.setNationalID(NationalID);
        this.setGender(gender);
        this.setEmail(email);
        this.setUsername(username);
        this.setPassword(password);
         this. setPosition(position);
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNationalID() {
        return nationalID;
    }

    public void setNationalID(long nationalID) {
        this.nationalID = nationalID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
    public abstract boolean login(String username , String password);
    
}


