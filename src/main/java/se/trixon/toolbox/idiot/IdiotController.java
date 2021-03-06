/* 
 * Copyright 2017 Patrik Karlsson.
 *
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
 */
package se.trixon.toolbox.idiot;

import java.util.ResourceBundle;
import org.openide.util.lookup.ServiceProvider;
import org.openide.util.lookup.ServiceProviders;
import se.trixon.toolbox.core.ToolProvider;
import se.trixon.toolbox.core.base.ToolController;
import se.trixon.toolbox.core.base.ToolTopComponent;
import se.trixon.almond.nbp.news.NewsProvider;

/**
 *
 * @author Patrik Karlsson
 */
@ServiceProviders(value = {
    @ServiceProvider(service = ToolProvider.class),
    @ServiceProvider(service = NewsProvider.class)}
)
public class IdiotController extends ToolController {

    public static final String LOG_TAG = "Idiot";

    public IdiotController() {
    }

    public IdiotController(ToolTopComponent toolTopComponent) {
        super(toolTopComponent);
    }

    @Override
    public ResourceBundle getNewsBundle() {
        return ResourceBundle.getBundle(getPackageAsPath() + "news");
    }
}
