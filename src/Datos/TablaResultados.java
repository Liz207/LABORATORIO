package Datos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/** Copia un resultado JDBC a una tabla Swing sin depender de rs2xml. */
public final class TablaResultados {
    private TablaResultados() { }

    public static TableModel resultSetToTableModel(ResultSet resultado) {
        try {
            ResultSetMetaData datos = resultado.getMetaData();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= datos.getColumnCount(); i++) {
                modelo.addColumn(datos.getColumnLabel(i));
            }
            while (resultado.next()) {
                Object[] fila = new Object[datos.getColumnCount()];
                for (int i = 0; i < fila.length; i++) fila[i] = resultado.getObject(i + 1);
                modelo.addRow(fila);
            }
            return modelo;
        } catch (SQLException error) {
            throw new IllegalStateException("No se pudo cargar la tabla", error);
        }
    }
}
