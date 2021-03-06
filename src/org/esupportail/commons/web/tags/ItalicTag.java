/**
 * ESUP-Portail Commons - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-commons
 */
package org.esupportail.commons.web.tags;


/**
 * ESUP-Portail implementation of the 'italic' tag.
 */
public class ItalicTag extends TextTag {

	/**
	 * The italic style.
	 */
	private static final String ITALIC_STYLE = "font-style: italic; "; 
	
	/**
	 * Constructor.
	 */
	public ItalicTag() {
		super();
	}
	
	/**
	 * @see org.esupportail.commons.web.tags.AbstractWrapperTag#getStyle()
	 */
	@Override
	protected String getStyle() {
		return ITALIC_STYLE;
	}
}
