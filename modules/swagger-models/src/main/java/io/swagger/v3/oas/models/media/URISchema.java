package io.swagger.v3.oas.models.media;

import java.net.URI;
import java.util.Objects;

public class URISchema extends Schema<URI> {

    public URISchema() {
        super("string", "uri");
    }

    public URISchema type(String type) {
        super.setType(type);
        return this;
    }

    public URISchema format(String format) {
        super.setFormat(format);
        return this;
    }

    public URISchema _default(String _default) {
        super.setDefault(_default);
        return this;
    }

    @Override
    protected URI cast(Object value) {
        if (value != null) {
            try {
                if (value instanceof URI) {
                    return (URI) value;
                } else if (value instanceof String) {
                    return URI.create((String) value);
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public URISchema addEnumItem(URI _enumItem) {
        super.addEnumItemObject(_enumItem);
        return this;
    }

    @Override
    public boolean equals(Object o) {
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
