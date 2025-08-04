/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package oop.ica.e2;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SportsShopGUITest {

    public SportsShopGUITest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of load method, of class SportsShopGUI.
     */
    @Test
    public void testLoad() throws FileNotFoundException {
        System.out.println("CVS Data is Load Sucessfully");
        SportsShopGUI instance = new SportsShopGUI();
        instance.loadDatafile();
    }

    /**
     * Test of buyItem method, of class SportsShopGUI.
     */
    @Test
    public void testBuyItem() {
        System.out.println("buyItem");
        System.out.println("_______________________________________________________");
        SportsShopGUI instance = new SportsShopGUI();

        var jtable = instance.getAsportsTable();
        jtable.setRowSelectionInterval(2, 1);
        instance.buyItem();

        for (var stockItems : instance.dataList) {

            String[] splitname = stockItems.getProdDescription().split("(?<=\\u00a0\\u00a0\\u00a0)(?!\\u00a0)");
            String name = null;
            if (splitname.length > 1) {
                name = splitname[1];
            }

            var displaymenu = String.format("%s - %s - UNIT PRICE: £%s - QTY: %d",
                    stockItems.getpT(),
                    name != null ? name : stockItems.getProdDescription(),
                    stockItems.getPrice(),
                    stockItems.getStockQty());

            displaymenu = displaymenu.replace("\u00a0", "");
            System.out.println(displaymenu);
        }

    }

    /**
     * Test of addStock method, of class SportsShopGUI.
     */
    @Test
    public void testaddItem() {
        System.out.println("addStock");
        System.out.println("__________________________________________________________");
        SportsShopGUI instance = new SportsShopGUI();

        var jtable = instance.getAsportsTable();
        jtable.setRowSelectionInterval(2, 1);
        instance.addItem();

        for (var stockItems : instance.dataList) {

            String[] splitname = stockItems.getProdDescription().split("(?<=\\u00a0\\u00a0\\u00a0)(?!\\u00a0)");
            String name = null;
            if (splitname.length > 1) {
                name = splitname[1];
            }

            var displaymenu = String.format("%s - %s - UNIT PRICE: £%s - QTY: %d",
                    stockItems.getpT(),
                    name != null ? name : stockItems.getProdDescription(),
                    stockItems.getPrice(),
                    stockItems.getStockQty());

            displaymenu = displaymenu.replace("\u00a0", "");
            

            System.out.println(displaymenu);
        }
    }



}
