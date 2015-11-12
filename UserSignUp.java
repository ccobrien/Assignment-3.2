

import java.util.Collections;

import javax.swing.JOptionPane;

//import edu.nvcc.csc200.javafx.User;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class UserSignUp extends Application {
	private static final int SIZE = 10;
	private static User[] users = new User[SIZE];
	private int index = 0;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Sign Up Page");
		Label firstNameLb1 = new Label("First Name");
		Label lastNameLb1 = new Label("Last Name");
		Label emailLb1 = new Label("Email");
		Label userNameLb1 = new Label("User Name");
		Label passwordLb1 = new Label("Password");
		Label confirmPasswordLb1 = new Label("Confirm Password");
		Label acTypeLb1 = new Label("Account Type");
		Label passwordWarning = new Label("Invalid Password");
		passwordWarning.setVisible(false);
		Label nonMatchPass = new Label("Passwords do not match");
		nonMatchPass.setVisible(false);
		Label blankFields = new Label("The fields cannot be blank");
		blankFields.setVisible(false);
		Label invalidEmail = new Label("Invalid email");
		invalidEmail.setVisible(false);
		TextField firstNameTxtFld = new TextField();
		TextField lastNameTxtFld = new TextField();
		TextField emailTxtFld = new TextField();
		TextField userNameTxtFld = new TextField();
		PasswordField passwordTxtFld = new PasswordField();
		PasswordField confirmPasswordTxtFld = new PasswordField();
		ComboBox acTypeCmbBox = new ComboBox();
		acTypeCmbBox.getItems().addAll(AccountType.values());

		Button submitBtn = new Button("Sign Up");
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {

			// initialize components of User to be inputed and passed into the
			// User class
			String firstName = "";
			String lastName = "";
			String email = "";
			String userName = "";
			String password = "";
			String confirmPassword = "";
			AccountType accountType;

			@Override
			public void handle(ActionEvent arg0) {

				// set necessary patterns of string data for certain
				// constructors
				String emailPattern = "\\w+@\\w+\\.\\w";
				String passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=.*\\S+$).{8,64}";

				// check if any text fields are empty
				// receive input and validate text fields for appropriate data
				boolean status1, status2, status3, status4, status5, status6 = false;
				status1 = validate(firstNameTxtFld);
				status2 = validate(lastNameTxtFld);
				status3 = validate(emailTxtFld);
				status4 = validate(userNameTxtFld);
				status5 = validate(passwordTxtFld);
				status6 = validate(confirmPasswordTxtFld);

				// checks to see if any text field is left empty before
				// executing program
					// accountType =
					// AccountType.valueOf(acTypeCmbBox.getPromptText());
					firstName = firstNameTxtFld.getText();
					lastName = lastNameTxtFld.getText();
					email = emailTxtFld.getText();
					userName = userNameTxtFld.getText();
					password = passwordTxtFld.getText();
					confirmPassword = confirmPasswordTxtFld.getText();

					// checks to see if the email is in the right format before
					// continuing program
					if (!email.matches(emailPattern)) {
						invalidEmail.setTextFill(Color.RED);
						invalidEmail.setVisible(true);
					}
					// checks to see if password is in the correct format before
					// continuing program
					if (password.length() < 8
							|| !password.matches(passwordPattern)) {
						passwordWarning.setTextFill(Color.RED);
						passwordWarning.setVisible(true);
					}
					// checks to see if confirm password and password are
					// equivalent
					if (!confirmPassword.equals(password)) {
						nonMatchPass.setTextFill(Color.RED);
						nonMatchPass.setVisible(true);
						status6=false;
					}
									
					
					if (status1 && status2 && status3 && status4 && status5
							&& status6) {
						// remember to add account type to user components using
						// combo box
						users[index] = new User(firstName, lastName, email,
								userName, password, accountType);
						index++;
						// JOptionPane.showMessageDialog(null, User.toString());
					}
					else{
						blankFields.setTextFill(Color.RED);
						blankFields.setVisible(true);
					}
				}

			
		});

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(firstNameLb1, 0, 0);
		grid.add(lastNameLb1, 0, 1);
		grid.add(emailLb1, 0, 2);
		grid.add(userNameLb1, 0, 3);
		grid.add(passwordLb1, 0, 4);
		grid.add(confirmPasswordLb1, 0, 5);
		grid.add(acTypeLb1, 0, 6);
		grid.add(passwordWarning, 1, 8);
		grid.add(nonMatchPass, 1, 9);
		grid.add(blankFields,1, 10);
		grid.add(invalidEmail, 1, 11);
		grid.add(firstNameTxtFld, 1, 0);
		grid.add(lastNameTxtFld, 1, 1);
		grid.add(emailTxtFld, 1, 2);
		grid.add(userNameTxtFld, 1, 3);
		grid.add(passwordTxtFld, 1, 4);
		grid.add(confirmPasswordTxtFld, 1, 5);
		grid.add(acTypeCmbBox, 1, 6);
		grid.add(submitBtn, 1, 7);

		Scene scene = new Scene(grid, 500, 800);
		scene.getStylesheets().add(
				getClass().getResource("JavaFx.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private boolean validate(TextField tf) {
		boolean pass = false;
		ObservableList<String> styleClass = tf.getStyleClass();
		if (tf.getText().trim().length() == 0) {
			if (!styleClass.contains("error")) {
				styleClass.add("error");
			}
		} else {
			styleClass.removeAll(Collections.singleton("error"));
			pass = true;
		}
		return pass;
	}
}
