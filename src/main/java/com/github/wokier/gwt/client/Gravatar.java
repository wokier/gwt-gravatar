package com.github.wokier.gwt.client;

import java.security.NoSuchAlgorithmException;

import com.google.gwt.core.client.impl.Md5Digest;
import com.google.gwt.user.client.ui.Image;
import com.googlecode.gwt.crypto.bouncycastle.util.encoders.Hex;

/**
 * Gravatar Image
 * 
 * @author francois wauquier
 * 
 */
public class Gravatar extends Image {

    /**
     * Constructor
     * 
     * @param email
     */
    public Gravatar(String email) {
	setUrl("http://www.gravatar.com/avatar/" + hash(email));
    }

    private String hash(String email) {
	try {
	    String cleanEmail = email.trim().toLowerCase();
	    return new String(Hex.encode(Md5Digest.getInstance("MD5").digest(cleanEmail.getBytes())));
	} catch (NoSuchAlgorithmException e) {
	    throw new RuntimeException("MD5 implementation not found", e);
	}
    }

}
