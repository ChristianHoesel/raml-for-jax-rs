/*
 * Copyright 2013-2018 (c) MuleSoft, Inc.
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
package org.raml.jaxrs.converter.model;

import com.google.common.base.Optional;
import org.raml.api.RamlFormParameter;
import org.raml.jaxrs.model.JaxRsFormParameter;

import java.lang.reflect.Type;

/**
 * Created by Jean-Philippe Belanger on 4/2/17. Just potential zeroes and ones
 */
public class JaxRsRamlFormParameter implements RamlFormParameter {

  private final JaxRsFormParameter jaxRsFormParameter;

  public JaxRsRamlFormParameter(JaxRsFormParameter jaxRsFormParameter) {

    this.jaxRsFormParameter = jaxRsFormParameter;
  }

  public static RamlFormParameter create(JaxRsFormParameter jaxRsHeaderParameter) {

    return new JaxRsRamlFormParameter(jaxRsHeaderParameter);
  }

  @Override
  public String getName() {
    return this.jaxRsFormParameter.getName();
  }

  @Override
  public Optional<String> getDefaultValue() {
    return this.jaxRsFormParameter.getDefaultValue();
  }

  @Override
  public Type getType() {
    return this.jaxRsFormParameter.getType();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder(this.getClass().getSimpleName());
    builder.append("{ ");
    builder.append("name: ").append(this.getName());
    builder.append(" }");
    return builder.toString();
  }

}
