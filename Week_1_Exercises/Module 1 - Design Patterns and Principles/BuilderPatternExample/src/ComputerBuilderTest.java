
public class ComputerBuilderTest {
    public static void main(String[] args) {
        
        Computer basicComputer = new Computer.Builder()
                .setCpu("Intel Core i3")
                .setRam("8GB")
                .setStorage("256GB")
                .build();
        System.out.println("Basic Computer: " + basicComputer);

      
        Computer gamingComputer = new Computer.Builder()
                .setCpu("Intel Core i7")
                .setRam("16GB")
                .setStorage("1TB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        
        Computer serverComputer = new Computer.Builder()
                .setCpu("Intel Xeon")
                .setRam("32GB")
                .setStorage("2TB")
                .setBluetoothEnabled(true)
                .build();
        System.out.println("Server Computer: " + serverComputer);
    }
}