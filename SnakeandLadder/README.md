Requirements
> Multiplayer Game

> Customizable Board in terms of Snake and ladder placement and Board size

> Customizable in terms of number of dice used

> When Game Board loads it should:
    A. Load the configured Board size

    B. Load the configured snake and ladder

    C. Load the configured number of dice

    D. Load the number of players who will play the game and all player should be at starting location.




Dice: Simulates a dice roll, generating random values that determine how far a player moves on the board.

GameBoard: Manages the game board, including all the snakes and ladders (jumpers). It checks if a player lands on a jumper (snake or ladder) and moves them accordingly.

Jumper: Represents a snake or ladder, which moves players between positions on the board.

PlaySnakeAndLadder: Handles the core gameplay logic, such as rolling the dice, moving players, checking for game end conditions, and printing updates after each move.

Player: Represents a player, keeping track of their position on the board