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
package server.raml08;

import example.simpleraml08.ApiRequest;
import example.simpleraml08.Jobs;
import example.simpleraml08.JobsPostApplicationJson;

/**
 * Created by Jean-Philippe Belanger on 11/11/16. Just potential zeroes and ones
 */
public class JobsImpl implements Jobs {

  @Override
  public PostJobsResponse postJobs(ApiRequest entity) {
    return null;
  }

  @Override
  public PostJobsResponse postJobs(JobsPostApplicationJson entity) {
    return null;
  }
}
