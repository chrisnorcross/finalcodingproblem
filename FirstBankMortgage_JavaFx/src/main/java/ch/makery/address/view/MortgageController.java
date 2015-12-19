package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.UUID;

import base.RateDAL;
import ch.makery.address.MainApp;
import ch.makery.address.model.Rate;


public class MortgageController {


    // Reference to the main application.
    private MainApp mainApp;
    public TextField getTxtIncome() {
		return txtIncome;
	}

	public void setTxtIncome(TextField txtIncome) {
		this.txtIncome = txtIncome;
	}

	public TextField getTxtExpenses() {
		return txtExpenses;
	}

	public void setTxtExpenses(TextField txtExpenses) {
		this.txtExpenses = txtExpenses;
	}

	public TextField getTxtCreditScore() {
		return txtCreditScore;
	}

	public void setTxtCreditScore(TextField txtCreditScore) {
		this.txtCreditScore = txtCreditScore;
	}

	public TextField getTxtHouseCost() {
		return txtHouseCost;
	}

	public void setTxtHouseCost(TextField txtHouseCost) {
		this.txtHouseCost = txtHouseCost;
	}

	public ComboBox getCmbTerm() {
		return cmbTerm;
	}

	public void setCmbTerm(ComboBox cmbTerm) {
		this.cmbTerm = cmbTerm;
	}

	public Label getLblMortgagePayment() {
		return lblMortgagePayment;
	}

	public void setLblMortgagePayment(Label lblMortgagePayment) {
		this.lblMortgagePayment = lblMortgagePayment;
	}

	@FXML
    private TextField txtIncome;
    @FXML
    private TextField txtExpenses;
    @FXML
    private TextField txtCreditScore;
    @FXML
    private TextField txtHouseCost;
    @FXML
    private ComboBox cmbTerm;
    @FXML
    private Label lblMortgagePayment;
    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MortgageController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	cmbTerm.setId("15");
    	cmbTerm.setId("30");
    	txtIncome.setText("income");
    	txtExpenses.setText("Expenses");
    	txtCreditScore.setText("Credit Score");
    	txtHouseCost.setText("House Cost");

    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
   
}