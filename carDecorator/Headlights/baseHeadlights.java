package carDecorator.Headlights;
import carBody.baseBody;
import carDecorator.baseAutoDecorator;

public class baseHeadlights extends baseAutoDecorator{

    public baseBody baseBody;

    public baseHeadlights(baseBody autoBody){
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
