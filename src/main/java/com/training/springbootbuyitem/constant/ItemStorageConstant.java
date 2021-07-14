package com.training.springbootbuyitem.constant;

public class ItemStorageConstant {

    /**
     * Entities
     */
    public static final String ITEM = "Item";

    /**
     * Header Names
     */
    public static final String TRACE_ID_HEADER = "Trace-Id";

    /**
     * Messages
     */
    public static final String ENTITY_NOT_FOUND_MSG = "Entity {%s} :: UID {%s} not found.";
    public static final String LOGGING_HANDLER_INBOUND_MSG = "Received HTTP [%s] Request to [%s] at [%s]";
    public static final String LOGGING_HANDLER_OUTBOUND_MSG = "Responded with Status [%s] at [%s]";
    public static final String LOGGING_HANDLER_PROCESS_TIME_MSG = "Total processing time [%s] ms";

    public static final String TRACE_ID = "TraceId";
    public static final String OPERATION = "OPERATION";
}
