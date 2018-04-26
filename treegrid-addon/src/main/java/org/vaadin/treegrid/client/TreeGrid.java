package org.vaadin.treegrid.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.vaadin.v7.client.widget.grid.events.BodyClickHandler;
import com.vaadin.v7.client.widgets.Escalator;
import com.vaadin.v7.client.widgets.Grid;

import elemental.json.JsonObject;

public class TreeGrid extends Grid<JsonObject> {

    /**
     * Method for accessing the private {@link Grid#focusCell(int, int)} method from this package
     */
    native void focusCell(int rowIndex, int columnIndex)/*-{
        this.@com.vaadin.v7.client.widgets.Grid::focusCell(II)(rowIndex, columnIndex);
    }-*/;

    /**
     * {@inheritDoc}
     * Exposed for compatibility with Vaadin 7.7.6
     */
    @Override
    public Escalator getEscalator() {
        return super.getEscalator();
    }

    /**
     * Method for accessing the private {@link Grid#isElementInChildWidget(Element)} method from this package
     */
    native boolean isElementInChildWidget(Element e)/*-{
        return this.@com.vaadin.v7.client.widgets.Grid::isElementInChildWidget(*)(e);
    }-*/;

    // Register click handler with the TreeGridClickEvent subclass instead
    @Override
    public HandlerRegistration addBodyClickHandler(BodyClickHandler handler) {
        return addHandler(handler, TreeGridClickEvent.TYPE);
    }
}
