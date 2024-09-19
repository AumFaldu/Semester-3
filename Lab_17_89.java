import java.util.LinkedList;
import java.util.Scanner;

// A class to represent the key-value pair
class KeyValuePair<K, V> {
    K key;
    V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

// A class for the Hash Table implementation
class HashTable<K, V> {
    private LinkedList<KeyValuePair<K, V>>[] table;
    private int capacity;

    // Constructor to initialize the hash table
    @SuppressWarnings("unchecked")  // Suppress the unchecked type cast warning
    public HashTable(int capacity) {
        this.capacity = capacity;
        table = (LinkedList<KeyValuePair<K, V>>[]) new LinkedList[capacity];  // Safe unchecked cast

        // Initialize each bucket as an empty LinkedList
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to generate an index for the key
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Method to insert or update a key-value pair
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<KeyValuePair<K, V>> bucket = table[index];

        // Check if the key already exists in the bucket
        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);  // Update the value if key exists
                return;
            }
        }

        // Insert a new key-value pair if key doesn't exist
        bucket.add(new KeyValuePair<>(key, value));
    }

    // Method to retrieve a value by key
    public V get(K key) {
        int index = hash(key);
        LinkedList<KeyValuePair<K, V>> bucket = table[index];

        // Search for the key in the bucket
        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();  // Return the value if key is found
            }
        }
        return null;  // Return null if key is not found
    }

    // Method to remove a key-value pair
    public void remove(K key) {
        int index = hash(key);
        LinkedList<KeyValuePair<K, V>> bucket = table[index];

        // Iterate over the bucket to find the key
        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                bucket.remove(pair);  // Remove the pair if key is found
                return;
            }
        }
    }
}

// Main class named Lab_17_89
public class Lab_17_89 {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>(10);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Menu-driven program using switch case
        while (running) {
            System.out.println("Choose an operation:");
            System.out.println("1: Insert (put) key-value pair");
            System.out.println("2: Retrieve (get) value by key");
            System.out.println("3: Remove key-value pair");
            System.out.println("4: Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline after integer input

            switch (choice) {
                case 1:
                    // Insert key-value pair
                    System.out.println("Enter key (string): ");
                    String keyPut = scanner.nextLine();
                    System.out.println("Enter value (integer): ");
                    int valuePut = scanner.nextInt();
                    hashTable.put(keyPut, valuePut);
                    System.out.println("Inserted key-value pair (" + keyPut + ", " + valuePut + ")");
                    break;

                case 2:
                    // Retrieve value by key
                    System.out.println("Enter key (string) to retrieve value: ");
                    String keyGet = scanner.nextLine();
                    Integer valueGet = hashTable.get(keyGet);
                    if (valueGet != null) {
                        System.out.println("Value for key '" + keyGet + "' is: " + valueGet);
                    } else {
                        System.out.println("Key '" + keyGet + "' not found.");
                    }
                    break;

                case 3:
                    // Remove key-value pair
                    System.out.println("Enter key (string) to remove: ");
                    String keyRemove = scanner.nextLine();
                    hashTable.remove(keyRemove);
                    System.out.println("Removed key '" + keyRemove + "'");
                    break;

                case 4:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
