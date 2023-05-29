class ParkingSystem {
    int[] arr = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        arr[0] = big;
        arr[1] = medium;
        arr[2] = small;
    }
    
    public boolean addCar(int ct) {
        if(ct==1){
            if(arr[0]>0){
                arr[0]--;
                return true;
            }
        }
        if(ct==2){
            if(arr[1]>0){
                arr[1]--;
                return true;
            }
        }
        if(ct==3){
            if(arr[2]>0){
                arr[2]--;
                return true;
            }
        }
        return false;
    }
}

/** 
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
