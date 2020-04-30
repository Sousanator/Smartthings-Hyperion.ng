/**
 *  Copyright 2015 SmartThings
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
 

metadata {
	definition (name: "Hyperion.ng JSON Control", namespace: "Sousanator", author: "Sousanator") {
		capability "Switch"
		capability "Switch Level"
		capability "Light"
		capability "Color Control"
		
        command "on"
		command "off"
        command "setColor"
		command "setLevel"
		command "setScene" 
        command "setSceneCustom" 
        
        command "clearAll"
        command "clearSmartThings"
        command "enableLED"
        command "disableLED"
        command "enableUSB"
        command "disableUSB"
		
        command "levelDecrement"
		command "levelIncrement"

		command "sceneDecrement"
		command "sceneIncrement"
		
       
        command "setScene0"
		command "setScene1"
		command "setScene2"
		command "setScene3"	
        command "setScene4"
		command "setScene5"
		command "setScene6"
        command "setScene7"
		command "setScene8"
		command "setScene9"	
        
        command "setScene10"
		command "setScene11"
		command "setScene12"
		command "setScene13"	
        command "setScene14"
		command "setScene15"
		command "setScene16"
        command "setScene17"
		command "setScene18"
		command "setScene19"	
        
        command "setScene20"
		command "setScene21"
		command "setScene22"
		command "setScene23"	
        command "setScene24"
		command "setScene25"
		command "setScene26"
        command "setScene27"
		command "setScene28"
		command "setScene29"	
        
        command "setScene30"
		command "setScene31"
		command "setScene32"
		command "setScene33"	
        command "setScene34"
		command "setScene35"
		command "setScene36"
        command "setScene37"
		command "setScene38"
		command "setScene39"	
                
        command "setScene40"
		command "setScene41"
		command "setScene42"
		command "setScene43"	
        command "setScene44"
		command "setScene45"
		command "setScene46"
        command "setScene47"
		command "setScene48"
		command "setScene49"	
        
        command "setScene50"
		
        command "refreshLabels"

           
		attribute "color", "String"
		attribute "scene", "Number"
		attribute "level", "Number"
	}

	simulator {

	}
    
	tiles (scale: 2) { 
		// ON + OFF
		standardTile("switch", "switch", width: 3, height: 1, decoration: "flat", canChangeIcon: true) {
			state "off", action: "on", label: "off", icon: "st.switches.switch.off", backgroundColor: "#ffffff"
			state "on", action: "off", label: "on", icon: "st.switches.switch.on", backgroundColor: "#00a0dc"
		}
        
        // CLEAR + ENABLES
        standardTile("clearA", "clearA", width: 2, height: 1, decoration: "flat") {
        	state "val", label: "Clear All", backgroundColor: "#ffffff", action: "clearAll" 
        }
        standardTile("clearThis", "clearThis", width: 2, height: 1, decoration: "flat") {
        	state "val", label: "Clear SmartThings", backgroundColor: "#ffffff", action: "clearSmartThings" 
        }
		standardTile("deviceLED", "deviceLED", width: 1, height: 1, decoration: "flat", canChangeIcon: true) {
			state "off", action: "enableLED", label: "LED Disabled", backgroundColor: "#ffffff"//, icon: "st.switches.switch.off
			state "on", action: "disableLED", label: "LED Enabled", backgroundColor: "#00ff00"//, icon: "st.switches.switch.on"
		}
       standardTile("deviceUSB", "deviceUSB", width: 1, height: 1, decoration: "flat", canChangeIcon: true) {
			state "off", action: "enableUSB", label: "USB Disabled", backgroundColor: "#ffffff"//, icon: "st.switches.switch.off
			state "on", action: "disableUSB", label: "USB Enabled", backgroundColor: "#00ff00"//, icon: "st.switches.switch.on"
		}
		
		//COLOR
		valueTile("currentColor", "color", width: 3, height: 1) {
			state "val", label:'${currentValue}', defaultState: true
		}
 		controlTile("rgbSelector", "color", "color", width: 6, height: 6, inactiveLabel: false) {
            state "color", action:"setColor"
        }

		//BRIGHTNESS
		valueTile("levelLabel", "levelLabel", width: 2, height: 1) {
			state "val", label:'Level', defaultState: true
		}
		standardTile("levelDecrement", "level", width: 1, height: 1, decoration: "flat") {
			state "level", label: "-", backgroundColor: "#ffffff", action: "levelDecrement"//, icon: "st.thermostat.thermostat-down"
		} 
		standardTile("levelIncrement", "level", width: 1, height: 1, decoration: "flat") {
			state "level", label: "+", backgroundColor: "#ffffff", action: "levelIncrement"//, icon: "st.thermostat.thermostat-up"
		} 
		controlTile("level", "level", "slider",  width: 2, height: 1, inactiveLabel: false ) {
			state "level", action:"setLevel", label: "Level"
		}
		

		//SCENES
		standardTile("scene0", "scene0", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '0\n${currentValue}', backgroundColor: "#ffffff", action: "setScene0" 
        }
		standardTile("scene1", "scene1", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '1\n${currentValue}', backgroundColor: "#ffffff", action: "setScene1" 
        }    
        standardTile("scene2", "scene2", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '2\n${currentValue}', backgroundColor: "#ffffff", action: "setScene2" 
		}
        standardTile("scene3", "scene3", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '3\n${currentValue}', backgroundColor: "#ffffff", action: "setScene3" 
        }
        standardTile("scene4", "scene4", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '4\n${currentValue}', backgroundColor: "#ffffff", action: "setScene4" 
        }
		standardTile("scene5", "scene5", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '5\n${currentValue}', backgroundColor: "#ffffff", action: "setScene5" 
        }
        standardTile("scene6", "scene6", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '6\n${currentValue}', backgroundColor: "#ffffff", action: "setScene6" 
        }
        standardTile("scene7", "scene7", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '7\n${currentValue}', backgroundColor: "#ffffff", action: "setScene7" 
        }
        standardTile("scene8", "scene8", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '8\n${currentValue}', backgroundColor: "#ffffff", action: "setScene8" 
        }
        standardTile("scene9", "scene9", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '9\n${currentValue}', backgroundColor: "#ffffff", action: "setScene9" 
        }
        
        standardTile("scene10", "scene10", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '10\n${currentValue}', backgroundColor: "#ffffff", action: "setScene10" 
        }
		standardTile("scene11", "scene11", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '11\n${currentValue}', backgroundColor: "#ffffff", action: "setScene11" 
        }    
        standardTile("scene12", "scene12", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '12\n${currentValue}', backgroundColor: "#ffffff", action: "setScene12" 
		}
        standardTile("scene13", "scene13", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '13\n${currentValue}', backgroundColor: "#ffffff", action: "setScene13" 
        }
        standardTile("scene14", "scene14", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '14\n${currentValue}', backgroundColor: "#ffffff", action: "setScene14" 
        }
		standardTile("scene15", "scene15", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '15\n${currentValue}', backgroundColor: "#ffffff", action: "setScene15" 
        }
        standardTile("scene16", "scene16", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '16\n${currentValue}', backgroundColor: "#ffffff", action: "setScene16" 
        }
        standardTile("scene17", "scene17", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '17\n${currentValue}', backgroundColor: "#ffffff", action: "setScene17" 
        }
        standardTile("scene18", "scene18", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '18\n${currentValue}', backgroundColor: "#ffffff", action: "setScene18" 
        }
        standardTile("scene19", "scene19", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '19\n${currentValue}', backgroundColor: "#ffffff", action: "setScene19" 
        }
        
        standardTile("scene20", "scene20", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '20\n${currentValue}', backgroundColor: "#ffffff", action: "setScene20" 
        }
		standardTile("scene21", "scene21", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '21\n${currentValue}', backgroundColor: "#ffffff", action: "setScene21" 
        }    
        standardTile("scene22", "scene22", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '22\n${currentValue}', backgroundColor: "#ffffff", action: "setScene22" 
		}
        standardTile("scene23", "scene23", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '23\n${currentValue}', backgroundColor: "#ffffff", action: "setScene23" 
        }
        standardTile("scene24", "scene24", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '24\n${currentValue}', backgroundColor: "#ffffff", action: "setScene24" 
        }
		standardTile("scene25", "scene25", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '25\n${currentValue}', backgroundColor: "#ffffff", action: "setScene25" 
        }
        standardTile("scene26", "scene26", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '26\n${currentValue}', backgroundColor: "#ffffff", action: "setScene26" 
        }
        standardTile("scene27", "scene27", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '27\n${currentValue}', backgroundColor: "#ffffff", action: "setScene27" 
        }
        standardTile("scene28", "scene28", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '28\n${currentValue}', backgroundColor: "#ffffff", action: "setScene28" 
        }
        standardTile("scene29", "scene29", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '29\n${currentValue}', backgroundColor: "#ffffff", action: "setScene29" 
        }
        
        standardTile("scene30", "scene30", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '30\n${currentValue}', backgroundColor: "#ffffff", action: "setScene30" 
        }
		standardTile("scene31", "scene31", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '31\n${currentValue}', backgroundColor: "#ffffff", action: "setScene31" 
        }    
        standardTile("scene32", "scene32", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '32\n${currentValue}', backgroundColor: "#ffffff", action: "setScene32" 
		}
        standardTile("scene33", "scene33", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '33\n${currentValue}', backgroundColor: "#ffffff", action: "setScene33" 
        }
        standardTile("scene34", "scene34", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '34\n${currentValue}', backgroundColor: "#ffffff", action: "setScene34" 
        }
		standardTile("scene35", "scene35", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '35\n${currentValue}', backgroundColor: "#ffffff", action: "setScene35" 
        }
        standardTile("scene36", "scene36", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '36\n${currentValue}', backgroundColor: "#ffffff", action: "setScene36" 
        }
        standardTile("scene37", "scene37", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '37\n${currentValue}', backgroundColor: "#ffffff", action: "setScene37" 
        }
        standardTile("scene38", "scene38", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '38\n${currentValue}', backgroundColor: "#ffffff", action: "setScene38" 
        }
        standardTile("scene39", "scene39", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '39\n${currentValue}', backgroundColor: "#ffffff", action: "setScene39" 
        }
        
        standardTile("scene40", "scene40", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '40\n${currentValue}', backgroundColor: "#ffffff", action: "setScene40" 
        }
		standardTile("scene41", "scene41", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '41\n${currentValue}', backgroundColor: "#ffffff", action: "setScene41" 
        }    
        standardTile("scene42", "scene42", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '42\n${currentValue}', backgroundColor: "#ffffff", action: "setScene42" 
		}
        standardTile("scene43", "scene43", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '43\n${currentValue}', backgroundColor: "#ffffff", action: "setScene43" 
        }
        standardTile("scene44", "scene44", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '44\n${currentValue}', backgroundColor: "#ffffff", action: "setScene44" 
        }
		standardTile("scene45", "scene45", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '45\n${currentValue}', backgroundColor: "#ffffff", action: "setScene45" 
        }
        standardTile("scene46", "scene46", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '46\n${currentValue}', backgroundColor: "#ffffff", action: "setScene46" 
        }
        standardTile("scene47", "scene47", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '47\n${currentValue}', backgroundColor: "#ffffff", action: "setScene47" 
        }
        standardTile("scene48", "scene48", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '48\n${currentValue}', backgroundColor: "#ffffff", action: "setScene48" 
        }
        standardTile("scene49", "scene49", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '49\n${currentValue}', backgroundColor: "#ffffff", action: "setScene49" 
        }
        
        standardTile("scene50", "scene50", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '50\n${currentValue}', backgroundColor: "#ffffff", action: "setScene50" 
        }
		
		
		standardTile("sceneDecrement", "scene", width: 1, height: 1, decoration: "flat") {
			state "default", label: "<", backgroundColor: "#ffffff", action: "sceneDecrement"//, icon: "st.thermostat.thermostat-left"
		} 
		valueTile("currentScene", "scene", width: 4, height: 1, decoration: "flat") {
			state "val", label: '${currentValue}', backgroundColor: "#ffffff"
		} 
		standardTile("sceneIncrement", "scene", width: 1, height: 1, decoration: "flat") {
			state "default", label: ">", backgroundColor: "#ffffff", action: "sceneIncrement"//, icon: "st.thermostat.thermostat-right"
		} 
		standardTile("refresh", "refresh", width: 2, height: 1, decoration: "flat") {
        	state "val", label: 'Refresh Labels', backgroundColor: "#ffffff", action: "refreshLabels" 
        }
          
		main "switch"
			details([
			"switch","currentColor",
            "clearA", "clearThis", "deviceLED", "deviceUSB",
            "rgbSelector", 
            "levelLabel", "levelDecrement","levelIncrement", "level", 
            "speedLabel", "speedDecrement","speedIncrement", "speed",
            
            
            "sceneDecrement","currentScene","sceneIncrement",
            
            "scene0","scene1","scene2",
            "scene3","scene4","scene5",
            "scene6","scene7","scene8",
            "scene9","scene10","scene11",
            
            "scene12","scene13","scene14",
            "scene15","scene16","scene17",
            "scene18","scene19","scene20",
            "scene21","scene22","scene23",
            
            "scene24","scene25","scene26",
            "scene27","scene28","scene29",
            "scene30","scene31","scene32",
            "scene33","scene34","scene35",
            
            "scene36","scene37","scene38",
            "scene39","scene40","scene41",
            "scene42","scene43","scene44",
            "scene45","scene46","scene47",
            
            "scene48","scene49","scene50",
			"refresh"
            
            ])
	}

    preferences {
        	input name: "IP_Address", type: "text", title: "IP", required: true
			input name: "Port_Address", type: "text", title: "Port", defaultValue: 19444, required: true
            input name: "priority", type: "text", title: "Priority", defaultValue: 50, required: true
            input name: "instance", type: "text", title: "Instance #", defaultValue: 0, required: true
            
            input name: "scene0", type: "text", title: "Scene 0", defaultValue: "", required: false
            input name: "scene1", type: "text", title: "Scene 1", defaultValue: "Atomic swirl", required: false
            input name: "scene2", type: "text", title: "Scene 2", defaultValue: "Blue mood blobs", required: false
            input name: "scene3", type: "text", title: "Scene 3", defaultValue: "Breath", required: false
            input name: "scene4", type: "text", title: "Scene 4", defaultValue: "Candle", required: false
            input name: "scene5", type: "text", title: "Scene 5", defaultValue: "Cinema brighten lights", required: false
            input name: "scene6", type: "text", title: "Scene 6", defaultValue: "Cinema dim lights", required: false
            input name: "scene7", type: "text", title: "Scene 7", defaultValue: "Cold mood blobs", required: false
            input name: "scene8", type: "text", title: "Scene 8", defaultValue: "Collision", required: false
            input name: "scene9", type: "text", title: "Scene 9", defaultValue: "Color traces", required: false
            
            input name: "scene10", type: "text", title: "Scene 10", defaultValue: "Double swirl", required: false
            input name: "scene11", type: "text", title: "Scene 11", defaultValue: "Fire", required: false
            input name: "scene12", type: "text", title: "Scene 12", defaultValue: "Flags Germany/Sweden", required: false
            input name: "scene13", type: "text", title: "Scene 13", defaultValue: "Full color mood blobs", required: false
            input name: "scene14", type: "text", title: "Scene 14", defaultValue: "Knight rider", required: false
            input name: "scene15", type: "text", title: "Scene 15", defaultValue: "Led Test", required: false
            input name: "scene16", type: "text", title: "Scene 16", defaultValue: "Light clock", required: false
            input name: "scene17", type: "text", title: "Scene 17", defaultValue: "Lights", required: false
            input name: "scene18", type: "text", title: "Scene 18", defaultValue: "Notify blue", required: false
            input name: "scene19", type: "text", title: "Scene 19", defaultValue: "Pac-Man", required: false
            
            input name: "scene20", type: "text", title: "Scene 20", defaultValue: "Police Lights Single", required: false
            input name: "scene21", type: "text", title: "Scene 21", defaultValue: "Police Lights Solid", required: false
            input name: "scene22", type: "text", title: "Scene 22", defaultValue: "Rainbow mood", required: false
            input name: "scene23", type: "text", title: "Scene 23", defaultValue: "Rainbow swirl", required: false
            input name: "scene24", type: "text", title: "Scene 24", defaultValue: "Rainbow swirl fast", required: false
            input name: "scene25", type: "text", title: "Scene 25", defaultValue: "Random", required: false
            input name: "scene26", type: "text", title: "Scene 26", defaultValue: "Red mood blobs", required: false
            input name: "scene27", type: "text", title: "Scene 27", defaultValue: "Sea waves", required: false
            input name: "scene28", type: "text", title: "Scene 28", defaultValue: "Snake", required: false
            input name: "scene29", type: "text", title: "Scene 29", defaultValue: "Sparks", required: false
            
            input name: "scene30", type: "text", title: "Scene 30", defaultValue: "Strobe red", required: false
            input name: "scene31", type: "text", title: "Scene 31", defaultValue: "Strobe white", required: false
            input name: "scene32", type: "text", title: "Scene 32", defaultValue: "System Shutdown", required: false
            input name: "scene33", type: "text", title: "Scene 33", defaultValue: "Trails", required: false
            input name: "scene34", type: "text", title: "Scene 34", defaultValue: "Trails color", required: false
            input name: "scene35", type: "text", title: "Scene 35", defaultValue: "Warm mood blobs", required: false
            input name: "scene36", type: "text", title: "Scene 36", defaultValue: "Waves with Color", required: false
            input name: "scene37", type: "text", title: "Scene 37", defaultValue: "X-Mas", required: false
            input name: "scene38", type: "text", title: "Scene 38", defaultValue: "", required: false
            input name: "scene39", type: "text", title: "Scene 39", defaultValue: "", required: false
            
            input name: "scene40", type: "text", title: "Scene 40", defaultValue: "", required: false
            input name: "scene41", type: "text", title: "Scene 41", defaultValue: "", required: false
            input name: "scene42", type: "text", title: "Scene 42", defaultValue: "", required: false
            input name: "scene43", type: "text", title: "Scene 43", defaultValue: "", required: false
            input name: "scene44", type: "text", title: "Scene 44", defaultValue: "", required: false
            input name: "scene45", type: "text", title: "Scene 45", defaultValue: "", required: false
            input name: "scene46", type: "text", title: "Scene 46", defaultValue: "", required: false
            input name: "scene47", type: "text", title: "Scene 47", defaultValue: "", required: false
            input name: "scene48", type: "text", title: "Scene 48", defaultValue: "", required: false
            input name: "scene49", type: "text", title: "Scene 49", defaultValue: "", required: false
            
            input name: "scene50", type: "text", title: "Scene 50", defaultValue: "", required: false
            
        	      
	}
}


/*
=============================================
ON/OFF
=============================================
*/
def off() {
	sendEvent(name: "switch", value: "off", isStateChange: true)
    state.PowerState = 0;
    
    log.debug("Turn OFF")   
    sendGetRequest("{\"command\":\"componentstate\",\"componentstate\":{\"component\":\"ALL\",\"state\":false}}")
	//clearAll()
} 
def on() {
    sendEvent(name: "switch", value: "on", isStateChange: true)
    state.PowerState = 1;
    
    log.debug("Turn ON")
 	sendGetRequest("{\"command\":\"componentstate\",\"componentstate\":{\"component\":\"ALL\",\"state\":true}}")
}

