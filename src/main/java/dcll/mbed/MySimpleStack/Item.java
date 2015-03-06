package dcll.mbed.MySimpleStack;

/**
 * Created by Max on 06/03/2015.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * Un commentaire repondant a l'exigence #1
     * @return
     */

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
