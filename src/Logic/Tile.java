/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Michael
 */
public class Tile {

    private final Edge edgeNorth;
    private final Edge edgeEast;
    private final Edge edgeSouth;
    private final Edge edgeWest;
    private boolean isMonestery = false;
    private boolean isCityInCenter = false;
    private boolean isCrossCity = false;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public int decreaeAmountbyOne() {
        if (amount > 0) {
            --amount;
        } else {
        amount = 0;
        }

        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Tile(int amount, Edge edgeNorth, Edge edgeEast, Edge edgeSouth, Edge edgeWest) {
        this.amount = amount;
        this.edgeNorth = edgeNorth;
        this.edgeEast = edgeEast;
        this.edgeSouth = edgeSouth;
        this.edgeWest = edgeWest;
    }

    public Tile(int amount, Edge edgeNorth, Edge edgeEast, Edge edgeSouth, Edge edgeWest, boolean isMonestery) {
        this(amount, edgeNorth, edgeEast, edgeSouth, edgeWest);
        this.isMonestery = isMonestery;
    }

    public Tile(int amount, Edge edgeNorth, Edge edgeEast, Edge edgeSouth, Edge edgeWest, boolean isMonestery, boolean isCityInCenter) {
        this(amount, edgeNorth, edgeEast, edgeSouth, edgeWest, isMonestery);
        this.isCityInCenter = isCityInCenter;
    }

    public Tile(int amount, Edge edgeNorth, Edge edgeEast, Edge edgeSouth, Edge edgeWest, boolean isMonestery, boolean isCityInCenter, boolean isCrossCity) {
        this(amount, edgeNorth, edgeEast, edgeSouth, edgeWest, isMonestery, isCityInCenter);
        this.isCrossCity = isCrossCity;
    }
}
