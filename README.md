# 🛡️ Defense System - Object Oriented Programming Coursework

A simulated defense system that manages and monitors various defense units including Helicopters, Tanks, and Submarines. This Java Swing application demonstrates key Object-Oriented Programming concepts through a centralized command and control interface.

## 📋 Project Overview

This project simulates a sophisticated defense system with multiple interconnected units that communicate with a central controller. Each defense unit features its own graphical user interface, unique capabilities, and attributes. The system emphasizes communication, coordination, and real-time information exchange between defense components.

## 🏗️ Architecture & Design Patterns

### Observer Pattern Implementation
- **Observable Interface**: All defense units (Helicopter, Tank, Submarine) implement the Observable interface
- **MainController (Observer)**: Central coordinator that observes and manages all defense units
- **Event-Driven Updates**: Automatic notification system for state changes

### Inheritance Hierarchy
- **SuperDefence Class**: Abstract base class providing common functionality
- **Specialized Units**: Helicopter, Tank, and Submarine classes extend SuperDefence
- **Polymorphic Behavior**: Each unit implements unique features while sharing common interfaces

## 🎯 Key Features

### 1. Defense Units

#### 🚁 Helicopter
- **Aerial Capabilities**: Mobile air support unit
- **Combat Operations**: Shoot, missile deployment, laser operations
- **Unique Attributes**: Soldier count, ammunition tracking
- **Area Monitoring**: Real-time area reporting

#### 🚀 Tank
- **Ground Operations**: Heavy armored ground unit
- **Combat Systems**: Main cannon shooting, defensive maneuvers
- **Resource Management**: Soldier count, ammo count tracking
- **Battlefield Communication**: Area-based status updates

#### 🌊 Submarine
- **Underwater Operations**: Specialized naval defense
- **Unique Capabilities**: Underwater shooting, missile deployment, sonar operations
- **Critical Systems**: Energy management, oxygen level monitoring
- **Stealth Operations**: Sonar-based detection systems

### 2. Main Controller (SuperDefence)
- **Central Coordination**: Manages all defense unit interactions
- **Strength Calculation**: Aggregates and broadcasts overall defense strength
- **Message Hub**: Facilitates communication between units
- **Global Operations**: Coordinates multi-unit defense strategies

### 3. Communication Systems
- **Area Messaging**: Units report their current operational area
- **Strength Updates**: Real-time war strength reporting
- **Message Broadcasting**: Global communication between all units
- **Observer Notifications**: Automatic updates to central controller

## 🖥️ GUI Components

Each defense unit features a specialized Swing GUI:

### Helicopter Interface
- Soldier count display
- Ammunition tracking
- Shoot/Missile/Laser controls
- Message broadcasting panel

### Tank Interface
- Armor status indicator
- Ammo management
- Combat operation controls
- Area reporting system

### Submarine Interface
- Oxygen level monitoring
- Energy system display
- Sonar operation controls
- Underwater combat systems

### Main Controller Interface
- Overall defense strength display
- Area message aggregation
- Unit status monitoring
- Global command controls

## 🔧 Technical Implementation

### Core Technologies
- **Java Swing**: GUI framework for all interfaces
- **Observer Pattern**: Event-driven architecture
- **Polymorphism**: Specialized unit behaviors
- **Inheritance**: Shared functionality through SuperDefence

### Key Classes

- **SuperDefence (Abstract)**
- Helicopter
- Tank
- Submarine

- **MainController (Observer)**
- **Starter (Application Entry)**
- **Observable (Interface)**


### System Flow
1. **Starter Class** initializes observer and main controller
2. **Unit Instances** created and registered with observer
3. **User Interaction** through unit GUIs
4. **State Changes** trigger observer notifications
5. **Central Coordination** via MainController
6. **Strength Signals** broadcast to all units



- This README provides a comprehensive overview of Defense System project, highlighting the OOP concepts, architecture, features, and technical implementation details.
