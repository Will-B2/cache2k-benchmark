package org.cache2k.benchmark;

/*
 * #%L
 * zoo
 * %%
 * Copyright (C) 2013 - 2016 headissue GmbH, Munich
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.cache2k.benchmark.impl2015.ClockCache;

/**
 * Run benchmark collection on the CLOCK implementation.
 *
 * @author Jens Wilke; created: 2013-06-13
 * @see ClockCache
 */
public class ClockCacheBenchmark extends BenchmarkCollection {

  {
    factory = new Cache2k2015Factory().implementation(ClockCache.class);
  }

}
