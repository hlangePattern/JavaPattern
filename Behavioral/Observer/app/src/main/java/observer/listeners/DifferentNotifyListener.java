package observer.listeners;

import java.io.File;

public class DifferentNotifyListener implements EventListener {

    private String exampleText; 

    public DifferentNotifyListener (String text){
        this.exampleText = text;
    }
    @Override
    public void update(String eventType, File file) {
        System.out.println("Set Text for nofication"+exampleText +" for file: "+ file.getName());
    }
    
}
