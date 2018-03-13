package fernandez.pau.shoppinglist;

/**
 * Created by marcmc6 on 13/03/2018.
 */

public class ShoppingItem {
    private String text;
    private boolean checked;

    //creat automaticament amb el generador d'android studio (code>generate o alt+insert)

    public ShoppingItem(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    public ShoppingItem(String text) {//si només rep el text
        this.text = text;
        this.checked = false;//chacked false
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void toggleChecked(){
        this.checked = !this.checked;
    }
}