def clearAll() {
	log.debug("Clear All")
	sendGetRequest("{\"command\":\"clearall\"}")
}

def clearSmartThings() {
	log.debug("Clear SmartThings")
	sendGetRequest("{\"command\":\"clear\",\"priority\":${priority}}")
}

def enableLED() {
	sendEvent(name: "deviceLED", value: "on", isStateChange: true)
	sendGetRequest("{\"command\":\"componentstate\",\"componentstate\":{\"component\":\"LEDDEVICE\",\"state\":true}}")
}
def disableLED() {
	sendEvent(name: "deviceLED", value: "off", isStateChange: true)
	sendGetRequest("{\"command\":\"componentstate\",\"componentstate\":{\"component\":\"LEDDEVICE\",\"state\":false}}")
}
def enableUSB() {
	sendEvent(name: "deviceUSB", value: "on", isStateChange: true)
	sendGetRequest("{\"command\":\"componentstate\",\"componentstate\":{\"component\":\"V4L\",\"state\":true}}")
}
def disableUSB() {
	sendEvent(name: "deviceUSB", value: "off", isStateChange: true)
	sendGetRequest("{\"command\":\"componentstate\",\"componentstate\":{\"component\":\"V4L\",\"state\":false}}")
}

/*
=============================================
SCENES
=============================================
*/

