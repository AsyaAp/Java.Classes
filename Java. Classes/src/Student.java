public class Student
{
    private int id;
    private String surname, name, secName;
    private String bthDate;
    private String adress;
    private int telephone;
    private String faculty;
    private int course, group;

    //конструкторы

    Student(int id, String surname, String name, String secName, String bthDate,
            String adress, int telephone, String faculty, int course, int group )
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secName = secName;
        if (valid(bthDate))
        {
            this.bthDate = bthDate;
        }
        else
        {
            this.bthDate = "01.01.2000";
        }
        this.adress = adress;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    Student (){}

    //геттеры и сеттеры

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSecName() {
        return secName;
    }
    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getBthDate() {
        return bthDate;
    }
    public void setBthDate(String bthDate) {
        if (valid(bthDate))
        {
            this.bthDate = bthDate;
        }
         else
        {
            this.bthDate = "01.01.2000";
        }
    }

    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }

    //toString

    public String toString() {
        return "Student " + this.id + ": \n"
                + "Full name: " + this.surname + " " + this.name + " " + this.secName + '\n'
                + "Date of birth: " + this.bthDate + '\n'
                + "Adress: " + this.adress + '\n'
                + "Telephone number: " + this.telephone + '\n'
                + "Faculty: " + this.faculty + '\n'
                + "Course: " + this.course + '\n'
                + "Group: " + this.group + '\n';
    }

    //проверка даты

    public boolean valid(String bthDate){
        boolean result = true;
        char[] Date = bthDate.toCharArray();
        if (Date[2] != '.' || Date[5] != '.')
            result = false;
        for (int i = 0; i < Date.length; i++)
        {
            if (!Character.isDigit(Date[i]) && (i != 2 && i != 5))
            {
                result = false;
            }
        }
        return result;
    }
}
