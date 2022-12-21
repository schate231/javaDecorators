package carDecorator.Bumper;
import carBody.baseBody;

public class stepbumper extends baseBumper{
    public stepbumper(baseBody autoBody){
        super(autoBody);
        this.price = 700;
    }

    public String getDescription(){
        return baseBody.getDescription() + "+ Step Bumper";
    }
}
