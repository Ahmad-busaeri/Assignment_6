package assignment_6.Bangun_Datar;

public abstract class BangunDatar {
    String warna;

    String getName(){
        return warna;
    }

    void setWarna(String warna){
        this.warna=warna;
    }
    
    abstract float getLuas();
}
