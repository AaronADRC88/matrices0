package matrices0;

public class Print {

    public void printM(String cidades[], String dias[], float[][] tas) {
        int i, j, k;
        for (i = 0; i < dias.length; i++) {
            System.out.print("\t" + dias[i] + "\t");
        }
        for (j = 0; j < cidades.length; j++) {
            System.out.print("\n" + cidades[j] + "\n");
            for (k = 0; k < dias.length; k++) {
                System.out.print("\t" + tas[j][k] + "\t");
            }
        }
    }

    public void mediaS(String cidades[], String dias[], float[][] tas) {
        int j, k;
        float acu[] = new float[cidades.length];
        for (j = 0; j < cidades.length; j++) {
            for (k = 0; k < dias.length; k++) {
                acu[j] += tas[j][k];
            }
        }
        for (int i = 0; i < acu.length; i++) {
            System.out.print("\n" + cidades[i] + "\n" + "media: " + acu[i] / dias.length);
        }

    }

    public void mediaD(String cidades[], String dias[], float[][] tas){
       int i,j,k;
        float acu[]=new float[dias.length];
        for(i=0;i<acu.length;i++){
            for(j=0;j<acu.length;j++)
                acu[i]+=tas[i][j];
    }
        for(k=0;k<cidades.length;k++)
            System.out.print("\n" + dias[i] + "\n" + "media: " + acu[i] / cidades.length);
        
        
    }
    
}
