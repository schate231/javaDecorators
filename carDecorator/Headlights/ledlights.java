package carDecorator.Headlights;
import carBody.baseBody;

public class ledlights extends baseHeadlights{
    public ledlights(baseBody autoBody){
        super(autoBody);
        this.price = 900;
    }

    public String getDescription(){
        return baseBody.getDescription() + "+ LED Lights";
    }
}
