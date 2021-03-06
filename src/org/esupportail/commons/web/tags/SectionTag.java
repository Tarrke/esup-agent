/**
 * ESUP-Portail Commons - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-commons
 */
package org.esupportail.commons.web.tags;

import org.esupportail.commons.web.renderers.SectionRenderer;
import org.esupportail.commons.web.tags.config.TagsConfigurator;

/**
 * ESUP-Portail implementation of the 'section' tag.
 */
public class SectionTag extends AbstractStyleClassWrapperTag {

	/**
	 * Constructor.
	 */
	public SectionTag() {
		super();
	}
	
	/**
	 * @see org.apache.myfaces.taglib.html.HtmlOutputFormatTag#getRendererType()
	 */
	@Override
	public String getRendererType() {
		return SectionRenderer.RENDERER_TYPE;
	}

	/**
	 * @see org.esupportail.commons.web.tags.AbstractStyleClassWrapperTag#getStyleClass()
	 */
	@Override
	protected String getStyleClass() {
		return TagsConfigurator.getInstance().getSectionStyleClass();
	}
}
