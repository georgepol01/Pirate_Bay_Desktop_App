package controllers;

import java.util.HashMap;
import javax.swing.JPanel;
import views.CustomerPanel;
import views.MainFrame;
import views.MainPanel;
import views.RentPanel;
import views.WelcomeFrame;
import views.IRestorableJPanel;
import views.QueryPanel;
import views.StoresPanel;
import views.TitlesPanel;

public class MainController {

    private MainFrame mainFrame = new MainFrame();
    private HashMap<Class, IRestorableJPanel> panels = new HashMap<>();
    private static MainController instance;
        
    private MainController() {
        panels.put(MainPanel.class, new MainPanel());
        panels.put(RentPanel.class, new RentPanel());
        panels.put(StoresPanel.class, new StoresPanel());
        panels.put(QueryPanel.class, new QueryPanel());
        panels.put(CustomerPanel.class, new CustomerPanel());
        panels.put(TitlesPanel.class, new TitlesPanel());
        new WelcomeFrame();
    }
 
    public void setPanel(Class<? extends JPanel> jPanelClass) {
        IRestorableJPanel myPanel = panels.get(jPanelClass);
        mainFrame.setMainPanel((JPanel) myPanel);
    }

    public void setVisible() {
        mainFrame.setVisible(true);
    }
    
    public static MainController getInstance() {
        if (instance == null) {
            instance = new MainController();
        }
        return instance;
    }
}
