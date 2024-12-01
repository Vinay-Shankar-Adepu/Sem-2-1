class Bulb{
        String Shape; //long,Spherical.
        short Power; //kW
        String ColorOfLight;
        Boolean SupportIot;
        String Brand;
        float Price;
        String Type; //LED, Halogen, projector 

        Bulb(){
        }
        void TurnOff(){
            System.out.println(this.Brand + " bulb of " 
            + this.Type + " type and of power " + this.Power + "kW with the price of " + this.Price + 
            "rs. which illuminates a color of " + this.ColorOfLight + " with a " + this.Shape + " shape is turned OFF.");
        }
        void TurnOn(){
            System.out.println(this.Brand + " bulb of " 
            + this.Type + " type and of power " + this.Power + "kW with the price of " + this.Price + 
            "rs. which illuminates a color of " + this.ColorOfLight + " with " + this.Shape + " shape is turned ON.");
        }
}
