import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> transformers;
    StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers=transformers;
    }
    public void execute(StringDrink drink){
        for(int i=0;i<transformers.size();i++){
            transformers.get(i).execute(drink);
        }
    }

    @Override
    public void undo(StringDrink drink) {
        for(int i=0;i<transformers.size();i++){
            transformers.get(i).undo(drink);
        }
    }
}
