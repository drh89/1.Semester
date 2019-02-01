/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizzabar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Dennis
 */
public class MariosPizzaBar {

    private String orderPath = "C:\\Users\\Runej\\Desktop\\Files\\Marios\\Orders.txt";
    private String savedOrdersPath = "C:\\Users\\Runej\\Desktop\\Files\\Marios\\SavedOrders.txt";
    private String menuPath = "C:\\Users\\Runej\\Desktop\\Files\\Marios\\Menukort.txt";
    private boolean endIt = false;

    private ArrayList<Order> savedOrders = new ArrayList();
    private ArrayList<Order> orders = new ArrayList();
    private ArrayList<Pizza> menu = new ArrayList();
    UI ui = new UI();

    public void marios() {
        while (true) {
            ui.menu();
            String menu = ui.input();

            switch (menu) {
                case "1":
                    do {
                        System.out.println(showPizzaMenu(makeMenu(menuPath)));
                        ui.back();
                    } while (!ui.backButton());
                    break;
                case "2":
                    readMenu(menuPath);
                    System.out.println(showPizzaMenu(makeMenu(menuPath)));
                    orders.add(newOrder(orders, makeMenu(menuPath)));

                    storeOrder(orders, orderPath);

                    break;
                case "3":
                    System.out.println(readOrders(orderPath));
                    break;
                case "4":
                    System.out.println(readOrders(orderPath));
                    removeOrder(orders);

                    storeOrder(orders, orderPath);
                    saveOrder(savedOrders, savedOrdersPath);

                    break;
            }

        }
    }

    public void removeOrder(ArrayList<Order> orders) {
        try {

            ui.removeOrder1();
            String temp = ui.input();
            for (int i = 0; i <= orders.size() - 1; i++) {
                if (orders.get(i).getOrderNumber() == Integer.parseInt(temp)) {
                    savedOrders.add(orders.get(i));
                    orders.remove(i);

                }

            }
//            for (int i = 0; i < orders.size(); i++) {
//                orders.get(i).setOrderNumber(i + 1);
//
//            }

        } catch (NumberFormatException ex) {
            ui.removeOrder2();
        }
    }

    public Order newOrder(ArrayList<Order> orders, List<Pizza> pizzaMenu) {

        Order ord = new Order(LocalDate.now(), LocalTime.now(), 0);
        if (orders.isEmpty()) {
            ord.setOrderNumber(1);
        }
        if (!orders.isEmpty()) {
            Order temp = new Order();
            for (int i = orders.size() - 1; i < orders.size(); i++) {
                temp.setOrderNumber(orders.get(i).getOrderNumber());
            }
            ord.setOrderNumber(temp.getOrderNumber() + 1);
        }

        do {
            try {
                ui.newOrder1();
                String temp = ui.input();
                for (Pizza pizza : pizzaMenu) {

                    if (pizza.getMenuNumber() == Integer.parseInt(temp)) {

                        ord.getPizzas().add(pizza);

                    }
                }

                ui.back();
                ui.newOrder2();
            } catch (NumberFormatException ex) {
                ui.newOrder3();

            }
        } while (!ui.backButton());

        return ord;

    }

    public List<String> readMenu(String filePath) {
        try {
//            Charset charset = Charset.forName("UTF-8");
            Path path = Paths.get(filePath);

            List<String> list = Files.readAllLines(path);

            return list;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Pizza> makeMenu(String filePath) {

        List<String> lines = readMenu(filePath);
        List<Pizza> pizzaMenu = new ArrayList();
        for (String line : lines) {
            String[] parameters = line.split("-");
            for (int i = 0; i < parameters.length - 3; i++) {
                // String menuNumber = parameters[i].trim();
                String name = parameters[i + 1].trim();
                String toppings = parameters[i + 2].trim();
                String price = parameters[i + 3].trim();

                pizzaMenu.add(new Pizza(0, name, toppings, price));
                i += 3;
            }

            for (int i = 0; i < pizzaMenu.size(); i++) {
                pizzaMenu.get(i).setMenuNumber(i + 1);
            }

        }
        return pizzaMenu;

    }

    public String showPizzaMenu(List<Pizza> pizzaMenu) {
        return pizzaMenu.toString()
                .replace("[", "").replace("]", "")
                .replace(", ", "\n").replace(",", ", ");

    }

    public void storeOrder(ArrayList<Order> orders, String filePath) {
        ObjectOutputStream out = null;

        try {
            File file = new File(filePath);
            out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(orders);
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String readOrders(String filePath) {
        ObjectInputStream in = null;

        try {
            File file = new File(filePath);
            in = new ObjectInputStream(new FileInputStream(file));

            ArrayList<Order> orders = (ArrayList<Order>) in.readObject();
            return orders.toString().replace("[", "").replace("]", "").replace(", ", "");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return "";

    }

    public void saveOrder(ArrayList<Order> savedOrders, String filePath) {
        PrintWriter writer = null;
        try {
            File file = new File(filePath);
            writer = new PrintWriter(new FileWriter(file));
            for (Order savedOrder : savedOrders) {
                writer.println(savedOrder.getDate() + " " + savedOrder.getTime());
                for (Pizza pizza : savedOrder.getPizzas()) {
                    writer.println(pizza.toString());
                }
                writer.println();

            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
