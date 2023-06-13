module MP3Player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires jid3lib;

    exports com.course.mp3player.main;

    opens com.course.mp3player.controller to javafx.fxml;
    opens com.course.mp3player.mp3 to javafx.base;
}