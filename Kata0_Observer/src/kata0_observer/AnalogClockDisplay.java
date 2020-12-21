
package kata0_observer;

import javax.swing.JTextArea;


public class AnalogClockDisplay extends ClockDisplay {

    public AnalogClockDisplay(String title) {
        super(title);
    }
    
    @Override
    public void refreshClockDisplay(JTextArea textArea, String hour, String minute, String second) {
        textArea.setText("ANALOG CLOCK: " + hour + ":" + minute + ":" + second);
    }

}
  