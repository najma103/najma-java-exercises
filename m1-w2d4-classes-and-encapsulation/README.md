# OOP with Encapsulation Exercises

The following are descriptions of several everyday items that you need to implement as classes. The minimal set of attributes and methods are outlined, but you should feel free to add additional ones.

## Homework Assignment

### Data Members

    totalMarks
    possibleMarks
    submitter
    letterGrade *


**Notes**
- `letterGrade` is a derived property that is calculated using totalMarks and possibleMarks. 
    - For 90% or greater return "A" 
    - 80-89% return "B" 
    - 70-79% return "C" 
    - 60-69% return "D" 
    - otherwise return "F"

<br/>

## Fruit Tree

### Data Members

    fruitType
    piecesOfFruitLeft
    
### Methods

    bool pickFruit(int numberOfPieces)
    
**Notes**
- `pickFruit()` is a method 
    - returns `true` if more fruit was picked or `false` if no fruit was picked.
    - when picking fruit, remember to update the number of remaining pieces

<br/>

## Employee

### Data Members

    employeeId
    name
    department
    annualSalary
    
### Methods

    void raiseSalary(int percent)

**Notes**
- `raiseSalary()` raises the current salary by the percentage provided
    
<br/>    

## Airplane

### Data Members

    planeNumber
    bookedFirstClassSeats
    totalFirstClassSeats
    bookedCoachSeats
    totalCoachSeats
    
### Constructors
    
    Airplane(int totalFirstClassSeats, int totalCoachSeats)    

### Methods

    bool reserveSeats(bool firstClass, int totalNumberOfSeats)


**Notes**
- An airplane can't exist without seats. Make a constructor require a number of first class and coach seats be provided
- `reserveSeats()` is a method
    - if firstClass is true, update the number of remaining first class seats using `totalNumberOfSeats`
    - if firstClass is false, update the number of remaining coach class seats using `totalNumberOfSeats`
    - return a bool indicating if the reservation can be made

<br/>

## Smart Phone

### Data Members

    phoneNumber
    carrier
    operatingSystem
    batteryCharge
    onCall
    
### Constructor

    SmartPhone(phoneNumber)

### Methods

    bool call(phoneNumberToCall)
    answer()
    hangup()
    
**Notes**
- A smartphone requires a phone number
- The `answer()` method sets `onCall` to true
- The `call()` method makes sure the phone number is 10 digits and sets `onCall` to true. If the phone number is not length 10, it does not set `onCall` to true.
- The `hangUp()` method sets `onCall` to false
    
<br/>    

## Television        
    
### Data Members
    
    isOn        
    selectedChannel
    currentVolume

### Methods
    
    turnOff()
    turnOn()
    changeChannel(int newChannel)
    raiseVolume()
    lowerVolume()    

**Notes**
- `turnOn()` besides turning the tv on, it also resets the channel to 3 and the volume to 2
- `raiseVolume()` inceases the volume by 1. The limit is 10
- `lowerVolume()` decreases the volume by 1. The limit is 0

<br/>
    
## Elevator

### Data Members

    shaftNumber
    currentLevel
    numberOfLevels
    doorOpen
    isMoving

### Constructor

    Elevator(int totalNumberOffloors)

### Methods
    
    void openDoor()
    void closeDoor()
    bool goUp(int desiredFloor)
    bool goDown(int desiredFloor)        
    
**Notes**
- A new elevator must start on floor 0.
- Elevators cannot go up past the last floor
- Elevators cannot go down past floor one
- Elevators cannot go up when the door is open
- `goUp()` changes the currentLevel and returns true if the elevator is able to move up
- `goDown()` chanes the currentLevel and returns true if the elevator is able to move down

<br/>

    
The select three of the following, and create a class for them.  Make sure to include both attributes, and methods that not only do things, but change the object's state.

    Cowgirl                                 Broom
    
    Superhero (or heroine)                  Thermostat
    
    Dorm Fridge                             Pizza
    
    Pencil                                  Pilot
    
    Dice                                    Dragon
    
    Diva                                    UFO
    
    Dice                                    Book
    
    Ball                                    Scooter
    
    Laundry                                 Clock
    
    Camera                                  Block
    
    Volcano                                 Ice cream
    
    Apple                                   Clown
