package carDecorator.Headlights;

import carBody.baseBody;

public class hidlights extends baseHeadlights{
    public hidlights(baseBody autoBody){
        super(autoBody);
        this.price = 400;
    }

    public String getDescription(){
        return baseBody.getDescription() + "+ HID Lights";
    }
}
