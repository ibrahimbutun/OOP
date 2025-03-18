package ibo.nyp_lab_6;

public class Car {
    private String plaka;
    private String isim;

    
public Car(String isim, String plaka){
    this.plaka = plaka;
    this.isim = isim;
}

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String toString(){
        return (this.isim +"  //  "+ this.plaka);
    }
}
