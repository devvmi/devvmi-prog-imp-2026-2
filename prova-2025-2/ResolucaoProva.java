/*
 * Universidade Católica de Pernambuco (UNICAP)
 * Prog Imp - Prova 2025.2 - Atividade
 */

public class ResolucaoProva {


    
    // Auxiliar para verificar se um elemento existe num vetor até determinado tamanho
    public static boolean contem(int[] v, int tam, int elem) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == elem) {
                return true;
            }
        }
        return false;
    }

    
    // QUESTÃO A -- 1,5 pontos
    
    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;

        for (int i = 0; i < tamA; i++) {
            if (!contem(u, tamU, a[i])) {
                u[tamU] = a[i];
                tamU++;
            }
        }

        for (int i = 0; i < tamB; i++) {
            if (!contem(u, tamU, b[i])) {
                u[tamU] = b[i];
                tamU++;
            }
        }

        return tamU;
    }

   
    // QUESTÃO B - 1,0 ponto
    
    public static void ordenar(int[] v, int n) {
        for (int i = 1; i < n; i++) {
            int chave = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }

    
    // QUESTÃO C - 1,5 pontos
    
    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
        int tamVSR = 0;

        for (int i = 0; i < tamV; i++) {
            if (!contem(vsr, tamVSR, v[i])) {
                vsr[tamVSR] = v[i];
                tamVSR++;
            }
        }

        return tamVSR;
    }

    
    // QUESTÃO D - 1,0 ponto
    
    public static void rotacionar(int[] v, int tam, int k) {
        if (tam <= 1) return;

        // Normaliza k para o intervalo válido do vetor
        k = k % tam;
        if (k < 0) {
            k = k + tam; // Converte rotação para a direita em rotação para a esquerda
        }

        if (k == 0) return;

        // Rotação de 1 posição para a esquerda repetida k vezes (in-place)
        for (int r = 0; r < k; r++) {
            int primeiro = v[0];
            for (int i = 0; i < tam - 1; i++) {
                v[i] = v[i + 1];
            }
            v[tam - 1] = primeiro;
        }
    }
}