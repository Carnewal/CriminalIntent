package com.carnewal.greendaogenerator;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;
/**
 *
 * @author Brecht
 */
public class CrimeDaoGenerator {
    public static void main(String args[]) throws Exception {
        Schema schema = new Schema( 1, "com.carnewal.na10_beadetective.crimegreendao.model");

        Entity crime = schema.addEntity("Crime");
        crime.addIdProperty();
        crime.addStringProperty("title");
        crime.addDateProperty("date");
        crime.addBooleanProperty("solved");
        crime.addStringProperty("suspect");

        new DaoGenerator().generateAll(schema, "../app/src/main/java");
    }
}