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

/**
 * @author Andres Almiray
 */
class L2fprodGriffonPlugin {
    // the plugin version
    String version = '1.0.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, qt
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-l2fprod-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Swing components from l2fprod'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Missing Swing components provided by [l2fprod][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| Node                    | Property         | Type     | Required | Bindable | Notes                                                                |
| ----------------------- | ---------------- | -------- | -------- | -------- | -------------------------------------------------------------------- |
| jbannerPanel            |                  |          |          |          |                                                                      |
| jbuttonBar              | ui               | String   | no       | no       | values must be one of [blue, mozilla, icon packager]                 |
| linkButton              |                  |          |          |          |                                                                      |
| jtipOfTheDay            |                  |          |          |          |                                                                      |
| jdefaultTipModel        |                  |          |          |          |                                                                      |
| jdefaultTip             |                  |          |          |          |                                                                      |
| jtaskPaneGroup          |                  |          |          |          |                                                                      |
| jtaskPane               |                  |          |          |          |                                                                      |
| outlookBar              |                  |          |          |          | same properties as a `tabbedPane`                                    |
| directoryChooser        |                  |          |          |          |                                                                      |
| fontChooser             |                  |          |          |          |                                                                      |
| percentLayout           |                  |          |          |          |                                                                      |
| propertySheetPanel      | includes         | String[] | no       | no       | filters which properties can be displayed                            |
|                         | excludes         | String[] | no       | no       | filters which properties can be displayed                            |
|                         | skipSetup        | boolean  | no       | no       | skips registering all properties, you must specify nested properties |
|                         |                  |          |          |          | requires a bean as value                                             |
| propertySheetTable      | includes         | String[] | no       | no       | filters which properties can be displayed                            |
|                         | excludes         | String[] | no       | no       | filters which properties can be displayed                            |
| propertySheetTableModel |                  |          |          |          |                                                                      |
| property                | name             | String   | no       | yes      |                                                                      |
|                         | displayName      | String   | no       | yes      |                                                                      |
|                         | shortDescription | String   | no       | yes      |                                                                      |
|                         | type             | Class    | no       | yes      |                                                                      |
|                         |                  |          |          |          | requires a bean as value                                             |   

Refer to the Javadocs found in the plugin's distribution to learn more about the properties that can be set on these nodes.

### Example

Using `propertySheetPanel` and `property`

        panel {
            bean(new Person(), id: "person",
                name: "Joe",
                lastname: "Cool")
            propertySheetPanel(person,
                excludes: ["metaClass"],
                preferredSize: [320,300]) {
                    property(name: "name",  shortDescription: "Person's name")
                    property(name: "lastname", shortDescription: "Person's lastname")  
            }
        }
        
Using `jtaskPane` and `jtaskPaneGroup`

        jtaskPane(preferredSize: [320,300]) {
            jtaskPaneGroup(title: "Group 1", special: true) {
                label("Action 1")
                label("Action 2")
            }
            jtaskPaneGroup(title: "Group 2", expanded: false) {
                label("Action 1")
                label("Action 2")
                label("Action 3")
            }
            jtaskPaneGroup(title: "Group 3") {
                label("Action 1")
                label("Action 2")
                label("Action 3")
            }
        }

[1]: http://l2fprod.com/common
'''
}
