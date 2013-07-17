import train.Train;

public class Main {

    public static void main(String[] args) {
    /* * Задача.
        * Есть поезд. У поезда есть номер, направление, имя, количество вагонов. В вагорне есть номер вагона,
        * количество мест всего и знаятых мест. Также в вагоне есть список пионеров. Необходимо посадить человека в вагон.
        * */

        Train train = new Train(79, "Firm");
        train.addCarriage();
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).deletePassenger(15);
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");
        train.getCarriages().get(0).addPassenger("Vasya", "Pupkin");


        train.getCarriages().get(0).report();
     }
}
