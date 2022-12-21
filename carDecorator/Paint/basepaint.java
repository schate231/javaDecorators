package carDecorator.Paint;

import carBody.baseBody;
import carDecorator.baseAutoDecorator;

public abstract class basepaint extends baseAutoDecorator{
    public baseBody baseBody;

    public basepaint(baseBody autoBody){
        this.baseBody = autoBody;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return (this.baseBody.getPrice() + this.price);
    }
}
