# Java Assignment 1

## Contents

[Background](#Background)

[Install](#Install)

[Usage](#Usage)

[Maintainers](#Maintainers)

[Licence](#Licence)


## Background 

This is a role playing game where you can choose different characters (Heroes) and equip them with different weapons and armors.
You can choose between the following heroes:
```
1.Mage 
2.Ranger
3.Rouge
4.Warrior
```
These heroes can equip some (not all) of these weapons:
```
1.Axes 
2.Bows
3.Daggers
4.Hammers
5.Staffs
6.Swords
7.Wands
```
and armors:
```
1.Cloth 
2.Leather
3.Mail
4.Plate
```

### Folderstructure at high level
```
.
|-- Assignment-1.iml
|-- out               # Compiled files
|-- src               # Source files
`-- tests             # Automated tests
```

### Structure for source files and tests <br />
```
src
|-- Main.java         			
|-- attributes
|   `-- Attributes.java
|-- enumerators
|   |-- ArmorType.java
|   |-- AttributesEnum.java
|   |-- Slot.java
|   `-- WeaponType.java
|-- exceptions
|   |-- InvalidArmorException.java
|   `-- InvalidWeaponException.java
|-- heros
|   |-- Hero.java
|   |-- Mage.java
|   |-- Ranger.java
|   |-- Rouge.java
|   `-- Warrior.java
`-- items
    |-- Armor.java
    |-- Item.java
    `-- Weapon.java
tests
|-- heros
|   |-- MageTests.java
|   |-- WarriorTest.java
|   `-- heroAttributeTests.java
`-- items
    |-- ArmorTests.java
    `-- WeaponTests.java

```

## Install
Clone git repo

Open folder in IDE
		
## Usage
Right click on tests-folder and choose Run 'All Tests'

## Maintainers
Vegard Gunnarson

## Licence
Open
		
