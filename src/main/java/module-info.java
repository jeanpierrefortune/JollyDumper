module org.calypsonet.jollydumper {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.slf4j;

    opens org.calypsonet.jollydumper to javafx.fxml;
    exports org.calypsonet.jollydumper;
}