package org.apache.kafka.clients.producer.internals;

import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.record.Record;

/**
 * @author Michael Yeskov
 */
public class RawProducedRecord {

    private byte[] key;
    private byte[] value;
    private Header[] headers;

    public RawProducedRecord(byte[] key, byte[] value, Header[] headers) {
        this.key = key;
        this.value = value;
        this.headers = headers;
        if (this.headers == null) {
            this.headers = Record.EMPTY_HEADERS;
        }
    }

    public byte[] getKey() {
        return key;
    }

    public void setKey(byte[] key) {
        this.key = key;
    }

    public byte[] getValue() {
        return value;
    }

    public void setValue(byte[] value) {
        this.value = value;
    }

    public Header[] getHeaders() {
        return headers;
    }

    public void setHeaders(Header[] headers) {
        this.headers = headers;
    }
}
