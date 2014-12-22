/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * final bo overriable method
 *
 * @author Michael
 */
public final class TileRepository {

    public List<Tile> repository = new ArrayList<>();
    Plik plik = new Plik();

    public TileRepository() {

        createDefaultRepo();
    }

    public void createDefaultRepo() {
        repository.add(new Tile(3, Edge.POLE, Edge.POLE, Edge.DROGA, Edge.POLE, true));
        repository.add(new Tile(4, Edge.POLE, Edge.POLE, Edge.POLE, Edge.POLE, true));
        repository.add(new Tile(1, Edge.MIASTO, Edge.MIASTO, Edge.MIASTO, Edge.MIASTO, false, true));
        repository.add(new Tile(5, Edge.MIASTO, Edge.DROGA, Edge.POLE, Edge.DROGA));
        repository.add(new Tile(5, Edge.MIASTO, Edge.POLE, Edge.POLE, Edge.POLE));
        repository.add(new Tile(3, Edge.POLE, Edge.MIASTO, Edge.POLE, Edge.MIASTO, false, true));
        repository.add(new Tile(3, Edge.MIASTO, Edge.POLE, Edge.MIASTO, Edge.POLE, false, false));
        repository.add(new Tile(2, Edge.MIASTO, Edge.MIASTO, Edge.POLE, Edge.POLE, false, false));
        repository.add(new Tile(4, Edge.MIASTO, Edge.DROGA, Edge.DROGA, Edge.POLE));
        repository.add(new Tile(4, Edge.MIASTO, Edge.POLE, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(3, Edge.MIASTO, Edge.DROGA, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(5, Edge.MIASTO, Edge.POLE, Edge.POLE, Edge.MIASTO, false, true));
        repository.add(new Tile(5, Edge.MIASTO, Edge.DROGA, Edge.DROGA, Edge.MIASTO, false, true));
        repository.add(new Tile(4, Edge.MIASTO, Edge.MIASTO, Edge.POLE, Edge.MIASTO, false, true));
        repository.add(new Tile(3, Edge.MIASTO, Edge.MIASTO, Edge.DROGA, Edge.MIASTO, false, true));
        repository.add(new Tile(8, Edge.DROGA, Edge.POLE, Edge.DROGA, Edge.POLE));
        repository.add(new Tile(9, Edge.POLE, Edge.POLE, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(5, Edge.POLE, Edge.DROGA, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(1, Edge.DROGA, Edge.DROGA, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(1,  Edge.MIASTO,  Edge.POLE, Edge.POLE, Edge.DROGA));
        repository.add(new Tile(1,  Edge.MIASTO, Edge.DROGA,  Edge.POLE, Edge.POLE));
        repository.add(new Tile(1, Edge.MIASTO, Edge.MIASTO, Edge.POLE, Edge.DROGA, false, true));
        repository.add(new Tile(1, Edge.POLE, Edge.DROGA, Edge.POLE, Edge.DROGA,true));
        repository.add(new Tile(1,  Edge.MIASTO, Edge.POLE, Edge.DROGA,  Edge.POLE));
        repository.add(new Tile(1, Edge.DROGA, Edge.DROGA, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(1, Edge.MIASTO, Edge.MIASTO, Edge.DROGA, Edge.POLE, false, true));
        repository.add(new Tile(1, Edge.POLE, Edge.POLE, Edge.DROGA, Edge.POLE));

    }

    public void saveToFile() throws FileNotFoundException, UnsupportedEncodingException {
        int tab[] = new int[100];

        for (int i = 0; i < repository.size(); i++) {
            tab[i] = repository.get(i).getAmount();
        }

        plik.save(tab);
    }

    public void changeRepoFromFile() throws FileNotFoundException {
        repository.clear();
       // repository.add(new Tile(plik.load()[0], Edge.POLE, Edge.POLE, Edge.DROGA, Edge.POLE, true));
        
        repository.add(new Tile(3, Edge.POLE, Edge.POLE, Edge.DROGA, Edge.POLE, true));
        repository.add(new Tile(4, Edge.POLE, Edge.POLE, Edge.POLE, Edge.POLE, true));
        repository.add(new Tile(1, Edge.MIASTO, Edge.MIASTO, Edge.MIASTO, Edge.MIASTO, false, true));
        repository.add(new Tile(5, Edge.MIASTO, Edge.DROGA, Edge.POLE, Edge.DROGA));
        repository.add(new Tile(5, Edge.MIASTO, Edge.POLE, Edge.POLE, Edge.POLE));
        repository.add(new Tile(3, Edge.POLE, Edge.MIASTO, Edge.POLE, Edge.MIASTO, false, true));
        repository.add(new Tile(3, Edge.MIASTO, Edge.POLE, Edge.MIASTO, Edge.POLE, false, false));
        repository.add(new Tile(2, Edge.MIASTO, Edge.MIASTO, Edge.POLE, Edge.POLE, false, false));
        repository.add(new Tile(4, Edge.MIASTO, Edge.DROGA, Edge.DROGA, Edge.POLE));
        repository.add(new Tile(4, Edge.MIASTO, Edge.POLE, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(3, Edge.MIASTO, Edge.DROGA, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(5, Edge.MIASTO, Edge.POLE, Edge.POLE, Edge.MIASTO, false, true));
        repository.add(new Tile(5, Edge.MIASTO, Edge.DROGA, Edge.DROGA, Edge.MIASTO, false, true));
        repository.add(new Tile(4, Edge.MIASTO, Edge.MIASTO, Edge.POLE, Edge.MIASTO, false, true));
        repository.add(new Tile(3, Edge.MIASTO, Edge.MIASTO, Edge.DROGA, Edge.MIASTO, false, true));
        repository.add(new Tile(8, Edge.DROGA, Edge.POLE, Edge.DROGA, Edge.POLE));
        repository.add(new Tile(9, Edge.POLE, Edge.POLE, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(5, Edge.POLE, Edge.DROGA, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(1, Edge.DROGA, Edge.DROGA, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(1,  Edge.MIASTO,  Edge.POLE, Edge.POLE, Edge.DROGA));
        repository.add(new Tile(1,  Edge.MIASTO, Edge.DROGA,  Edge.POLE, Edge.POLE));
        repository.add(new Tile(1, Edge.MIASTO, Edge.MIASTO, Edge.POLE, Edge.DROGA, false, true));
        repository.add(new Tile(1, Edge.POLE, Edge.DROGA, Edge.POLE, Edge.DROGA,true));
        repository.add(new Tile(1,  Edge.MIASTO, Edge.POLE, Edge.DROGA,  Edge.POLE));
        repository.add(new Tile(1, Edge.DROGA, Edge.DROGA, Edge.DROGA, Edge.DROGA));
        repository.add(new Tile(1, Edge.MIASTO, Edge.MIASTO, Edge.DROGA, Edge.POLE, false, true));
        repository.add(new Tile(1, Edge.POLE, Edge.POLE, Edge.DROGA, Edge.POLE));

    }
}
