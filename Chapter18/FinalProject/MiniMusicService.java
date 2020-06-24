package Chapter18.FinalProject;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniMusicService implements Service {
    
    MyDrawPanel myPanel;

    @Override
    public JPanel getGuiPanel() {
        JPanel mainPanel = new JPanel();
        myPanel = new MyDrawPanel();
        JButton playIButton = new JButton("Play it");
        playIButton.addActionListener(new PlayItListener());
        mainPanel.add(myPanel);
        mainPanel.add(playIButton);
        return mainPanel;
    }

    public class PlayItListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Sequencer sequencer = MidiSystem.getSequencer();
                sequencer.open();
    
                int[] eventsIWant = {127};
                sequencer.addControllerEventListener(myPanel, eventsIWant);
    
                Sequence seq = new Sequence(Sequence.PPQ, 4);
                Track track = seq.createTrack();
                
                for (int i = 0; i < 100; i+=4) {
                    int r = (int) (Math.random()*50 + 1);
                    if (r < 38) {
                        track.add(makeEvent(144, 1, r, 100, i));
                        track.add(makeEvent(176, 1, 127, 0, i));
                        track.add(makeEvent(128, 1, r, 100, i+2));  
                    }
                }
    
                sequencer.setSequence(seq);
                sequencer.setTempoInBPM(220);
                sequencer.start();
            } catch (Exception ex) {ex.printStackTrace();}
        }
    }
    
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {}
        return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;
        
        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(300, 300);
        }
     
        @Override
        public void paintComponent(Graphics g) {
            if (msg) {
                Graphics2D g2 = (Graphics2D) g;
                
                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g.setColor(new Color(r, gr, b));

                int ht = (int) (Math.random() * 120 + 10);
                int width = (int) (Math.random() * 120 + 10);
                int x = (int) (Math.random()*40 + 100);
                int y = (int) (Math.random()*40 + 100);

                g.fillRect(x, y, width, ht);
                msg = false;
            }
        }
    }
}