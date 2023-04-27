import java.util.Scanner;

public class Idomunka {
    public void startIdomunka(){
        kiir(bekerData());
    }
    private void kiir(double megmunkalasiIdo){
        System.out.println("A megmunkálási idő: "+megmunkalasiIdo+" perc.");
    }
    private double bekerData(){
        String megmunkaltHosszStr=beker("Kérem adja meg a megmunkált hosszt (mm-ben): ");
        while (!checkInput(megmunkaltHosszStr)){
            System.out.println("Hiba! A megadott adat formátumának double-nak kell lennie.");
            megmunkaltHosszStr=beker("Kérem adja meg a megmunkált hosszt (mm-ben): ");}
        double megmunkaltHossz=Double.parseDouble(megmunkaltHosszStr);


        String fordulatonkentiElotolasStr=beker("Kérem adja meg a fordulatonkénti előtolást (mm-ben): ");
        while (!checkInput(fordulatonkentiElotolasStr)){
            System.out.println("Hiba! A megadott adat formátumának double-nak kell lennie.");
            fordulatonkentiElotolasStr=beker("Kérem adja meg a fordulatonkénti előtolást (mm-ben): ");}
        double fordulatonkentiElotolas=Double.parseDouble(fordulatonkentiElotolasStr);

        String foorsoFordulatszamStr=beker("Kérem adja meg a főorsó fordulatszámát (fordulatszám/perc-ben): ");
        while (!checkInput(foorsoFordulatszamStr)){
            System.out.println("Hiba! A megadott adat formátumának double-nak kell lennie.");
            foorsoFordulatszamStr=beker("Kérem adja meg a főorsó fordulatszámát (fordulatszám/perc-ben): ");}
        double foorsoFordulatszam=Double.parseDouble(foorsoFordulatszamStr);
        return szamol(megmunkaltHossz, fordulatonkentiElotolas, foorsoFordulatszam);
    }
    private String beker(String msg){
        Scanner scanner=new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
    private double szamol(double megMunkalthossz, double fordulatonkentiElotolas, double foorsoFordulatszam){
        double megmunkalasiIdo=megMunkalthossz/(fordulatonkentiElotolas*foorsoFordulatszam);
        return megmunkalasiIdo;
    }
    public boolean checkInput(String input){
        if(input.matches("[0-9.]*")){
            return true;
        }else{
            return false;
        }
    }
}
