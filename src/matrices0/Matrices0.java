
package matrices0;

public class Matrices0 {

    
    public static void main(String[] args) {
     String cidades[] = {"Vigo", "Pontevedra", "Santiago", "Ourense"};
     String dias[] = {"Luns", "Mércores", "Venres"};
     float[][] tas = {{15f, 12f, 16f}, {10f, 11f, 11f}, {7f, 8f, 9f}, {6f, 5f, 7f}};
    
     Print obx=new Print();
     obx.printM(cidades, dias, tas);
     obx.mediaS(cidades,dias, tas);
     obx.mediaD(cidades, dias, tas);
    }
     
}
