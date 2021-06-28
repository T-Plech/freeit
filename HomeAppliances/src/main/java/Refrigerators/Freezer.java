package Refrigerators;

import HomeAppliances.HomeAppliances;

public interface Freezer extends HomeAppliances {
    void makeIce();
    void freeze();
    int freezerDegree = -18;
}
