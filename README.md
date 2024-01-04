# Text-Game

Welcome to my basic text-based adventure game!

This is a very basic example that I plan to expand upon. This text game is special because it is not just a simple Java game, but it uses a tool called ANTLR. ANTLR is a parser generator that allows you to create your own languages. This comes in handy throughout this game twice as I have written one language that builds the map for the game. Another language is created using ANTLR that parses the commands entered by the user and performs each action in the game. These languages are super helpful and allow the simplification of the map and command system as well as the ability to change the map at will and allow for easy expansion to the game. In the future, it would be very easy to change out the map with the creation of a single text file. It would also be fairly easy to even add more commands as I would just need to change a few lines in the ANTLR and in the Java.

Notes:
- errors shown at beginning are due to grammar issues - only unfinished part of the game
- the game still functions properly but a warning appears

- the game is fully playable using the example map that is shown in the example cheatsheet image
- commands list below


List of possible commands in Explore mode(all case sensitive): 
- door n: Opens door labeled n and enter the room
- pickup item: Pick up an item in room and add to inventory
- exit:Search room to find exit
- describe: Describes the room, list pickups on the floor and number of doors
available
- admire valuable: Admire a valuable pickup in the inventory to increase confidence.
The valuable may only be used once to increase confidence, but is
not removed from the player’s inventory
- eat food: Eats a food pickup in the inventory to increase health points. Once
eaten, the food is removed from the player’s inventory
- stats: Display player health and confidence points and inventory
- wield weapon: Player wields weapon from inventory for battle
- open chest: Opens a treasure or war chest in the inventory. The contents of the
chest is placed in the player’s inventory and the chest removed
- help: Displays commands in this mode

List of possible commands in Explore mode(all case sensitive): 
- attack: Attacks the monster in the room using the wielded weapon
- wield weapon: Player wields weapon from inventory for battle
- help: Displays commands in this mode


hope you enjoy
