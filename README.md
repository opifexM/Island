
[![Maintainability](https://api.codeclimate.com/v1/badges/579a746a0453e26b0864/maintainability)](https://codeclimate.com/github/opifexM/Island/maintainability)

## Animal Life Simulation Island

Island Life Settings File:

- settings.txt

  

In the settings, you can define the following:

- Island Size

- Map of the island

- Types of animals and their characteristics

- Graphical interface

  

The Map is divided by type:

- MOUNTAIN 
	- *Color*: Gray, 
	- *Symbol*: '**@**'
	- *Movement*: Impassable

- RIVER 
	- *Color*: Blue
	- *Symbol*: '**~**'
	- *Movement*: 2 points

- FIELD
	- *Color*: Green
	- *Symbol* '**.**'
	- *Movement*: 1 point

  
Each animal type has a capital letter displayed as an animal symbol on the map.

Animals are divided by type:

- OMNIVOROUS 
	- *Color*: Vinous
	- *Food*: Plants and animals
- CARNIVORES 
	- *Color*: Red
	- *Food*: Only other animals
- HERBIVORES 
	- *Color*: Green
	- *Food*: Plants only


Available animal actions:
 - **Weight loss** applies to all animals; at every turn, 10% of the animal's weight is lost. 
- **Reproduction** requires the presence of an animal weight of more than 50%. And representative of the same type of animal in the map tile.
- **Move** depending on the type of terrain and movement points of this type of animal.
- **Eat** depending on the animal's nutrition type and the chance against other animals.
  


The statistics screen displays:

- Animal type

- Number of animals relative to the start of the game

- Number of animals at the moment of the game
