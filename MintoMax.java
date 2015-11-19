import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Arrays;
import javafx.application.Application;

public class MinToMax extends Application {
	int[] number = new int[10];
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Number Sorter");
		Label numOne = new Label("Number One");
		Label numTwo = new Label("Number Two");
		Label numThree = new Label("Number Three");
		Label numFour = new Label("Number Four");
		Label numFive = new Label("Number Five");
		Label numSix = new Label("Number Six");
		Label numSeven = new Label("Number Seven");
		Label numEight = new Label("Number Eight");
		Label numNine = new Label("Number Nine");
		Label numTen = new Label("Number Ten");
		Label sortedNums = new Label("");
		sortedNums.setVisible(false);
		TextField numOneTxtFld = new TextField();
		TextField numTwoTxtFld = new TextField();
		TextField numThreeTxtFld = new TextField();
		TextField numFourTxtFld = new TextField();
		TextField numFiveTxtFld = new TextField();
		TextField numSixTxtFld = new TextField();
		TextField numSevenTxtFld = new TextField();
		TextField numEightTxtFld = new TextField();
		TextField numNineTxtFld = new TextField();
		TextField numTenTxtFld = new TextField();

		Button submitBtn = new Button("Sort");
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {

			// initialize components of User to be inputed and passed into the
			// User class
			String numOne = "";
			String numTwo = "";
			String numThree = "";
			String numFour = "";
			String numFive = "";
			String numSix = "";
			String numSeven = "";
			String numEight = "";
			String numNine = "";
			String numTen = "";

			@Override
			public void handle(ActionEvent arg0) {

				numOne = numOneTxtFld.getText();
				numTwo = numTwoTxtFld.getText();
				numThree = numThreeTxtFld.getText();
				numFour = numFourTxtFld.getText();
				numFive = numFiveTxtFld.getText();
				numSix = numSixTxtFld.getText();
				numSeven = numSevenTxtFld.getText();
				numEight = numEightTxtFld.getText();
				numNine = numNineTxtFld.getText();
				numTen = numTenTxtFld.getText();


				number[0] = Integer.parseInt(numOne);
				number[1] = Integer.parseInt(numTwo);
				number[2] = Integer.parseInt(numThree);
				number[3] = Integer.parseInt(numFour);
				number[4] = Integer.parseInt(numFive);
				number[5] = Integer.parseInt(numSix);
				number[6] = Integer.parseInt(numSeven);
				number[7] = Integer.parseInt(numEight);
				number[8] = Integer.parseInt(numNine);
				number[9] = Integer.parseInt(numTen);

				
				for (int i = 0; i < number.length - 1; i++) {
					int min = number[i];
					for (int j = i; j < number.length; j++) {

						if (min > number[j]) {
							Swap(i, j);
							min = number[i];
						}
					}

				}
				sortedNums.setText(Arrays.toString(number));
				sortedNums.setVisible(true);

			}

		});


		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(numOne, 0, 0);
		grid.add(numTwo, 0, 1);
		grid.add(numThree, 0, 2);
		grid.add(numFour, 0, 3);
		grid.add(numFive, 0, 4);
		grid.add(numSix, 0, 5);
		grid.add(numSeven, 0, 6);
		grid.add(numEight, 0, 7);
		grid.add(numNine, 0, 8);
		grid.add(numTen, 0, 9);
		grid.add(numOneTxtFld, 1, 0);
		grid.add(numTwoTxtFld, 1, 1);
		grid.add(numThreeTxtFld, 1, 2);
		grid.add(numFourTxtFld, 1, 3);
		grid.add(numFiveTxtFld, 1, 4);
		grid.add(numSixTxtFld, 1, 5);
		grid.add(numSevenTxtFld, 1, 6);
		grid.add(numEightTxtFld, 1, 7);
		grid.add(numNineTxtFld, 1, 8);
		grid.add(numTenTxtFld, 1, 9);
		grid.add(sortedNums, 1, 11);
		grid.add(submitBtn, 1, 10);

		Scene scene = new Scene(grid, 500, 800);

		primaryStage.setScene(scene);
		primaryStage.show();

	}
	public void Swap(int minIndex, int compareIndex) {
		int temp = number[minIndex];
		number[minIndex] = number[compareIndex];		
		number[compareIndex] = temp;	
	}
}