def setScene(Integer scene) {
    state.SavedSceneName = state.sceneList[scene.toInteger()]
  	state.SavedSceneNumber = scene.toInteger()
 
 	sendEvent(name: "scene", value: "${state.SavedSceneName}", isStateChange: true)//,
  
     if (state.PowerState == 0) {
    	on()
    }
       
    log.debug("Set Scene ${scene}:${state.SavedSceneName}")    
   	sendGetRequest("{\"command\":\"effect\",\"effect\":{\"name\":\"${state.SavedSceneName}\"},\"origin\":\"SmartThings\",\"priority\":${priority}}")      
}
def setSceneCustom(customScene) {
    sendEvent(name: "scene", value: "${customScene}", isStateChange: true)//,
    sendEvent(name: "switch", value: "on", isStateChange: true)
       
    log.debug("Set Custom Scene:${customScene}") 
   	sendGetRequest("{\"command\":\"effect\",\"effect\":{\"name\":\"${customScene}\"},\"origin\":\"SmartThings\",\"priority\":${priority}}")      
}

def sceneDecrement() {
  	def index = state.SavedSceneNumber
  	
  	index--
  	if(index < 0) { index = 0; }	
	setScene(index)
}

def sceneIncrement() {
  	def index = state.SavedSceneNumber

  	index++
  	if(index > 50) { index = 50; }	
	setScene(index)
}

	def setScene0() {
		sendEvent(name: "scene0", value: "${scene0}")
		setScene(0)
	} 
	def setScene1() {
		sendEvent(name: "scene1", value: "${scene1}")
		setScene(1)
	}    
	def setScene2() {    	
		sendEvent(name: "scene2", value: "${scene2}")
		setScene(2)    	
	} 
	def setScene3() {
		sendEvent(name: "scene3", value: "${scene3}")
		setScene(3)
	} 
	def setScene4() {
		sendEvent(name: "scene4", value: "${scene4}")
		setScene(4)
	}
	def setScene5() {
		sendEvent(name: "scene5", value: "${scene5}")
		setScene(5)
	}
	def setScene6() {
		sendEvent(name: "scene6", value: "${scene6}")
		setScene(6)
	}
	def setScene7() {
		sendEvent(name: "scene7", value: "${scene7}")
		setScene(7)
	}
	def setScene8() {
		sendEvent(name: "scene8", value: "${scene8}")
		setScene(8)
	}
	def setScene9() {
		sendEvent(name: "scene9", value: "${scene9}")
		setScene(9)
	}
	def setScene10() {
		sendEvent(name: "scene10", value: "${scene10}")
		setScene(10)
	} 
	def setScene11() {
		sendEvent(name: "scene11", value: "${scene11}")
		setScene(11)
	}    
	def setScene12() {    	
		sendEvent(name: "scene12", value: "${scene12}")
		setScene(12)    	
	} 
	def setScene13() {
		sendEvent(name: "scene13", value: "${scene13}")
		setScene(13)
	} 
	def setScene14() {
		sendEvent(name: "scene14", value: "${scene14}")
		setScene(14)
	}
	def setScene15() {
		sendEvent(name: "scene15", value: "${scene15}")
		setScene(15)
	}
	def setScene16() {
		sendEvent(name: "scene16", value: "${scene16}")
		setScene(16)
	}
	def setScene17() {
		sendEvent(name: "scene17", value: "${scene17}")
		setScene(17)
	}
	def setScene18() {
		sendEvent(name: "scene18", value: "${scene18}")
		setScene(18)
	}
	def setScene19() {
		sendEvent(name: "scene19", value: "${scene19}")
		setScene(19)
	}

	def setScene20() {
		sendEvent(name: "scene20", value: "${scene20}")
		setScene(20)
	} 
	def setScene21() {
		sendEvent(name: "scene21", value: "${scene21}")
		setScene(21)
	}    
	def setScene22() {    	
		sendEvent(name: "scene22", value: "${scene22}")
		setScene(22)    	
	} 
	def setScene23() {
		sendEvent(name: "scene23", value: "${scene23}")
		setScene(23)
	} 
	def setScene24() {
		sendEvent(name: "scene24", value: "${scene24}")
		setScene(24)
	}
	def setScene25() {
		sendEvent(name: "scene25", value: "${scene25}")
		setScene(25)
	}
	def setScene26() {
		sendEvent(name: "scene26", value: "${scene26}")
		setScene(26)
	}
	def setScene27() {
		sendEvent(name: "scene27", value: "${scene27}")
		setScene(27)
	}
	def setScene28() {
		sendEvent(name: "scene28", value: "${scene28}")
		setScene(28)
	}
	def setScene29() {
		sendEvent(name: "scene29", value: "${scene29}")
		setScene(29)
	}
	def setScene30() {
		sendEvent(name: "scene30", value: "${scene30}")
		setScene(30)
	} 
	def setScene31() {
		sendEvent(name: "scene31", value: "${scene31}")
		setScene(31)
	}    
	def setScene32() {    	
		sendEvent(name: "scene32", value: "${scene32}")
		setScene(32)    	
	} 
	def setScene33() {
		sendEvent(name: "scene33", value: "${scene33}")
		setScene(33)
	} 
	def setScene34() {
		sendEvent(name: "scene34", value: "${scene34}")
		setScene(34)
	}
	def setScene35() {
		sendEvent(name: "scene35", value: "${scene35}")
		setScene(35)
	}
	def setScene36() {
		sendEvent(name: "scene36", value: "${scene36}")
		setScene(36)
	}
	def setScene37() {
		sendEvent(name: "scene37", value: "${scene37}")
		setScene(37)
	}
	def setScene38() {
		sendEvent(name: "scene38", value: "${scene38}")
		setScene(38)
	}
	def setScene39() {
		sendEvent(name: "scene39", value: "${scene39}")
		setScene(39)
	}
	def setScene40() {
		sendEvent(name: "scene40", value: "${scene40}")
		setScene(40)
	} 
	def setScene41() {
		sendEvent(name: "scene41", value: "${scene41}")
		setScene(41)
	}    
	def setScene42() {    	
		sendEvent(name: "scene42", value: "${scene42}")
		setScene(42)    	
	} 
	def setScene43() {
		sendEvent(name: "scene43", value: "${scene43}")
		setScene(43)
	} 
	def setScene44() {
		sendEvent(name: "scene44", value: "${scene44}")
		setScene(44)
	}
	def setScene45() {
		sendEvent(name: "scene45", value: "${scene45}")
		setScene(45)
	}
	def setScene46() {
		sendEvent(name: "scene46", value: "${scene46}")
		setScene(46)
	}
	def setScene47() {
		sendEvent(name: "scene47", value: "${scene47}")
		setScene(47)
	}
	def setScene48() {
		sendEvent(name: "scene48", value: "${scene48}")
		setScene(48)
	}
	def setScene49() {
		sendEvent(name: "scene49", value: "${scene49}")
		setScene(49)
	}
	def setScene50() {
		sendEvent(name: "scene50", value: "${scene50}")
		setScene(50)
	} 


