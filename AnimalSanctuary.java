import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Optional;

/**
 * A JavaFX GUI program, where users can enter the animal's info as they come
 * into the sanctuary and to see what animals are here.
 *
 * @author ericsheng
 * @version 1.1337
 */
public class AnimalSanctuary extends Application {
    private static int counter;
    private ArrayList<String> queueList = new ArrayList<>();
    private ArrayList<String> backgroundList = new ArrayList<>();


    /**
     * Main method for launching the stages.
     *
     * @param args arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Set a window for an area that shows all of the animals currently in the sanctuary.
     * A place for the user to input new animals with their fields.
     * A button to submit animal to the sanctuary.
     *
     * @param primaryStage stage element.
     * @throws Exception exception.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        boolean[] arr = new boolean[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = false;
        }

        primaryStage.setTitle("Animal Sanctuary");
        AnchorPane root = new AnchorPane();

        Image wallpaper = new Image("animalImage.jpg", false);
        ImageView imageView = new ImageView(wallpaper);
        imageView.setOpacity(0.7);
        root.getChildren().add(imageView);

        Text title = new Text("The Animal Sanctuary");
        title.setLayoutX(268);
        title.setLayoutY(104);
        title.setFont(new Font("Cambria", 50));
        title.setStyle("-fx-font-weight: bold");
        root.getChildren().add(title);

        Button s1 = new Button("Empty");
        s1.setStyle("-fx-background-color: Grey");
        s1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
                new BorderWidths(2.75))));
        s1.setPrefHeight(200);
        s1.setPrefWidth(200);
        s1.setFont(Font.font("Verdana", FontWeight.BOLD, 13));

        s1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                s1.setText("Empty");
                counter--;
                s1.setStyle("-fx-background-color: Grey");
                arr[0] = false;
                if (queueList.size() != 0) {
                    s1.setText(queueList.get(0));
                    if (backgroundList.get(0).equals("dog")) {
                        s1.setStyle("-fx-background-image: url('dog.png')");
                    } else if (backgroundList.get(0).equals("cat")) {
                        s1.setStyle("-fx-background-image: url('cat.png')");
                    } else if (backgroundList.get(0).equals("bird")) {
                        s1.setStyle("-fx-background-image: url('bird.png')");
                    } else if (backgroundList.get(0).equals("squirrel")) {
                        s1.setStyle("-fx-background-image: url('squirrel.jpeg')");
                    }
                    arr[0] = true;
                    queueList.remove(0);
                    backgroundList.remove(0);
                    counter++;
                }
            }
        });
        Button s2 = new Button("Empty");
        s2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
                new BorderWidths(2.75))));
        s2.setPrefHeight(200);
        s2.setPrefWidth(200);
        s2.setStyle("-fx-background-color: Grey");
        s2.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        s2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                s2.setText("Empty");
                counter--;
                s2.setStyle("-fx-background-color: Grey");
                arr[1] = false;
                if (queueList.size() != 0) {
                    s2.setText(queueList.get(0));
                    if (backgroundList.get(0).equals("dog")) {
                        s2.setStyle("-fx-background-image: url('dog.png')");
                    } else if (backgroundList.get(0).equals("cat")) {
                        s2.setStyle("-fx-background-image: url('cat.png')");
                    } else if (backgroundList.get(0).equals("bird")) {
                        s2.setStyle("-fx-background-image: url('bird.png')");
                    } else if (backgroundList.get(0).equals("squirrel")) {
                        s2.setStyle("-fx-background-image: url('squirrel.jpeg')");
                    }
                    arr[1] = true;
                    queueList.remove(0);
                    backgroundList.remove(0);
                    counter++;
                }
            }
        });
        Button s3 = new Button("Empty");
        s3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
                new BorderWidths(2.75))));
        s3.setPrefHeight(200);
        s3.setPrefWidth(200);
        s3.setStyle("-fx-background-color: Grey");
        s3.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        s3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                s3.setText("Empty");
                counter--;
                s3.setStyle("-fx-background-color: Grey");
                arr[2] = false;
                if (queueList.size() != 0) {
                    s3.setText(queueList.get(0));
                    if (backgroundList.get(0).equals("dog")) {
                        s3.setStyle("-fx-background-image: url('dog.png')");
                    } else if (backgroundList.get(0).equals("cat")) {
                        s3.setStyle("-fx-background-image: url('cat.png')");
                    } else if (backgroundList.get(0).equals("bird")) {
                        s3.setStyle("-fx-background-image: url('bird.png')");
                    } else if (backgroundList.get(0).equals("squirrel")) {
                        s3.setStyle("-fx-background-image: url('squirrel.jpeg')");
                    }
                    arr[2] = true;
                    queueList.remove(0);
                    backgroundList.remove(0);
                    counter++;
                }
            }
        });
        Button s4 = new Button("Empty");
        s4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
                new BorderWidths(2.75))));
        s4.setPrefHeight(200);
        s4.setPrefWidth(200);
        s4.setStyle("-fx-background-color: Grey");
        s4.setFont(Font.font("Verdana", FontWeight.BOLD, 13));

        s4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                s4.setText("Empty");
                counter--;
                s4.setStyle("-fx-background-color: Grey");
                arr[3] = false;
                if (queueList.size() != 0) {
                    s4.setText(queueList.get(0));
                    if (backgroundList.get(0).equals("dog")) {
                        s4.setStyle("-fx-background-image: url('dog.png')");
                    } else if (backgroundList.get(0).equals("cat")) {
                        s4.setStyle("-fx-background-image: url('cat.png')");
                    } else if (backgroundList.get(0).equals("bird")) {
                        s4.setStyle("-fx-background-image: url('bird.png')");
                    } else if (backgroundList.get(0).equals("squirrel")) {
                        s4.setStyle("-fx-background-image: url('squirrel.jpeg')");
                    }
                    arr[3] = true;
                    queueList.remove(0);
                    backgroundList.remove(0);
                    counter++;
                }
            }
        });
        Button s5 = new Button("Empty");
        s5.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
                new BorderWidths(2.75))));
        s5.setPrefHeight(200);
        s5.setPrefWidth(200);
        s5.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        s5.setStyle("-fx-background-color: Grey");
        s5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                s5.setText("Empty");
                counter--;
                s5.setStyle("-fx-background-color: Grey");
                arr[4] = false;
                if (queueList.size() != 0) {
                    s5.setText(queueList.get(0));
                    if (backgroundList.get(0).equals("dog")) {
                        s5.setStyle("-fx-background-image: url('dog.png')");
                    } else if (backgroundList.get(0).equals("cat")) {
                        s5.setStyle("-fx-background-image: url('cat.png')");
                    } else if (backgroundList.get(0).equals("bird")) {
                        s5.setStyle("-fx-background-image: url('bird.png')");
                    } else if (backgroundList.get(0).equals("squirrel")) {
                        s5.setStyle("-fx-background-image: url('squirrel.jpeg')");
                    }
                    arr[4] = true;
                    queueList.remove(0);
                    backgroundList.remove(0);
                    counter++;
                }
            }
        });
        Button s6 = new Button("Empty");
        s6.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
                new BorderWidths(2.75))));
        s6.setPrefHeight(200);
        s6.setPrefWidth(200);
        s6.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        s6.setStyle("-fx-background-color: Grey");
        s6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                s6.setText("Empty");
                counter--;
                s6.setStyle("-fx-background-color: Grey");
                arr[5] = false;
                if (queueList.size() != 0) {
                    s6.setText(queueList.get(0));
                    if (backgroundList.get(0).equals("dog")) {
                        s6.setStyle("-fx-background-image: url('dog.png')");
                    } else if (backgroundList.get(0).equals("cat")) {
                        s6.setStyle("-fx-background-image: url('cat.png')");
                    } else if (backgroundList.get(0).equals("bird")) {
                        s6.setStyle("-fx-background-image: url('bird.png')");
                    } else if (backgroundList.get(0).equals("squirrel")) {
                        s6.setStyle("-fx-background-image: url('squirrel.jpeg')");
                    }
                    arr[5] = true;
                    queueList.remove(0);
                    backgroundList.remove(0);
                    counter++;
                }
            }
        });


        GridPane gridPane = new GridPane();
        gridPane.add(s1, 0, 0, 1, 1);
        gridPane.add(s2, 1, 0, 1, 1);
        gridPane.add(s3, 2, 0, 1, 1);
        gridPane.add(s4, 0, 1, 1, 1);
        gridPane.add(s5, 1, 1, 1, 1);
        gridPane.add(s6, 2, 1, 1, 1);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.relocate(150, 150);
        root.getChildren().add(gridPane);


        Rectangle r1 = new Rectangle(850, 75, 270, 500);
        r1.setFill(Color.web("#93989e"));
        root.getChildren().add(r1);

        Label titleLabel = new Label("Add animals here:");
        titleLabel.setFont(new Font("Cambria", 22));
        titleLabel.setLayoutX(910);
        titleLabel.setLayoutY(104);
        root.getChildren().add(titleLabel);


        Label nameLabel = new Label("Enter animal name:");
        nameLabel.setFont(new Font("Cambria", 13));
        nameLabel.setLayoutX(940);
        nameLabel.setLayoutY(190);
        root.getChildren().add(nameLabel);

        TextField nameField = new TextField();
        nameField.setLayoutX(910);
        nameField.setLayoutY(220);
        nameField.setPromptText("No Name Yet");
        nameField.setFocusTraversable(false);
        root.getChildren().add(nameField);
        nameField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
            }
        });


        Label healthLabel = new Label("Enter health here:");
        healthLabel.setFont(new Font("Cambria", 13));
        healthLabel.setLayoutX(945);
        healthLabel.setLayoutY(285);
        root.getChildren().add(healthLabel);

        TextField healthField = new TextField();
        healthField.setLayoutX(910);
        healthField.setLayoutY(315);
        healthField.setPromptText("Integer from 1 to 5");
        healthField.setFocusTraversable(false);
        root.getChildren().add(healthField);


        Label typeLabel = new Label("Pick animal type:");
        typeLabel.setFont(new Font("Cambria", 13));
        typeLabel.setLayoutX(945);
        typeLabel.setLayoutY(390);
        root.getChildren().add(typeLabel);

        ComboBox<Animal> animalType = new ComboBox<>();
        animalType.setLayoutX(940);
        animalType.setLayoutY(420);
        animalType.getItems().addAll(
                Animal.DOG,
                Animal.CAT,
                Animal.SQUIRREL,
                Animal.BIRD
        );
        root.getChildren().add(animalType);


        Button addBtn = new Button("Add animal");
        addBtn.setLayoutX(946);
        addBtn.setLayoutY(520);
        root.getChildren().add(addBtn);
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                boolean isFull = false;
                String animalName = new String();
                String animalHealth = new String();
                String animalTypes = new String();
                animalTypes = ("Animal Type: " + String.valueOf(animalType.getValue()));

                if (counter == 6) {
                    isFull = true;
                }

                if (healthField.getText().equals("1")) {
                    animalHealth = ("Animal Health: " + healthField.getText());
                } else if (healthField.getText().equals("2")) {
                    animalHealth = ("Animal Health: " + healthField.getText());
                } else if (healthField.getText().equals("Animal Health: 3")) {
                    animalHealth = ("Animal Health: " + healthField.getText());
                } else if (healthField.getText().equals("Animal Health: 4")) {
                    animalHealth = ("Animal Health: " + healthField.getText());
                } else if (healthField.getText().equals("Animal Health: 5")) {
                    animalHealth = ("Animal Health: " + healthField.getText());
                } else {
                    animalHealth = ("Animal Health: 5");
                }

                if (nameField.getText().isEmpty()) {
                    for (int i = 0; i < arr.length; i++) {
                        if (!arr[i]) {
                            animalName = ("Name: No name yet");
                            if (!arr[0]) {
                                s1.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s1.setStyle("-fx-highlight-fill: lightgray");
                                s1.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s1.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s1.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s1.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s1.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    s1.setStyle("-fx-background-color: Cyan");
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[1]) {
                                s2.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s2.setStyle("-fx-highlight-fill: lightgray");
                                s2.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s2.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s2.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s2.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s2.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    animalType.getValue();
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[2]) {
                                s3.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s3.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                s3.setStyle("-fx-highlight-fill: lightgray");
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s3.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s3.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s3.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s3.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    animalType.getValue();
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[3]) {
                                s4.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s4.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                s4.setStyle("-fx-highlight-fill: lightgray");
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s4.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s4.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s4.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s4.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    animalType.getValue();
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[4]) {
                                s5.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s5.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                s5.setStyle("-fx-highlight-fill: lightgray");
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s5.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s5.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s5.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s5.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    animalType.getValue();
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[5]) {
                                s6.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s6.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                s6.setStyle("-fx-highlight-fill: lightgray");
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s6.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s6.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s6.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s6.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    animalType.getValue();
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            }
                            arr[i] = true;
                            for (boolean z : arr) {
                                System.out.print(z);
                            }
                            System.out.println();
                            break;
                        }
                    }
                    counter = 0;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j]) {
                            counter++;
                        }
                    }

                    if (isFull) {
                        nameField.setText("");
                        healthField.setText("");
                        animalType.setValue(null);
                        Alert fullAlert = new Alert(Alert.AlertType.CONFIRMATION);
                        fullAlert.setTitle("Full Sanctuary Alert");
                        fullAlert.setHeaderText("There's no more room!");
                        fullAlert.setContentText("Join the queue for the next available sanctuary?");
                        Optional<ButtonType> btn = fullAlert.showAndWait();
                        if (btn.isPresent() && btn.get() == ButtonType.OK) {

                            AnchorPane layout2 = new AnchorPane();
                            Stage window = new Stage();
                            window.setTitle("Queue for Animal Sanctuary");


                            Label titleLabel = new Label("Add to queue here:");
                            titleLabel.setFont(new Font("Cambria", 22));
                            titleLabel.setLayoutX(140);
                            titleLabel.setLayoutY(40);
                            layout2.getChildren().add(titleLabel);

                            Label nameLabel = new Label("Enter animal name:");
                            nameLabel.setFont(new Font("Cambria", 13));
                            nameLabel.setLayoutX(170);
                            nameLabel.setLayoutY(114);
                            layout2.getChildren().add(nameLabel);

                            TextField nameField = new TextField();
                            nameField.setPromptText("No Name Yet");
                            nameField.setFocusTraversable(false);
                            nameField.setLayoutX(143);
                            nameField.setLayoutY(140);
                            layout2.getChildren().add(nameField);

                            Label healthLabel = new Label("Enter health here:");
                            healthLabel.setFont(new Font("Cambria", 13));
                            healthLabel.setLayoutX(173);
                            healthLabel.setLayoutY(190);
                            layout2.getChildren().add(healthLabel);

                            TextField healthField = new TextField();
                            healthField.setLayoutX(145);
                            healthField.setLayoutY(213);
                            healthField.setPromptText("Integer from 1 to 5");
                            healthField.setFocusTraversable(false);
                            layout2.getChildren().add(healthField);

                            Label typeLabel = new Label("Pick animal type:");
                            typeLabel.setFont(new Font("Cambria", 13));
                            typeLabel.setLayoutX(173);
                            typeLabel.setLayoutY(262);
                            layout2.getChildren().add(typeLabel);

                            ComboBox<Animal> animalType = new ComboBox<>();
                            animalType.setLayoutX(165);
                            animalType.setLayoutY(288);
                            animalType.getItems().addAll(
                                    Animal.DOG,
                                    Animal.CAT,
                                    Animal.SQUIRREL,
                                    Animal.BIRD
                            );
                            layout2.getChildren().add(animalType);


                            Button closeBtn = new Button("Close queue window");
                            closeBtn.setLayoutX(165);
                            closeBtn.setLayoutY(400);
                            closeBtn.setOnAction(e -> window.close());
                            layout2.getChildren().addAll(closeBtn);

                            Button addBtn = new Button("Add animal");
                            addBtn.setLayoutX(155);
                            addBtn.setLayoutY(350);
                            layout2.getChildren().add(addBtn);
                            addBtn.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent actionEvent) {
                                    String animalName = new String();
                                    String animalHealth = new String();
                                    String animalTypes = new String();
                                    animalTypes = ("Animal Type: " + String.valueOf(animalType.getValue()));
                                    if (animalType.getValue().equals(Animal.DOG)) {
//                                        backgroundType = "dog";
                                        backgroundList.add("dog");
                                    } else if (animalType.getValue().equals(Animal.CAT)) {
//                                        backgroundType = "cat";
                                        backgroundList.add("cat");

                                    } else if (animalType.getValue().equals(Animal.BIRD)) {
//                                        backgroundType = "bird";
                                        backgroundList.add("bird");

                                    } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
//                                        backgroundType = "squirrel";
                                        backgroundList.add("squirrel");

                                    }

                                    if (healthField.getText().equals("1")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else if (healthField.getText().equals("2")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else if (healthField.getText().equals("Animal Health: 3")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else if (healthField.getText().equals("Animal Health: 4")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else if (healthField.getText().equals("Animal Health: 5")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else {
                                        animalHealth = ("Animal Health: 5");
                                    }
                                    if (nameField.getText().isEmpty()) {
                                        animalName = ("Name: No name yet");
                                    } else {
                                        animalName = ("Name: " + nameField.getText());
                                    }
                                    queueList.add(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                    window.close();
                                    Alert added = new Alert(Alert.AlertType.CONFIRMATION);
                                    added.setTitle("Queue Confirmation");
                                    added.setHeaderText("Your(" + animalTypes + ")has been added to the queue!");
                                    int before = queueList.size() - 1;
                                    added.setContentText("There are " + before + " animals before you");
                                    added.showAndWait();
                                }
                            });

                            Scene scene = new Scene(layout2, 450, 450);
                            window.setScene(scene);
                            window.showAndWait();
                        }
                    }

                } else {
                    for (int i = 0; i < arr.length; i++) {
                        if (!arr[i]) {
                            animalName = ("Name: " + nameField.getText());
                            if (!arr[0]) {
                                s1.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s1.setStyle("-fx-highlight-fill: lightgray");
                                s1.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s1.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s1.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s1.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s1.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    s1.setStyle("-fx-background-color: Cyan");
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[1]) {
                                s2.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s2.setStyle("-fx-highlight-fill: lightgray");
                                s2.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s2.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s2.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s2.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s2.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    animalType.getValue();
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[2]) {
                                s3.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s3.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                s3.setStyle("-fx-highlight-fill: lightgray");
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s3.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s3.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s3.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s3.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    animalType.getValue();
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[3]) {
                                s4.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s4.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                s4.setStyle("-fx-highlight-fill: lightgray");
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s4.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s4.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s4.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s4.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else {
                                    animalType.getValue();
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[4]) {
                                s5.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s5.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                s5.setStyle("-fx-highlight-fill: lightgray");
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s5.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s5.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s5.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s5.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else if (animalType.getValue().equals(null)) {
                                    s5.setStyle("-fx-background-color: Cyan");
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            } else if (!arr[5]) {
                                s6.setText(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                s6.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
                                s6.setStyle("-fx-highlight-fill: lightgray");
                                if (animalType.getValue().equals(Animal.DOG)) {
                                    s6.setStyle("-fx-background-image: url('dog.png')");
                                } else if (animalType.getValue().equals(Animal.CAT)) {
                                    s6.setStyle("-fx-background-image: url('cat.png')");
                                } else if (animalType.getValue().equals(Animal.BIRD)) {
                                    s6.setStyle("-fx-background-image: url('bird.png')");
                                } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
                                    s6.setStyle("-fx-background-image: url('squirrel.jpeg')");
                                } else if (animalType.getValue().equals(null)) {
                                    s6.setStyle("-fx-background-color: Cyan");
                                }
                                nameField.setText("");
                                healthField.setText("");
                                animalType.setValue(null);
                            }
                            arr[i] = true;
                            System.out.println("arr updated");
                            break;
                        }
                    }
                    counter = 0;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j]) {
                            counter++;
                        }
                    }
                    if (isFull) {
                        nameField.setText("");
                        healthField.setText("");
                        animalType.setValue(null);
                        Alert fullAlert = new Alert(Alert.AlertType.CONFIRMATION);
                        fullAlert.setTitle("Full Sanctuary Alert");
                        fullAlert.setHeaderText("There's no more room!");
                        fullAlert.setContentText("Join the queue for the next available sanctuary?");
                        Optional<ButtonType> btn = fullAlert.showAndWait();
                        if (btn.isPresent() && btn.get() == ButtonType.OK) {
                            AnchorPane layout2 = new AnchorPane();
                            Stage window = new Stage();
                            window.setTitle("Queue for Animal Sanctuary");

                            Label titleLabel = new Label("Add to queue here:");
                            titleLabel.setFont(new Font("Cambria", 22));
                            titleLabel.setLayoutX(140);
                            titleLabel.setLayoutY(40);
                            layout2.getChildren().add(titleLabel);

                            Label nameLabel = new Label("Enter animal name:");
                            nameLabel.setFont(new Font("Cambria", 13));
                            nameLabel.setLayoutX(170);
                            nameLabel.setLayoutY(114);
                            layout2.getChildren().add(nameLabel);

                            TextField nameField = new TextField();
                            nameField.setPromptText("No Name Yet");
                            nameField.setFocusTraversable(false);
                            nameField.setLayoutX(143);
                            nameField.setLayoutY(140);
                            layout2.getChildren().add(nameField);

                            Label healthLabel = new Label("Enter health here:");
                            healthLabel.setFont(new Font("Cambria", 13));
                            healthLabel.setLayoutX(173);
                            healthLabel.setLayoutY(190);
                            layout2.getChildren().add(healthLabel);

                            TextField healthField = new TextField();
                            healthField.setLayoutX(145);
                            healthField.setLayoutY(213);
                            healthField.setPromptText("Integer from 1 to 5");
                            healthField.setFocusTraversable(false);
                            layout2.getChildren().add(healthField);

                            Label typeLabel = new Label("Pick animal type:");
                            typeLabel.setFont(new Font("Cambria", 13));
                            typeLabel.setLayoutX(173);
                            typeLabel.setLayoutY(262);
                            layout2.getChildren().add(typeLabel);

                            ComboBox<Animal> animalType = new ComboBox<>();
                            animalType.setLayoutX(165);
                            animalType.setLayoutY(288);
                            animalType.getItems().addAll(
                                    Animal.DOG,
                                    Animal.CAT,
                                    Animal.SQUIRREL,
                                    Animal.BIRD
                            );
                            layout2.getChildren().add(animalType);


                            Button closeBtn = new Button("Close queue window");
                            closeBtn.setLayoutX(165);
                            closeBtn.setLayoutY(400);
                            closeBtn.setOnAction(e -> window.close());
                            layout2.getChildren().addAll(closeBtn);

                            Button addBtn = new Button("Add animal");
                            addBtn.setLayoutX(500);
                            addBtn.setLayoutY(350);
                            layout2.getChildren().add(addBtn);
                            addBtn.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent actionEvent) {
                                    String animalName = new String();
                                    String animalHealth = new String();
                                    String animalTypes = new String();
                                    animalTypes = ("Animal Type: " + String.valueOf(animalType.getValue()));
                                    if (animalType.getValue().equals(Animal.DOG)) {
//                                        backgroundType = "dog";
                                        backgroundList.add("dog");
                                    } else if (animalType.getValue().equals(Animal.CAT)) {
//                                        backgroundType = "cat";
                                        backgroundList.add("cat");
                                    } else if (animalType.getValue().equals(Animal.BIRD)) {
//                                        backgroundType = "bird";
                                        backgroundList.add("bird");
                                    } else if (animalType.getValue().equals(Animal.SQUIRREL)) {
//                                        backgroundType = "squirrel";
                                        backgroundList.add("squirrel");
                                    }
                                    if (healthField.getText().equals("1")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else if (healthField.getText().equals("2")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else if (healthField.getText().equals("Animal Health: 3")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else if (healthField.getText().equals("Animal Health: 4")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else if (healthField.getText().equals("Animal Health: 5")) {
                                        animalHealth = ("Animal Health: " + healthField.getText());
                                    } else {
                                        animalHealth = ("Animal Health: 5");
                                    }
                                    if (nameField.getText().isEmpty()) {
                                        animalName = ("Name: No name yet");
                                    } else {
                                        animalName = ("Name: " + nameField.getText());
                                    }
                                    queueList.add(animalName + "\n" + animalHealth + "\n" + animalTypes);
                                    window.close();
                                    Alert added = new Alert(Alert.AlertType.CONFIRMATION);
                                    added.setTitle("Queue Confirmation");
                                    added.setHeaderText("Your(" + animalTypes + ")has been added to the queue!");
                                    int before = queueList.size() - 1;
                                    added.setContentText("There are " + before + " animals before you");
                                    added.showAndWait();
                                }
                            });

                            Scene scene = new Scene(layout2, 450, 450);
                            window.setScene(scene);
                            window.showAndWait();
                        }
                    }
                }
            }
        });


        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }


}
