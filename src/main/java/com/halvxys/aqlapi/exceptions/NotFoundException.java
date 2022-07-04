package com.halvxys.aqlapi.exceptions;

import com.halvxys.aqlapi.utils.MessageUtils;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
