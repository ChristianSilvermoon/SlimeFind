# SlimeFind
Tool to find Slime Chunks in Minecraft

Special thanks to [Minecraft Wiki (Gamepedia)](https://minecraft.gamepedia.com/Slime#.22Slime_chunks.22) for the Slime Chunk Algorithm

Currently Functional.

## Compatibility
Compatibility for Minecraft Versions. All Tests were preformed with [OpenJDK](http://openjdk.java.net/).

| Minecraft Version | Tested? | Works? |
| --- | --- | --- |
| 1.12.2 | Yes | Yes |
| 1.12.1 | No | Probably |
| 1.12 | Yes | Yes |

## SlimeFind.java
Need to use `javac` to compile to a runnable class file

Usage: `java SlimeFind <Numerical Seed> <X Chunk Start> <Z Chunk Start> <X Chunk End> <Z Chunk End>`

Returns a complete list of Slime Chunks within the specified Chunk Range

Coordinates correspond to the North Western corner of the Chunk in question.

You can get the numerical world seed in-game with the `/seed` command!
