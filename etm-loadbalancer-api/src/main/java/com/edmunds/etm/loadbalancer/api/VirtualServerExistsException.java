/*
 * Copyright 2011 Edmunds.com, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.edmunds.etm.loadbalancer.api;

/**
 * This exception indicates that a virtual server already exists on a load balancer.
 * <p/>
 * It is thrown e.g. when attempting to create a duplicate virtual server.
 *
 * @author Ryan Holmes
 */
public class VirtualServerExistsException extends Exception {

    public VirtualServerExistsException(String message) {
        super(message);
    }

    public VirtualServerExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public VirtualServerExistsException(Throwable cause) {
        super(cause);
    }
}
