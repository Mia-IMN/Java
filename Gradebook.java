public class Gradebook {
    
    private String CourseName;

    public Gradebook(String name){
        CourseName = name;
    }

    public void setCourseName(String name){
        CourseName = name;
    }

    public String getCourseName(){
        return CourseName;
    }

    public void displayMessage(){
        System.out.printf("This is the gradebook for \n%s!\n\n", getCourseName());
    }
}