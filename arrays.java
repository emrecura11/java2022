public class arrays{

    public static void main(String[] args) {
        String ogrenci1="Ersin";
        String ogrenci2="Demir";
        String ogrenci3="Sinan";
        String ogrenci4="Arslan";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-------------------------------");

        String[] ogrenciler=new String[4];
        ogrenciler[0]="Ersin";
        ogrenciler[1]="Demir";
        ogrenciler[2]="Sinan";
        ogrenciler[3]="Arslan";

        for(int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }System.out.println("-------------------------------");

        for(String ogrenci:ogrenciler) {
            System.out.println(ogrenci);

        }
    }
}