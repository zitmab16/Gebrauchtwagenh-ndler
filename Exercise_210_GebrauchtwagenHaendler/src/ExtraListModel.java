
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class ExtraListModel extends AbstractListModel {

    private ArrayList extras = new ArrayList();

    @Override
    public int getSize() {
        return extras.size();
    }

    @Override
    public Object getElementAt(int index) {
        return extras.get(index);
    }
    public void loadExtras(ArrayList extras){
        
    }

}
