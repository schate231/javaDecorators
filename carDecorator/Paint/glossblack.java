package carDecorator.Paint;

import carBody.baseBody;

public class glossblack extends basepaint{
    public glossblack(baseBody autoBody){
        super(autoBody);
        this.price = 500;
    }

    public String getDescription(){
        return baseBody.getDescription() + "+ Gloss Black Paint";
    }
}
