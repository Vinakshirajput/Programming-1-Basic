class Phone {
    public void playMusic() {
        System.out.println("Playing a song...");
    }

    public void makeCall() {
        System.out.println("Call Tom...");
    }
}

class Smartphone extends Phone {
    public void makeCall() {
        System.out.println("Call Om...");
    }

    public void showMap() {
        System.out.println("Show map...");
    }
}

class DynamicProgram {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Phone obj = new Smartphone();
        obj.makeCall();
    }
}
