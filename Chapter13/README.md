# Notes for Chapter 13 

## Components

* A more correct term for *widget*

* Extends from `javax.swing.JComponent`

* Can be nested.

## Layout manager

* Controls the size and location of components.

* `BorderLayout`
    * Components usually don't get to have their preferred size.
    * Default for a frame.
    * Five regions: east, west, north, south and center.
    * Preferred width in east/west; Height in north/south. The center region gets whatever's left (unless use `pack()`).
    * `pack()`: uses the full preferred size of the center components, then determines the size of the frame using the center as a starting point, building the rest components in the other regions.
* `FlowLayout`
    * Respect the components size. 
    * Left to right, top to bottom, in the added order with "word-wrap". 
    * Default for a panel.
* `BoxLayout`
    * Components have their own size. 
    * Stack components vertically/horizontally.