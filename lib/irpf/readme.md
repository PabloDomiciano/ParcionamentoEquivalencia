Derive um conjunto de teste que satisfaça o critério **Particionamento de Equivalência** para o cálculo do Imposto de Renda de Pessoa Física (IRPF) brasileiro de 2022.

Em 2022, o cálculo do Imposto de Renda de Pessoa Física (IRPF) brasileiro é feito considerando a renda mensal da pessoa multiplicado pela alíquota e na sequência subtrai a parcela a deduzir. A seguinte tabela é utilizada para o cálculo de incidência mensal sobre o salário recebido:

|                    Base de Cálculo (R$)                    |                    Alíquota (R$)                |                    Parcela a deduzir do IRPF (R$)                |
|----------------------------------------------------------------------|-----------------------------------------------------------|----------------------------------------------------------------------------|
|                    Até 1.903,98                            |                    -                            |                    -                                             |
|                    De 1.903,99 até 2.826,65                |                    7,5                          |                    142,80                                        |
|                    De 2.826,66 até 3.751,05                |                    15                           |                    354,80                                        |
|                    De 3.751,06 até 4.664,68                |                    22,5                         |                    636,13                                        |
|                    Acima de 4.664,68                       |                    27,5                         |                    869,36                                        |


**Exemplo 1:** Considerando que uma determinada pessoa recebeu R$ 3.000,00 em um determinado mês o cálculo será: ((R$ 3.000,00 \* 15%) - R$ 354,80), com isso o resultado será R$ 95,20.

**Exemplo 2:** Considerando que uma determinada pessoa recebeu R$ 7.000,00 em um determinado mês o cálculo será: ((R$ 7.000,00 \* 27,5%) - R$ 869,36), com isso o resultado será R$ 1.055,64.

  

**Sugestão**: Use a seguinte estrutura para a definição do conjunto de teste (não necessariamente precisa ser uma tabela).



| Descrição da Classe de Equivalência | Variável de Entrada | Saída Esperada |
|-|-|-|
||
||
||

[Mais informações em Simulador de IRPF 2022](https://www27.receita.fazenda.gov.br/simulador-irpf/)
