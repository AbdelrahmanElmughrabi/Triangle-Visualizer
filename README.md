
# ASCII Triangle Drawer/Triangle-Visualizer (OLD)

A Java program that visualizes triangles using ASCII characters in a console window.
This was one of my learning process projects that I made to master the fundamentals of java.

## Description

This program allows users to draw triangles by:
- Inputting 3 sets of (x,y) coordinates 
- Visualizing the triangle in a 51x51 grid using asterisks (*)
- Drawing lines between the points using a simple line drawing algorithm

## Usage

1. Run the program
2. Enter the x and y coordinates for each of the 3 points when prompted
3. The program will display the triangle using ASCII characters
4. To exit, enter 0,0 for all three points

### Example Input (To see the triagnle)
```
Enter x1
5
Enter y1
5
Enter x2
30
Enter y2
30
Enter x3
10
Enter y3
40
```

The program will display the triangle formed by these coordinates using asterisk (*) characters.

## Features

- Interactive console input
- ASCII visualization
- Line drawing algorithm that handles:
  - Vertical lines
  - Horizontal lines
  - Diagonal lines
- 51x51 grid display
- Automatic matrix clearing between drawings

## Technical Details

The program uses:
- Boolean matrix for storing the triangle points
- Line drawing algorithm with slope calculations
- Modular design with separate methods for:
  - Drawing lines
  - Clearing the display
  - Printing the matrix
