package teachertest.page.action;

public interface TeacherAction {
    void clickAddTeacherButton();
    void clickUpdateTeacherButton();
    void clickDeleteTeacherButton();
    void clickSearchTeacherButton();
    void clickRefeshTeacherButton();
    String getFirstNameText();
    String getLastNameText();
    String getEmailText();
    void sendKeyTeacherFirstNameInputSearch(String s);
    int numTeacher();
}
