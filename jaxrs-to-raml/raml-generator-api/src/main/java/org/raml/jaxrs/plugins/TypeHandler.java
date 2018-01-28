/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.plugins;

import org.raml.api.RamlEntity;
import org.raml.builder.TypeBuilder;
import org.raml.jaxrs.types.TypeRegistry;

import java.io.IOException;

/**
 * Created by Jean-Philippe Belanger on 3/26/17. Just potential zeroes and ones
 */
public interface TypeHandler {

  TypeBuilder writeType(TypeRegistry registry, RamlEntity type) throws IOException;

}
