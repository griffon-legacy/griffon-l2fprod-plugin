/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import groovy.swing.factory.RichActionWidgetFactory
import groovy.swing.factory.TextArgWidgetFactory
import groovy.swing.factory.TabbedPaneFactory
import groovy.swing.factory.TableFactory
import groovy.swing.factory.LayoutFactory
import griffon.plugins.l2fprod.factory.*

import com.l2fprod.common.swing.*
import com.l2fprod.common.swing.tips.*
import com.l2fprod.common.propertysheet.*

/**
 * @author Andres Almiray
 */
class L2fprodGriffonAddon {
    Map factories = [
        jbannerPanel: BannerPanel,
        jbuttonBar: new JButtonBarFactory(),
        linkButton: new RichActionWidgetFactory(JLinkButton),
        jtipOfTheDay: JTipOfTheDay,
        jdefaultTipModel: DefaultTipModel,
        jdefaultTip: DefaultTip,
        jtaskPaneGroup: JTaskPaneGroup,
        jtaskPane: JTaskPane,
        outlookBar: new TabbedPaneFactory(JOutlookBar),
        directoryChooser: JDirectoryChooser,
        fontChooser: JFontChooser,
        percentLayout: new LayoutFactory(PercentLayout),
        propertySheetPanel: new PropertySheetPanelFactory(),
        propertySheetTable: new TableFactory(PropertySheetTable),
        propertySheetTableModel: new PropertySheetTableModelFactory(),
        property: new PropertyFactory()
    ]
}