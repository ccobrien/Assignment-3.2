/**
 * Assignment 5 
 * @ author Christopher O'Brien
 *  This program takes the user's input for grades and for weights of grades
 *  and calculates and output's the user's weighted average, GPA, and Letter Grade
 */
//import edu.nvcc.csc200.javafx.User;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ScoreGUI extends Application
{
	private static final int GRADE = 4;
	private static final int WEIGHT = 2;
	private double grades [][] = new double [GRADE][WEIGHT];
	private static Student[] student = new Student[10];
	private int index = 0;
	public static void main(String [] args)
	{
		launch(args);
	}

	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("GPA Calculator");
		Label nameLabel = new Label("Name:");
		Label testOne = new Label("Test One:");
		Label testTwo = new Label("Test Two:");
		Label testThree = new Label("Test Three:");
		Label testFour = new Label("Test Four:");
		Label weightOne = new Label("Test One Weight:");
		Label weightTwo = new Label("Test Two Weight:");
		Label weightThree = new Label("Test Three Weight:");
		Label weightFour = new Label("Test Four Weight:");
		//set stage for results
		Label testAverageLabel = new Label("Test Average:");
		Label gpaLabel= new Label("GPA:");
		Label letterGradeLabel = new Label("Letter Grade:");
		testAverageLabel.setVisible(false);
		gpaLabel.setVisible(false);
		letterGradeLabel.setVisible(false);
		Label testAverage = new Label("");
		Label gpa = new Label("");
		Label letterGrade = new Label("");
		testAverage.setVisible(false);
		gpa.setVisible(false);
		letterGrade.setVisible(false);
		TextField nameTxtFld = new TextField();
		TextField testOneTxtFld = new TextField();
		TextField testTwoTxtFld = new TextField();
		TextField testThreeTxtFld = new TextField();
		TextField testFourTxtFld = new TextField();
		TextField weightOneTxtFld = new TextField();
		TextField weightTwoTxtFld = new TextField();
		TextField weightThreeTxtFld = new TextField();
		TextField weightFourTxtFld = new TextField();

		Button submitBtn = new Button("Calculate");
		submitBtn.setOnAction(new EventHandler<ActionEvent>()
		{
			String name = ""; 
			String scoreOne = "";
			String scoreTwo = "";
			String scoreThree = "";
			String scoreFour = "";
			String testOneWeight= "";
			String testTwoWeight = "";
			String testThreeWeight = "";
			String testFourWeight = "";

			@Override
			public void handle(ActionEvent arg0) 
			{

				//set the scores and grades
				name = nameTxtFld.getText();
				scoreOne = testOneTxtFld.getText();
				scoreTwo = testTwoTxtFld.getText();
				scoreThree = testThreeTxtFld.getText();
				scoreFour = testFourTxtFld.getText();
				testOneWeight = weightOneTxtFld.getText();
				testTwoWeight = weightTwoTxtFld.getText();
				testThreeWeight = weightThreeTxtFld.getText();
				testFourWeight = weightFourTxtFld.getText();

				grades[0][0] = Double.parseDouble(scoreOne);
				grades[1][0] =  Double.parseDouble(scoreTwo);
				grades[2][0] =  Double.parseDouble(scoreThree);
				grades[3][0] =  Double.parseDouble(scoreFour);
				grades[0][1] =  Double.parseDouble(testOneWeight);
				grades[1][1] =  Double.parseDouble(testTwoWeight);
				grades[2][1] =  Double.parseDouble(testThreeWeight);
				grades[3][1] =  Double.parseDouble(testFourWeight);

				//build student[index] array for class Student
				double studentGPA = 0;
				student[index] = new Student(name, grades, studentGPA);
				student[index].setGPA(grades);

				//calculate and output test average, gpa, and letter grade
				String gpaTxt = student[index].getGPATxt();
				String testAverageTxt = student[index].getTestAverage();
				String letterGradeTxt = student[index].getLetterGrade();
				
				testAverage.setText(testAverageTxt);
				gpa.setText(gpaTxt);
				letterGrade.setText(letterGradeTxt);

				testAverageLabel.setVisible(true);
				gpaLabel.setVisible(true);
				letterGradeLabel.setVisible(true);
				testAverage.setVisible(true);
				gpa.setVisible(true);
				letterGrade.setVisible(true);
				index++;
			}

		});


		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(nameLabel, 0, 0);
		grid.add(nameTxtFld, 1,  0);
		grid.add(testOne, 0, 1);
		grid.add(testTwo, 0, 2);
		grid.add(testThree, 0, 3);
		grid.add(testFour, 0, 4);
		grid.add(testOneTxtFld, 1, 1);
		grid.add(testTwoTxtFld, 1, 2);
		grid.add(testThreeTxtFld, 1, 3);
		grid.add(testFourTxtFld, 1, 4);
		grid.add(weightOne, 2, 1);
		grid.add(weightTwo, 2, 2);
		grid.add(weightThree, 2, 3);
		grid.add(weightFour, 2, 4);
		grid.add(weightOneTxtFld, 3, 1);
		grid.add(weightTwoTxtFld, 3, 2);
		grid.add(weightThreeTxtFld, 3, 3);
		grid.add(weightFourTxtFld, 3,4);
		grid.add(submitBtn, 0, 5);
		grid.add(testAverageLabel, 0, 6);
		grid.add(testAverage, 1, 6);
		grid.add(gpaLabel, 2, 6);
		grid.add(gpa, 3, 6);
		grid.add(letterGradeLabel, 4,6);
		grid.add(letterGrade, 5, 6);


		Scene scene = new Scene(grid, 800, 500);

		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
