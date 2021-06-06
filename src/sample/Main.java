package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;


public class Main extends Application {
    public static TextField txtInput;


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");
        Stage secondaryStage = new Stage();

        //Compound Interest
        Label lblComIntCal = new Label("Compound Interest Calculator");
        lblComIntCal.setStyle("-fx-background-color: #95FAB3; -fx-font-family: verdana; -fx-font-size: 18px; -fx-text-fill: black; -fx-alignment: center;");
        lblComIntCal.setMinSize(800,30);
        lblComIntCal.setLayoutY(20);


        Label lblCIStartPrincipal = new Label("Start Principal:");
        lblCIStartPrincipal.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblCIStartPrincipal.setLayoutX(50);
        lblCIStartPrincipal.setLayoutY(80);
        TextField tfCIStartPrincipal = new TextField();
        tfCIStartPrincipal.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfCIStartPrincipal.setPromptText("$");
        tfCIStartPrincipal.setLayoutX(300);
        tfCIStartPrincipal.setLayoutY(75);
        tfCIStartPrincipal.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfCIStartPrincipal.setText(txtInput.getText());
            }
        });
        Label lblCIAnnualContribute = new Label("Annual Contribution:");
        lblCIAnnualContribute.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblCIAnnualContribute.setLayoutX(50);
        lblCIAnnualContribute.setLayoutY(120);
        TextField tfCIAnnualContribute = new TextField();
        tfCIAnnualContribute.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfCIAnnualContribute.setPromptText("$");
        tfCIAnnualContribute.setLayoutX(300);
        tfCIAnnualContribute.setLayoutY(115);
        tfCIAnnualContribute.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfCIAnnualContribute.setText(txtInput.getText());
            }
        });
        Label lblCIInterestRate = new Label("Interest Rate:");
        lblCIInterestRate.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblCIInterestRate.setLayoutX(50);
        lblCIInterestRate.setLayoutY(160);
        TextField tfCIInterestRate = new TextField();
        tfCIInterestRate.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfCIInterestRate.setPromptText("%");
        tfCIInterestRate.setLayoutX(300);
        tfCIInterestRate.setLayoutY(155);
        tfCIInterestRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfCIInterestRate.setText(txtInput.getText());
            }
        });
        Label lblCIYears = new Label("After:");
        lblCIYears.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblCIYears.setLayoutX(50);
        lblCIYears.setLayoutY(200);
        TextField tfCIYears = new TextField();
        tfCIYears.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfCIYears.setPromptText("years");
        tfCIYears.setLayoutX(300);
        tfCIYears.setLayoutY(195);
        tfCIYears.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfCIYears.setText(txtInput.getText());
            }
        });
        Label lblCITaxRate = new Label("Tax Rate:");
        lblCITaxRate.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblCITaxRate.setLayoutX(50);
        lblCITaxRate.setLayoutY(240);
        TextField tfCITaxRate = new TextField();
        tfCITaxRate.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfCITaxRate.setPromptText("%");
        tfCITaxRate.setLayoutX(300);
        tfCITaxRate.setLayoutY(235);
        tfCITaxRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfCITaxRate.setText(txtInput.getText());
            }
        });
        Label lblCIResultsTag = new Label("         Results");
        lblCIResultsTag.setStyle("-fx-background-color: #3CB024; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: white;");
        lblCIResultsTag.setMinSize(800,25);
        lblCIResultsTag.setLayoutY(300);
        Label lblCIEndBalanceTag = new Label("End Balance");
        lblCIEndBalanceTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblCIEndBalanceTag.setLayoutY(330);
        lblCIEndBalanceTag.setLayoutX(50);
        Label lblCIEndBalanceTag2 = new Label();
        lblCIEndBalanceTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblCIEndBalanceTag2.setLayoutY(330);
        lblCIEndBalanceTag2.setLayoutX(300);
        Label lblCITotalPrincipalTag = new Label("Total Principal");
        lblCITotalPrincipalTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblCITotalPrincipalTag.setLayoutY(360);
        lblCITotalPrincipalTag.setLayoutX(50);
        Label lblCITotalPrincipalTag2 = new Label();
        lblCITotalPrincipalTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblCITotalPrincipalTag2.setLayoutY(360);
        lblCITotalPrincipalTag2.setLayoutX(300);
        Label lblCITotalInterestTag = new Label("Total Interest");
        lblCITotalInterestTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblCITotalInterestTag.setLayoutY(390);
        lblCITotalInterestTag.setLayoutX(50);
        Label lblCITotalInterestTag2 = new Label();
        lblCITotalInterestTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblCITotalInterestTag2.setLayoutY(390);
        lblCITotalInterestTag2.setLayoutX(300);
        Label lblCITotalTaxTag = new Label("Total Tax");
        lblCITotalTaxTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblCITotalTaxTag.setLayoutY(420);
        lblCITotalTaxTag.setLayoutX(50);
        Label lblCITotalTaxTag2 = new Label();
        lblCITotalTaxTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblCITotalTaxTag2.setLayoutY(420);
        lblCITotalTaxTag2.setLayoutX(300);

        Button btnCICalculate = new Button("Calculate");
        btnCICalculate.setMinSize(100, 35);
        btnCICalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnCICalculate.setOnMouseEntered(event -> btnCICalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnCICalculate.setOnMousePressed(event -> btnCICalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnCICalculate.setOnMouseExited(event -> btnCICalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnCICalculate.setLayoutX(650);
        btnCICalculate.setLayoutY(100);

        Button btnCIClear = new Button("Clear");
        btnCIClear.setMinSize(100, 35);
        btnCIClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnCIClear.setOnMouseEntered(event -> btnCIClear.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnCIClear.setOnMousePressed(event -> btnCIClear.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnCIClear.setOnMouseExited(event -> btnCIClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnCIClear.setLayoutX(650);
        btnCIClear.setLayoutY(150);


        //Mortgage Calculator
        Label lblMortgageCal = new Label("Mortgage Calculator");
        lblMortgageCal.setStyle("-fx-background-color: #95FAB3; -fx-font-family: verdana; -fx-font-size: 18px; -fx-text-fill: black; -fx-alignment: center;");
        lblMortgageCal.setMinSize(800,30);
        lblMortgageCal.setLayoutY(20);

        Label lblHomePrice = new Label("Home Price:");
        lblHomePrice.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblHomePrice.setLayoutX(50);
        lblHomePrice.setLayoutY(80);
        TextField tfHomePrice = new TextField();
        tfHomePrice.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfHomePrice.setPromptText("$");
        tfHomePrice.setLayoutX(300);
        tfHomePrice.setLayoutY(75);
        tfHomePrice.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfHomePrice.setText(txtInput.getText());
            }
        });
        Label lblDownPayment = new Label("Down Payment:");
        lblDownPayment.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblDownPayment.setLayoutX(50);
        lblDownPayment.setLayoutY(120);
        TextField tfDownPayment = new TextField();
        tfDownPayment.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfDownPayment.setPromptText("$");
        tfDownPayment.setLayoutX(300);
        tfDownPayment.setLayoutY(115);
        tfDownPayment.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfDownPayment.setText(txtInput.getText());
            }
        });
        Label lblLoanTerm = new Label("Loan Term:");
        lblLoanTerm.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblLoanTerm.setLayoutX(50);
        lblLoanTerm.setLayoutY(160);
        TextField tfLoanTerm = new TextField();
        tfLoanTerm.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfLoanTerm.setPromptText("years");
        tfLoanTerm.setLayoutX(300);
        tfLoanTerm.setLayoutY(155);
        tfLoanTerm.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfLoanTerm.setText(txtInput.getText());
            }
        });
        Label lblInterestRate = new Label("Interest Rate:");
        lblInterestRate.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblInterestRate.setLayoutX(50);
        lblInterestRate.setLayoutY(200);
        TextField tfInterestRate = new TextField();
        tfInterestRate.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfInterestRate.setPromptText("%");
        tfInterestRate.setLayoutX(300);
        tfInterestRate.setLayoutY(195);
        tfInterestRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfInterestRate.setText(txtInput.getText());
            }
        });

        Label lblMonthlyPayTag = new Label("         Monthly Pay");
        lblMonthlyPayTag.setStyle("-fx-background-color: #3CB024; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: white;");
        lblMonthlyPayTag.setMinSize(800,25);
        lblMonthlyPayTag.setLayoutY(300);
        lblMonthlyPayTag.setLayoutX(0);
        Label lblMonthlyPayTag2 = new Label();
        lblMonthlyPayTag2.setStyle("-fx-text-fill: #FFEB6D; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblMonthlyPayTag2.setMinSize(200,25);
        lblMonthlyPayTag2.setLayoutY(300);
        lblMonthlyPayTag2.setLayoutX(320);
        Label lblHousePriceTag = new Label("House Price");
        lblHousePriceTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblHousePriceTag.setLayoutY(330);
        lblHousePriceTag.setLayoutX(50);
        Label lblHousePriceTag2 = new Label();
        lblHousePriceTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblHousePriceTag2.setMinSize(200,25);
        lblHousePriceTag2.setLayoutY(330);
        lblHousePriceTag2.setLayoutX(320);
        Label lblDownPaymentTag = new Label("Down Payment");
        lblDownPaymentTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblDownPaymentTag.setLayoutY(390);
        lblDownPaymentTag.setLayoutX(50);
        Label lblDownPaymentTag2 = new Label();
        lblDownPaymentTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblDownPaymentTag2.setMinSize(200,25);
        lblDownPaymentTag2.setLayoutY(390);
        lblDownPaymentTag2.setLayoutX(320);
        Label lblLoanAmountTag = new Label("Loan Amount");
        lblLoanAmountTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblLoanAmountTag.setLayoutY(360);
        lblLoanAmountTag.setLayoutX(50);
        Label lblLoanAmountTag2 = new Label();
        lblLoanAmountTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblLoanAmountTag2.setMinSize(200,25);
        lblLoanAmountTag2.setLayoutY(360);
        lblLoanAmountTag2.setLayoutX(320);
        Label lblTotalMortgagePaymentTag = new Label("Total of Mortgage Payments");
        lblTotalMortgagePaymentTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblTotalMortgagePaymentTag.setLayoutY(420);
        lblTotalMortgagePaymentTag.setLayoutX(50);
        Label lblTotalMortgagePaymentTag2 = new Label();
        lblTotalMortgagePaymentTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblTotalMortgagePaymentTag2.setMinSize(200,25);
        lblTotalMortgagePaymentTag2.setLayoutY(420);
        lblTotalMortgagePaymentTag2.setLayoutX(320);
        Label lblTotalInterestTag = new Label("Total Interest");
        lblTotalInterestTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblTotalInterestTag.setLayoutY(450);
        lblTotalInterestTag.setLayoutX(50);
        Label lblTotalInterestTag2 = new Label();
        lblTotalInterestTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblTotalInterestTag2.setMinSize(200,25);
        lblTotalInterestTag2.setLayoutY(450);
        lblTotalInterestTag2.setLayoutX(320);

        Button calculate = new Button("Calculate");
        calculate.setMinSize(100, 35);
        calculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        calculate.setOnMouseEntered(event -> calculate.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        calculate.setOnMousePressed(event -> calculate.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        calculate.setOnMouseExited(event -> calculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        calculate.setLayoutX(650);
        calculate.setLayoutY(100);

        Button clearMain = new Button("Clear");
        clearMain.setMinSize(100, 35);
        clearMain.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        clearMain.setOnMouseEntered(event -> clearMain.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        clearMain.setOnMousePressed(event -> clearMain.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        clearMain.setOnMouseExited(event -> clearMain.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        clearMain.setLayoutX(650);
        clearMain.setLayoutY(150);

        //Finance Calculator - FV
        Label lblFutureValue = new Label("Future Value");
        lblFutureValue.setStyle("-fx-background-color: #95FAB3; -fx-font-family: verdana; -fx-font-size: 18px; -fx-text-fill: black; -fx-alignment: center;");
        lblFutureValue.setMinSize(800,30);
        lblFutureValue.setLayoutY(20);

        Label lblFvNoOfPeriods = new Label("N(# of Periods):");
        lblFvNoOfPeriods.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblFvNoOfPeriods.setLayoutX(50);
        lblFvNoOfPeriods.setLayoutY(80);
        TextField tfFvNoOfPeriods = new TextField();
        tfFvNoOfPeriods.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfFvNoOfPeriods.setLayoutX(300);
        tfFvNoOfPeriods.setLayoutY(75);
        tfFvNoOfPeriods.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfFvNoOfPeriods.setText(txtInput.getText());
            }
        });
        Label lblFvStartPrincipal = new Label("Start Principal:");
        lblFvStartPrincipal.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblFvStartPrincipal.setLayoutX(50);
        lblFvStartPrincipal.setLayoutY(120);
        TextField tfFvStartPrincipal = new TextField();
        tfFvStartPrincipal.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfFvStartPrincipal.setPromptText("$");
        tfFvStartPrincipal.setLayoutX(300);
        tfFvStartPrincipal.setLayoutY(115);
        tfFvStartPrincipal.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfFvStartPrincipal.setText(txtInput.getText());
            }
        });
        Label lblFvIYInterest = new Label("I/Y (Interest):");
        lblFvIYInterest.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblFvIYInterest.setLayoutX(50);
        lblFvIYInterest.setLayoutY(160);
        TextField tfFvIYInterest = new TextField();
        tfFvIYInterest.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfFvIYInterest.setPromptText("%");
        tfFvIYInterest.setLayoutX(300);
        tfFvIYInterest.setLayoutY(155);
        tfFvIYInterest.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfFvIYInterest.setText(txtInput.getText());
            }
        });
        Label lblFvPMTAnnuityPay = new Label("PMT (Annuity Payment):");
        lblFvPMTAnnuityPay.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblFvPMTAnnuityPay.setLayoutX(50);
        lblFvPMTAnnuityPay.setLayoutY(200);
        TextField tfFvPMTAnnuityPay = new TextField();
        tfFvPMTAnnuityPay.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfFvPMTAnnuityPay.setPromptText("$");
        tfFvPMTAnnuityPay.setLayoutX(300);
        tfFvPMTAnnuityPay.setLayoutY(195);

        Label lblFvResultsTag = new Label("         Results");
        lblFvResultsTag.setStyle("-fx-background-color: #3CB024; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: white;");
        lblFvResultsTag.setMinSize(800,25);
        lblFvResultsTag.setLayoutY(300);
        Label lblFvFutureValueTag = new Label("FV (Future Value)");
        lblFvFutureValueTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblFvFutureValueTag.setLayoutY(330);
        lblFvFutureValueTag.setLayoutX(50);
        Label lblFvFutureValueTag2 = new Label();
        lblFvFutureValueTag2.setStyle("-fx-text-fill: #FFEB6D; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblFvFutureValueTag2.setLayoutY(330);
        lblFvFutureValueTag2.setLayoutX(300);
        Label lblFvPvTag = new Label("PV (Present Value)");
        lblFvPvTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblFvPvTag.setLayoutY(360);
        lblFvPvTag.setLayoutX(50);
        Label lblFvPvTag2 = new Label();
        lblFvPvTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblFvPvTag2.setLayoutY(360);
        lblFvPvTag2.setLayoutX(300);
        Label lblFvNTag = new Label("N (Number of Periods)");
        lblFvNTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblFvNTag.setLayoutY(390);
        lblFvNTag.setLayoutX(50);
        Label lblFvNTag2 = new Label();
        lblFvNTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblFvNTag2.setLayoutY(390);
        lblFvNTag2.setLayoutX(300);
        Label lblFvIyTag = new Label("I/Y (Interest Rate)");
        lblFvIyTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblFvIyTag.setLayoutY(420);
        lblFvIyTag.setLayoutX(50);
        Label lblFvIyTag2 = new Label();
        lblFvIyTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblFvIyTag2.setLayoutY(420);
        lblFvIyTag2.setLayoutX(300);
        Label lblFvPmtTag = new Label("PMT (Periodic Payment)");
        lblFvPmtTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblFvPmtTag.setLayoutY(450);
        lblFvPmtTag.setLayoutX(50);
        Label lblFvPmtTag2 = new Label();
        lblFvPmtTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblFvPmtTag2.setLayoutY(450);
        lblFvPmtTag2.setLayoutX(300);
        Label lblFvStartingPayTag = new Label("Starting Investment");
        lblFvStartingPayTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblFvStartingPayTag.setLayoutY(480);
        lblFvStartingPayTag.setLayoutX(50);
        Label lblFvStartingPayTag2 = new Label();
        lblFvStartingPayTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblFvStartingPayTag2.setLayoutY(480);
        lblFvStartingPayTag2.setLayoutX(300);
        Label lblFvTotalPrincipalTag = new Label("Total Principal");
        lblFvTotalPrincipalTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblFvTotalPrincipalTag.setLayoutY(510);
        lblFvTotalPrincipalTag.setLayoutX(50);
        Label lblFvTotalPrincipalTag2 = new Label();
        lblFvTotalPrincipalTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblFvTotalPrincipalTag2.setLayoutY(510);
        lblFvTotalPrincipalTag2.setLayoutX(300);
        Label lblFvTotalInterestTag = new Label("Total Interest");
        lblFvTotalInterestTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblFvTotalInterestTag.setLayoutY(540);
        lblFvTotalInterestTag.setLayoutX(50);
        Label lblFvTotalInterestTag2 = new Label();
        lblFvTotalInterestTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblFvTotalInterestTag2.setLayoutY(540);
        lblFvTotalInterestTag2.setLayoutX(300);


        Button btnFvCalculate = new Button("Calculate");
        btnFvCalculate.setMinSize(100, 35);
        btnFvCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnFvCalculate.setOnMouseEntered(event -> btnFvCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnFvCalculate.setOnMousePressed(event -> btnFvCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnFvCalculate.setOnMouseExited(event -> btnFvCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnFvCalculate.setLayoutX(650);
        btnFvCalculate.setLayoutY(100);

        Button btnFvClear = new Button("Clear");
        btnFvClear.setMinSize(100, 35);
        btnFvClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnFvClear.setOnMouseEntered(event -> btnFvClear.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnFvClear.setOnMousePressed(event -> btnFvClear.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnFvClear.setOnMouseExited(event -> btnFvClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnFvClear.setLayoutX(650);
        btnFvClear.setLayoutY(150);

        //Finance Calculator - PMT
        Label lblAnnuityPayment = new Label("Annuity Payment (PMT)");
        lblAnnuityPayment.setStyle("-fx-background-color: #95FAB3; -fx-font-family: verdana; -fx-font-size: 18px; -fx-text-fill: black; -fx-alignment: center;");
        lblAnnuityPayment.setMinSize(800,30);
        lblAnnuityPayment.setLayoutY(20);

        Label lblPMTFv = new Label("FV (Future Value):");
        lblPMTFv.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblPMTFv.setLayoutX(50);
        lblPMTFv.setLayoutY(80);
        TextField tfPMTFv = new TextField();
        tfPMTFv.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfPMTFv.setPromptText("$");
        tfPMTFv.setLayoutX(300);
        tfPMTFv.setLayoutY(75);
        tfPMTFv.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfPMTFv.setText(txtInput.getText());
            }
        });
        Label lblPmtNoOfPeriods = new Label("N(# of Periods):");
        lblPmtNoOfPeriods.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblPmtNoOfPeriods.setLayoutX(50);
        lblPmtNoOfPeriods.setLayoutY(120);
        TextField tfPmtNoOfPeriods = new TextField();
        tfPmtNoOfPeriods.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfPmtNoOfPeriods.setLayoutX(300);
        tfPmtNoOfPeriods.setLayoutY(115);
        tfPmtNoOfPeriods.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfPmtNoOfPeriods.setText(txtInput.getText());
            }
        });
        Label lblPmtStartPrincipal = new Label("Start Principal:");
        lblPmtStartPrincipal.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblPmtStartPrincipal.setLayoutX(50);
        lblPmtStartPrincipal.setLayoutY(160);
        TextField tfPmtStartPrincipal = new TextField();
        tfPmtStartPrincipal.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfPmtStartPrincipal.setPromptText("$");
        tfPmtStartPrincipal.setLayoutX(300);
        tfPmtStartPrincipal.setLayoutY(155);
        tfPmtStartPrincipal.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfPmtStartPrincipal.setText(txtInput.getText());
            }
        });
        Label lblPmtIYInterest = new Label("I/Y (Interest):");
        lblPmtIYInterest.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblPmtIYInterest.setLayoutX(50);
        lblPmtIYInterest.setLayoutY(200);
        TextField tfPmtIYInterest = new TextField();
        tfPmtIYInterest.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfPmtIYInterest.setPromptText("%");
        tfPmtIYInterest.setLayoutX(300);
        tfPmtIYInterest.setLayoutY(195);

        Label lblPmtResultsTag = new Label("         Results");
        lblPmtResultsTag.setStyle("-fx-background-color: #3CB024; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: white;");
        lblPmtResultsTag.setMinSize(800,25);
        lblPmtResultsTag.setLayoutY(300);
        Label lblPmtFutureValueTag = new Label("FV (Future Value)");
        lblPmtFutureValueTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblPmtFutureValueTag.setLayoutY(330);
        lblPmtFutureValueTag.setLayoutX(50);
        Label lblPmtFutureValueTag2 = new Label();
        lblPmtFutureValueTag2.setStyle("-fx-text-fill: #FFEB6D; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblPmtFutureValueTag2.setLayoutY(330);
        lblPmtFutureValueTag2.setLayoutX(300);
        Label lblPmtPvTag = new Label("PV (Present Value)");
        lblPmtPvTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblPmtPvTag.setLayoutY(360);
        lblPmtPvTag.setLayoutX(50);
        Label lblPmtPvTag2 = new Label();
        lblPmtPvTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblPmtPvTag2.setLayoutY(360);
        lblPmtPvTag2.setLayoutX(300);
        Label lblPmtNTag = new Label("N (Number of Periods)");
        lblPmtNTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblPmtNTag.setLayoutY(390);
        lblPmtNTag.setLayoutX(50);
        Label lblPmtNTag2 = new Label();
        lblPmtNTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblPmtNTag2.setLayoutY(390);
        lblPmtNTag2.setLayoutX(300);
        Label lblPmtIyTag = new Label("I/Y (Interest Rate)");
        lblPmtIyTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblPmtIyTag.setLayoutY(420);
        lblPmtIyTag.setLayoutX(50);
        Label lblPmtIyTag2 = new Label();
        lblPmtIyTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblPmtIyTag2.setLayoutY(420);
        lblPmtIyTag2.setLayoutX(300);
        Label lblPmtPmtTag = new Label("PMT (Periodic Payment)");
        lblPmtPmtTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblPmtPmtTag.setLayoutY(450);
        lblPmtPmtTag.setLayoutX(50);
        Label lblPmtPmtTag2 = new Label();
        lblPmtPmtTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblPmtPmtTag2.setLayoutY(450);
        lblPmtPmtTag2.setLayoutX(300);
        Label lblPmtStartingPayTag = new Label("Starting Investment");
        lblPmtStartingPayTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblPmtStartingPayTag.setLayoutY(480);
        lblPmtStartingPayTag.setLayoutX(50);
        Label lblPmtStartingPayTag2 = new Label();
        lblPmtStartingPayTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblPmtStartingPayTag2.setLayoutY(480);
        lblPmtStartingPayTag2.setLayoutX(300);
        Label lblPmtTotalPrincipalTag = new Label("Total Principal");
        lblPmtTotalPrincipalTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblPmtTotalPrincipalTag.setLayoutY(510);
        lblPmtTotalPrincipalTag.setLayoutX(50);
        Label lblPmtTotalPrincipalTag2 = new Label();
        lblPmtTotalPrincipalTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblPmtTotalPrincipalTag2.setLayoutY(510);
        lblPmtTotalPrincipalTag2.setLayoutX(300);
        Label lblPmtTotalInterestTag = new Label("Total Interest");
        lblPmtTotalInterestTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblPmtTotalInterestTag.setLayoutY(540);
        lblPmtTotalInterestTag.setLayoutX(50);
        Label lblPmtTotalInterestTag2 = new Label();
        lblPmtTotalInterestTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblPmtTotalInterestTag2.setLayoutY(540);
        lblPmtTotalInterestTag2.setLayoutX(300);


        Button btnPmtCalculate = new Button("Calculate");
        btnPmtCalculate.setMinSize(100, 35);
        btnPmtCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnPmtCalculate.setOnMouseEntered(event -> btnPmtCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnPmtCalculate.setOnMousePressed(event -> btnPmtCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnPmtCalculate.setOnMouseExited(event -> btnPmtCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnPmtCalculate.setLayoutX(650);
        btnPmtCalculate.setLayoutY(100);

        Button btnPmtClear = new Button("Clear");
        btnPmtClear.setMinSize(100, 35);
        btnPmtClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnPmtClear.setOnMouseEntered(event -> btnPmtClear.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnPmtClear.setOnMousePressed(event -> btnPmtClear.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnPmtClear.setOnMouseExited(event -> btnPmtClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnPmtClear.setLayoutX(650);
        btnPmtClear.setLayoutY(150);

        //Finance Calculator - I/Y
        Label lblInterestRateMain = new Label("Interest Rate");
        lblInterestRateMain.setStyle("-fx-background-color: #95FAB3; -fx-font-family: verdana; -fx-font-size: 18px; -fx-text-fill: black; -fx-alignment: center;");
        lblInterestRateMain.setMinSize(800,30);
        lblInterestRateMain.setLayoutY(20);

        Label lblIYFv = new Label("FV (Future Value):");
        lblIYFv.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblIYFv.setLayoutX(50);
        lblIYFv.setLayoutY(80);
        TextField tfIYFv = new TextField();
        tfIYFv.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfIYFv.setPromptText("$");
        tfIYFv.setLayoutX(300);
        tfIYFv.setLayoutY(75);
        tfIYFv.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfIYFv.setText(txtInput.getText());
            }
        });
        Label lblIYNoOfPeriods = new Label("N(# of Periods):");
        lblIYNoOfPeriods.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblIYNoOfPeriods.setLayoutX(50);
        lblIYNoOfPeriods.setLayoutY(120);
        TextField tfIYNoOfPeriods = new TextField();
        tfIYNoOfPeriods.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfIYNoOfPeriods.setLayoutX(300);
        tfIYNoOfPeriods.setLayoutY(115);
        tfIYNoOfPeriods.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfIYNoOfPeriods.setText(txtInput.getText());
            }
        });
        Label lblIYStartPrincipal = new Label("Start Principal:");
        lblIYStartPrincipal.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblIYStartPrincipal.setLayoutX(50);
        lblIYStartPrincipal.setLayoutY(160);
        TextField tfIYStartPrincipal = new TextField();
        tfIYStartPrincipal.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfIYStartPrincipal.setPromptText("$");
        tfIYStartPrincipal.setLayoutX(300);
        tfIYStartPrincipal.setLayoutY(155);
        tfIYStartPrincipal.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfIYStartPrincipal.setText(txtInput.getText());
            }
        });
        Label lblIYPmt = new Label("PMT (Annuity Payment):");
        lblIYPmt.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblIYPmt.setLayoutX(50);
        lblIYPmt.setLayoutY(200);
        TextField tfIYPmt = new TextField();
        tfIYPmt.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfIYPmt.setPromptText("$");
        tfIYPmt.setLayoutX(300);
        tfIYPmt.setLayoutY(195);
        tfIYPmt.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfIYPmt.setText(txtInput.getText());
            }
        });

        Label lblIYResultsTag = new Label("         Results");
        lblIYResultsTag.setStyle("-fx-background-color: #3CB024; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: white;");
        lblIYResultsTag.setMinSize(800,25);
        lblIYResultsTag.setLayoutY(300);
        Label lblIYFutureValueTag = new Label("FV (Future Value)");
        lblIYFutureValueTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblIYFutureValueTag.setLayoutY(330);
        lblIYFutureValueTag.setLayoutX(50);
        Label lblIYFutureValueTag2 = new Label();
        lblIYFutureValueTag2.setStyle("-fx-text-fill: #FFEB6D; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblIYFutureValueTag2.setLayoutY(330);
        lblIYFutureValueTag2.setLayoutX(300);
        Label lblIYPvTag = new Label("PV (Present Value)");
        lblIYPvTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblIYPvTag.setLayoutY(360);
        lblIYPvTag.setLayoutX(50);
        Label lblIYPvTag2 = new Label();
        lblIYPvTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblIYPvTag2.setLayoutY(360);
        lblIYPvTag2.setLayoutX(300);
        Label lblIYNTag = new Label("N (Number of Periods)");
        lblIYNTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblIYNTag.setLayoutY(390);
        lblIYNTag.setLayoutX(50);
        Label lblIYNTag2 = new Label();
        lblIYNTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblIYNTag2.setLayoutY(390);
        lblIYNTag2.setLayoutX(300);
        Label lblIYIyTag = new Label("I/Y (Interest Rate)");
        lblIYIyTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblIYIyTag.setLayoutY(420);
        lblIYIyTag.setLayoutX(50);
        Label lblIYIyTag2 = new Label();
        lblIYIyTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblIYIyTag2.setLayoutY(420);
        lblIYIyTag2.setLayoutX(300);
        Label lblIYPmtTag = new Label("PMT (Periodic Payment)");
        lblIYPmtTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblIYPmtTag.setLayoutY(450);
        lblIYPmtTag.setLayoutX(50);
        Label lblIYPmtTag2 = new Label();
        lblIYPmtTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblIYPmtTag2.setLayoutY(450);
        lblIYPmtTag2.setLayoutX(300);
        Label lblIYStartingPayTag = new Label("Starting Investment");
        lblIYStartingPayTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblIYStartingPayTag.setLayoutY(480);
        lblIYStartingPayTag.setLayoutX(50);
        Label lblIYStartingPayTag2 = new Label();
        lblIYStartingPayTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblIYStartingPayTag2.setLayoutY(480);
        lblIYStartingPayTag2.setLayoutX(300);
        Label lblIYTotalPrincipalTag = new Label("Total Principal");
        lblIYTotalPrincipalTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblIYTotalPrincipalTag.setLayoutY(510);
        lblIYTotalPrincipalTag.setLayoutX(50);
        Label lblIYTotalPrincipalTag2 = new Label();
        lblIYTotalPrincipalTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblIYTotalPrincipalTag2.setLayoutY(510);
        lblIYTotalPrincipalTag2.setLayoutX(300);
        Label lblIYTotalInterestTag = new Label("Total Interest");
        lblIYTotalInterestTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblIYTotalInterestTag.setLayoutY(540);
        lblIYTotalInterestTag.setLayoutX(50);
        Label lblIYTotalInterestTag2 = new Label();
        lblIYTotalInterestTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblIYTotalInterestTag2.setLayoutY(540);
        lblIYTotalInterestTag2.setLayoutX(300);


        Button btnIYCalculate = new Button("Calculate");
        btnIYCalculate.setMinSize(100, 35);
        btnIYCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnIYCalculate.setOnMouseEntered(event -> btnIYCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnIYCalculate.setOnMousePressed(event -> btnIYCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnIYCalculate.setOnMouseExited(event -> btnIYCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnIYCalculate.setLayoutX(650);
        btnIYCalculate.setLayoutY(100);

        Button btnIYClear = new Button("Clear");
        btnIYClear.setMinSize(100, 35);
        btnIYClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnIYClear.setOnMouseEntered(event -> btnIYClear.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnIYClear.setOnMousePressed(event -> btnIYClear.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnIYClear.setOnMouseExited(event -> btnIYClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnIYClear.setLayoutX(650);
        btnIYClear.setLayoutY(150);

        //Finance Calculator - N
        Label lblNumberOfPeriods = new Label("Number Of Periods");
        lblNumberOfPeriods.setStyle("-fx-background-color: #95FAB3; -fx-font-family: verdana; -fx-font-size: 18px; -fx-text-fill: black; -fx-alignment: center;");
        lblNumberOfPeriods.setMinSize(800,30);
        lblNumberOfPeriods.setLayoutY(20);

        Label lblNFv = new Label("FV (Future Value):");
        lblNFv.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblNFv.setLayoutX(50);
        lblNFv.setLayoutY(80);
        TextField tfNFv = new TextField();
        tfNFv.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfNFv.setPromptText("$");
        tfNFv.setLayoutX(300);
        tfNFv.setLayoutY(75);
        tfNFv.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfNFv.setText(txtInput.getText());
            }
        });
        Label lblNStartPrincipal = new Label("Start Principal:");
        lblNStartPrincipal.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblNStartPrincipal.setLayoutX(50);
        lblNStartPrincipal.setLayoutY(120);
        TextField tfNStartPrincipal = new TextField();
        tfNStartPrincipal.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfNStartPrincipal.setPromptText("$");
        tfNStartPrincipal.setLayoutX(300);
        tfNStartPrincipal.setLayoutY(115);
        tfNStartPrincipal.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfNStartPrincipal.setText(txtInput.getText());
            }
        });
        Label lblNIYInterest = new Label("I/Y (Interest):");
        lblNIYInterest.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblNIYInterest.setLayoutX(50);
        lblNIYInterest.setLayoutY(160);
        TextField tfNIYInterest = new TextField();
        tfNIYInterest.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfNIYInterest.setPromptText("%");
        tfNIYInterest.setLayoutX(300);
        tfNIYInterest.setLayoutY(155);
        tfNIYInterest.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfNIYInterest.setText(txtInput.getText());
            }
        });
        Label lblNPMTAnnuityPay = new Label("PMT (Annuity Payment):");
        lblNPMTAnnuityPay.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 16px;");
        lblNPMTAnnuityPay.setLayoutX(50);
        lblNPMTAnnuityPay.setLayoutY(200);
        TextField tfNPMTAnnuityPay = new TextField();
        tfNPMTAnnuityPay.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfNPMTAnnuityPay.setPromptText("$");
        tfNPMTAnnuityPay.setLayoutX(300);
        tfNPMTAnnuityPay.setLayoutY(195);
        tfNPMTAnnuityPay.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfNPMTAnnuityPay.setText(txtInput.getText());
            }
        });

        Label lblNResultsTag = new Label("         Results");
        lblNResultsTag.setStyle("-fx-background-color: #3CB024; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: white;");
        lblNResultsTag.setMinSize(800,25);
        lblNResultsTag.setLayoutY(300);
        Label lblNFutureValueTag = new Label("FV (Future Value)");
        lblNFutureValueTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblNFutureValueTag.setLayoutY(330);
        lblNFutureValueTag.setLayoutX(50);
        Label lblNFutureValueTag2 = new Label();
        lblNFutureValueTag2.setStyle("-fx-text-fill: #FFEB6D; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblNFutureValueTag2.setLayoutY(330);
        lblNFutureValueTag2.setLayoutX(300);
        Label lblNPvTag = new Label("PV (Present Value)");
        lblNPvTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblNPvTag.setLayoutY(360);
        lblNPvTag.setLayoutX(50);
        Label lblNPvTag2 = new Label();
        lblNPvTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblNPvTag2.setLayoutY(360);
        lblNPvTag2.setLayoutX(300);
        Label lblNNTag = new Label("N (Number of Periods)");
        lblNNTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblNNTag.setLayoutY(390);
        lblNNTag.setLayoutX(50);
        Label lblNNTag2 = new Label();
        lblNNTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblNNTag2.setLayoutY(390);
        lblNNTag2.setLayoutX(300);
        Label lblNIyTag = new Label("I/Y (Interest Rate)");
        lblNIyTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblNIyTag.setLayoutY(420);
        lblNIyTag.setLayoutX(50);
        Label lblNIyTag2 = new Label();
        lblNIyTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblNIyTag2.setLayoutY(420);
        lblNIyTag2.setLayoutX(300);
        Label lblNPmtTag = new Label("PMT (Periodic Payment)");
        lblNPmtTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblNPmtTag.setLayoutY(450);
        lblNPmtTag.setLayoutX(50);
        Label lblNPmtTag2 = new Label();
        lblNPmtTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblNPmtTag2.setLayoutY(450);
        lblNPmtTag2.setLayoutX(300);
        Label lblNStartingPayTag = new Label("Starting Investment");
        lblNStartingPayTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblNStartingPayTag.setLayoutY(480);
        lblNStartingPayTag.setLayoutX(50);
        Label lblNStartingPayTag2 = new Label();
        lblNStartingPayTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblNStartingPayTag2.setLayoutY(480);
        lblNStartingPayTag2.setLayoutX(300);
        Label lblNTotalPrincipalTag = new Label("Total Principal");
        lblNTotalPrincipalTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblNTotalPrincipalTag.setLayoutY(510);
        lblNTotalPrincipalTag.setLayoutX(50);
        Label lblNTotalPrincipalTag2 = new Label();
        lblNTotalPrincipalTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblNTotalPrincipalTag2.setLayoutY(510);
        lblNTotalPrincipalTag2.setLayoutX(300);
        Label lblNTotalInterestTag = new Label("Total Interest");
        lblNTotalInterestTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblNTotalInterestTag.setLayoutY(540);
        lblNTotalInterestTag.setLayoutX(50);
        Label lblNTotalInterestTag2 = new Label();
        lblNTotalInterestTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblNTotalInterestTag2.setLayoutY(540);
        lblNTotalInterestTag2.setLayoutX(300);


        Button btnNCalculate = new Button("Calculate");
        btnNCalculate.setMinSize(100, 35);
        btnNCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnNCalculate.setOnMouseEntered(event -> btnNCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnNCalculate.setOnMousePressed(event -> btnNCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnNCalculate.setOnMouseExited(event -> btnNCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnNCalculate.setLayoutX(650);
        btnNCalculate.setLayoutY(100);

        Button btnNClear = new Button("Clear");
        btnNClear.setMinSize(100, 35);
        btnNClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        btnNClear.setOnMouseEntered(event -> btnNClear.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnNClear.setOnMousePressed(event -> btnNClear.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnNClear.setOnMouseExited(event -> btnNClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        btnNClear.setLayoutX(650);
        btnNClear.setLayoutY(150);


        //Auto Loan Calculator - Total Price
        Label lblTotalPrice = new Label("Total Price");
        lblTotalPrice.setStyle("-fx-background-color: #95FAB3; -fx-font-family: verdana; -fx-font-size: 18px; -fx-text-fill: black; -fx-alignment: center;");
        lblTotalPrice.setMinSize(800,30);
        lblTotalPrice.setLayoutY(10);

        Label lblAutoPrice = new Label("Auto Price:");
        lblAutoPrice.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblAutoPrice.setLayoutX(50);
        lblAutoPrice.setLayoutY(55);
        TextField tfAutoPrice = new TextField();
        tfAutoPrice.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfAutoPrice.setPromptText("$");
        tfAutoPrice.setLayoutX(350);
        tfAutoPrice.setLayoutY(50);
        tfAutoPrice.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfAutoPrice.setText(txtInput.getText());
            }
        });
        Label lblAutoLoanTerm = new Label("Loan Term:");
        lblAutoLoanTerm.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblAutoLoanTerm.setLayoutX(50);
        lblAutoLoanTerm.setLayoutY(95);
        TextField tfAutoLoanTerm = new TextField();
        tfAutoLoanTerm.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfAutoLoanTerm.setPromptText("months");
        tfAutoLoanTerm.setLayoutX(350);
        tfAutoLoanTerm.setLayoutY(90);
        tfAutoLoanTerm.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfAutoLoanTerm.setText(txtInput.getText());
            }
        });
        Label lblLoanInterestRate = new Label("Interest Rate:");
        lblLoanInterestRate.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblLoanInterestRate.setLayoutX(50);
        lblLoanInterestRate.setLayoutY(135);
        TextField tfLoanInterestRate = new TextField();
        tfLoanInterestRate.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfLoanInterestRate.setPromptText("%");
        tfLoanInterestRate.setLayoutX(350);
        tfLoanInterestRate.setLayoutY(130);
        tfLoanInterestRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfLoanInterestRate.setText(txtInput.getText());
            }
        });
        Label lblLoanDownPayment = new Label("Down Payment:");
        lblLoanDownPayment.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblLoanDownPayment.setLayoutX(50);
        lblLoanDownPayment.setLayoutY(175);
        TextField tfLoanDownPayment = new TextField();
        tfLoanDownPayment.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfLoanDownPayment.setPromptText("$");
        tfLoanDownPayment.setLayoutX(350);
        tfLoanDownPayment.setLayoutY(170);
        tfLoanDownPayment.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfLoanDownPayment.setText(txtInput.getText());
            }
        });
        Label lblSalesTax = new Label("Sales Tax:");
        lblSalesTax.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblSalesTax.setLayoutX(50);
        lblSalesTax.setLayoutY(215);
        TextField tfSalesTax = new TextField();
        tfSalesTax.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfSalesTax.setPromptText("%");
        tfSalesTax.setLayoutX(350);
        tfSalesTax.setLayoutY(210);
        tfSalesTax.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfSalesTax.setText(txtInput.getText());
            }
        });
        Label lblFee = new Label("Title, Registration and Other fees:");
        lblFee.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblFee.setLayoutX(50);
        lblFee.setLayoutY(255);
        TextField tfFee = new TextField();
        tfFee.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfFee.setPromptText("$");
        tfFee.setLayoutX(350);
        tfFee.setLayoutY(250);
        tfFee.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfFee.setText(txtInput.getText());
            }
        });

        Label lblMonthlyLoanPayTag = new Label("         Monthly Pay");
        lblMonthlyLoanPayTag.setStyle("-fx-background-color: #3CB024; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: white;");
        lblMonthlyLoanPayTag.setMinSize(800,25);
        lblMonthlyLoanPayTag.setLayoutY(320);
        Label lblMonthlyLoanPayTag2 = new Label();
        lblMonthlyLoanPayTag2.setStyle("-fx-text-fill: #FFEB6D; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblMonthlyLoanPayTag2.setMinSize(200,25);
        lblMonthlyLoanPayTag2.setLayoutY(320);
        lblMonthlyLoanPayTag2.setLayoutX(350);
        Label lblTotalLoanAmountTag = new Label("Total Loan Amount");
        lblTotalLoanAmountTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblTotalLoanAmountTag.setLayoutY(350);
        lblTotalLoanAmountTag.setLayoutX(50);
        Label lblTotalLoanAmountTag2 = new Label();
        lblTotalLoanAmountTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblTotalLoanAmountTag2.setMinSize(200,25);
        lblTotalLoanAmountTag2.setLayoutY(350);
        lblTotalLoanAmountTag2.setLayoutX(350);
        Label lblSaleTaxTag = new Label("Sales Tax");
        lblSaleTaxTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblSaleTaxTag.setLayoutY(380);
        lblSaleTaxTag.setLayoutX(50);
        Label lblSaleTaxTag2 = new Label();
        lblSaleTaxTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblSaleTaxTag2.setMinSize(200,25);
        lblSaleTaxTag2.setLayoutY(380);
        lblSaleTaxTag2.setLayoutX(350);
        Label lblUpfrontTag = new Label("Upfront Payment");
        lblUpfrontTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblUpfrontTag.setLayoutY(410);
        lblUpfrontTag.setLayoutX(50);
        Label lblUpfrontTag2 = new Label();
        lblUpfrontTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblUpfrontTag2.setMinSize(200,25);
        lblUpfrontTag2.setLayoutY(410);
        lblUpfrontTag2.setLayoutX(350);
        Label lblTotalLoanPayTag = new Label("Total of Loan Payment");
        lblTotalLoanPayTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblTotalLoanPayTag.setLayoutY(440);
        lblTotalLoanPayTag.setLayoutX(50);
        Label lblTotalLoanPayTag2 = new Label();
        lblTotalLoanPayTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblTotalLoanPayTag2.setMinSize(200,25);
        lblTotalLoanPayTag2.setLayoutY(440);
        lblTotalLoanPayTag2.setLayoutX(350);
        Label lblTotalLoanInterestTag = new Label("Total Loan Interest");
        lblTotalLoanInterestTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblTotalLoanInterestTag.setLayoutY(470);
        lblTotalLoanInterestTag.setLayoutX(50);
        Label lblTotalLoanInterestTag2 = new Label();
        lblTotalLoanInterestTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblTotalLoanInterestTag2.setMinSize(200,25);
        lblTotalLoanInterestTag2.setLayoutY(470);
        lblTotalLoanInterestTag2.setLayoutX(350);
        Label lblTotalLoanCostTag = new Label("Total Cost (price,interest,tax,fees)");
        lblTotalLoanCostTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblTotalLoanCostTag.setLayoutY(500);
        lblTotalLoanCostTag.setLayoutX(50);
        Label lblTotalLoanCostTag2 = new Label();
        lblTotalLoanCostTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblTotalLoanCostTag2.setMinSize(200,25);
        lblTotalLoanCostTag2.setLayoutY(500);
        lblTotalLoanCostTag2.setLayoutX(350);


        Button loanCalculate = new Button("Calculate");
        loanCalculate.setMinSize(100, 35);
        loanCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        loanCalculate.setOnMouseEntered(event -> loanCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanCalculate.setOnMousePressed(event -> loanCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanCalculate.setOnMouseExited(event -> loanCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanCalculate.setLayoutX(650);
        loanCalculate.setLayoutY(100);

        Button loanCalculatorClear = new Button("Clear");
        loanCalculatorClear.setMinSize(100, 35);
        loanCalculatorClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        loanCalculatorClear.setOnMouseEntered(event -> loanCalculatorClear.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanCalculatorClear.setOnMousePressed(event -> loanCalculatorClear.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanCalculatorClear.setOnMouseExited(event -> loanCalculatorClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanCalculatorClear.setLayoutX(650);
        loanCalculatorClear.setLayoutY(150);


        //Auto Loan Calculator - Monthly Payment
        Label lblMonthlyPayment = new Label("Monthly Payment");
        lblMonthlyPayment.setStyle("-fx-background-color: #95FAB3; -fx-font-family: verdana; -fx-font-size: 18px; -fx-text-fill: black; -fx-alignment: center;");
        lblMonthlyPayment.setMinSize(800,30);
        lblMonthlyPayment.setLayoutY(10);

        Label lblMonthlyPay = new Label("Monthly Pay:");
        lblMonthlyPay.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyPay.setLayoutX(50);
        lblMonthlyPay.setLayoutY(55);
        TextField tfMonthlyPay = new TextField();
        tfMonthlyPay.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfMonthlyPay.setPromptText("$");
        tfMonthlyPay.setLayoutX(350);
        tfMonthlyPay.setLayoutY(50);
        tfMonthlyPay.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfMonthlyPay.setText(txtInput.getText());
            }
        });
        Label lblMonthlyAutoLoanTerm = new Label("Loan Term:");
        lblMonthlyAutoLoanTerm.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyAutoLoanTerm.setLayoutX(50);
        lblMonthlyAutoLoanTerm.setLayoutY(95);
        TextField tfMonthlyAutoLoanTerm = new TextField();
        tfMonthlyAutoLoanTerm.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfMonthlyAutoLoanTerm.setPromptText("months");
        tfMonthlyAutoLoanTerm.setLayoutX(350);
        tfMonthlyAutoLoanTerm.setLayoutY(90);
        tfMonthlyAutoLoanTerm.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfMonthlyAutoLoanTerm.setText(txtInput.getText());
            }
        });
        Label lblMonthlyLoanInterestRate = new Label("Interest Rate:");
        lblMonthlyLoanInterestRate.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyLoanInterestRate.setLayoutX(50);
        lblMonthlyLoanInterestRate.setLayoutY(135);
        TextField tfMonthlyLoanInterestRate = new TextField();
        tfMonthlyLoanInterestRate.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfMonthlyLoanInterestRate.setPromptText("%");
        tfMonthlyLoanInterestRate.setLayoutX(350);
        tfMonthlyLoanInterestRate.setLayoutY(130);
        tfMonthlyLoanInterestRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfMonthlyLoanInterestRate.setText(txtInput.getText());
            }
        });
        Label lblMonthlyLoanDownPayment = new Label("Down Payment:");
        lblMonthlyLoanDownPayment.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyLoanDownPayment.setLayoutX(50);
        lblMonthlyLoanDownPayment.setLayoutY(175);
        TextField tfMonthlyLoanDownPayment = new TextField();
        tfMonthlyLoanDownPayment.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfMonthlyLoanDownPayment.setPromptText("$");
        tfMonthlyLoanDownPayment.setLayoutX(350);
        tfMonthlyLoanDownPayment.setLayoutY(170);
        tfMonthlyLoanDownPayment.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfMonthlyLoanDownPayment.setText(txtInput.getText());
            }
        });
        Label lblMonthlySalesTax = new Label("Sales Tax:");
        lblMonthlySalesTax.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlySalesTax.setLayoutX(50);
        lblMonthlySalesTax.setLayoutY(215);
        TextField tfMonthlySalesTax = new TextField();
        tfMonthlySalesTax.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfMonthlySalesTax.setPromptText("%");
        tfMonthlySalesTax.setLayoutX(350);
        tfMonthlySalesTax.setLayoutY(210);
        tfMonthlySalesTax.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfMonthlySalesTax.setText(txtInput.getText());
            }
        });
        Label lblMonthlyFee = new Label("Title, Registration and Other fees:");
        lblMonthlyFee.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyFee.setLayoutX(50);
        lblMonthlyFee.setLayoutY(255);
        TextField tfMonthlyFee = new TextField();
        tfMonthlyFee.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        tfMonthlyFee.setPromptText("$");
        tfMonthlyFee.setLayoutX(350);
        tfMonthlyFee.setLayoutY(250);
        tfMonthlyFee.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tfMonthlyFee.setText(txtInput.getText());
            }
        });

        Label lblMonthlyPayLoanPayTag = new Label("         Vehicle Price");
        lblMonthlyPayLoanPayTag.setStyle("-fx-background-color: #3CB024; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: white;");
        lblMonthlyPayLoanPayTag.setMinSize(800,25);
        lblMonthlyPayLoanPayTag.setLayoutY(320);
        Label lblMonthlyPayLoanPayTag2 = new Label();
        lblMonthlyPayLoanPayTag2.setStyle("-fx-text-fill: #FFEB6D; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblMonthlyPayLoanPayTag2.setMinSize(200,25);
        lblMonthlyPayLoanPayTag2.setLayoutY(320);
        lblMonthlyPayLoanPayTag2.setLayoutX(350);
        Label lblMonthlyTotalLoanAmountTag = new Label("Total Loan Amount");
        lblMonthlyTotalLoanAmountTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyTotalLoanAmountTag.setLayoutY(350);
        lblMonthlyTotalLoanAmountTag.setLayoutX(50);
        Label lblMonthlyTotalLoanAmountTag2 = new Label();
        lblMonthlyTotalLoanAmountTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblMonthlyTotalLoanAmountTag2.setMinSize(200,25);
        lblMonthlyTotalLoanAmountTag2.setLayoutY(350);
        lblMonthlyTotalLoanAmountTag2.setLayoutX(350);
        Label lblMonthlySaleTaxTag = new Label("Sales Tax");
        lblMonthlySaleTaxTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlySaleTaxTag.setLayoutY(380);
        lblMonthlySaleTaxTag.setLayoutX(50);
        Label lblMonthlySaleTaxTag2 = new Label();
        lblMonthlySaleTaxTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblMonthlySaleTaxTag2.setMinSize(200,25);
        lblMonthlySaleTaxTag2.setLayoutY(380);
        lblMonthlySaleTaxTag2.setLayoutX(350);
        Label lblMonthlyUpfrontTag = new Label("Upfront Payment");
        lblMonthlyUpfrontTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyUpfrontTag.setLayoutY(410);
        lblMonthlyUpfrontTag.setLayoutX(50);
        Label lblMonthlyUpfrontTag2 = new Label();
        lblMonthlyUpfrontTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblMonthlyUpfrontTag2.setMinSize(200,25);
        lblMonthlyUpfrontTag2.setLayoutY(410);
        lblMonthlyUpfrontTag2.setLayoutX(350);
        Label lblMonthlyTotalLoanPayTag = new Label("Total of Loan Payment");
        lblMonthlyTotalLoanPayTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyTotalLoanPayTag.setLayoutY(440);
        lblMonthlyTotalLoanPayTag.setLayoutX(50);
        Label lblMonthlyTotalLoanPayTag2 = new Label();
        lblMonthlyTotalLoanPayTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblMonthlyTotalLoanPayTag2.setMinSize(200,25);
        lblMonthlyTotalLoanPayTag2.setLayoutY(440);
        lblMonthlyTotalLoanPayTag2.setLayoutX(350);
        Label lblMonthlyTotalLoanInterestTag = new Label("Total Loan Interest");
        lblMonthlyTotalLoanInterestTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyTotalLoanInterestTag.setLayoutY(470);
        lblMonthlyTotalLoanInterestTag.setLayoutX(50);
        Label lblMonthlyTotalLoanInterestTag2 = new Label();
        lblMonthlyTotalLoanInterestTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblMonthlyTotalLoanInterestTag2.setMinSize(200,25);
        lblMonthlyTotalLoanInterestTag2.setLayoutY(470);
        lblMonthlyTotalLoanInterestTag2.setLayoutX(350);
        Label lblMonthlyTotalLoanCostTag = new Label("Total Cost (price,interest,tax,fees)");
        lblMonthlyTotalLoanCostTag.setStyle("-fx-text-fill: white; -fx-font-family: verdana; -fx-font-size: 15px;");
        lblMonthlyTotalLoanCostTag.setLayoutY(500);
        lblMonthlyTotalLoanCostTag.setLayoutX(50);
        Label lblMonthlyTotalLoanCostTag2 = new Label();
        lblMonthlyTotalLoanCostTag2.setStyle("-fx-text-fill: #93DCB5; -fx-font-family: verdana; -fx-font-size: 15px; -fx-font-weight: bold;");
        lblMonthlyTotalLoanCostTag2.setMinSize(200,25);
        lblMonthlyTotalLoanCostTag2.setLayoutY(500);
        lblMonthlyTotalLoanCostTag2.setLayoutX(350);


        Button loanMonthlyCalculate = new Button("Calculate");
        loanMonthlyCalculate.setMinSize(100, 35);
        loanMonthlyCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        loanMonthlyCalculate.setOnMouseEntered(event -> loanMonthlyCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanMonthlyCalculate.setOnMousePressed(event -> loanMonthlyCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanMonthlyCalculate.setOnMouseExited(event -> loanMonthlyCalculate.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanMonthlyCalculate.setLayoutX(650);
        loanMonthlyCalculate.setLayoutY(100);

        Button loanMonthlyCalculatorClear = new Button("Clear");
        loanMonthlyCalculatorClear.setMinSize(100, 35);
        loanMonthlyCalculatorClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;");
        loanMonthlyCalculatorClear.setOnMouseEntered(event -> loanMonthlyCalculatorClear.setStyle("-fx-background-radius: 20px; -fx-background-color: white; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanMonthlyCalculatorClear.setOnMousePressed(event -> loanMonthlyCalculatorClear.setStyle("-fx-background-radius: 20px; -fx-background-color: lime; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanMonthlyCalculatorClear.setOnMouseExited(event -> loanMonthlyCalculatorClear.setStyle("-fx-background-radius: 20px; -fx-background-color: cyan; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #00008B;"));
        loanMonthlyCalculatorClear.setLayoutX(650);
        loanMonthlyCalculatorClear.setLayoutY(150);

        //Keyboard layout
        Button help = new Button("Help❓");
        help.setMinSize(600,50);
        help.setStyle("-fx-background-radius: 0px; -fx-font-family: verdana; -fx-font-weight: bold; -fx-background-color: #1A0C46; -fx-text-fill: #C9159F;");
        help.setOnMouseEntered(event -> help.setStyle(" -fx-background-color: #000033; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #C9159F; -fx-font-weight: bold;"));
        help.setOnMousePressed(event -> help.setStyle("-fx-background-color: black; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: white; -fx-font-weight: bold;"));
        help.setOnMouseExited(event -> help.setStyle("-fx-background-radius: 0px; -fx-background-color: #1A0C46; -fx-font-family: verdana; -fx-font-size: 15px; -fx-text-fill: #C9159F; -fx-font-weight: bold;"));
        help.setLayoutY(127);
        help.setLayoutX(2.5);
        help.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                secondaryStage.show();
            }
        });


        txtInput = new TextField();
        txtInput.setStyle("-fx-background-radius: 10px; -fx-background-color: #95FAE3;");
        txtInput.setLayoutY(3);
        txtInput.setLayoutX(605);

        Button num0 = new Button("0");
        num0.setMinSize(40,25);
        num0.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num0.setOnMouseEntered(event -> num0.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num0.setOnMousePressed(event -> num0.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num0.setOnMouseExited(event -> num0.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num0.setLayoutY(145);
        num0.setLayoutX(653);
        num0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"0");
            }
        });
        Button num1 = new Button("1");
        num1.setMinSize(40,25);
        num1.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num1.setOnMouseEntered(event -> num1.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num1.setOnMousePressed(event -> num1.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num1.setOnMouseExited(event -> num1.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num1.setLayoutY(40);
        num1.setLayoutX(605);
        num1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"1");
            }
        });
        Button num2 = new Button("2");
        num2.setMinSize(40,25);
        num2.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num2.setOnMouseEntered(event -> num2.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num2.setOnMousePressed(event -> num2.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num2.setOnMouseExited(event -> num2.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num2.setLayoutY(40);
        num2.setLayoutX(653);
        num2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"2");
            }
        });
        Button num3 = new Button("3");
        num3.setMinSize(40,25);
        num3.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num3.setOnMouseEntered(event -> num3.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num3.setOnMousePressed(event -> num3.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num3.setOnMouseExited(event -> num3.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num3.setLayoutY(40);
        num3.setLayoutX(701);
        num3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"3");
            }
        });
        Button num4 = new Button("4");
        num4.setMinSize(40,25);
        num4.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num4.setOnMouseEntered(event -> num4.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num4.setOnMousePressed(event -> num4.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num4.setOnMouseExited(event -> num4.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num4.setLayoutY(75);
        num4.setLayoutX(605);
        num4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"4");
            }
        });
        Button num5 = new Button("5");
        num5.setMinSize(40,25);
        num5.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num5.setOnMouseEntered(event -> num5.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num5.setOnMousePressed(event -> num5.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num5.setOnMouseExited(event -> num5.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num5.setLayoutY(75);
        num5.setLayoutX(653);
        num5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"5");
            }
        });
        Button num6 = new Button("6");
        num6.setMinSize(40,25);
        num6.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num6.setOnMouseEntered(event -> num6.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num6.setOnMousePressed(event -> num6.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num6.setOnMouseExited(event -> num6.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num6.setLayoutY(75);
        num6.setLayoutX(701);
        num6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"6");
            }
        });
        Button num7 = new Button("7");
        num7.setMinSize(40,25);
        num7.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num7.setOnMouseEntered(event -> num7.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num7.setOnMousePressed(event -> num7.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num7.setOnMouseExited(event -> num7.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num7.setLayoutY(110);
        num7.setLayoutX(605);
        num7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"7");
            }
        });
        Button num8 = new Button("8");
        num8.setMinSize(40,25);
        num8.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num8.setOnMouseEntered(event -> num8.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num8.setOnMousePressed(event -> num8.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num8.setOnMouseExited(event -> num8.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num8.setLayoutY(110);
        num8.setLayoutX(653);
        num8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"8");
            }
        });
        Button num9 = new Button("9");
        num9.setMinSize(40,25);
        num9.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        num9.setOnMouseEntered(event -> num9.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num9.setOnMousePressed(event -> num9.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num9.setOnMouseExited(event -> num9.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        num9.setLayoutY(110);
        num9.setLayoutX(701);
        num9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"9");
            }
        });
        Button numEnt = new Button("⏎");
        numEnt.setMinSize(40,64);
        numEnt.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        numEnt.setOnMouseEntered(event -> numEnt.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        numEnt.setOnMousePressed(event -> numEnt.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        numEnt.setOnMouseExited(event -> numEnt.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        numEnt.setLayoutY(110);
        numEnt.setLayoutX(750);
        numEnt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText("");
            }
        });
        Button numDot = new Button(".");
        numDot.setMinSize(40,25);
        numDot.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        numDot.setOnMouseEntered(event -> numDot.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        numDot.setOnMousePressed(event -> numDot.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        numDot.setOnMouseExited(event -> numDot.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        numDot.setLayoutY(145);
        numDot.setLayoutX(701);
        numDot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+".");
            }
        });
        Button numCom = new Button("-");
        numCom.setMinSize(40,25);
        numCom.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        numCom.setOnMouseEntered(event -> numCom.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        numCom.setOnMousePressed(event -> numCom.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        numCom.setOnMouseExited(event -> numCom.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        numCom.setLayoutY(145);
        numCom.setLayoutX(605);
        numCom.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText(txtInput.getText()+"-");
            }
        });
        Button backSpace = new Button("⌫");
        backSpace.setMinSize(40,25);
        backSpace.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        backSpace.setOnMouseEntered(event -> backSpace.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        backSpace.setOnMousePressed(event -> backSpace.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        backSpace.setOnMouseExited(event -> backSpace.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        backSpace.setLayoutY(75);
        backSpace.setLayoutX(750);
        backSpace.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char[] text = txtInput.getText().toCharArray();
                String content = "";
                for (int i = 0; i < text.length - 1; i++) content += text[i];
                txtInput.setText(content);
            }
        });
        Button clear = new Button("C");
        clear.setMinSize(40,25);
        clear.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;");
        clear.setOnMouseEntered(event -> clear.setStyle("-fx-background-color: cyan; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        clear.setOnMousePressed(event -> clear.setStyle("-fx-background-color: blue; -fx-background-radius: 15px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        clear.setOnMouseExited(event -> clear.setStyle("-fx-background-color: lime; -fx-background-radius: 10px; -fx-font-family: verdana; -fx-font-size: 15px;"));
        clear.setLayoutY(40);
        clear.setLayoutX(750);
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtInput.setText("");
            }
        });

        //Calculations for the compound interest calculator
        btnCICalculate.setOnAction(event -> {
            double startPrincipal = Double.parseDouble(tfCIStartPrincipal.getText());
            double annualContribute = Double.parseDouble(tfCIAnnualContribute.getText());
            double interestRate = Double.parseDouble(tfCIInterestRate.getText())/100;
            double years = Double.parseDouble(tfCIYears.getText());
            double taxRate = Double.parseDouble(tfCITaxRate.getText())/100;
            double endBalance = startPrincipal;
            double interest = 0;
            double tax = 0;
            double totalInterest = 0;
            double totalTax = 0;
            double totalPrincipal = startPrincipal;

            for (int i = 0; i < years; i++){
                interest = endBalance*interestRate;
                tax = interest*taxRate;
                endBalance = (endBalance + annualContribute + interest) - tax;
                totalPrincipal = totalPrincipal + annualContribute;
                totalInterest = totalInterest + interest;
                totalTax = totalTax + tax;
            }

            lblCIEndBalanceTag2.setText("$"+ Math.round(endBalance*100.00)/100.00);
            lblCITotalPrincipalTag2.setText("$"+ Math.round(totalPrincipal*100.00)/100.00);
            lblCITotalInterestTag2.setText("$"+ Math.round(totalInterest*100.00)/100.00);
            lblCITotalTaxTag2.setText("$"+ Math.round(totalTax*100.00)/100.00);

        });
        btnCIClear.setOnAction(event -> {
            tfCIStartPrincipal.setText("");
            tfCIAnnualContribute.setText("");
            tfCIInterestRate.setText("");
            tfCIYears.setText("");
            tfCITaxRate.setText("");
            lblCIEndBalanceTag2.setText("");
            lblCITotalPrincipalTag2.setText("");
            lblCITotalInterestTag2.setText("");
            lblCITotalTaxTag2.setText("");

        });

        //Calculations for the mortgage calculator
        calculate.setOnAction(event -> {
            Double homePrice = Double.parseDouble(tfHomePrice.getText());
            Double downPayment = Double.parseDouble(tfDownPayment.getText());

            double loanTerm = Double.parseDouble(tfLoanTerm.getText());
            double interestRate = Double.parseDouble(tfInterestRate.getText());
            double loanAmount = homePrice-downPayment;
            double interest = interestRate/100/12;
            double numOfPeriods = loanTerm*12;

            double monPaymnt = (loanAmount*interest*(Math.pow((1+interest),numOfPeriods)))/(Math.pow((1+interest),numOfPeriods)-1);

            lblMonthlyPayTag2.setText("$ "+ Math.round(monPaymnt * 100.00) / 100.00);
            lblTotalMortgagePaymentTag.setText("Total of "+((int) (12 * loanTerm))+" Mortgage Payments");
            lblHousePriceTag2.setText("$ "+ homePrice);
            lblLoanAmountTag2.setText("$ "+ (homePrice - downPayment));
            lblDownPaymentTag2.setText("$ "+ downPayment);
            lblTotalMortgagePaymentTag2.setText("$ "+ Math.round((monPaymnt * numOfPeriods) * 100.0) / 100.0);
            lblTotalInterestTag2.setText("$ "+ Math.round(((monPaymnt * numOfPeriods) - loanAmount) * 100.0) / 100.0);

        });

        clearMain.setOnAction(event -> {
            tfHomePrice.setText("");
            tfDownPayment.setText("");
            tfLoanTerm.setText("");
            tfInterestRate.setText("");
            lblMonthlyPayTag2.setText("");
            lblTotalMortgagePaymentTag.setText("Total of Mortgage Payments");
            lblHousePriceTag2.setText("");
            lblLoanAmountTag2.setText("");
            lblDownPaymentTag2.setText("");
            lblTotalMortgagePaymentTag2.setText("");
            lblTotalInterestTag2.setText("");

        });
        //Calculations for FV cal in Finance
        btnFvCalculate.setOnAction(event -> {
            double numOfPeriodsFV = Double.parseDouble(tfFvNoOfPeriods.getText());
            double startPrincipalFV = Double.parseDouble(tfFvStartPrincipal.getText());
            double interestFV = Double.parseDouble(tfFvIYInterest.getText());
            double pmtAnnuityFV = Double.parseDouble(tfFvPMTAnnuityPay.getText());
            double endPrincipalFV = startPrincipalFV;
            double compInterestFV = 0;
            double totalInterestFV = 0;
            double startBalFV = startPrincipalFV;
            double endBalFV = 0;

            for (int i = 0; i < numOfPeriodsFV; i++){
                compInterestFV = (startBalFV)*interestFV/100;
                totalInterestFV = totalInterestFV + compInterestFV;
                startBalFV = startBalFV + compInterestFV + pmtAnnuityFV;
                endBalFV = startBalFV;
                endPrincipalFV = endPrincipalFV + pmtAnnuityFV;
            }
            double presentValueFV = endBalFV/Math.pow((1+interestFV/100),numOfPeriodsFV);

            lblFvFutureValueTag2.setText("$"+Math.round(endBalFV*100.0) / 100.0);
            lblFvPvTag2.setText("$"+Math.round(presentValueFV*100.0) / 100.0);
            lblFvNTag2.setText(String.valueOf(numOfPeriodsFV));
            lblFvIyTag2.setText(interestFV+"%");
            lblFvPmtTag2.setText("$"+pmtAnnuityFV);
            lblFvStartingPayTag2.setText("$"+startPrincipalFV);
            lblFvTotalPrincipalTag2.setText("$"+endPrincipalFV);
            lblFvTotalInterestTag2.setText(String.valueOf(Math.round(totalInterestFV*100.00)/100.00));
        });

        btnFvClear.setOnAction(event -> {

            tfFvNoOfPeriods.setText("");
            tfFvStartPrincipal.setText("");
            tfFvIYInterest.setText("");
            tfFvPMTAnnuityPay.setText("");
            lblFvFutureValueTag2.setText("");
            lblFvPvTag2.setText("");
            lblFvNTag2.setText("");
            lblFvIyTag2.setText("");
            lblFvPmtTag2.setText("");
            lblFvStartingPayTag2.setText("");
            lblFvTotalPrincipalTag2.setText("");
            lblFvTotalInterestTag2.setText("");
        });

        //Calculations for PMT cal in Finance
        btnPmtCalculate.setOnAction(event -> {
            double fvPmt = Double.parseDouble(tfPMTFv.getText());
            double n = Double.parseDouble(tfPmtNoOfPeriods.getText());
            double startPrincipal = Double.parseDouble(tfPmtStartPrincipal.getText());
            double r = Double.parseDouble(tfPmtIYInterest.getText())/100;
            double Pv = fvPmt/(Math.pow(1+r,n));
            double totalInterest = 0;
            double endPrinciple = startPrincipal;
            double pmt = Pv*r/(1-(1-r/n)/(Math.pow(1+r,n)));
            for (int i = 0; i < n; i++){
                double interest = startPrincipal*r;
                totalInterest = totalInterest + interest;
                startPrincipal = startPrincipal + interest + pmt;
                endPrinciple = endPrinciple + pmt;
            }
            lblPmtFutureValueTag2.setText("$"+ fvPmt);
            lblPmtPvTag2.setText("$"+ Math.round(Pv * 100.00) / 100.00);
            lblPmtNTag2.setText(String.valueOf(n));
            lblPmtIyTag2.setText(r*100 +"%");
            lblPmtPmtTag2.setText("$"+Math.round(pmt*100.00)/100.00);
            lblPmtStartingPayTag2.setText("$"+tfPmtStartPrincipal.getText());
            lblPmtTotalPrincipalTag2.setText("$"+ Math.round(endPrinciple * 100.00) / 100.00);
            lblPmtTotalInterestTag2.setText("$"+ Math.round(totalInterest * 100.00) / 100.00);
        });
        btnPmtClear.setOnAction(event -> {
            tfPMTFv.setText("");
            tfPmtNoOfPeriods.setText("");
            tfPmtIYInterest.setText("");
            tfPmtStartPrincipal.setText("");
            lblPmtFutureValueTag2.setText("");
            lblPmtPvTag2.setText("");
            lblPmtNTag2.setText("");
            lblPmtIyTag2.setText("");
            lblPmtPmtTag2.setText("");
            lblPmtStartingPayTag2.setText("");
            lblPmtTotalPrincipalTag2.setText("");
            lblPmtTotalInterestTag2.setText("");

        });

        //Calculations for I/Y cal in Finance
        btnIYCalculate.setOnAction(event -> {
            double Fv = Double.parseDouble(tfIYFv.getText());
            double n = Double.parseDouble(tfIYNoOfPeriods.getText());
            double r = 0;
            double startPrincipal = Double.parseDouble(tfIYStartPrincipal.getText());
            double startBalance = startPrincipal;
            double endPrincipal = startPrincipal;
            double Pv = startBalance;
            double interest = 0;
            double totalInterest = 0;
            double pmt = Double.parseDouble(tfIYPmt.getText());
            r = (Math.pow(Fv/Pv,(1/n)))-1;
            double iyRate = Math.round((r*100)*100.00)/100.00;

            for (int i = 0; i < n; i++){
                interest = startBalance*r;
                startBalance = startBalance + interest + pmt;
                endPrincipal = endPrincipal + pmt;
                totalInterest = totalInterest + interest;
            }
            lblIYFutureValueTag2.setText("$"+Fv);
            lblIYPvTag2.setText("$"+Pv);
            lblIYNTag2.setText(String.valueOf(n));
            lblIYIyTag2.setText(iyRate+"%");
            lblIYPmtTag2.setText("$"+pmt);
            lblIYStartingPayTag2.setText("$"+startPrincipal);
            lblIYTotalPrincipalTag2.setText("$"+endPrincipal);
            lblIYTotalInterestTag2.setText("$"+Math.round(totalInterest*100.00)/100.00);
        });
        btnIYClear.setOnAction(event -> {
            tfIYFv.setText("");
            tfIYNoOfPeriods.setText("");
            tfIYPmt.setText("");
            tfIYStartPrincipal.setText("");
            lblIYFutureValueTag2.setText("");
            lblIYPvTag2.setText("");
            lblIYNTag2.setText("");
            lblIYIyTag2.setText("");
            lblIYPmtTag2.setText("");
            lblIYStartingPayTag2.setText("");
            lblIYTotalPrincipalTag2.setText("");
            lblIYTotalInterestTag2.setText("");

        });
        //Calculations for N cal in Finance
        btnNCalculate.setOnAction(event -> {
            double futureVal = Double.parseDouble(tfNFv.getText());
            double startPrincipal = Double.parseDouble(tfNStartPrincipal.getText());
            double endPrincipal = Double.parseDouble(tfNStartPrincipal.getText());
            double startBalance = Double.parseDouble(tfNStartPrincipal.getText());
            double interestRate = Double.parseDouble(tfNIYInterest.getText())/100;
            double totalInterest = 0;
            double interest = 0;
            double pmt = Double.parseDouble(tfNPMTAnnuityPay.getText());
            double numOfPeriods = 0;

            do {
                interest = startBalance * interestRate;
                totalInterest = totalInterest + interest;
                startBalance = startBalance + interest + pmt;
                endPrincipal = endPrincipal + pmt;
                numOfPeriods++;
            } while (!((startBalance + interest + pmt) >= futureVal));
            totalInterest = totalInterest+(futureVal-startBalance);
            double presentVal = futureVal/(Math.pow(1+interestRate,numOfPeriods));
            lblNFutureValueTag2.setText("$"+futureVal);
            lblNPvTag2.setText("$"+Math.round(presentVal*100.00)/100.00);
            lblNNTag2.setText(String.valueOf(numOfPeriods+1));
            lblNIyTag2.setText((interestRate*100)+"%");
            lblNPmtTag2.setText("$"+pmt);
            lblNStartingPayTag2.setText("$"+startPrincipal);
            lblNTotalPrincipalTag2.setText("$"+endPrincipal);
            lblNTotalInterestTag2.setText("$"+Math.round(totalInterest*100.00)/100.00);

        });
        btnNClear.setOnAction(event -> {
            tfNFv.setText("");
            tfNIYInterest.setText("");
            tfNPMTAnnuityPay.setText("");
            tfNStartPrincipal.setText("");
            lblNFutureValueTag2.setText("");
            lblNPvTag2.setText("");
            lblNNTag2.setText("");
            lblNIyTag2.setText("");
            lblNPmtTag2.setText("");
            lblNStartingPayTag2.setText("");
            lblNTotalPrincipalTag2.setText("");
            lblNTotalInterestTag2.setText("");
        });

        //Calculations for Total Price cal in Auto Loans
        loanCalculate.setOnAction(event -> {

            double autoPrice = Double.parseDouble(tfAutoPrice.getText());
            double downPayment = Double.parseDouble(tfLoanDownPayment.getText());
            double loanAmount = autoPrice-downPayment;
            double rate = Double.parseDouble(tfLoanInterestRate.getText())/100;
            double loanTerm = Integer.parseInt(tfAutoLoanTerm.getText());
            double years = loanTerm/12;
            double salesTax = autoPrice*(Double.parseDouble(tfSalesTax.getText())/100);
            double title = Double.parseDouble(tfFee.getText());

            double monPay = (loanAmount*(rate/12))/(1-(Math.pow(1+rate/12,(-12*years))));
            double totalLoanPay = monPay*loanTerm;
            double totalInterest = totalLoanPay-loanAmount;
            double totalCost = autoPrice+totalInterest+salesTax+title;

            lblMonthlyLoanPayTag2.setText("$"+Math.round(monPay*100.00)/100.00);
            lblTotalLoanAmountTag2.setText("$"+loanAmount);
            lblSaleTaxTag2.setText("$"+Math.round(salesTax*100.00)/100.00);
            lblUpfrontTag2.setText("$"+(downPayment+title+Math.round(salesTax*100.00)/100.00));
            lblTotalLoanPayTag.setText("Total of "+ Math.round(loanTerm) +" Loan Payment");
            lblTotalLoanPayTag2.setText("$"+Math.round(totalLoanPay*100.00)/100.00);
            lblTotalLoanInterestTag2.setText("$"+Math.round(totalInterest*100.00)/100.00);
            lblTotalLoanCostTag2.setText("$"+Math.round(totalCost*100.00)/100.00);
        });
        loanCalculatorClear.setOnAction(event -> {
            tfAutoPrice.setText("");
            tfLoanDownPayment.setText("");
            tfLoanInterestRate.setText("");
            tfAutoLoanTerm.setText("");
            tfSalesTax.setText("");
            tfFee.setText("");
            lblMonthlyLoanPayTag2.setText("");
            lblTotalLoanAmountTag2.setText("");
            lblSaleTaxTag2.setText("");
            lblUpfrontTag2.setText("");
            lblTotalLoanPayTag.setText("Total of Loan Payment");
            lblTotalLoanPayTag2.setText("");
            lblTotalLoanInterestTag2.setText("");
            lblTotalLoanCostTag2.setText("");
        });

        //Calculations for Monthly Price cal in Auto Loans
        loanMonthlyCalculate.setOnAction(event -> {
            double autoPrice = 0;
            double downPayment = Double.parseDouble(tfMonthlyLoanDownPayment.getText());
            double interestRate = Double.parseDouble(tfMonthlyLoanInterestRate.getText())/100;
            double loanTerm = Double.parseDouble(tfMonthlyAutoLoanTerm.getText());
            double monPaymnt = Double.parseDouble(tfMonthlyPay.getText());
            double salesTaxRate = Double.parseDouble(tfMonthlySalesTax.getText());
            double fee = Double.parseDouble(tfMonthlyFee.getText());
            double term = 12;
            double year = loanTerm/12;

            double loanAmount = monPaymnt*(1-(Math.pow(1+interestRate/term,(-term*year))))/(interestRate/term);
            autoPrice = loanAmount + downPayment;
            double salesTax = autoPrice*salesTaxRate/100;

            lblMonthlyPayLoanPayTag2.setText("$"+Math.round(autoPrice*100.00)/100.00);
            lblMonthlyTotalLoanAmountTag2.setText("$"+Math.round(loanAmount*100.00)/100.00);
            lblMonthlySaleTaxTag2.setText("$"+Math.round(salesTax*100.00)/100.00);
            lblMonthlyUpfrontTag2.setText("$"+Math.round((downPayment+fee+salesTax)*100.00)/100.00);
            lblMonthlyTotalLoanPayTag.setText("Total of "+Math.round(loanTerm)+" Loan Payment");
            lblMonthlyTotalLoanPayTag2.setText("$"+monPaymnt*loanTerm);
            lblMonthlyTotalLoanInterestTag2.setText("$"+Math.round((monPaymnt*loanTerm-loanAmount)*100.00)/100.00);
            lblMonthlyTotalLoanCostTag2.setText("$"+Math.round((monPaymnt*loanTerm+downPayment+salesTax+fee)*100.00)/100.00);
        });
        loanMonthlyCalculatorClear.setOnAction(event -> {
            tfMonthlyAutoLoanTerm.setText("");
            tfMonthlyFee.setText("");
            tfMonthlyLoanDownPayment.setText("");
            tfMonthlyLoanInterestRate.setText("");
            tfMonthlyPay.setText("");
            tfMonthlySalesTax.setText("");
            lblMonthlyPayLoanPayTag2.setText("");
            lblMonthlyTotalLoanAmountTag2.setText("");
            lblMonthlySaleTaxTag2.setText("");
            lblMonthlyUpfrontTag2.setText("");
            lblMonthlyTotalLoanPayTag.setText("Total of Loan Payment");
            lblMonthlyTotalLoanPayTag2.setText("");
            lblMonthlyTotalLoanInterestTag2.setText("");
            lblMonthlyTotalLoanCostTag2.setText("");
        });

        //UI Layout
        //Main root pane
        Pane root = new Pane();
        //Compound Interest tab
        Pane comInterest = new Pane();
        //Mortgage pane.
        Pane mortgage = new Pane();
        //Finance Calculator
        Pane savings = new Pane();
        Pane fv = new Pane();
        Pane pmt = new Pane();
        Pane iy = new Pane();
        Pane N = new Pane();
        //Auto Loans
        Pane loans = new Pane();
        Pane totalPayment = new Pane();
        Pane monthlyPayment = new Pane();
        //Keyboard
        Pane keyBoard = new Pane();
        //Help
        Pane helpPane = new Pane();
        TextArea helptxt = new TextArea("\n                                           Financial Calculator\n" +
                "\n" +
                "What is this app?\n" +
                "\n" +
                "\tThis calculator that helps you to calculate your financial needs \nefficiently and accurately. This Calculator has 4 main calculators within.\n" +
                "\t•  Compound Interest Calculator\n" +
                "\t•  Mortgage Calculator\n" +
                "\t•  Finance Calculator\n" +
                "\t•  Auto Loan Calculator\n" +
                "\n" +
                "How to use this app?\n" +
                "\n" +
                "\tEnter your data to respective entries to calculate your need. \nEach calculator has its own finance category. \n" +
                "\n" +
                "How to use the keyboard?\n" +
                "\n" +
                "\tThe keyboard will append the user input to the text field in the \nkeyboard. Then you user should click on the entry to append the input. \nBy clicking the ‘Enter’ key on the keyboard to move on to the next input.\n");
        helptxt.setMinSize(500,600);
        helptxt.setEditable(false);

        TabPane layout = new TabPane();
        TabPane autoLoans = new TabPane();
        TabPane finance = new TabPane();
        layout.setTabMinWidth(150);
        autoLoans.setTabMinWidth(120);
        finance.setTabMinWidth(100);

        Tab tab1 = new Tab("Compound Interest");
        Tab tab2 = new Tab("Mortgage");
        Tab tab3 = new Tab("Finance");
        Tab tab4 = new Tab("Auto Loans");
        Tab tabTotalPrice = new Tab("Total Price");
        Tab tabMonthlyPayment = new Tab("Monthly Payment");
        Tab fV = new Tab("FV");
        Tab pMT = new Tab("PMT");
        Tab iY = new Tab("I/Y");
        Tab n = new Tab("N");

        root.getChildren().add(layout);
        loans.getChildren().add(autoLoans);
        savings.getChildren().add(finance);
        root.getChildren().add(keyBoard);
        root.setStyle("-fx-background-color: black;");

        layout.getTabs().add(tab1);
        layout.getTabs().add(tab2);
        layout.getTabs().add(tab3);
        layout.getTabs().add(tab4);
        autoLoans.getTabs().add(tabTotalPrice);
        autoLoans.getTabs().add(tabMonthlyPayment);
        finance.getTabs().add(fV);
        finance.getTabs().add(pMT);
        finance.getTabs().add(iY);
        finance.getTabs().add(n);


        tab1.setClosable(false);
        tab2.setClosable(false);
        tab3.setClosable(false);
        tab4.setClosable(false);
        tabTotalPrice.setClosable(false);
        tabMonthlyPayment.setClosable(false);
        fV.setClosable(false);
        pMT.setClosable(false);
        iY.setClosable(false);
        n.setClosable(false);

        tab1.setContent(comInterest);
        tab2.setContent(mortgage);
        tab3.setContent(savings);
        tab4.setContent(loans);
        tabTotalPrice.setContent(totalPayment);
        tabMonthlyPayment.setContent(monthlyPayment);
        fV.setContent(fv);
        pMT.setContent(pmt);
        iY.setContent(iy);
        n.setContent(N);

        comInterest.setMinSize(800,600);
        mortgage.setMinSize(800,600);
        savings.setMinSize(800,600);
        loans.setMinSize(800,600);
        totalPayment.setMinSize(800,600);
        monthlyPayment.setMinSize(800,520);
        fv.setMinSize(800,520);
        pmt.setMinSize(800,520);
        iy.setMinSize(800,520);
        N.setMinSize(800,520);
        keyBoard.setMinSize(800,180);
        keyBoard.setLayoutY(620);

        comInterest.getChildren().add(lblComIntCal);
        comInterest.getChildren().add(lblCIAnnualContribute);
        comInterest.getChildren().add(lblCIInterestRate);
        comInterest.getChildren().add(lblCITaxRate);
        comInterest.getChildren().add(lblCIStartPrincipal);
        comInterest.getChildren().add(lblCIYears);
        comInterest.getChildren().add(tfCIAnnualContribute);
        comInterest.getChildren().add(tfCIInterestRate);
        comInterest.getChildren().add(tfCITaxRate);
        comInterest.getChildren().add(tfCIStartPrincipal);
        comInterest.getChildren().add(tfCIYears);
        comInterest.getChildren().add(lblCIResultsTag);
        comInterest.getChildren().add(lblCIEndBalanceTag);
        comInterest.getChildren().add(lblCIEndBalanceTag2);
        comInterest.getChildren().add(lblCITotalPrincipalTag);
        comInterest.getChildren().add(lblCITotalPrincipalTag2);
        comInterest.getChildren().add(lblCITotalInterestTag);
        comInterest.getChildren().add(lblCITotalInterestTag2);
        comInterest.getChildren().add(lblCITotalTaxTag);
        comInterest.getChildren().add(lblCITotalTaxTag2);
        comInterest.getChildren().add(btnCICalculate);
        comInterest.getChildren().add(btnCIClear);
        comInterest.setStyle("-fx-background-color: #411C8A; -fx-border-color: black;");

        mortgage.getChildren().add(lblMortgageCal);
        mortgage.getChildren().add(lblHomePrice);
        mortgage.getChildren().add(lblDownPayment);
        mortgage.getChildren().add(lblLoanTerm);
        mortgage.getChildren().add(lblInterestRate);
        mortgage.getChildren().add(tfHomePrice);
        mortgage.getChildren().add(tfDownPayment);
        mortgage.getChildren().add(tfLoanTerm);
        mortgage.getChildren().add(tfInterestRate);
        mortgage.getChildren().add(lblMonthlyPayTag);
        mortgage.getChildren().add(lblMonthlyPayTag2);
        mortgage.getChildren().add(lblHousePriceTag);
        mortgage.getChildren().add(lblHousePriceTag2);
        mortgage.getChildren().add(lblDownPaymentTag);
        mortgage.getChildren().add(lblDownPaymentTag2);
        mortgage.getChildren().add(lblLoanAmountTag);
        mortgage.getChildren().add(lblLoanAmountTag2);
        mortgage.getChildren().add(lblTotalMortgagePaymentTag);
        mortgage.getChildren().add(lblTotalMortgagePaymentTag2);
        mortgage.getChildren().add(lblTotalInterestTag);
        mortgage.getChildren().add(lblTotalInterestTag2);
        mortgage.getChildren().add(calculate);
        mortgage.getChildren().add(clearMain);
        mortgage.setStyle("-fx-background-color: #411C8A; -fx-border-color: black;");

        fv.getChildren().add(lblFutureValue);
        fv.getChildren().add(lblFvIYInterest);
        fv.getChildren().add(lblFvNoOfPeriods);
        fv.getChildren().add(lblFvPMTAnnuityPay);
        fv.getChildren().add(lblFvStartPrincipal);
        fv.getChildren().add(tfFvIYInterest);
        fv.getChildren().add(tfFvNoOfPeriods);
        fv.getChildren().add(tfFvPMTAnnuityPay);
        fv.getChildren().add(tfFvStartPrincipal);
        fv.getChildren().add(lblFvResultsTag);
        fv.getChildren().add(lblFvFutureValueTag);
        fv.getChildren().add(lblFvFutureValueTag2);
        fv.getChildren().add(lblFvPvTag);
        fv.getChildren().add(lblFvPvTag2);
        fv.getChildren().add(lblFvNTag);
        fv.getChildren().add(lblFvNTag2);
        fv.getChildren().add(lblFvIyTag);
        fv.getChildren().add(lblFvIyTag2);
        fv.getChildren().add(lblFvPmtTag);
        fv.getChildren().add(lblFvPmtTag2);
        fv.getChildren().add(lblFvStartingPayTag);
        fv.getChildren().add(lblFvStartingPayTag2);
        fv.getChildren().add(lblFvTotalPrincipalTag);
        fv.getChildren().add(lblFvTotalPrincipalTag2);
        fv.getChildren().add(lblFvTotalInterestTag);
        fv.getChildren().add(lblFvTotalInterestTag2);
        fv.getChildren().add(btnFvCalculate);
        fv.getChildren().add(btnFvClear);
        fv.setStyle("-fx-background-color: #411C8A; -fx-border-color: black;");

        pmt.getChildren().add(lblAnnuityPayment);
        pmt.getChildren().add(lblPMTFv);
        pmt.getChildren().add(lblPmtNoOfPeriods);
        pmt.getChildren().add(lblPmtStartPrincipal);
        pmt.getChildren().add(lblPmtIYInterest);
        pmt.getChildren().add(tfPMTFv);
        pmt.getChildren().add(tfPmtNoOfPeriods);
        pmt.getChildren().add(tfPmtStartPrincipal);
        pmt.getChildren().add(tfPmtIYInterest);
        pmt.getChildren().add(lblPmtResultsTag);
        pmt.getChildren().add(lblPmtFutureValueTag);
        pmt.getChildren().add(lblPmtFutureValueTag2);
        pmt.getChildren().add(lblPmtPvTag);
        pmt.getChildren().add(lblPmtPvTag2);
        pmt.getChildren().add(lblPmtNTag);
        pmt.getChildren().add(lblPmtNTag2);
        pmt.getChildren().add(lblPmtIyTag);
        pmt.getChildren().add(lblPmtIyTag2);
        pmt.getChildren().add(lblPmtPmtTag);
        pmt.getChildren().add(lblPmtPmtTag2);
        pmt.getChildren().add(lblPmtStartingPayTag);
        pmt.getChildren().add(lblPmtStartingPayTag2);
        pmt.getChildren().add(lblPmtTotalPrincipalTag);
        pmt.getChildren().add(lblPmtTotalPrincipalTag2);
        pmt.getChildren().add(lblPmtTotalInterestTag);
        pmt.getChildren().add(lblPmtTotalInterestTag2);
        pmt.getChildren().add(btnPmtCalculate);
        pmt.getChildren().add(btnPmtClear);
        pmt.setStyle("-fx-background-color: #411C8A; -fx-border-color: black;");


        iy.getChildren().add(lblInterestRateMain);
        iy.getChildren().add(lblIYFv);
        iy.getChildren().add(lblIYNoOfPeriods);
        iy.getChildren().add(lblIYStartPrincipal);
        iy.getChildren().add(lblIYPmt);
        iy.getChildren().add(tfIYFv);
        iy.getChildren().add(tfIYNoOfPeriods);
        iy.getChildren().add(tfIYStartPrincipal);
        iy.getChildren().add(tfIYPmt);
        iy.getChildren().add(lblIYResultsTag);
        iy.getChildren().add(lblIYFutureValueTag);
        iy.getChildren().add(lblIYFutureValueTag2);
        iy.getChildren().add(lblIYPvTag);
        iy.getChildren().add(lblIYPvTag2);
        iy.getChildren().add(lblIYNTag);
        iy.getChildren().add(lblIYNTag2);
        iy.getChildren().add(lblIYIyTag);
        iy.getChildren().add(lblIYIyTag2);
        iy.getChildren().add(lblIYPmtTag);
        iy.getChildren().add(lblIYPmtTag2);
        iy.getChildren().add(lblIYStartingPayTag);
        iy.getChildren().add(lblIYStartingPayTag2);
        iy.getChildren().add(lblIYTotalPrincipalTag);
        iy.getChildren().add(lblIYTotalPrincipalTag2);
        iy.getChildren().add(lblIYTotalInterestTag);
        iy.getChildren().add(lblIYTotalInterestTag2);
        iy.getChildren().add(btnIYCalculate);
        iy.getChildren().add(btnIYClear);
        iy.setStyle("-fx-background-color: #411C8A; -fx-border-color: black;");

        N.getChildren().add(lblNumberOfPeriods);
        N.getChildren().add(lblNIYInterest);
        N.getChildren().add(lblNFv);
        N.getChildren().add(lblNPMTAnnuityPay);
        N.getChildren().add(lblNStartPrincipal);
        N.getChildren().add(tfNIYInterest);
        N.getChildren().add(tfNFv);
        N.getChildren().add(tfNPMTAnnuityPay);
        N.getChildren().add(tfNStartPrincipal);
        N.getChildren().add(lblNResultsTag);
        N.getChildren().add(lblNFutureValueTag);
        N.getChildren().add(lblNFutureValueTag2);
        N.getChildren().add(lblNPvTag);
        N.getChildren().add(lblNPvTag2);
        N.getChildren().add(lblNNTag);
        N.getChildren().add(lblNNTag2);
        N.getChildren().add(lblNIyTag);
        N.getChildren().add(lblNIyTag2);
        N.getChildren().add(lblNPmtTag);
        N.getChildren().add(lblNPmtTag2);
        N.getChildren().add(lblNStartingPayTag);
        N.getChildren().add(lblNStartingPayTag2);
        N.getChildren().add(lblNTotalPrincipalTag);
        N.getChildren().add(lblNTotalPrincipalTag2);
        N.getChildren().add(lblNTotalInterestTag);
        N.getChildren().add(lblNTotalInterestTag2);
        N.getChildren().add(btnNCalculate);
        N.getChildren().add(btnNClear);
        N.setStyle("-fx-background-color: #411C8A; -fx-border-color: black;");

        totalPayment.getChildren().add(lblTotalPrice);
        totalPayment.getChildren().add(lblAutoPrice);
        totalPayment.getChildren().add(lblAutoLoanTerm);
        totalPayment.getChildren().add(lblLoanInterestRate);
        totalPayment.getChildren().add(lblLoanDownPayment);
        totalPayment.getChildren().add(lblSalesTax);
        totalPayment.getChildren().add(lblFee);
        totalPayment.getChildren().add(tfAutoPrice);
        totalPayment.getChildren().add(tfAutoLoanTerm);
        totalPayment.getChildren().add(tfLoanInterestRate);
        totalPayment.getChildren().add(tfLoanDownPayment);
        totalPayment.getChildren().add(tfSalesTax);
        totalPayment.getChildren().add(tfFee);
        totalPayment.getChildren().add(lblMonthlyLoanPayTag);
        totalPayment.getChildren().add(lblMonthlyLoanPayTag2);
        totalPayment.getChildren().add(lblTotalLoanAmountTag);
        totalPayment.getChildren().add(lblTotalLoanAmountTag2);
        totalPayment.getChildren().add(lblSaleTaxTag);
        totalPayment.getChildren().add(lblSaleTaxTag2);
        totalPayment.getChildren().add(lblUpfrontTag);
        totalPayment.getChildren().add(lblUpfrontTag2);
        totalPayment.getChildren().add(lblTotalLoanPayTag);
        totalPayment.getChildren().add(lblTotalLoanPayTag2);
        totalPayment.getChildren().add(lblTotalLoanInterestTag);
        totalPayment.getChildren().add(lblTotalLoanInterestTag2);
        totalPayment.getChildren().add(lblTotalLoanCostTag);
        totalPayment.getChildren().add(lblTotalLoanCostTag2);
        totalPayment.getChildren().add(loanCalculate);
        totalPayment.getChildren().add(loanCalculatorClear);
        totalPayment.setStyle("-fx-background-color: #411C8A; -fx-border-color: black;");

        monthlyPayment.getChildren().add(lblMonthlyPayment);
        monthlyPayment.getChildren().add(lblMonthlyPay);
        monthlyPayment.getChildren().add(lblMonthlyAutoLoanTerm);
        monthlyPayment.getChildren().add(lblMonthlyLoanInterestRate);
        monthlyPayment.getChildren().add(lblMonthlyLoanDownPayment);
        monthlyPayment.getChildren().add(lblMonthlySalesTax);
        monthlyPayment.getChildren().add(lblMonthlyFee);
        monthlyPayment.getChildren().add(tfMonthlyPay);
        monthlyPayment.getChildren().add(tfMonthlyAutoLoanTerm);
        monthlyPayment.getChildren().add(tfMonthlyLoanInterestRate);
        monthlyPayment.getChildren().add(tfMonthlyLoanDownPayment);
        monthlyPayment.getChildren().add(tfMonthlySalesTax);
        monthlyPayment.getChildren().add(tfMonthlyFee);
        monthlyPayment.getChildren().add(lblMonthlyPayLoanPayTag);
        monthlyPayment.getChildren().add(lblMonthlyPayLoanPayTag2);
        monthlyPayment.getChildren().add(lblMonthlyTotalLoanAmountTag);
        monthlyPayment.getChildren().add(lblMonthlyTotalLoanAmountTag2);
        monthlyPayment.getChildren().add(lblMonthlySaleTaxTag);
        monthlyPayment.getChildren().add(lblMonthlySaleTaxTag2);
        monthlyPayment.getChildren().add(lblMonthlyUpfrontTag);
        monthlyPayment.getChildren().add(lblMonthlyUpfrontTag2);
        monthlyPayment.getChildren().add(lblMonthlyTotalLoanPayTag);
        monthlyPayment.getChildren().add(lblMonthlyTotalLoanPayTag2);
        monthlyPayment.getChildren().add(lblMonthlyTotalLoanInterestTag);
        monthlyPayment.getChildren().add(lblMonthlyTotalLoanInterestTag2);
        monthlyPayment.getChildren().add(lblMonthlyTotalLoanCostTag);
        monthlyPayment.getChildren().add(lblMonthlyTotalLoanCostTag2);
        monthlyPayment.getChildren().add(loanMonthlyCalculate);
        monthlyPayment.getChildren().add(loanMonthlyCalculatorClear);
        monthlyPayment.setStyle("-fx-background-color: #411C8A; -fx-border-color: black;");

        keyBoard.getChildren().add(txtInput);
        keyBoard.getChildren().add(help);
        keyBoard.getChildren().add(num0);
        keyBoard.getChildren().add(num1);
        keyBoard.getChildren().add(num2);
        keyBoard.getChildren().add(num3);
        keyBoard.getChildren().add(num4);
        keyBoard.getChildren().add(num5);
        keyBoard.getChildren().add(num6);
        keyBoard.getChildren().add(num7);
        keyBoard.getChildren().add(num8);
        keyBoard.getChildren().add(num9);
        keyBoard.getChildren().add(numEnt);
        keyBoard.getChildren().add(numDot);
        keyBoard.getChildren().add(numCom);
        keyBoard.getChildren().add(backSpace);
        keyBoard.getChildren().add(clear);
        keyBoard.setStyle("-fx-background-color: #1A0C46; -fx-border-color: black;");

        helpPane.getChildren().add(helptxt);

        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();

        secondaryStage.setTitle("Help");
        secondaryStage.setScene(new Scene(helpPane,500,600));
    }


    public static String Insert(){
        return txtInput.getText();
    }

    public static void main(String[] args) {
        launch(args);
    }
}