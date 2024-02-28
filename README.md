# FrigidDataLib
Implementation of a data structures library, Linked List based.

# FrigidDataLib Documentation (English Ver.)

Data Structures

Data structures are structures used to store data in an application. The most common data structure is the array, but it has some disadvantages.

These disadvantages include:

Fixed size: The size of an array is defined at creation, which can lead to problems in applications where the volume of data tends to grow or ends up growing too much.

Memory usage: Unused allocated space in an array remains occupying unused memory on the machine, which is another disadvantage of its use.

A linked list is an alternative to arrays. Java already has a ready-made implementation of the linked list, through the LinkedList class that implements the List interface, from the collections package. However, in some cases, creating your own linked list can be a good choice for developing an application/system.

Some advantages of linked lists are:

Dynamic growth: They grow dynamically and do not have a statically defined size, like arrays.

Efficient memory usage: Since they grow dynamically, there is no idle allocated space in memory (except for nodes that lose their link in the list, but the Java Garbage Collector takes care of cleaning up those nodes from time to time).

However, they also have some disadvantages, such as:

Access to middle nodes: Accessing nodes in the middle of the list is not as easy as in arrays, where you can access an element by its index.

Recursive algorithms: Algorithms that use recursive calls are more readable and clear, but also more complex, since recursive algorithms are more difficult to visualize and perform testing, as the recursive calls are accumulated on the memory stack.

This repository contains the implementation of my data structures library, where I created interfaces, classes, and a main algorithm with a menu to execute and test the linked list functionalities. Here is an explanation of the project artifacts:

Interfaces

1.1 List Interface

This interface contains all the methods that must be implemented by a linked list of integers.

1.2 Search Interface

This interface contains the signature of a linear search method to be implemented.

1.3 Sort Interface

This interface contains the signature of a sorting method to be implemented.

1.4 AdditionalMethods Interface

This interface contains some additional methods to be implemented in a linked list of integers.

Classes

2.1 Node Class

This class implements the node of a linked list, which has a value and a pointer to the next node in the list.

2.2 LinkedList Class

This class implements the linked list, which has a first node and a last node, including the implementation of the List and AdditionalMethods interfaces, and overrides these methods.

2.2.1 addBegin(), addMiddle(), and addEnd() Methods

The linked list can add nodes at the beginning, middle (at the desired position), and end of the list.

2.2.2 remove() Method

The linked list can remove nodes from any position in the list.

2.2.3 getNode() Method

The linked list can return the value of a node based on its position in the list.

2.2.4 countNodes() Method

The linked list can return the number of nodes that exist in the list (its size) using this method. The return value of this method is used in several other operations of the list.

2.2.5 destroy() Method

The linked list can destroy itself using this method, breaking the links between the nodes in the list (given that first and last pass to points to null).

2.2.6 showList() Method

The linked list can return each node, in a linear way, displaying the node value and its position in the list using this method. This display is done in the console.

2.2.7 firstNode() and lastNode() Methods

The linked list can display the first and last node of the list using these methods.

2.2.8 isEmpty() Method

The linked list can check if it is empty or not, returning a boolean. This method is used several times in other operations of the list.

2.2.9 showPairs() and showOddN() Methods

The linked list can display all nodes with pairs and odd numbers present in the list using these methods. The display is done in the console.

2.2.10 sumNodes() Method

The linked list can sum all the values of its nodes using this method.

2.3 SortImplementation Class

This class implements the sorting algorithm, where I used a bubble sort adapted for a linked list. The Sort interface is implemented, and the method is overridden.

2.3.1 sort() Method

This method is capable of sorting all the nodes in the list based on their values in ascending order. This sorting is done using a bubble sort method, which has a time complexity of O(n^2) in the worst case.

2.4 LinearSearch Class

This class implements the linear search algorithm in the linked list. The Search interface is implemented, and the method is overridden.

2.4.1 search() Method

The linear search, through its search method, is capable of performing a linear search on all nodes of a linked list it receives.

ExceptionHandler

An ExceptionHandler class was used to handle exceptions that may occur in the application. Its static methods are called at specific moments.

3.1 sizeExceptionMessage() Method

This static method, from the ExceptionHandler class, returns an error code -1 in the case of an attempt to retrieve a node from a non-existent position in the list.

3.2 emptyList() Method

This static method, from the ExceptionHandler class, returns an error code -2 in the case of an empty list.

4. Main

The main algorithm, where a menu was written, allows the execution and testing of most of the functionalities/operations of the list.

#

# Documentação (Versão em Português)

Estruturas de Dados

As estruturas de dados são as estruturas onde se armazenam os dados de uma aplicação. A estrutura de dados mais comum é o vetor/matriz, porém essa estrutura possui algumas desvantagens.

São elas, por exemplo:

Tamanho fixo: Em um vetor/matriz, o seu tamanho é definido em sua criação, portanto, em uma aplicação onde o volume de dados tenda a crescer ou acabe crescendo muito, podem surgir problemas posteriores a
o fazer uso dessas estruturas.

Consumo de memória: O espaço alocado não utilizado de um vetor/matriz permanece ocupando memória não utilizada na máquina, sendo essa outra desvantagem do seu uso.

