
Everaldo's Crystal icon set
---------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/crystalicons-javafx](http://artifacts.griffon-framework.org/plugin/crystalicons-javafx)


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

