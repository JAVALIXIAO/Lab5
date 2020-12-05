package zuoye;

public class Students {

    public String name;
    public int id;
    public String gender;
    public int age;

    public void Student(String name, int id, int age, String gender){
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        
    }

    @Override
    public String toString() {
        return "Student: " +
                "name=" + name +  
                ", id=" + id +
                ", gender=" + gender  +
                ", age=" + age +
                
                ' ';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

  
}
