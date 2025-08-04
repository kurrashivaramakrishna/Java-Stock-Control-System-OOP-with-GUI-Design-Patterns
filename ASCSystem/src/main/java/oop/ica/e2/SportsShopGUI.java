
 // Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 // Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 
package oop.ica.e2;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author ShivaKrishna
 */
public class SportsShopGUI extends javax.swing.JFrame {

    
     // Creates new form SportsShopGUI2
     
    public SportsShopGUI() {
        this.setTitle("Ashers Sports consortium");
        try {
            //Trying to retrieve book data.
            loadDatafile();

        } //Notify the user and terminate.
        catch (Exception e) {
            //warn user and exit
            System.out.print("\n\n!!!!! Processing error !!!!!\n" + e.getMessage() + "\n");
        }

        if (!dataList.isEmpty()) {
            initComponents();
            JTableHeader columnheader = sportsTable.getTableHeader();

            columnheader.setBackground(Color.ORANGE);
            columnheader.setForeground(Color.pink);
            columnheader.setFont(new Font("", Font.BOLD, 15));
            sportsTable();
        }

    }

    private void sportsTable() {

        ascModel = new TableModelASC(columnNames, dataList);

        //Associate the abstract table model with a JTable.
        sportsTable.setModel((TableModel) ascModel);

        //Establish column titles in JTable.
        for (int col = 0; col < sportsTable.getColumnCount(); col++) {
            //Access the present column
            TableColumn column = sportsTable.getTableHeader().getColumnModel().getColumn(col);

            //Define the title for a column."
            column.setHeaderValue(columnNames[col]);
        }
    }

