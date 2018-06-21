package by.epam.preTraining.punkoDmitri.tasks.task07.model.logic;

import by.epam.preTraining.punkoDmitri.tasks.task07.model.entities.Vehicle;

public interface Storable {

    int size();

    boolean isEmpty();

    Vehicle get(int index);

    void set(int index, Vehicle element);


}
