// Last updated: 29/04/2025, 18:46:25
class ParkingSystem {
    public int big;
    public int medium;
    public int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.big-- > 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.medium-- > 0) {
                    return true;
                }
                return false;
            case 3:
                if (this.small-- > 0) {
                    return true;
                }
                return false;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */