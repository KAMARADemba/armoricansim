# ArmoricAnsim

A simulation game featuring Gauls, Romans, and Werewolves set in the world of ancient Armorica.

## Description

ArmoricAnsim is a Java-based simulation game that brings together different civilizations and mythical creatures in an interactive world. Players can control various characters including Gauls (Druids, Blacksmiths, Merchants), Romans (Generals, Legionaries, Prefects), and Werewolves in a dynamic environment.

## Features

- **Multiple Character Types**: Play as Gauls, Romans, or Werewolves, each with unique abilities
- **Magic Potion System**: Druids can brew magical potions with various ingredients
- **Pack Hierarchy**: Werewolves organize in packs with a complex social structure
- **Battle System**: Engage in battles between different factions
- **Graphical Interface**: JavaFX-based user interface with CLI fallback

## Project Structure

```
src/
├── main/
│   ├── java/fr/amu/qualite/
│   │   ├── controller/     # Game controllers
│   │   ├── exceptions/     # Custom exceptions
│   │   ├── model/          # Domain models
│   │   │   ├── characters/ # Character classes
│   │   │   ├── food/       # Food and potion items
│   │   │   ├── places/     # Game locations
│   │   │   └── werewolf/   # Werewolf pack system
│   │   ├── utils/          # Utility classes
│   │   └── view/           # UI components
│   └── resources/          # Configuration files
└── test/                   # Unit tests
```

## Requirements

- Java 17 or higher
- Maven 3.6+

## Building

```bash
mvn clean install
```

## Running

```bash
mvn javafx:run
```

## Testing

```bash
mvn test
```

## Dependencies

- JavaFX 21 (Controls, FXML)
- Log4j2 2.21.1 (Core, API)
- JUnit 5.10.1 (Jupiter)

## License

MIT License