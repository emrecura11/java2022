public class multidimensionalArrays {
    public static void main(String[] args) {

        String[][]ulkeler=new String[3][3];

        ulkeler[0][0]="Arjantin";
        ulkeler[0][1]="Rusya";
        ulkeler[0][2]="Belcika";
        ulkeler[1][0]="Almanya";
        ulkeler[1][1]="Kolombiya";
        ulkeler[1][2]="Kanada";
        ulkeler[2][0]="Danimarka";
        ulkeler[2][1]="Finlandiya";
        ulkeler[2][2]="Hindistan";

        for(int i=0;i<=2;i++) {
            for(int j=0;j<=2;j++) {
                System.out.println(ulkeler[i][j]);
            }
        }

    }
}

