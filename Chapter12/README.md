# Notes for Chapter 12 (GUI)

## Events

* `JFrame`: reprensents a window.

* Widgets are added on the window pane.

* Not all look and feels are available on every platform.
    * Standard: ***Metal***
    * Native

* A listener interface is the bridge between the listener and event source.
    * Event source accepts registrations from listeners and sends the event
    * Listener implements interface, register with the event source and provide event handling.
    * Event object carries information about the event, including the source of the event.

* Every event type has a matching listener interface.

## Graphics

* Three ways to put things on a GUI:
    * Put widgets on a frame
    * Draw 2D graphics on a widget
    * Put a JPEG/GIF on a widget

* Make a drawing widget -- make a subclass of `JPanel` and override `paintComponent()` method, which is alway called by the GUI system.

* Graphics parameter in the paintComponent is actually an instance of the Graphics2D class, which has more methods. To invoke those, Graphics object must be cast to Graphics2D object.

* Inner class: can use all the methods and variables of the outer class, even private ones.
    * Can be in different inheritance tree.

* An inner class instance must be tied to an outer class instance (with one exception).
