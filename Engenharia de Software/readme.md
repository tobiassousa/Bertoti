# Gerenciamento de ônibus na garagem:
 ## Requisitos funcionais (story cards):
 -	O funcionário da garagem precisa cadastrar e fazer um relatório da entrada e condição de cada placa, inserindo o número do ônibus, quantos Km rodado, e quantos litros de combustível perdido; 
 -	O funcionário pode Buscar o veículo e suas informações por meio da placa;
 -	O funionário pode buscar no sistema os veículos que fazem uma linha de ônibus, apenas pesquisando a linha que deseja. 

## Casos de Uso
<div align="center">
<img src="https://user-images.githubusercontent.com/100934496/186032837-ce2ff0e8-fd29-4fb9-8a54-0b1037146714.png" width='650px'/>
</div>



## Requisitos não funcionais:
- Separação de Interesses: definir uma arquitetura de aplicação com modelo MVC (separando assim lógica de negócios, comportamentos e interação com usuário);
- Portabilidade: executar o sistema em diferentes plataformas (ex. web, nativa iOS, nativa Android e etc). Importante: a Separação de Interesses do item anterior me ajuda nisso, porque como minha lógica de negócios está encapsulada em um módulo do sistema, se torna possível reutilizá-las em diferentes plataformas;
- Usabilidade: criar uma interface de simples acesso e uso às funções do sistema.

## Diagrama de Classes UML
![uiuo](https://user-images.githubusercontent.com/100934496/187312788-3412822e-acfe-42e7-8ae2-6f4be530112b.jpg)
