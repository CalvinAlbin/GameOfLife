# GameOfLife

This program works by taking an input file consisting of a 20x20 matrix where each entry is either an 'X' or a '.' representing true and false respectively.
The user is prompted to input a this file, as well as how many generations the game of life should run through. The game runs through that many generations
and outputs to a file called output.txt.

RULES:
1. Any live cell with fewer than two live neighbors dies, as if caused by under-population.
2. Any live cell with two or three live neighbors lives on to the next generation.
3. Any live cell with more than three live neighbors dies, as if by overpopulation.
4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
