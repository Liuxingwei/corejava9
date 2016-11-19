/**
 * Created by match on 2016-11-19.
 */
public class Constants
{
    public static final double CM_PER_INCH = 2.54;

    public static void main (String[] args)
    {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Pager size is centimeters: "
                + paperWidth * Constants.CM_PER_INCH + " by " + paperHeight * Constants.CM_PER_INCH);
        Constants constants = new Constants();
        System.out.println("Pager size is centimeters: "
                + paperWidth * constants.CM_PER_INCH + " by " + paperHeight * constants.CM_PER_INCH);
        System.out.println("Pager size is centimeters: "
                + paperWidth * constants.getCmPerInch() + " by " + paperHeight * constants.getCmPerInch());
    }

    public double getCmPerInch ()
    {
        return this.CM_PER_INCH;
    }
}
