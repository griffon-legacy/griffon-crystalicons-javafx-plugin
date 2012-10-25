/*
 * griffon-crystalicons-javafx: Crystal icons Griffon plugin for JavaFX
 * Copyright 2012 and beyond, Andres Almiray
 *
 * griffon-crystalicons is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

/**
 * @author Andres Almiray
 */
class CrystaliconsJavafxGriffonPlugin {
    // the plugin version
    String version = '0.1'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.1.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [javafx: '0.8']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'GNU LGPL 2.1'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['javafx']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-crystalicons-javafx-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = "Everaldo's Crystal icon set"
    String description = '''
Provides a shortcut for adding icons based on Everaldo's [Crystal icon set][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*          | *Node*                        | *Property* | *Type* | *Default*   | *Bindable* |
| --------------- | ----------------------------- | ---------- | ------ | ----------- | ---------- |
| crystalIcon     | `javax.scene.image.Image`     | icon       | String |             | no         |
|                 |                               | size       | int    | `16`        | no         |
|                 |                               | category   | String | `actions`   | no         |
| crystalIconView | `javax.scene.image.ImageView` | icon       | String |             | no         |
|                 |                               | size       | int    | `16`        | no         |
|                 |                               | category   | String | `actions`   | no         |

Valid values for `icon` can be obtained by running **crystal-icon-selector** and inspecting the tooltip of the chosen icon.

Valid values for `size` property are: 16, 24, 32.

Valid values for `category` property are: actions, apps, devices, filesystems, mimetypes.

Scripts
-------

 * **crystal-icon-selector** - launches a window that displays all available icons (Hover an icon to see the icon name)

[1]: http://everaldo.com/crystal
'''
}
