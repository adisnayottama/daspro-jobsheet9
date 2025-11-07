import java.util.Scanner;
public class CariMenuCafe02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", 
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String cariMenu;
        boolean ditemukan = false;
        int i;


        System.out.println("=== DAFTAR MENU KAFE ===");
        for (i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        cariMenu = sc.nextLine();

        for (i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) { 
                ditemukan = true;
                break;
            }
        }

        System.out.println();
        if (ditemukan) {
            System.out.println("Menu " + cariMenu + " tersedia di kafe.");
        } else {
            System.out.println("Maaf, menu" + cariMenu + " tidak tersedia di kafe.");
        }
    }
}