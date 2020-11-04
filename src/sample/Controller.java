package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    public TableView tableStudents;
    public TableColumn tableColumnFirstName;
    public TableColumn tableColumnLastName;
    public TableColumn tableColumnStudentId;
    ObservableList<Student> students = FXCollections.observableArrayList();

    public TextField textFieldFirstName;
    public TextField textFieldLastName;
    public TextField textFieldStudentId;

    public void addStudent(ActionEvent actionEvent) {
        Student student = new Student(textFieldFirstName.getText(), textFieldLastName.getText(), textFieldStudentId.getText());
        students.add(student);

        System.out.println(students);
    }

    // will be executed when GUI is ready
    public void initialize()
    {
        tableStudents.setItems(students);

        tableColumnFirstName.setCellValueFactory(
                new PropertyValueFactory<Student, String>("firstname")
        );
        tableColumnLastName.setCellValueFactory(
                new PropertyValueFactory<Student, String>("lastname")
        );
        tableColumnStudentId.setCellValueFactory(
                new PropertyValueFactory<Student, String>("studentID")
        );
    }
}
