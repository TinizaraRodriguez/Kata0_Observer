
package kata0_observer;

import javax.swing.JTextArea;


public class DigitalClockDisplay extends ClockDisplay{

    public DigitalClockDisplay(String title) {
        super(title);
    }
    
    @Override
    public void refreshClockDisplay(JTextArea textArea, String hour, String minute, String second) {
        textArea.setText("DIGITAL CLOCK: " + hour + ":" + minute + ":" + second);
    }
    
}
