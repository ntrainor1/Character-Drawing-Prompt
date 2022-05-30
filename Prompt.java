/**
 * Prompt
 */
public class Prompt {

    public static void main(String[] args) {
        nameTopic();
    }
    
    public static void nameTopic() {
        String[] ranks = {"King", "Queen", "Knight", "Wizard", "Knave"};
        String[] suits = {"Cheese", "Slime", "Hat", "Witch", "Water", "Bird", "Dog", "Cat", "Cow", "Horse", "Chicken", "Stove", "Pig", "Elephant", "Snake", "Owl", "Weasel", "Wind", "Stone", "Mountain", "Beetle", "Ant", "Spider", "Crab", "Camel", "Tiger", "Bread", "Onion", "Light", "Storm", "Darkness", "Stag", "Hare", "Fox", "Wolf", "Rat", "Buffalo", "Panther", "Lion", "Goat", "Bear", "Chain", "Sun", "Moon", "Cloud", "Lizard", "Lemon", "Sugar", "Salt", "Spice", "Sand", "Swamp", "Tree", "Bush", "Grass", "River", "Ocean", "Pine", "Gold", "Silver", "Copper", "Barrel", "Smith", "Beer", "Wine", "Meat", "Otter", "Mole", "Space", "Star", "Jupiter", "Saturn", "Mercury", "Venus", "Mars", "Apple", "Chocolate", "Banana", "Pepper", "Corn", "Fire", "Vampire", "Desert", "Snow", "Jungle", "Seal", "Vulture", "Anteater", "Turtle", "Crocodile", "Fur", "Wood", "Fish", "Shark", "Whale", "Flower", "Death", "Heart", "War", "Hunter", "Game", "Card", "Ghost", "Mirror", "Pillow", "Car", "Radio", "Steam", "Smoke", "Engine", "Ivory", "Marble", "Obsidian", "Ruby", "Rose", "Purple", "Green", "Blue", "Yellow", "Red", "Orange", "Brown", "Ash", "Cloth", "Ink", "Feather", "Paper", "Dragon", "Bridge", "Holy", "Skeleton", "Insect", "Zebra", "Beehive", "Potato", "Berry", "Magic", "Cherry", "Riddle", "Sphinx", "Leviathan", "Golem", "Wendigo", "Minotaur", "Swan", "Demon", "Lava", "Pineapple", "Pasta", "Frog", "Angle", "Fairy", "Ring", "Donkey", "Puppet", "Candle", "Key", "Roulette", "Paint", "Mud", "Mind", "Coffee", "Net", "Tea", "Scythe", "Blade", "Hammer", "Tooth", "Eye", "Poison", "Hydra", "Gorgon", "Mop", "Cup", "Soap", "Thread", "Garden", "Rug", "Peach", "Broccoli", "Moss", "Salamander", "Mad", "Number", "Alphabet", "Gear", "Shovel", "Egg", "Mole", "Crow", "Mosaic", "Speed", "Disease", "Famine", "Harvest", "Scope", "Gunpowder", "Goblin", "Dinosaur", "Nut", "Noir", "Atom", "Strength", "Monkey", "Chimney", "Mosquito", "Mummy", "Flight", "Hourglass", "Time", "Watch", "Cactus", "Greed", "Sour", "Abstract", "Picnic", "Camp", "Diamond", "Club", "Spade", "Xylophone", "Trumpet", "Harp", "Violin", "Bass", "Raft", "Coconut", "Dodo", "Comic", "Book", "Farm", "Crown", "Troll", "Elf", "Dwarf", "Mine", "Halfling", "Crate", "Orb", "Portal", "Claw", "Fang", "Unicorn", "Pegasus", "Cyclops", "Cerberus", "Genie", "Hippo", "Alligator", "Llama", "Chalk", "Bat", "Rope", "Lantern", "Clay", "Spore", "Train", "Cheetah", "Snail", "Boat", "Mariner", "Laser", "Bomb", "Hedgehog", "Porcupine", "Nomad", "Bandit", "Music", "Camera", "Secret", "Ribbon", "Robot", "Dust", "Centipede", "Grasshopper", "Elastic", "Ball", "Harpy", "Gnome", "Griffin", "Leprechaun", "Manticore", "Wraith", "Scorpion", "Centaur", "Fawn", "Wheel", "Pickle", "Ray", "Duck", "Castle", "Mermaid", "Leaf", "Cherry", "Ice", "Eraser", "Pencil", "Sundial", "Shell", "Jellyfish"};

        int min = 0; 
        int max = (int)(suits.length - 1);
        int suit = (int)(Math.random()*(max-min+1)+min);

        min = 0; 
        max = (int)(ranks.length - 1);
        int rank = (int)(Math.random()*(max-min+1)+min);
    
        String topic = suits[suit] + " " + ranks[rank];
    
        System.out.println(suits.length);
    }

    
}