package carDecorator.Bumper;
import carBody.baseBody;
import carDecorator.baseAutoDecorator;

public class baseBumper extends baseAutoDecorator{

    public baseBody baseBody;

    public baseBumper(baseBody autoBody){
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
