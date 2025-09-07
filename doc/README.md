[![Build](https://github.com/magemonkeystudio/${project.artifactId}/actions/workflows/release.yml/badge.svg?branch=main)](https://repo.travja.dev/releases/studio/magemonkey/${project.artifactId}/${project.version})
[![Build](https://github.com/magemonkeystudio/${project.artifactId}/actions/workflows/devbuild.yml/badge.svg?branch=dev)](https://repo.travja.dev/snapshots/studio/magemonkey/${project.artifactId}/${project.version})
[![Discord](https://dcbadge.limes.pink/api/server/6UzkTe6RvW?style=flat)](https://discord.gg/6UzkTe6RvW)

# ${project.name}

Let [Citizens](https://www.spigotmc.org/resources/citizens.13811/) NPCs build your schematics and structures block by
block.

## Dependencies

- [Citizens](https://www.spigotmc.org/resources/citizens.13811/)
- [Codex](https://www.spigotmc.org/resources/codex-core-plugin-by-magemonkey-studio-formerly-promccore.93608/)

## Usage

1) Create a NPC with Citizens and give it the 'builder' trait.

   Example: `/npc create Bob --trait builder`

2) Select the NPC, either by right-clicking them or through `/npc select <npc>`
3) Load a schematic with `/blueprint load <file name>`.

   Example: `/blueprint load house.schem`

   This will load the included example file `house.schem`.

4) Position the NPC in the center of the area in which it should build.
5) Start the NPC building with: `/blueprint build`
6) Watch the magic happen!

### A huge thanks to our contributors

<a href="https://github.com/magemonkeystudio/${project.artifactId}/graphs/contributors">
<img src="https://contrib.rocks/image?repo=magemonkeystudio/${project.artifactId}" />
</a>