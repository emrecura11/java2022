public class switchBlokları {

    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel! Geçtiniz!");
                break;
            case 'B':
                System.out.println("İyi! Geçtiniz!");
                break;
            case 'C':
                System.out.println("Orta! Geçtiniz!");
                break;
            case 'D':
                System.out.println("Şartlı! Geçtiniz!");
                break;
            case 'F':
                System.out.println("Maalesef! Kaldınız!");
                break;
        }    }
}
