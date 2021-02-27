package org.sg.campus.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("booleanToYesNoConverter")
public class BooleanToYesNoConverter implements Converter {

    public BooleanToYesNoConverter() {
    }

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String param) {
        try {
            Boolean result = Boolean.parseBoolean(param);
            return result;
        } catch (Exception exception) {
            throw new ConverterException(exception);
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object obj) {
        try {
            if (obj != null && ((Boolean) obj)) {
                return "YES";
            } else {
                return "NO";
            }
        } catch (Exception exception) {
            throw new ConverterException(exception);
        }
    }
}