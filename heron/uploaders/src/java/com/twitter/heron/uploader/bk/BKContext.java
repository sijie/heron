//  Copyright 2017 Twitter. All rights reserved.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.twitter.heron.uploader.bk;

import com.twitter.heron.spi.common.Config;
import com.twitter.heron.spi.common.Context;

final class BKContext extends Context {

  public static final String DL_CONFIG_DIR = "heron.uploader.bk.config.dir";
  public static final String DL_TOPOLOGIES_NS_URI = "hero.uploader.bk.topologies.namespace.uri";

  private BKContext() {
  }

  public static String dlConfigDir(Config config) {
    return config.getStringValue(DL_CONFIG_DIR);
  }

  public static String dlTopologiesNamespaceURI(Config config) {
    return config.getStringValue(DL_TOPOLOGIES_NS_URI);
  }

}