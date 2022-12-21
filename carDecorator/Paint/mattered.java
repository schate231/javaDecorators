package carDecorator.Paint;
import carBody.baseBody;

public class mattered extends basepaint{
    public mattered(baseBody autoBody){
        super(autoBody);
        this.price = 700;
    }

    public String getDescription(){
        return baseBody.getDescription() + "+ Matte Red Paint";
    }
}
