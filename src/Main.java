public class Main {
    public static void main(String[] args) {
Student student1=new Student("Aidai","Ysmaiylova",18,"ay@gmail.com");
Student student2=new Student("Aizirek","Toktosunova",18,"at@gmail.com");
Student student3=new Student("Bermer","Mamatjanova",20,"bm@gmail.com");
Student student4=new Student("Baikal","Asanov",16,"ba@gmail.com");
Student student5=new Student("Samagan","Tolombaev",16,"st@gmail.com");
Student student6=new Student("Kumarbek","Ysmaiylova",16,"kt@gmail.com");
Student student7=new Student("Aizat","Kamaldin kyzy",18,"ak@gmail.com");
Student student8=new Student("Aleriza","Sultanova",18,"as@gmail.com");
Student student9=new Student("Adina","Duishobaeve",30,"ad@gmail.com");
Student student10=new Student("Rysbek","Sharapov",30,"rs@gmail.com");
Student[]students={student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        Group group1=new Group("English1",17,students);
        Group group2=new Group("English2",10,students);
        Group group3=new Group("English3",5,students);
        Group group4=new Group("English4",9,students);
        Group group5=new Group("English5",15,students);
        Group[]groups={group1,group2,group3,group4,group5};
        Course course=new Course("Language Academy",7878787,"Riahna",groups);
        System.out.println(course);

    }
}