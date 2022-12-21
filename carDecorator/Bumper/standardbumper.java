package carDecorator.Bumper;
import carBody.baseBody;

public class standardbumper extends baseBumper{
    public standardbumper(baseBody autoBody){
        super(autoBody);
        this.price = 500;
    }

    public String getDescription(){
        return baseBody.getDescription() + "+ Standard Bumper";
    }
}
