package teachertest.page.action;

public interface NewTeacherAction {
    void sendKeyFirstName(String s);
    void sendKeyLastName(String s);
    void sendKeyEmail(String s);
    void clickSubmitNewButton();
    void createNewTeacher(String a, String b, String c);
}
