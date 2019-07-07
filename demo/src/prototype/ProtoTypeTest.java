package prototype;

/**
 * Created by cute coder
 * 2019/7/5 15:24
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        Resume resume = new Resume("炼炼");
        resume.setPersonalInfo("25","male");
        resume.setWorkExperience("2018-09-01 nanjing", "百度");
        Object clone = resume.clone();
        System.out.println("resume = " + resume);
        System.out.println("clone = " + clone);
        System.out.println("p == clone"+resume==clone);
    }
}
