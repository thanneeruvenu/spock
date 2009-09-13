/*
 * Copyright 2009 the original author or authors.
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

package org.spockframework.guice

import com.google.inject.AbstractModule
import com.google.inject.name.Names

class Module extends AbstractModule {
  protected void configure() {
    bind(IService).to(Service)

    bind(String).annotatedWith(Names.named("value1")).toInstance("named value 1")
    bind(String).annotatedWith(Names.named("value2")).toInstance("named value 2")

    bind(String).annotatedWith(BindingAnnotation1).toInstance("annotated value 1")
    bind(String).annotatedWith(BindingAnnotation2).toInstance("annotated value 2")
  }
}