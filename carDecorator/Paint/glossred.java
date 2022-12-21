package carDecorator.Paint;


import carBody.baseBody;

public class glossred extends basepaint{
    public glossred(baseBody autoBody){
        super(autoBody);
        this.price = 500;
    }

    public String getDescription(){
        return baseBody.getDescription() + "+ Gloss Red Paint";
    }
}
