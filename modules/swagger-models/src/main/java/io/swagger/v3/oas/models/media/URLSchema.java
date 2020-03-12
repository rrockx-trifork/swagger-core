package io.swagger.v3.oas.models.media;

import java.net.URL;
import java.util.Objects;

public class URLSchema extends Schema<URL> {

    public URLSchema() {
        super("string", "url");
    }

    public URLSchema type(String type) {
        super.setType(type);
        return this;
    }

    public URLSchema format(String format) {
        super.setFormat(format);
        return this;
    }

    public URLSchema _default(String _default) {
        super.setDefault(_default);
        return this;
    }

    @Override
    protected URL cast(Object value) {
        if (value != null) {
            try {
                if (value instanceof URL) {
                    return (URL) value;
                } else if (value instanceof String) {
                    return new URL((String) value);
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public URLSchema addEnumItem(URL _enumItem) {
        super.addEnumItemObject(_enumItem);
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class URLSchema {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
