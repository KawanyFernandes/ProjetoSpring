# projeto2 - Projeto Spring

Informações importantes:

Objetivo do projeto é deixar uma base para a criação da rede social. 
Foi desenvolvido todo o CRUD possibilitando assim a criação de usuarios, criação de postagens entre outras funções.
No momento, por se tratar de uma base, não foi criado o relacionamento das basses (postagens/users);
Existem mudanças a serem feitas como por exemplo, criptografar senha usando um base64.
Outro ponto muito importante seria a aplicação de uma autenticação utilizando um Access Token, onde poderiamos armazenar os dados do usuario logado além de
garantir uma maior confiabilidade no acesso a aplicação.
Todas essas mudanças seriam aplicadas para garantir assim um maior segurança.
O Projeto esta utilizando o banco em memoria H2, com isso os dados não são salvos efetivamente, ou seja, quando a aplicação é executada os dados salvos anteriormente são apagados. A escolha desse banco se deu pelo fato de tornar os testes mais faceis, sem precisar instalar um SGBD em sua maquina local.
Para visualizar os dados que serão armazenados no banco é possivel digitar na urs:"localhost:8080/h2-console", no qual redireciona-rá ao console do banco e ao carregar a tela, no campo "JDBC URL:" é necessário preencher como dado: jdbc:h2:mem:testdb. Com isso é possivel vizualizar os dados q estão sendo carregados via requisições.
Para realizar as requisições foi utilizada a ferramente Postman, para auxiliar os teste dos métodos implementados foi adicionada uma pasta ao projeto chamada PostmanRequests-Spring, na qual contém os scripts para rodar na ferramenta.
