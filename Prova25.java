public class Prova25 {

//Questão A - Interseção de Vetores//

public static boolean existe(int[] vetor, int tamanho, int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;

        for (int i = 0; i < tamA; i++) {
            if (!existe(u, tamU, a[i])) {
                u[tamU] = a[i];
                tamU++;
            }
        }
        for (int i = 0; i < tamB; i++) {
            if (!existe(u, tamU, b[i])) {
                u[tamU] = b[i];
                tamU++;
            }        
        return tamU;
    }
}
//Questão B - Insertion Sort //
    public static void ordenar(int[] v, int n) {
        for (int i = 1; i < n; i++) {
            int aux = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > aux) {
                v[j + 1] = v[j]; 
                j--;
            }

            v[j + 1] = aux; 
    }
    
//Questão C - gerar Vetor sem Repetição //
public static boolean verifica (int[] vsr, int tamVSR, int elemento) {
    for (int i = 0; i < tamVSR; i++) {
        if (vsr[i] == elemento) {
            return true; 
        }
    }
    return false; 
}

public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
    int tamVSR = 0; 
    for (int i = 0; i < tamV; i++) {
        int atual = v[i]; 
        if (verifica (vsr, tamVSR, atual)) {
            vsr[tamVSR] = atual;
            tamVSR++;                  
        }
    }
    return tamVSR;
}

//Questão D - //
public static void rotacionar(int[] v, int tam, int k) {
    if (tam <= 0) return;
    k = k % tam;
      if (k < 0) {
       k + tam; 
                
    for (int j = 0; j < k; j++) {
        int primeiro = v[0];
        for (int i = 0; i < tam - 1; i++) {
            v[i] = v[i + 1];
        }
        v[tam - 1] = primeiro; 
    }
}

}


//Questão C - gerar Vetor sem Repetição - corrigida //
public static boolean verifica (int[] vsr, int tamVSR, int elemento) {
    for (int i = 0; i < tamVSR; i++) {
        if (vsr[i] == elemento) {
            return true; 
        }
    }
    return false; 
}

public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
    int tamVSR = 0; 
    for (int i = 0; i < tamV; i++) {
        int atual = v[i]; 
        if (!verifica (vsr, tamVSR, atual)) {
            vsr[tamVSR] = atual;
            tamVSR++;                  
        }
    }
    return tamVSR;
}
//Questão D - Rotacionar - corrigida //
public static void rotacionar(int[] v, int tam, int k) {
    if (tam <= 0) return;
    k = k % tam;
      if (k < 0) {
       k = k + tam; 
      }
    for (int j = 0; j < k; j++) {
        int primeiro = v[0];
        for (int i = 0; i < tam - 1; i++) {
            v[i] = v[i + 1];
        }
        v[tam - 1] = primeiro; 
    }



}
    }}