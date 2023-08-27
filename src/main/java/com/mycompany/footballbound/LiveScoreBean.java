/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package com.mycompany.footballbound;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class LiveScoreBean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "scoreLine";
    
    private String scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreLine() {
        return scoreLine; 
    }
    
    public void setScoreLine(String value) {
        String oldValue = this.scoreLine;
        this.scoreLine = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, this.scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
