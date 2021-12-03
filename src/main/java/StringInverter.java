public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String aux="";
        for (int i = drink.getText().length()-1;i>-1;i--){
            aux=aux + drink.getText().charAt(i);
        }
        drink.setText(aux);
    }
}
