Classe CharacterFlyweight:

Essa classe representa o objeto Flyweight. No exemplo, cada objeto Flyweight representa um caractere.
A classe possui um atributo character para armazenar o caractere.
O construtor CharacterFlyweight(char character) recebe um caractere e atribui-o ao atributo character.
O método printCharacter() simplesmente imprime o caractere na tela.
Classe CharacterFlyweightFactory:

Essa classe é responsável por gerenciar a criação e o compartilhamento dos objetos Flyweight.
A classe possui um mapa chamado flyweights que mapeia caracteres para objetos Flyweight existentes.
O construtor CharacterFlyweightFactory() inicializa o mapa flyweights.
O método getCharacterFlyweight(char character) recebe um caractere como parâmetro e retorna o objeto Flyweight correspondente.
No método, é verificado se o mapa flyweights já contém um objeto Flyweight para o caractere fornecido. Se sim, o objeto Flyweight existente é retornado.
Caso contrário, é criado um novo objeto Flyweight com o caractere fornecido, adicionado ao mapa flyweights e retornado.
Classe de teste FlyweightExample:

Essa classe contém o método main, que é o ponto de entrada do programa.
Dentro do método main, é criada uma instância da fábrica CharacterFlyweightFactory.
Em seguida, são solicitados objetos Flyweight para os caracteres 'A' e 'B' usando o método getCharacterFlyweight da fábrica.
O método printCharacter é chamado em cada objeto Flyweight para imprimir o caractere correspondente.
Observe que, quando o objeto Flyweight para o caractere 'A' é solicitado novamente, a mesma instância já existente é retornada.
Isso é verificado ao comparar as referências dos objetos characterA e characterA2 usando o operador ==.


Neste exemplo, temos a classe CharacterFlyweight que representa o objeto Flyweight. 
Ela contém os dados compartilhados, que, no caso, é apenas um caractere.

A classe CharacterFlyweightFactory é responsável por gerenciar a criação e o
compartilhamento dos objetos Flyweight. Ela usa um mapa para 
armazenar os Flyweights existentes e, ao receber uma solicitação para um 
determinado caractere, verifica se ele já existe no mapa. Se já existir, retorna o 
Flyweight existente; caso contrário, cria um novo Flyweight e o adiciona ao mapa.

Na classe de teste FlyweightExample, criamos uma instância da fábrica (CharacterFlyweightFactory) e 
solicitamos alguns objetos Flyweight representando caracteres 'A' e 'B'. Como 'A' é solicitado duas vezes,
a segunda vez retorna o mesmo objeto Flyweight que foi criado anteriormente. Isso demonstra o 
compartilhamento de objetos e economia de memória alcançados pelo padrão Flyweight.