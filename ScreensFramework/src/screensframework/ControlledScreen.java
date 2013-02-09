/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package screensframework;

/**
 *
 * @author Angie
 */
public interface ControlledScreen {
    
    //This method will allow the injection of the Parent ScreenPane
    public void setScreenParent(ScreensController screenPage);
}
