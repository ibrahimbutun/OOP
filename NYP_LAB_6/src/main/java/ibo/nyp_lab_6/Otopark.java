package ibo.nyp_lab_6;

public class Otopark {
    private int kapasite;// min 10 olmalı
    private double ucret;//negatif olamaz
    private Car [] araclar;
    private double kazanc;

    public void setKapasite(int kapasite) {
        if (kapasite<10) {
            System.out.println("kapasite 10'dan kucuk olamaz!!");            
            this.kapasite = 10;
        }else{
            this.kapasite = kapasite;
    }
    }

    public void setUcret(double ucret) {
        if (ucret<=0) {
            System.out.println("ucret negatif olamaz !");
        }else{
        this.ucret = ucret;
    }
    }
    
    public Otopark(int kapasite, double ucret){
        setKapasite(kapasite);
        setUcret(ucret);
        araclar = new Car[this.kapasite];//kapasite kadar array oluşturduk.
    }
    
    public Otopark(double ucret, Car [] cars){
        setUcret(ucret);
        setKapasite(cars.length);
        araclar = new Car[this.kapasite];
        
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
            araclar[i] = cars[i];                
            }
        }
    }
    
    public void parkEt(Car car){
//        boolean parkEdildi = false;
//        for (int i = 0; i < kapasite; i++) {
//            if (araclar[i] == null) {
//                araclar[i] = car;
//                System.out.println(car.getPlaka() + "aracı park edildi.");
//                parkEdildi = true;
//                break;
//            }
//        }
//        if (!parkEdildi) {
//            System.out.println("otopark dolu, arac park edilemez.");
//        }

        if (araclar.length<kapasite) {
            for (int i = 0; i < kapasite; i++) {
                if (araclar[i] == null) {
                    araclar[i] = car;
                    System.out.println(car.getPlaka() + "aracı park edildi...");
                }
            }
        }
    }
    
    public Car aracCikar(String plaka){
        Car arac_temp = null;
        
        for (int i = 0; i < kapasite; i++) {
            if (araclar[i].getPlaka().equals(plaka)) {
                if (araclar[i] != null) {
                    arac_temp = araclar[i];
                    araclar[i] = null;
                    kazanc += ucret;
                    System.out.println(kazanc);
                }
            }
        }
        
        return arac_temp;
        
        
//        for (int i = 0; i < kapasite; i++) {
//            
//        //if (araclar[i] != null && araclar[i].getPlaka().equals(plaka)) {
//        if (araclar[i] != null) {
//            Car cikartilanArac = araclar[i];  
//            araclar[i] = null;  
//            kazanc += ucret;  
//            System.out.println(cikartilanArac.getPlaka() + " aracı otoparktan çıkarıldı.");
//            
//            return cikartilanArac;
//        }
//    }
//        
//    System.out.println("Plakası " + plaka + " olan araç otoparkta bulunamadı.");
//    
//    return null;
    }       
        
}
