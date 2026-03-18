# Extra Reach Mod

A simple Fabric mod for **Minecraft 1.21** that increases your player reach by **1 block**.

| Mode     | Default Reach | With Mod |
|----------|---------------|----------|
| Survival | 4.5 blocks    | 5.5 blocks |
| Creative | 5.0 blocks    | 6.0 blocks |

Both block-breaking reach and entity-interaction reach are extended.

---

## Requirements

- Java 21+
- Minecraft 1.21
- [Fabric Loader](https://fabricmc.net/use/installer/) 0.15+
- No Fabric API needed — this mod is standalone!

---

## How to Build

1. **Clone / download** this project folder.
2. Open a terminal in the project root.
3. Run:
   ```bash
   ./gradlew build          # macOS/Linux
   gradlew.bat build        # Windows
   ```
4. The compiled `.jar` will appear at:
   ```
   build/libs/extra-reach-1.0.0.jar
   ```

---

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/) for Minecraft 1.21.
2. Copy `extra-reach-1.0.0.jar` into your `.minecraft/mods/` folder.
3. Launch Minecraft with the Fabric profile.

---

## Want to change the reach amount?

Open `PlayerReachMixin.java` and change the `+ 1.0` values to whatever you like:

```java
cir.setReturnValue(cir.getReturnValue() + 1.0); // change 1.0 to e.g. 3.0
```
