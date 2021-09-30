We have the Plateau grid that can be represented as grid of integers
Value 0 means the position is free
Value 1 means it's occupied
This way we can have other Plateau shapes than square/rectangle
We can also easily add different reasons to occupy a position and different actions accordingly


The Rover will have his current position in position[x][y]
and the orientation that it's facing.
Executing a command may change the orientation or move to next position after checking if it's free.
If the rover can move successfully then his old position should be set free and the new one will be set as occupied
If not the rover will stay on it's last available position and there will be a message for the user
