package Stoves;
import HomeAppliances.HomeAppliances;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString


public abstract class Hob implements HomeAppliances{
    private String brand;
    private String model;
private String coating;

    public void burnerOn(){
    }
    public void burnerOff(){
    }




}
