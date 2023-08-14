public class Students {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage,fizikOrt,matOrt,kimyaOrt;
    boolean isPass;


    Students(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int matSozluNotu, int fizik,int fizikSozluNotu, int kimya,int kimyaSozluNotu) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (matSozluNotu >= 0 && matSozluNotu <= 100) {
            this.mat.sozluNote = matSozluNotu;
        }
        if (fizikSozluNotu >= 0 && fizikSozluNotu <= 100) {
            this.fizik.sozluNote = fizikSozluNotu;
        }

        if (kimyaSozluNotu >= 0 && kimyaSozluNotu <= 100) {
            this.kimya.sozluNote = kimyaSozluNotu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        fizikOrt=(this.fizik.sozluNote*0.20)+(this.fizik.note*0.80);
        kimyaOrt=(this.kimya.sozluNote*0.15)+(this.kimya.note*0.85);
        matOrt=(this.mat.sozluNote*0.30)+(this.mat.note*0.70);
        this.avarage = (this.fizikOrt + this.kimyaOrt + this.matOrt) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }


}