/*
=============================================
BRIGHTNESS LEVEL
=============================================
*/
def setLevel(Integer value) {
    state.SavedLevel = value
    
    sendEvent(name: "switch", value: "on", isStateChange: true)
    sendEvent(name: "level", value: state.SavedLevel, isStateChange: true)
    
	log.debug("Set Brightness:${value}")
    sendGetRequest("{\"adjustment\":{\"brightness\":${value}},\"command\":\"adjustment\"}")
}
def levelDecrement() {
  	def index = state.SavedLevel

  	index--
  	if(index <= 0) { index = 0; }
	//log.debug("Decrement Level")
	setLevel(index)
}
def levelIncrement() {
  	def index = state.SavedLevel;
 
  	index++
  	if(index >= 100) { index = 100;	}
	//log.debug("Increment Level")
	setLevel(index)
}



/*
=============================================
COLOR
=============================================
*/ 

def setColor(value) {
//log.debug("setColor: ${value}")
def colorRGB = [r,g,b,hex]

    if (value.red != null) {
    	state.SavedColor = "${value.red},${value.green},${value.blue}"
    } else if (value.hex != null){
    	log.debug("Converting Hex:${value.hex}")
    	colorRGB.hex = value.hex-"#"
		colorRGB.r = hex_to_int(colorRGB.hex[0],colorRGB.hex[1])
		colorRGB.g = hex_to_int(colorRGB.hex[2],colorRGB.hex[3])
		colorRGB.b = hex_to_int(colorRGB.hex[4],colorRGB.hex[5])  
        state.SavedColor = "${colorRGB.r},${colorRGB.g},${colorRGB.b}"
    } else if (value.hue != null) {
       log.debug("Converting Hue:${value.hue} and Saturation:${value.saturation}")
       colorRGB = HSLtoRGB(value.hue, value.saturation, 0.5)
       state.SavedColor = "${colorRGB.r},${colorRGB.g},${colorRGB.b}"
    } 
    log.debug("Color: ${state.SavedColor}")

    if (state.PowerState == 0) {
    	on()
    }
    sendEvent(name: "currentColor", value: "${value.hex}", isStateChange: true)
    sendEvent(name: "color", value: "${value.hex}", isStateChange: true)
	sendEvent(name: "scene", value: "${value.hex}", isStateChange: true)

    log.debug("Set Color:${state.SavedColor}")
    sendGetRequest("{\"color\":[${state.SavedColor},${state.SavedColor}],\"command\":\"color\",\"origin\":\"SmartThings\",\"priority\":${priority}}")
}

