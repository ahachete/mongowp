/*
 * This file is part of MongoWP.
 *
 * MongoWP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MongoWP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with bson. If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2016 8Kdata.
 * 
 */

package com.eightkdata.mongowp.bson.impl;

import com.eightkdata.mongowp.bson.abst.AbstractBsonDateTime;
import org.threeten.bp.Instant;

/**
 *
 */
public class InstantBsonDateTime extends AbstractBsonDateTime {

    private static final long serialVersionUID = 5915921994779799275L;

    private final Instant delegate;

    public InstantBsonDateTime(Instant delegate) {
        this.delegate = delegate;
    }

    @Override
    public long getMillisFromUnix() {
        return delegate.toEpochMilli();
    }

    @Override
    public Instant getValue() {
        return delegate;
    }

}
