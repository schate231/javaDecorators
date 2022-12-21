package carDecorator.Headlights;

import carBody.baseBody;

public class laserlight extends baseHeadlights{
    public laserlight(baseBody autoBody){
        super(autoBody);
        this.price = 1500;
    }

    public String getDescription(){
        return baseBody.getDescription() + "+ Laser Lights";
    }
}
