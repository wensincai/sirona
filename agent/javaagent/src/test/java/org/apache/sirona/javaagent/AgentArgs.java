/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sirona.javaagent;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 */
@Target( ElementType.METHOD)
@Retention ( RetentionPolicy.RUNTIME )
public @interface AgentArgs
{

    boolean removeTargetClassesFromClasspath() default true;

    boolean removeSironaFromClasspath() default true;

    String value() default "";

    String maxMem() default "";

    String minMem() default "";

    boolean noVerify() default false;

    /**
     *
     * @return system properties to use in the forked agent format: props1=value|props2=value
     */
    String sysProps() default "";

    /**
     * to setup extra vm args i.e -XX....
     * @return
     * @since 0.3
     */
    String[] vmArgs() default "";
}
