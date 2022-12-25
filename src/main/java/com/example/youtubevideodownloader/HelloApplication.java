package com.example.youtubevideodownloader;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    private String downloadPath;
    private String videoUrlPath;

    @Override
    public void start(Stage stage) throws IOException {

        stage.setFullScreen(true);
        stage.setTitle("Youtube Video Downloader");

        //Input Link URL:
        Label labellinkURL = new Label("Youtube Video Link");
        TextField linkTextField = new TextField();
        videoUrlPath = linkTextField.getText();

        //Quality of input:
        Label labelVideoQuality = new Label("Quality of video output");
        ToggleGroup groupQuality = new ToggleGroup();
        RadioButton lowQuality = new RadioButton("Low");
        RadioButton mediumQuality = new RadioButton("Medium");
        RadioButton highQuality = new RadioButton("High");

        //Video Download Location:
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(stage);
        downloadPath = selectedDirectory.getAbsolutePath();


    }

    public static void main(String[] args) {
        launch(args);
    }
}