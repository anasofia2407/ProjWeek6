public class StringReplacer implements StringTransformer {
    private Character cpt;
    private Character cpm;
    StringReplacer(Character cpt,Character cpm){
        this.cpt=cpt;
        this.cpm=cpm;
    }
    @Override
    public void execute(StringDrink drink) {
        String aux="";
        aux= drink.getText().replace(cpt,cpm);
        drink.setText(aux);
    }

    @Override
    public void undo(StringDrink drink) {
        String aux="";
        aux= drink.getText().replace(cpm,cpt);
        drink.setText(aux);
    }
}
