package carDecorator.Paint;


import carBody.baseBody;

public class matteblack extends basepaint{
    public matteblack(baseBody autoBody){
        super(autoBody);
        this.price = 700;
    }

    public String getDescription(){
        return baseBody.getDescription() + "+ Matte Black Paint";
    }
}
