
import java.awt.Color;
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();

        label.setText(value.toString());

        Vehicle v = (Vehicle) value;

        switch (column) {
            case 0:
                label.setText(v.getMarke());
                break;
            case 1:
                label.setText(v.getBaujahr());
                break;
//case 1:label.setText(String.format("%s",v.getBaujahr().format(DateTimeFormatter.ofPattern("yyyy")))); break;
            case 2:
                label.setText(String.format("%.2f", v.getKm()));
                break;
            case 3:
                label.setText(String.format("%.2f", v.calcPrice()));
                break;
        }
        label.setOpaque(true);
        label.setBackground(Color.white);
        if (hasFocus) {
            label.setBackground(Color.gray);
        }

        return label;
    }

}
