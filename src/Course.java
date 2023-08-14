public class Course {
Teacher courseTeacher;
String name,code,prefix;
int note,sozluNote;
public Course(String name,String code,String prefix){
    this.name=name;
    this.code=code;
    this.prefix=prefix;
    this.note=0;
    this.sozluNote=0;
}
public void addTeacher(Teacher t){

    Teacher teacher;
    if (this.prefix.equals(t.branch)){
        this.courseTeacher=t;
        System.out.println("islem Basarili..");
    }else {
        System.out.println(this.name+"Ogretmen Bu dersi veremez...");
    }
}
public void printTeacher(){
    if (courseTeacher != null) {
        System.out.println(this.name + " dersinin Ogretmeni : " + courseTeacher.name);
    } else {
        System.out.println(this.name + " dersine Ogretmen atanmamistir.");
    }
}

}
