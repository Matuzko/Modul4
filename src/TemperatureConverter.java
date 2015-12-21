/**
 * Created by Дима on 21.12.2015.
 */
public class TemperatureConverter {

    public static float fromFarengToCel (int tempFar){
        float temp = (5*tempFar-160)/9;
        return temp;
    }
    public static float fromCelToFareng (int tempCel){
        float temp = (tempCel*9)/5+32;
        return temp;
    }
}
