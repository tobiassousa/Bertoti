# Gerenciamento de ônibus na garagem:
 ## Requisitos funcionais (story cards):
 -	O funcionário da garagem precisa cadastrar e fazer um relatório da entrada e condição de cada placa, inserindo o número do ônibus, quantos Km rodado, e quantos litros de combustível perdido; 
 -	O funcionário pode Buscar o veículo e suas informações por meio da placa;
 -	O funionário pode buscar no sistema os veículos que fazem uma linha de ônibus, apenas pesquisando a linha que deseja. 

## Casos de Uso
<div align="center">
<img src="https://user-images.githubusercontent.com/100934496/204062100-cf40cee5-78d8-4dd7-b5fc-a6baa5b2b680.jpeg" width='650px'/>
</div>



## Requisitos não funcionais:
- Separação de Interesses: definir uma arquitetura de aplicação com modelo MVC (separando assim lógica de negócios, comportamentos e interação com usuário);
- Portabilidade: executar o sistema em diferentes plataformas (ex. web, nativa iOS, nativa Android e etc). Importante: a Separação de Interesses do item anterior me ajuda nisso, porque como minha lógica de negócios está encapsulada em um módulo do sistema, se torna possível reutilizá-las em diferentes plataformas;
- Usabilidade: criar uma interface de simples acesso e uso às funções do sistema.

## Diagrama de Classes UML
<div align="center">
<img src="https://user-images.githubusercontent.com/100934496/204060887-000aeb85-259a-496f-8699-80b06a6d94c2.jpeg" width='650px'/>
</div>


## Códigos 
### Garagem
<div align="center">
<img src="https://user-images.githubusercontent.com/100934496/204062370-6679951f-a87b-4689-8cbc-f1a543d7e511.jpeg" width='650px'/>
</div>

### Especificação
<div align="center">
<img src="https://user-images.githubusercontent.com/100934496/204062524-13e82829-231f-4377-8533-87b05abb25ae.jpeg" width='650px'/>
</div>

### Onibus
<div align="center">
<img src="https://user-images.githubusercontent.com/100934496/204062623-0a941ad8-beed-4844-9661-00dc12a219f9.jpeg" width='650px'/>
</div>



