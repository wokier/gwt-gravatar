package com.github.wokier.gwt.client;

import com.google.gwt.cell.client.ImageCell;
import com.google.gwt.user.cellview.client.Column;

/**
 * Gravatar CellTable Column
 * 
 * @author francois wauquier
 * 
 * @param <T>
 */
public abstract class GravatarColumn<T> extends Column<T, String> {

    /**
     * Constructor
     */
    public GravatarColumn() {
	super(new ImageCell());
    }

    public String getValue(T object) {
	return GravatarUrlBuilder.get().build(getEmail(object));
    }

    /**
     * To implement to extract the email from your model
     * 
     * @param object
     * @return
     */
    protected abstract String getEmail(T object);

}
