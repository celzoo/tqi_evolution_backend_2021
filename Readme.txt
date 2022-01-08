      
Justificativas:

	Nesse programa foi tentado resolver todos os 4 problemas propostos no processo seletivo evolution, para o mesmo foi utilizado a linguagem java, devido a familiarização com ela e pelo fato do Bootcamp ter ensinado essa linguagem, para a interface do programa foi utilizado HTML e CSS com Bootstrap ja que eles facilitam a visualização, tanbém foi utilizado o SpringBoot ja que o mesmo foi ensinado durante o Bootcamp pareceu certo utiliza-lo nesse processo seletivo. 

Exercicio:


1)
	Para realizar o cadastro do cliente foi pensado em utilizar um banco de dados, para simular uma aplicação de cadastro real, dessa forma a aplicação se conecta num banco MySQL local, ao inserir as informações necessarias em application properties, para facilitar isso foi utilizada a conexão MySQL com o Spring Boot, alem disso foi criado uma classe que contem as variáveis pertencentes ao usuário, alem de outras classes necessárias para o funcionamento do programa, assim como uma interface do usuário.  


2)
	Para o login do usuário foi utilizado o Spring Security e configurado o mesmo, para após a autenticação ele levar a pagina certa, a configuração dele esta na classe SecurityConfig.

3)
	O usuario pode ir a pagina para pedir um empréstimo novo ao fazer isso o sistema pede a informação dele, ao preencher a informação é colocada no banco de dados, foi possivel estabelecer um numero maximo de 60 para as parcelas, porém devido a falta de conhecimento e tempo atual não consegui colocar um limite a data de pagamento.

4) 
	A visualização do empréstimo aparece na tela do programa, o mesmo tem em mente que uma pessoa se cadastrata e utilizara o programa imediatamente, caso duas pessoas realizaem o cadastro e peçam impréstimos serão mostrados os dois, ja que não foi feita uma separação dos pedidos por usuário, devido a falta de conhecimento e tempo para realizar o mesmo.
	Na listagem é mostrado o empréstimo as parcelas e o codigo do empréstimo, assim como um valor zerado com codigo um, isso se trata do cadastro do usuario que cria valores nulos para o empréstimo, parcelas e data juntamente com os dados do usuario, isso ocorre pois eles são criadas na mesma table, novamente devido a falta de conhecimento e tempo atual, peço desculpas, nos detalhes do emprestimo enfrentamos o mesmo problema acima, porem temos o e-mail e a renda do usuario para vizualizar.