Uma alternativa aos vetores/matrizes, são as listas ligadas. O próprio Java já possui uma implementação pronta da lista ligada, através da classe LinkedList que implementa a interface List, do pacote de coleções. Porém, em alguns casos, a criação de uma lista ligada própria pode ser uma boa pedida para o desenvolvimento de uma aplicação/sistema.

Algumas vantagens da lista ligada, são:

Crescimento dinâmico: Cresce dinamicamente, não possuindo um tamanho definido estaticamente, como os vetores/matrizes.

Melhor uso de memória: Como ela cresce dinamicamente, não há espaço alocado ocioso em memória (com exceção de nós que perderem sua ligação na lista, mas o Garbage Collector do Java se encarrega em fazer a limpeza desses nós de tempos em tempos).

Porém ela possui algumas desvantagens, como:

Acesso aos nós do meio: O acesso aos nós do meio da lista não é tão fácil como em vetores/matrizes, onde é possível acessar um elemento pelo índice.

Algoritmos recursivos: Algoritmos mais legíveis e limpos fazendo uso de chamadas recursivas, porém mais complexos, uma vez que algoritmos recursivos são mais complexos de visualizar e fazer o teste de mesa do que algoritmos iterativos, já que as chamadas recursivas vão ficando acumuladas na pilha de memória.

Nesse repositório, está a implementação da minha biblioteca de estruturas de dados, onde eu criei interfaces, classes, e um algoritmo principal com um menu, para fazer a execução e o teste das funcionalidades da lista ligada. Segue a explicação dos artefatos do projeto:

Interfaces

1.1 Interface List

É a interface que possui todos os métodos que devem ser implementados por uma lista ligada de números inteiros.

1.2 Interface Search

É a interface que possui a assinatura de um método de busca linear, para ser implementado.

1.3 Interface Sort

É a interface que possui a assinatura de um método de ordenação, para ser implementado.

1.4 Interface AdditionalMethods

É a interface que possui alguns métodos adicionais para serem implementados em uma lista ligada de números inteiros.

Classes 

2.1 Classe Node

É a classe que implementa o nó de uma lista ligada, que possui um valor, e um ponteiro para o próximo nó da lista.

2.2 Classe LinkedList 

É a classe que implementa a lista ligada, que possui um primeiro nó e um último nó, incluindo a implementação das interfaces List e AdditionalMethods, e sobrescrita desses métodos.

2.2.1 Métodos addBegin(), addMiddle() e addEnd()

A lista ligada é capaz de adicionar nós no início, no meio (na posição desejada) e no fim da lista.

2.2.2 Método remove()

A lista ligada é capaz de remover nós de qualquer posição da lista.

2.2.3 Método getNode()

A lista ligada é capaz de retornar o valor de um nó com base em sua posição na lista.

2.2.4 Método countNodes()

A lista ligada é capaz, por meio desse método, de retornar a quantidade de nós que existem na lista (o seu tamanho). O retorno desse método é utilizado em diversas outras operações da lista.

2.2.5 Método destroy()

A lista ligada é capaz de se autodestruir por meio desse método, quebrando as ligações da lista.

2.2.6 Método showList()

A lista ligada é capaz de retornar cada nó, de forma linear, exibindo o valor do nó e a sua posição na lista por meio desse método. Essa exibição é feita no console.

2.2.7 Métodos firstNode() e lastNode()

A lista ligada é capaz de exibir o primeiro e o último nó da lista, por meio desses métodos.

2.2.8 Método isEmpty()

A lista ligada é capaz de verificar se ela está ou não vazia, retornando um booleano. Esse método é utilizado diversas vezes em outras operações da lista.

2.2.9 Método showPairs() e showOddN()

A lista ligada é capaz de exibir todos os nós com números pares e ímpares presentes na lista, por meio desses métodos. A exibição é feita no console.

2.2.10 Método sumNodes()

A lista ligada é capaz de somar todos os valores de seus nós, por meio desse método.

2.3 Classe SortImplementation

É a classe que implementa o algoritmo de ordenação, onde utilizei um bubbleSort adaptado para lista ligada. A interface Sort é implementada, e o método sobrescrito.

2.3.1 Método sort()

A classe SortImplementation, por meio do seu método sort(), é capaz de ordenar todos os nós da lista que ela receber com base em seus valores, em ordem crescente. Para isso, essa ordenação é feita através de um método bubbleSort, de complexidade de tempo O(n^2) no pior caso.

2.4 Classe LinearSearch

É a classe que implementa o algoritmo de busca linear na lista ligada. A interface Search é implementada, e o método sobrescrito.

2.4.1 Método search()

A busca linear, através do seu método de busca, é capaz de realizar uma busca linear em todos os nós de uma lista ligada que ela receber.

3. ExceptionHandler

Uma classe para tratamento de exceções foi utilizada, para tratar algumas exceções que podem ocorrer na aplicação e chamar seus métodos estáticos em determinados momentos.

3.1 Método sizeExceptionMessage()

Esse método, da classe ExceptionHandler, retorna um código de erro -1, no caso de uma tentativa de buscar um nó de uma posição inexistente na lista.

3.2 Método emptyList()

Esse método, da classe ExceptionHandler, retorna um código de erro -2, no caso de uma lista estar vazia. 

4. Main

O algoritmo principal, onde um menu foi escrito, que permite a execução e testagem da maioria das funcionalidades/operações da lista.
