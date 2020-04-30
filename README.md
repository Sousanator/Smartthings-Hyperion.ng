# SmartThings-Hyperion.ng

This device handler can disable/enable a specific instance in Hyperion.ng, set any color, set the brightness, change the scene(aka effect), clear animations, and enable/disable LED and USB Components Control.

Add this device handler in your Smartthings IDE. Create a new device with the above device handler. In the preferences add the IP address, and port (19444 by default) of your Hyperion.ng controller.  You'll also have to set the priority level (default 50) and the Instance # (not the instance name).  Instance # starts at 0 and is in order in 'General settings > LED Hardware Instance Management' on your Hyperion.ng webpage.

By default the scenes are populated with the included Hyperion effects.  You can add your own to any of the available 50 scenes.  Effects are case sensitive.  You can also use webCore to call a custom scene using setSceneCustom(String).  All main functions are in available in webCore as well.

Device:

![Device](https://github.com/Sousanator/Smartthings-Hyperion.ng/blob/master/SmartThings_hyperion.png)

Prefrences:

![Preferences](https://github.com/Sousanator/Smartthings-Hyperion.ng/blob/master/SmartThings_hyperion_Prefrences.png)
