public class Main {

    public static void main(String[] args) {

        sayiBulmaca();

    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int arancak=6;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (sayi==arancak){
            varMi=true;
            break;
        }
            if (varMi){
                mesajVer("Sayı mevcuttur: "+arancak);
            }
            else {
                mesajVer("Sayı mevcut değildir: "+arancak);
            }
        }
    }

    public static void mesajVer (String mesaj){
        System.out.println(mesaj);
    }
}