int hex_to_int(h, h2){
  int c
  int c2
 
 if ((h == "A")|(h == "a")) {
 	c = 160;
 } else if ((h == "B")|(h == "b")) {
 	c = 176;
 } else if ((h == "C")|(h == "c")) {
 	c = 192;
 } else if ((h == "D")|(h == "d")) {
 	c = 208;
 } else if ((h == "E")|(h == "e")) {
 	c = 224;
 } else if ((h == "F")|(h == "f")) {
 	c = 240;
 } else {
  c = h.toInteger()*10
 } 
 
  if ((h2 == "A")|(h2 == "a")) {
 	c2 = 10;
 } else if ((h2 == "B")|(h2 == "b")) {
 	c2 = 11;
 } else if ((h2 == "C")|(h2 == "c")) {
 	c2 = 12;
 } else if ((h2 == "D")|(h2 == "d")) {
 	c2 = 13;
 } else if ((h2 == "E")|(h2 == "e")) {
 	c2 = 14;
 } else if ((h2 == "F")|(h2 == "f")) {
 	c2 = 15;
 } else {
  c2 = h2.toInteger()
 } 
 
  return(c + c2)
}


private HSLtoRGB(float var_h, float var_s, float var_l) {
	def rgb_color = [r:0, g:0, b:0]
      
    float h = var_h / 100
    float s = var_s / 100
    float l = var_l
    
	if (s == 0) {
    	rgb_color.r = l * 255
        rgb_color.g = l * 255
        rgb_color.b = l * 255
	} else {
    	float var_2 = 0
    	if (l < 0.5) {
        	var_2 = l * (1 + s)
        } else {
        	var_2 = (l + s) - (s * l)
        }
                
        float var_1 = 2 * l - var_2
        
        rgb_color.r = 255 * hueToRgb(var_1, var_2, h + (1 / 3))
        rgb_color.g = 255 * hueToRgb(var_1, var_2, h)
        rgb_color.b = 255 * hueToRgb(var_1, var_2, h - (1 / 3))    
    }
    
    rgb_color.r = rgb_color.r.toInteger()
    rgb_color.g = rgb_color.g.toInteger()
    rgb_color.b = rgb_color.b.toInteger()
   
    return(rgb_color)

}
private hueToRgb(v1, v2, vh) {
	if (vh < 0) { vh += 1 }            
	if (vh > 1) { vh -= 1 }
	if ((6 * vh) < 1) { return (v1 + (v2 - v1) * 6 * vh) }
    if ((2 * vh) < 1) { return (v2) }
    if ((3 * vh) < 2) { return (v1 + (v2 - v1) * ((2 / 3 - vh) * 6)) }    
    return(v1)
}
private hex(value, width=2) {
	def s = new BigInteger(Math.round(value).toString()).toString(16)
	while (s.size() < width) {
		s = "0" + s
	}
	s
}

