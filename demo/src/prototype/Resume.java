package prototype;

/**
 * Created by cute coder
 * 2019/7/5 15:07
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", timeArea='" + timeArea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
