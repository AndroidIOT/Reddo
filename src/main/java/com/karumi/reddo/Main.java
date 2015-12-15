/*
 * Copyright (C) 2015 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.karumi.reddo;

import com.karumi.reddo.config.ReddoConfig;
import com.karumi.reddo.config.TypesafeHubReddoConfig;
import com.karumi.reddo.task.ReddoTask;
import com.karumi.reddo.view.View;
import java.util.Collection;

public class Main {

  public static void main(String[] args) {
    ReddoConfig config = new TypesafeHubReddoConfig();
    View view = config.getView();
    Reddo reddo = new Reddo(view);
    Collection<ReddoTask> tasksFromConfig = config.getTasks();
    reddo.addTasks(tasksFromConfig);
    reddo.evaluateTasks();
  }
}