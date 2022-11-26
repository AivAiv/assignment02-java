package Communication;

import application.GUIController;

public class CommController {
    
    GUIController guiC;
    
    public CommController(GUIController guiC){
        this.guiC = guiC;
    }

	public void communicate() throws Exception {	
	        SerialCommChannel channel = new SerialCommChannel("COM4",9600);
		System.out.println("Waiting Arduino for rebooting...");		
		Thread.sleep(4000);
		System.out.println("Ready.");

		while (true){
			String msg = channel.receiveMsg();
			System.out.println(msg);
			if() {
			    
			}
			Thread.sleep(500);
		}
	}
	
}
