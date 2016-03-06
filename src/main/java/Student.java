/**
 * Created by student on 2016/03/06.
 */
public class Student {

    private String studNum;
    private String name;
    private String surname;
    private boolean pass;

    public Student()
    {}

    public Student(String studNum,String name,String surname, boolean pass)
    {
        this.studNum = studNum;
        this.name = name;
        this.surname = surname;
        this.pass = pass;
    }

    public void setPass(boolean pass) {  this.pass = pass; }

    public String getStudNum()
    {
        return this.studNum;
    }
    public String getName()
    {
        return this.name;
    }
    public String getSurname() { return this.surname; }
    public boolean getPass() { return this.pass; }

}
