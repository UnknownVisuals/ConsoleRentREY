module com.consolesrr.consolesrentrey {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.consolesrr.consolesrentrey to javafx.fxml;
    exports com.consolesrr.consolesrentrey;
}