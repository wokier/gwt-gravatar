package com.github.wokier.gwt.client;

import org.junit.Test;

import com.google.gwt.junit.client.GWTTestCase;

public class GravatarImageTest extends GWTTestCase {

    @Override
    public String getModuleName() {
	return "com.github.wokier.gwt.Gravatar";
    }

    @Test
    public void test() throws Exception {
	GravatarImage gravatar = new GravatarImage("wokier@gmail.com");
	{
	    assertEquals("http://www.gravatar.com/avatar/0f243c44c7d921cb41ebdfcf8202b0c3", gravatar.getUrl());
	}
    }
}
