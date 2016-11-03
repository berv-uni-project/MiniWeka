/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniWeka;

import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.ConverterUtils.DataSink;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.NumericToNominal;

/**
 *
 * @author Bervianto Leo P
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evaluateRadioGroup = new javax.swing.ButtonGroup();
        allBar = new javax.swing.JPanel();
        mainBar = new javax.swing.JPanel();
        openButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        addInstanceButton = new javax.swing.JButton();
        saveModelButton = new javax.swing.JButton();
        loadModelButton = new javax.swing.JButton();
        showDataButton = new javax.swing.JButton();
        clasifyButton = new javax.swing.JButton();
        currentRelation = new javax.swing.JPanel();
        relationLabel = new javax.swing.JLabel();
        relationValue = new javax.swing.JLabel();
        attributesLabel = new javax.swing.JLabel();
        attributesValue = new javax.swing.JLabel();
        instancesLabel = new javax.swing.JLabel();
        instancesValue = new javax.swing.JLabel();
        sumOfWeightsLabel = new javax.swing.JLabel();
        sumOfWeightsValue = new javax.swing.JLabel();
        evaluateBar = new javax.swing.JPanel();
        evaluateLabel = new javax.swing.JLabel();
        crossRadio = new javax.swing.JRadioButton();
        fullRadio = new javax.swing.JRadioButton();
        startButton = new javax.swing.JButton();
        resultEvaluate = new javax.swing.JScrollPane();
        resultEvaluateArea = new javax.swing.JTextArea();
        statusBar = new javax.swing.JPanel();
        status = new javax.swing.JLabel();
        defaultMenu = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Weka");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        allBar.setLayout(new javax.swing.BoxLayout(allBar, javax.swing.BoxLayout.PAGE_AXIS));

        openButton.setText("Open File");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });
        mainBar.add(openButton);

        filterButton.setText("Filter");
        filterButton.setEnabled(false);
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });
        mainBar.add(filterButton);

        saveButton.setText("Save File");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        mainBar.add(saveButton);

        addInstanceButton.setText("Add Instance");
        addInstanceButton.setEnabled(false);
        addInstanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInstanceButtonActionPerformed(evt);
            }
        });
        mainBar.add(addInstanceButton);

        saveModelButton.setText("Save Model");
        saveModelButton.setEnabled(false);
        saveModelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveModelButtonActionPerformed(evt);
            }
        });
        mainBar.add(saveModelButton);

        loadModelButton.setText("Load Model");
        loadModelButton.setEnabled(false);
        loadModelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadModelButtonActionPerformed(evt);
            }
        });
        mainBar.add(loadModelButton);

        showDataButton.setText("Show Data");
        showDataButton.setEnabled(false);
        showDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataButtonActionPerformed(evt);
            }
        });
        mainBar.add(showDataButton);

        clasifyButton.setText("Clasify New Instance with Loaded Model");
        clasifyButton.setEnabled(false);
        clasifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasifyButtonActionPerformed(evt);
            }
        });
        mainBar.add(clasifyButton);

        allBar.add(mainBar);

        currentRelation.setLayout(new javax.swing.BoxLayout(currentRelation, javax.swing.BoxLayout.Y_AXIS));

        relationLabel.setText("Relation : ");
        currentRelation.add(relationLabel);

        relationValue.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                relationValuePropertyChange(evt);
            }
        });
        currentRelation.add(relationValue);

        attributesLabel.setText("Attributes : ");
        currentRelation.add(attributesLabel);
        currentRelation.add(attributesValue);

        instancesLabel.setText("Instances : ");
        currentRelation.add(instancesLabel);
        currentRelation.add(instancesValue);

        sumOfWeightsLabel.setText("Sum of weights : ");
        currentRelation.add(sumOfWeightsLabel);
        currentRelation.add(sumOfWeightsValue);

        allBar.add(currentRelation);

        evaluateBar.setLayout(new javax.swing.BoxLayout(evaluateBar, javax.swing.BoxLayout.Y_AXIS));

        evaluateLabel.setText("Mode Pembelajaran :");
        evaluateBar.add(evaluateLabel);

        evaluateRadioGroup.add(crossRadio);
        crossRadio.setText("Cross-Validation 10-fold");
        crossRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossRadioActionPerformed(evt);
            }
        });
        evaluateBar.add(crossRadio);

        evaluateRadioGroup.add(fullRadio);
        fullRadio.setText("Full Training");
        fullRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullRadioActionPerformed(evt);
            }
        });
        evaluateBar.add(fullRadio);

        startButton.setText("Start");
        startButton.setEnabled(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        evaluateBar.add(startButton);

        resultEvaluateArea.setEditable(false);
        resultEvaluateArea.setColumns(20);
        resultEvaluateArea.setRows(5);
        resultEvaluateArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        resultEvaluate.setViewportView(resultEvaluateArea);

        evaluateBar.add(resultEvaluate);

        allBar.add(evaluateBar);

        statusBar.setLayout(new javax.swing.BoxLayout(statusBar, javax.swing.BoxLayout.LINE_AXIS));
        statusBar.add(status);

        allBar.add(statusBar);

        getContentPane().add(allBar);

        File.setText("File");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        File.add(exit);

        defaultMenu.add(File);

        Help.setText("Help");

        aboutMenu.setText("About");
        Help.add(aboutMenu);

        defaultMenu.add(Help);

        setJMenuBar(defaultMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        if(evt.getSource() == this.openButton) {
            this.fc.setAcceptAllFileFilterUsed(false);
            this.fc.removeChoosableFileFilter(modelformat);
            this.fc.setFileFilter(arffformat);
            int returnVal = this.fc.showOpenDialog(MainWindow.this);
            
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = this.fc.getSelectedFile();
                    this.status.setText("Opening: " + file.getName() + ".\n");
                    this.data = DataSource.read(file.getAbsolutePath());
                    if (this.data.classIndex() == -1) {
                        this.data.setClassIndex(this.data.numAttributes() - 1);
                    }
                    this.instancesValue.setText(String.valueOf(this.data.numInstances()));
                    this.attributesValue.setText(String.valueOf(this.data.numAttributes()));
                    this.relationValue.setText(String.valueOf(this.data.relationName()));
                    this.sumOfWeightsValue.setText(String.valueOf(this.data.sumOfWeights()));
                    this.saveButton.setEnabled(true);
                    this.filterButton.setEnabled(true);
                    this.startButton.setEnabled(true);
                    this.addInstanceButton.setEnabled(true);
                    this.loadModelButton.setEnabled(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                this.status.setText("Open command cancelled by user.\n");
            }
        }        
    }//GEN-LAST:event_openButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(evt.getSource()==this.saveButton) {
            this.fc.setAcceptAllFileFilterUsed(false);
            this.fc.removeChoosableFileFilter(modelformat);
            this.fc.setFileFilter(arffformat);
            int returnVal = this.fc.showSaveDialog(MainWindow.this);
            
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = this.fc.getSelectedFile();
                    this.status.setText("Saving: " + file.getName() + ".\n");
                    DataSink.write(file.getAbsolutePath(), this.data);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                this.status.setText("Save command cancelled by user.\n");
            }
        }    
    }//GEN-LAST:event_saveButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        if (evt.getSource() == this.filterButton) { 
            try {
                NumericToNominal filter = new NumericToNominal();
                filter.setInputFormat(this.data);
                this.data = Filter.useFilter(this.data, filter);
                this.relationValue.setText(String.valueOf(this.data.relationName()));
                this.status.setText("Using Filter Done");
            } catch (Exception ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_filterButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if (evt.getSource() == this.startButton) {
            if (this.crossRadio.isSelected()) {
                try {
                    // cross-validate classifier
                    Evaluation evaluation = new Evaluation(this.data);
                    J48 tree = new J48();
                    tree.buildClassifier(this.data);
                    evaluation.crossValidateModel(tree, this.data, 10, new Random(1));
                    this.resultEvaluateArea.setText(tree.graph() + "\n");
                    this.resultEvaluateArea.append(tree.toSummaryString());
                    this.resultEvaluateArea.setText(evaluation.toSummaryString("\n== Summary ==\n",true));
                    this.resultEvaluateArea.append(evaluation.toClassDetailsString("\n== Detailed Accuracy By Class ==\n"));
                    this.resultEvaluateArea.append(evaluation.toMatrixString("\n== Confusion Matrix ==\n"));
                    this.status.setText("Running Cross Validation Completed");
                    this.saveModelButton.setEnabled(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (this.fullRadio.isSelected()) {
                try {
                    J48 cls = new J48();
                    cls.buildClassifier(this.data);
                    //evaluate classifier and print some statistics
                    Evaluation eval = new Evaluation(this.data);
                    eval.evaluateModel(cls, this.data);
                    this.resultEvaluateArea.setText(cls.graph() + "\n");
                    this.resultEvaluateArea.append(cls.toSummaryString());
                    this.resultEvaluateArea.append(eval.toSummaryString("\n== Summary ==\n",true));
                    this.resultEvaluateArea.append(eval.toClassDetailsString("\n== Detailed Accuracy By Class ==\n"));
                    this.resultEvaluateArea.append(eval.toMatrixString("\n== Confusion Matrix ==\n"));
                    this.status.setText("Running Full Training Completed");
                    this.saveModelButton.setEnabled(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                this.status.setText("Please Choose Methode");
            }
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void crossRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossRadioActionPerformed
        
    }//GEN-LAST:event_crossRadioActionPerformed

    private void fullRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullRadioActionPerformed
        
    }//GEN-LAST:event_fullRadioActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void addInstanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInstanceButtonActionPerformed
        if(evt.getSource() == this.addInstanceButton) {
            // Must valid input and added class to
            String[] temp_values = new String[this.data.numAttributes()];
            double[] values = new double[this.data.numAttributes()];
            JFrame frame = new JFrame("value");
            for (int i=0; i<temp_values.length; i++) {
                temp_values[i] = JOptionPane.showInputDialog(frame, "Value for "+this.data.attribute(i).name());
                if (temp_values[i] != null) {
                    if (data.attribute(i).isNumeric()){
                        values[i] = Double.valueOf(temp_values[i]);
                    } else if (data.attribute(i).isNominal()){
                        values[i] = data.attribute(i).indexOfValue(temp_values[i]);
                    } else if (data.attribute(i).isString()) {
                        values[i] = data.attribute(i).addStringValue(temp_values[i]);
                    }
                } else {
                    values[i] = 0;
                }
            }
            Instance inst = new DenseInstance(1.0, values);
            data.add(inst);
            this.instancesValue.setText(String.valueOf(this.data.numInstances()));
            this.sumOfWeightsValue.setText(String.valueOf(this.data.sumOfWeights()));
            this.status.setText("Success Add New Instance!");
        }
    }//GEN-LAST:event_addInstanceButtonActionPerformed

    private void relationValuePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_relationValuePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_relationValuePropertyChange

    private void loadModelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadModelButtonActionPerformed
        if (evt.getSource() == this.loadModelButton) {
            this.fc.setAcceptAllFileFilterUsed(false);
            this.fc.removeChoosableFileFilter(arffformat);
            this.fc.setFileFilter(modelformat);
            int returnVal = this.fc.showOpenDialog(MainWindow.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = this.fc.getSelectedFile();
                    this.status.setText("Load module: " + file.getName() + ".\n");
                    loadedModel = (J48) SerializationHelper.read(file.getAbsolutePath());
                    this.resultEvaluateArea.setText(loadedModel.graph()+"\n");
                    this.resultEvaluateArea.append(loadedModel.toSummaryString());
                    this.clasifyButton.setEnabled(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                this.status.setText("Load model canceled by user.\n");
            }
        }
    }//GEN-LAST:event_loadModelButtonActionPerformed

    private void showDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataButtonActionPerformed
        if (evt.getSource() == this.showDataButton) {
            
        }
    }//GEN-LAST:event_showDataButtonActionPerformed

    private void saveModelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveModelButtonActionPerformed
        if (evt.getSource() == this.saveModelButton) {
            this.fc.setAcceptAllFileFilterUsed(false);
            this.fc.removeChoosableFileFilter(arffformat);
            this.fc.setFileFilter(modelformat);
            int returnVal = this.fc.showSaveDialog(MainWindow.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = this.fc.getSelectedFile();
                    Classifier cls = new J48();
                    cls.buildClassifier(this.data);
                    SerializationHelper.write(file.getAbsolutePath(), cls);
                    this.status.setText("Save model completed.");
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                this.status.setText("Save model canceled by user.\n");
            }
        }
    }//GEN-LAST:event_saveModelButtonActionPerformed

    private void clasifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasifyButtonActionPerformed
        if (evt.getSource() == this.clasifyButton) {
            try {
                Instances newdata = new Instances(data);
                String[] temp_values = new String[this.data.numAttributes()];
                double[] values = new double[this.data.numAttributes()];
                JFrame frame = new JFrame("value");
                for (int i=0; i<temp_values.length-1; i++) {
                    temp_values[i] = JOptionPane.showInputDialog(frame, "Value for "+this.data.attribute(i).name());
                    if (temp_values[i] != null) {
                        if (data.attribute(i).isNumeric()){
                            values[i] = Double.valueOf(temp_values[i]);
                        } else if (data.attribute(i).isNominal()){
                            values[i] = data.attribute(i).indexOfValue(temp_values[i]);
                        } else if (data.attribute(i).isString()) {
                            values[i] = data.attribute(i).addStringValue(temp_values[i]);
                        }
                    } else {
                        values[i] = 0;
                    }
                }
                Instance inst = new DenseInstance(1.0, values);
                newdata.add(inst);
                double result = loadedModel.classifyInstance(newdata.lastInstance());
                this.resultEvaluateArea.setText("=== Classify Result ===\n");
                this.resultEvaluateArea.append(newdata.classAttribute().value((int)result));
            } catch (Exception ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_clasifyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    private Instances data;
    private final JFileChooser fc = new JFileChooser();
    private final ArffFile arffformat = new ArffFile();
    private final ModelFile modelformat = new ModelFile();
    private J48 loadedModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem aboutMenu;
    private javax.swing.JButton addInstanceButton;
    private javax.swing.JPanel allBar;
    private javax.swing.JLabel attributesLabel;
    private javax.swing.JLabel attributesValue;
    private javax.swing.JButton clasifyButton;
    private javax.swing.JRadioButton crossRadio;
    private javax.swing.JPanel currentRelation;
    private javax.swing.JMenuBar defaultMenu;
    private javax.swing.JPanel evaluateBar;
    private javax.swing.JLabel evaluateLabel;
    private javax.swing.ButtonGroup evaluateRadioGroup;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton filterButton;
    private javax.swing.JRadioButton fullRadio;
    private javax.swing.JLabel instancesLabel;
    private javax.swing.JLabel instancesValue;
    private javax.swing.JButton loadModelButton;
    private javax.swing.JPanel mainBar;
    private javax.swing.JButton openButton;
    private javax.swing.JLabel relationLabel;
    private javax.swing.JLabel relationValue;
    private javax.swing.JScrollPane resultEvaluate;
    private javax.swing.JTextArea resultEvaluateArea;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveModelButton;
    private javax.swing.JButton showDataButton;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel status;
    private javax.swing.JPanel statusBar;
    private javax.swing.JLabel sumOfWeightsLabel;
    private javax.swing.JLabel sumOfWeightsValue;
    // End of variables declaration//GEN-END:variables
}
