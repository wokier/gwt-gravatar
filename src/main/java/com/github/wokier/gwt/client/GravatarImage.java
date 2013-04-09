package com.github.wokier.gwt.client;

import com.google.gwt.user.client.ui.Image;

/**
 * Gravatar Image
 * 
 * @author francois wauquier
 * 
 */
public class GravatarImage extends Image {

    /**
     * Constructor
     * 
     * @param email
     */
    public GravatarImage(String email) {
	setUrl(GravatarUrlBuilder.get().build(email));
    }

}
