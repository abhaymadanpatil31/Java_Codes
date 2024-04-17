

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/*public class OpenURL {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    desktop.browse(new URI(url));
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
            } else {
                // Handle the case where browsing is not supported
                // You could use an alternative method here
            }
        } else {
            // Handle the case where the Desktop API is not supported
            // You could use an alternative method here
        }
    }
}*/


import java.net.*;
import java.awt.*;
import java.io.*;

class openWebsite {

	public static void main(String[] args) throws IOException,URISyntaxException {
	
		String url = "www.core2web.com";
		URI obj = new URI(url);
		Desktop desk = Desktop.getDesktop();
		desk.browse(obj);
	}
}
