package train;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/14/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Carriage {
    private int number;
    private int placesAmount;
    private ArrayList<Passenger> passengers;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPlacesAmount() {
        return placesAmount;
    }

    public void setPlacesAmount(int placesAmount) {
        this.placesAmount = placesAmount;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Carriage(int number, int placesAmount) {

        this.number = number;
        this.placesAmount = placesAmount;
        passengers = new ArrayList<Passenger>();
    }

    public void addPassenger(String name, String surname) {
        if (!isFreePlaces()) {
            System.out.println("Вагон заполнен");
        } else {
            passengers.add(new Passenger(name, surname, getFreePlace()));
        }

    }

    private boolean isFreePlaces() {
        boolean result = true;
        int amount = 0;
        for (Passenger line : passengers) {
            amount++;
        }
        if (amount >= Options.PLACENUMBER) {
            result = false;
        }
        return result;
    }

    private int getFreePlace() {
        for (int i = 1; i < Options.PLACENUMBER + 1; i++) {
            boolean isPlaceFree = true;
            for (Passenger line : passengers) {
                if (i == line.getPlaceNumber()) {
                    isPlaceFree = false;
                }
            }
            if (isPlaceFree) {
                return i;
            }
        }
        System.out.println("Борода с номерами. Или вагон переполнен, или номера попутались");
        return -1;
    }

    public void deletePassenger (int placeNumber) {
        int i = 0;
        while (passengers.get(i).getPlaceNumber() != placeNumber) {
            i++;
        }
        System.out.println("Пассажир: " + passengers.get(i).getName() + " " + passengers.get(i).getSurname());
        System.out.println("С места №" + placeNumber + " удален");
        passengers.remove(i);
    }

    public void report () {
        System.out.println("В вагоне №" + number + " едут:");
        for (Passenger line : passengers) {
            System.out.println(line.getName() + " " + line.getSurname() + ", место = " + line.getPlaceNumber() );
        }
    }
}
