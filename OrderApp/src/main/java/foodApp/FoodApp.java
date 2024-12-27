package foodApp;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodApp {
   private  List<MenuItem> menu;

    public FoodApp(List<MenuItem> menu) {
        this.menu = new ArrayList<>();
        loadMenu();
    }

    private void loadMenu(){
        menu.add(new MenuItem(25.0,"Pizza"));
        menu.add(new MenuItem(15.0,"Burger"));
        menu.add(new MenuItem(17.0,"Cheeseburger"));
        menu.add(new MenuItem(14.0,"Kebeb"));
    }
    public void showMenu(){
        System.out.println("Menu");
        for(int i=0; i<menu.size();i++){
            MenuItem item=menu.get(i);
            System.out.println(i+1 + " "+ item.getName() + "-" + item.getPrice()+ "PLN");
        }
    }

    public void placeOrder() {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order(menu);

        showMenu();

        System.out.println("Wybierz numer pozycji (lub wpisz 0, aby zakończyć):");
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            if (choice > 0 && choice <= menu.size()) {
                MenuItem item = menu.get(choice - 1);
                order.addItem(item);
                System.out.println("Dodano do zamówienia: " + item.getName());
            } else {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
            System.out.println("Wybierz kolejny numer pozycji (lub wpisz 0, aby zakończyć):");
        }

        System.out.println("Twoje zamówienie:");
        for (MenuItem item : order.getItem()) {
            System.out.println(item.getName() + " - " + item.getPrice() + " PLN");
        }
        System.out.println("Całkowity koszt: " + order.getTotalPrice() + " PLN");
    }

}