def refreshLabels() {
	log.debug "REFRESH"
    state.sceneList = [
    	"${scene0}",
		"${scene1}",
		"${scene2}",
 		"${scene3}",
		"${scene4}",
 		"${scene5}",
 		"${scene6}",
 		"${scene7}",
 		"${scene8}",
		"${scene9}",
        
        "${scene10}",
		"${scene11}",
		"${scene12}",
 		"${scene13}",
		"${scene14}",
 		"${scene15}",
 		"${scene16}",
 		"${scene17}",
 		"${scene18}",
		"${scene19}",
        
        "${scene20}",
		"${scene21}",
		"${scene22}",
 		"${scene23}",
		"${scene24}",
 		"${scene25}",
 		"${scene26}",
 		"${scene27}",
 		"${scene28}",
		"${scene29}",
        
        "${scene30}",
		"${scene31}",
		"${scene32}",
 		"${scene33}",
		"${scene34}",
 		"${scene35}",
 		"${scene36}",
 		"${scene37}",
 		"${scene38}",
		"${scene39}",
        
        "${scene40}",
		"${scene41}",
		"${scene42}",
 		"${scene43}",
		"${scene44}",
 		"${scene45}",
 		"${scene46}",
 		"${scene47}",
 		"${scene48}",
		"${scene49}",
        
        "${scene50}"
        ]

    sendEvent(name: "scene0", value: "${scene0}")
    sendEvent(name: "scene1", value: "${scene1}")
    sendEvent(name: "scene2", value: "${scene2}")
    sendEvent(name: "scene3", value: "${scene3}")
    sendEvent(name: "scene4", value: "${scene4}")
    sendEvent(name: "scene5", value: "${scene5}")
    sendEvent(name: "scene6", value: "${scene6}")
    sendEvent(name: "scene7", value: "${scene7}")
    sendEvent(name: "scene8", value: "${scene8}")
    sendEvent(name: "scene9", value: "${scene9}")

    sendEvent(name: "scene10", value: "${scene10}")
    sendEvent(name: "scene11", value: "${scene11}")
    sendEvent(name: "scene12", value: "${scene12}")
    sendEvent(name: "scene13", value: "${scene13}")
    sendEvent(name: "scene14", value: "${scene14}")
    sendEvent(name: "scene15", value: "${scene15}")
    sendEvent(name: "scene16", value: "${scene16}")
    sendEvent(name: "scene17", value: "${scene17}")
    sendEvent(name: "scene18", value: "${scene18}")
    sendEvent(name: "scene19", value: "${scene19}")

    sendEvent(name: "scene20", value: "${scene20}")
    sendEvent(name: "scene21", value: "${scene21}")
    sendEvent(name: "scene22", value: "${scene22}")
    sendEvent(name: "scene23", value: "${scene23}")
    sendEvent(name: "scene24", value: "${scene24}")
    sendEvent(name: "scene25", value: "${scene25}")
    sendEvent(name: "scene26", value: "${scene26}")
    sendEvent(name: "scene27", value: "${scene27}")
    sendEvent(name: "scene28", value: "${scene28}")
    sendEvent(name: "scene29", value: "${scene29}")

    sendEvent(name: "scene30", value: "${scene30}")
    sendEvent(name: "scene31", value: "${scene31}")
    sendEvent(name: "scene32", value: "${scene32}")
    sendEvent(name: "scene33", value: "${scene33}")
    sendEvent(name: "scene34", value: "${scene34}")
    sendEvent(name: "scene35", value: "${scene35}")
    sendEvent(name: "scene36", value: "${scene36}")
    sendEvent(name: "scene37", value: "${scene37}")
    sendEvent(name: "scene38", value: "${scene38}")
    sendEvent(name: "scene39", value: "${scene39}")

    sendEvent(name: "scene40", value: "${scene40}")
    sendEvent(name: "scene41", value: "${scene41}")
    sendEvent(name: "scene42", value: "${scene42}")
    sendEvent(name: "scene43", value: "${scene43}")
    sendEvent(name: "scene44", value: "${scene44}")
    sendEvent(name: "scene45", value: "${scene45}")
    sendEvent(name: "scene46", value: "${scene46}")
    sendEvent(name: "scene47", value: "${scene47}")
    sendEvent(name: "scene48", value: "${scene48}")
    sendEvent(name: "scene49", value: "${scene49}")

    sendEvent(name: "scene50", value: "${scene50}")

}

/*
=============================================
HTTP SEND
=============================================
*/ 

private sendGetRequest(String message) {
def body_msg = "{\"command\":\"instance\",\"instance\":${instance},\"subcommand\":\"switchTo\"}\n${message}\n"
log.debug("SEND:${IP_Address}:${Port_Address}\n${body_msg}")    
    def result = new physicalgraph.device.HubAction(
        method: "POST",
		//path: "${url}",
        body: body_msg,
        headers: [
            HOST: "${IP_Address}:${Port_Address}",
            "Content-Type": "application/json"
            ]

        )
        //log.debug("RESULT: \n${result}")
        sendHubCommand(result)
    
}

//def parse(String response) {
//	def msg = parseLanMessage(response)
//    log.debug("Received: ${msg.json}")
//    log.debug("Received: ${msg.body}")
//}

def installed() {
    initialize()
}

def updated() {
    initialize()
}

def initialize() {
	refreshLabels()
}