
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class DealerTableModel extends AbstractTableModel {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private String[] COLNAMES = {"Marke", "Baujahr", "Kilometerstand", "Listenpreis"};

    @Override
    public int getRowCount() {
        return vehicles.size();
    }

    @Override
    public int getColumnCount() {
        return COLNAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vehicle v = vehicles.get(rowIndex);
        return v;

    }

    @Override
    public String getColumnName(int column) {
        return COLNAMES[column];
    }

    public void add(Vehicle v) {
        vehicles.add(v);
        fireTableRowsInserted(vehicles.size() - 1, vehicles.size() - 1);
    }

}
