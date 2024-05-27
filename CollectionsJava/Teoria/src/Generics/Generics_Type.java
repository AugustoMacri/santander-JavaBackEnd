package Generics;
/*
 * - É um tipo genérico de classe ou interface que é parametrizada em relação a tipos
 * - O diamons operator (<>) é usado no contexto de tipos genéricos em java para inferir automaticamente o tipo com base no contexto
 * - Para atualizar uma classe para usar generics, você cria uma declaração de tipo genérico alterando o código "public class Box"
 * para "public class Box<>"
 * - Isso introduz a variável de tipo, T, qu epode ser usada em qualquer lugar dentro da classe
 */

public class Generics_Type<T>{
    //T representa Type
    private T t;
    public void set(T t){this.t = t;}
    public T get() { return t;}
}

/*
 * - Como pode ver, todas as ocorrências de Object são substituidas por T
 * - Uma variável de tipo pode ser qualquer tipo não primitvo que voce especificar: Qualquer tipo de classe, qualquer tipo de interface, array ou até outra variável de tipo
 * - Essa mesma técnica pode ser aplicada para criar interfaces genéricas.
 * - Os mais padrões são:
 * E - Elemento
 * K - Chave
 * N - Numero
 * T - Tipo
 * V - Valor
 * S, U, V...
 * 
 * VANTAGENS DE USAR GENERICS NAS INTERFACES COLLECTION EM JAVA:
 * - Segurança no tipo de dado;
 * - Código mais legível;
 * - Detecta erros mais cedo;
 * - Reutilização de código;
 * - Melhor desempenho.
 */
