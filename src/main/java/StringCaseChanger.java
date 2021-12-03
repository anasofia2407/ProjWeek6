public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String aux="";
        for (int i = 0;i<drink.getText().length();i++){
            if(Character.isLowerCase(drink.getText().charAt(i))){
                aux+=Character.toUpperCase(drink.getText().charAt(i));
            }
            else{
                aux+=Character.toLowerCase(drink.getText().charAt(i));
            }

        }
        drink.setText(aux);
    }
}