    /**
     *This method is utilized within the constructor to initialize the form.
CAUTION: Avoid making modifications to this code. The content of this method is consistently
reconstructed by the Form Editor
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sportsTable = new javax.swing.JTable();
        buy = new javax.swing.JButton();
        add = new javax.swing.JButton();
        quit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sportsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        sportsTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sportsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sportsTable.setGridColor(new java.awt.Color(51, 51, 51));
        sportsTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        sportsTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        sportsTable.setShowGrid(true);
        sportsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sportsTableMouseClicked(evt);
            }
        });
        sportsTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sportsTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(sportsTable);

        buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buy.setText("Buy");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setText("Sell");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        quit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(400, 400, 400))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quit)
                    .addComponent(add)
                    .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
//TODO add your handling code here:
    private void sportsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sportsTableMouseClicked
        
        lowQuantityWarning();
    }//GEN-LAST:event_sportsTableMouseClicked

    private void sportsTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sportsTableKeyReleased
      
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            lowQuantityWarning();
        }
    }//GEN-LAST:event_sportsTableKeyReleased

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
       
        buyItem();
    }//GEN-LAST:event_buyActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        addItem();
    }//GEN-LAST:event_addActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        
        quit();
    }//GEN-LAST:event_quitActionPerformed

    public void lowQuantityWarning() {
        int id = sportsTable.getSelectedRow();
        StockascItem item = dataList.get(id);
        if (item.getStockQty() < 5) {
            String warningmessage = String.format("%s has only %d unit of stock", item.getpT(), item.getStockQty());
            JOptionPane.showMessageDialog(null, warningmessage, "Notification of Limited Stock Availability", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void buyItem() {
        try {
            if (dataList.isEmpty()) {
                return;
            }

            int id = sportsTable.getSelectedRow();
            if (id < 0 || id > dataList.size()) {
                JOptionPane.showMessageDialog(null, "Please select an item from table.", "No Item Selected", JOptionPane.ERROR_MESSAGE);
                return;
            }

            StockascItem item = dataList.get(id);
            if (item.getStockQty() < 1) {
                String message = String.format("%s has only %d unit of stock", item.getpT(), item.getStockQty());
                JOptionPane.showMessageDialog(null, message, "Notification of Limited Stock Availability", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int updatedQuantity;
                updatedQuantity = buyOne(item);
              salestransactions(item.getpT(), item.getPrice(), 1, item.getStockQty());

        } catch (HeadlessException e) {
            System.err.println("Error buying item: " + e.getMessage());
        }
        
       

    }
    
     private void salestransactions(String pc, double price, int buyedQuantity, int stock) {
        String fileName = "Sales_Transactions.csv";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {

            writer.println(java.time.LocalDateTime.now() + "," + pc + "," + price + ","
                    + buyedQuantity + "," + stock);

            JOptionPane.showMessageDialog(null, "transaction details written to File  at: " + fileName, "Data Saved", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.out.println("Data successfully recorded in the file. : " + fileName);
        }
    }

    private int buyOne(StockascItem item) {
        int updatedQuantity = item.getStockQty() - 1;
        item.setStockQty(updatedQuantity);

        sportsTable();

        String message = String.format("Item: %s%nPrice: £ %s%nUnit bought: 1%nStock remaining: %d",
                item.getpT(), item.getPrice(), updatedQuantity);
        JOptionPane.showMessageDialog(null, message, "Confirmation of Sale", JOptionPane.INFORMATION_MESSAGE);
        if (item.getStockQty() < 5) {
            String warningmessage = String.format("%s has only %d unit of stock", item.getpT(), item.getStockQty());
            JOptionPane.showMessageDialog(null, warningmessage, "Notification of Limited Stock Availability", JOptionPane.WARNING_MESSAGE);
        }
        return updatedQuantity;
    }


    public void addItem() {
        if (dataList.isEmpty()) {
            return;
        }

        int selectedRowIndex = sportsTable.getSelectedRow();
        if (selectedRowIndex < 0 || selectedRowIndex >= dataList.size()) {
            JOptionPane.showMessageDialog(null, "Please select an item from the table.", "No Item Selected", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StockascItem selectedItem = dataList.get(selectedRowIndex);
        int updatedQuantity;

      
            updatedQuantity = selectedItem.getStockQty() + 1;
        

        String message = "Item: " + selectedItem.getpT() + System.lineSeparator()
                + "Unit added: " + (updatedQuantity - selectedItem.getStockQty()) + System.lineSeparator()
                + "New stock quantity: " + updatedQuantity;
        selectedItem.setStockQty(updatedQuantity);
        sportsTable();

        JOptionPane.showMessageDialog(null, message, "Confirmation of Added Stock", JOptionPane.INFORMATION_MESSAGE);
    }

// loading the data from the .csv file by using this method
// Used CSV Reader and writer to read the input and generate the output
    public void loadDatafile() {

        String csvFile = "";
        String fileName = "AshersSportsCollective.csv";
        try {
            File file = new File(fileName);
            csvFile = file.getAbsolutePath();
            int id = 1;
            CSVReader reader = new CSVReader(new FileReader(csvFile));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String[] attributes = nextLine;
                String StockCode = (attributes[0]);
                String Title = attributes[1];
                String Description = attributes[2];
                int pounds = Integer.parseInt(attributes[3]);
                int pence = Integer.parseInt(attributes[4]);
                double Price = pounds + pence / 100.0;
                DecimalFormat df = new DecimalFormat("0.00"); //Combining pence with the pounds in the decimal format
                df.format(Price);
                int Quantity = Integer.parseInt(attributes[5]);
               StockascItem datamodel = new StockascItem(StockCode, Title, Description, pounds, pence,
                        Quantity,"AshersSportsCollective.csv");
                id++;
                dataList.add(datamodel);
            }
        } catch (FileNotFoundException ioe) {
            System.out.println("!!!! Error : " + fileName + " does not exist !!!!!");
            JOptionPane.showMessageDialog(null, "Error : " + fileName + " does not exist.", "No File Found", JOptionPane.ERROR_MESSAGE);
            ioe.getStackTrace();
        } catch (IOException e) {
            System.out.println("!!!! Error : " + fileName + " has no data !!!!!");
            JOptionPane.showMessageDialog(null, "Error : " + fileName + " has no data", "No File Data Found", JOptionPane.ERROR_MESSAGE);
        } catch (CsvValidationException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
          var StockmsmItems = StockmsmItem.loadStock();

            for (var StockmsmItem : StockmsmItems) {
                dataList.add(new AdaptorOfmsmtoasc(StockmsmItem.getDepartmentId(), StockmsmItem.getCode(),
                        StockmsmItem.getnameAndDescription(), StockmsmItem.getUnitPrice(), StockmsmItem.getQuantityInStock()));
            }
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SportsShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SportsShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SportsShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SportsShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Build and show the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SportsShopGUI().setVisible(true);
            }
        });
    }

    public void quit() {
        try {
            //attempt to save books
            saveSItems();
        } catch (Exception e) {
            //warn user and exit
            System.err.print("\n!!!!! Processing error !!!!!\n" + e.getMessage());
        }
        System.exit(0);
    }
public void saveSItems() {
    Map<String, List<StockascItem>> fileToItemsMap = new HashMap<>();

    // Group items by their source file
    for (StockascItem item : dataList) {
        fileToItemsMap.computeIfAbsent(item.getSourceFile(), k -> new ArrayList<>()).add(item);
    }

    // Save each group of items to its respective file
    for (Map.Entry<String, List<StockascItem>> entry : fileToItemsMap.entrySet()) {
        saveItemsToFile(entry.getValue(), entry.getKey());
    }
}
private void saveItemsToFile(List<StockascItem> items, String fileName) {
    try {
        // Define the path for the file
        File file = new File(fileName);
        String filePath = file.getAbsolutePath();

        // Create a CSVWriter object
        try (CSVWriter csvWriter = (CSVWriter) new CSVWriterBuilder(new FileWriter(filePath))
                .withSeparator(',').withQuoteChar('\0').build()) {
            
            // Write header row
            String[] headerRow = {"Description", "Stock Code", "Title", "Pounds", "Pences", "Quantity"};
            csvWriter.writeNext(headerRow);

            // Write data rows
            for (StockascItem row : items) {
                String[] rowData = {
                    row.getProdDescription(),
                    row.getPC(),
                    row.getpT(),
                    String.valueOf(row.getPricePound()), // Convert to string
                    String.valueOf(row.getPp()),         // Convert to string
                    String.valueOf(row.getStockQty())    // Convert to string
                };
                csvWriter.writeNext(rowData);
            }

            // CSVWriter is auto-closed by try-with-resources
        }

        // Notify that data is written
        System.out.println("Data written to the file at: " + filePath);
        JOptionPane.showMessageDialog(null, "Data written to file at: " + file.getAbsolutePath(), "Data Saved", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException ie) {
        ie.printStackTrace(); // Print the stack trace for debugging
        JOptionPane.showMessageDialog(null, "Error occurred while writing to file: " + fileName, "Write Error", JOptionPane.ERROR_MESSAGE);
    }
}

    public  void saveItems() {
        String filePath;
        // List<ASCStockItem> updateddata = data;
        String fileName = "asc_output.txt"; // Declaring the output file name
        File file = new File(fileName);
        filePath = file.getAbsolutePath();
        // creating a CSVWriter object with default separator and quote character
        try {// creating a FileWriter object with the CSV file path

            FileWriter fileWriter = new FileWriter(filePath); // creating a CSVWriter object with default separator and quote character
            // creating a CSVWriter object with default separator and no quote character
            CSVWriter csvWriter = (CSVWriter) new CSVWriterBuilder(new FileWriter(filePath))
                    .withSeparator(',')
                    .withQuoteChar('\0')
                    .build(); // write header row
            String[] headerRow = {"Description", "Stock Code", "Title", "Pounds", "Pences", "Quantity"};
            csvWriter.writeNext(headerRow); // write data rows

            for (StockascItem row : dataList) {
                String[] rowData = new String[]{
                    row.getProdDescription(),
                    row.getPC(),
                    row.getpT(),
                    String.valueOf(row.getPricePound()), // convert to string
                    String.valueOf(row.getPp()), // convert to string
                    String.valueOf(row.getStockQty()), // convert to string
                };
                csvWriter.writeNext(rowData);
            }

            // close the CSVWriter object
            csvWriter.close();

            System.out.println("Data written to the file at: " + fileName);  // Printing the output file
            JOptionPane.showMessageDialog(null, "Data written to file at: " + file.getAbsolutePath(), "Data Saved", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ie) {
            ie.getMessage();
        }
    }

    public javax.swing.JTable getAsportsTable() {
        return sportsTable;
    }
    

    public ArrayList<StockascItem> dataList = new ArrayList<>();;
    private String[] columnNames = new String[]{"StockCode", "Title", "Description", "pounds", "pence", "Quantity"};
    TableModelASC ascModel;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton buy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quit;
    private javax.swing.JTable sportsTable;
    // End of variables declaration//GEN-END:variables
}
