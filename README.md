
Swing components from l2fprod
-----------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/l2fprod](http://artifacts.griffon-framework.org/plugin/l2fprod)


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

