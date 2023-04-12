package HW_6;

public class Notebook {
    public String model;
    public String manufacturer;
    public double screenDiagonal;
    public String screenResolution;
    public String processorType;
    public int processorCores;
    public double processorFrequency;
    public int ram;
    public int hardDriveCapacity;
    public String graphicsCard;
    public String operatingSystem;
    public String bodyColor;
    public double price;

    public Notebook(String model, String manufacturer, double screenDiagonal, String screenResolution, 
    String processorType, int processorCores, double processorFrequency, int ram, int hardDriveCapacity, 
    String graphicsCard, String operatingSystem, String bodyColor, double price){
        this.model = model;
        this.manufacturer = manufacturer;
        this.screenDiagonal = screenDiagonal;
        this.screenResolution = screenResolution;
        this.processorType = processorType;
        this.processorCores = processorCores;
        this.processorFrequency = processorFrequency;
        this.ram = ram;
        this.hardDriveCapacity = hardDriveCapacity;
        this.graphicsCard = graphicsCard;
        this.operatingSystem = operatingSystem;
        this.bodyColor = bodyColor;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getDisplayResolution() {
        return screenResolution;
    }

    public void setDisplayResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getCores() {
        return processorCores;
    }

    public void setCores(int processorCores) {
        this.processorCores = processorCores;
    }

    public double getCPU() {
        return processorFrequency;
    }

    public void setCPU(double processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHDD() {
        return hardDriveCapacity;
    }

    public void setHDD(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getOS() {
        return operatingSystem;
    }

    public void setOS(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return bodyColor;
    }

    public void setColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void displayInfo(){
        System.out.printf("Модель: %s\n", model);
        System.out.printf("Производитель: %s\n", manufacturer);
        System.out.printf("Диагональ экрана: %.1f\n", screenDiagonal);
        System.out.printf("Разрешение экрана: %s\n", screenResolution);
        System.out.printf("Тип процессора: %s\n", processorType);
        System.out.printf("Количество ядер процессора: %d\n", processorCores);
        System.out.printf("Частота процессора: %.1f\n", processorFrequency);
        System.out.printf("Оперативная память: %d\n", ram);
        System.out.printf("Объемного жесткого диска: %d\n", hardDriveCapacity);
        System.out.printf("Видеокарта: %s\n", graphicsCard);
        System.out.printf("Операционная система: %s\n", operatingSystem);
        System.out.printf("Цвет корпуса: %s\n", bodyColor);
        System.out.printf("Цена: %.2f\n", price);        
    }
}
