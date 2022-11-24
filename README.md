<h1 align="center">Buffalos PetShop</h1>

  <h1 align="center">
  	<img alt="FEITO PELO GRUPO BUFFALO" src="https://img.shields.io/static/v1?label=FEITO&message=PELO GRUPO BUFFALO&color=brightgreen">
	<img alt="STATUS EM DESENVOLVIMENTO" src="https://img.shields.io/static/v1?label=STATUS&message=EM DESENVOLVIMENTO&color=brightgreen">
	<img alt="CONTRIBUTORS 5" src="https://img.shields.io/static/v1?label=CONTRIBUTORS&message=5&color=blue">
        <img alt="COVERAGE 89%" src="https://img.shields.io/static/v1?label=COVERAGE&message=89%&color=blueviolet">
 	</h1>

 <h4 align="center"> 🚧 Buffalo PetShop 🚀 Em finaização 🚧</h4>
 
 <header>   
 <h2>📋 Sobre o Projeto</h2>
 
 >Projeto desenvolvido como atividade avaliativa do Curso de Qualificação Socioprofissional em Programação de Software pelo Governo do Estado de Pernambuco.

O sistema **Buffalo-PetShop** é uma aplicação criada para gerenciar, organizar e controlar entrada e saídas de dados financeiros e também elevação clínica de pacientes (animal).

De forma pratica, simplificada e intuitiva, o sistema visa automatizar o gerenciamento de serviços e histórico clínico de clientes/pacientes, sendo possível a consulta de procedimentos realizados anteriormente, para que possa ser acompanhado de forma segura por um médico veterinário. Como também a possibilidade de cadastro e verificação do cliente-paciente.

O sistema **Buffalo-PetShop**, é possivel cadastrar novos clientes-pacientes, cadastrar serviços e Médico veterinário(a), atualizar cadastrados no banco, cadastrar um novo cliente, registrar histórico, evolução e procedimentos realizados no paciente (animal).

A aplicação foi desenvolvida pela equipe da **Buffalo** e utilizada para desenvolvimento dos conhecimento obtidos pelos mesmos no último módulo do Curso de Qualificação Socioprofissional em Programação de Software, do [Instituto de Administração e Tecnologia](https://admtec.org.br/).
</header>

<h2>🔄 Ambiente de desenvolvimento e ferramentas</h2>

As seguintes ferramentas foram usadas na construção do projeto:
- java JDK
- Java
- UML

<h2>📝 Sumário</h2>

<!--ts-->
   * [Documentação](#Documentação)
   * [UML](#UML)
   * [Funcionalidade](#Funcionalidade)
   * [Como executar o projeto](#Como-executar-o-projeto)
   * [Pré Requisitos](#Pré-Requisitos)
   * [Tecnologias](#Tecnologias)
   * [Autores](#Autores)
   
<h2>Interface</h2>

### Acesso de um usuário vendedor

IMAGEM

### Acesso de um usuário veterinário

[IMAGEM]

### Acesso de um usuário administrador

[IMAGEM]

<h2>Descrição da arquitetura</h2>
Cada perfil de usuário desempenha um certo conjunto de atividade, sendo o usuário **Atendente** um perfil de acesso integral. Na imagem abaixo, segue o diagramas indicando as tarefas para cada perfil:

[IMAGEM]

<h2>📊 Diagramas de Arquitetura (UML)</h2>

[DIAGRAMA DE FUNCIONADIDADES]

[DIAGRAMA DE CLASSES-OBJETO]

[DIAGRAMA DE CASO]

[DIAGRAMA DE COMPONENTES]



**Vendedor:** classe responsável pelo controle geral do estabelecimento, a qual possui acesso global e contém todas as informações para o devido funcionamento do sistema.

**Veterinário:** Herda somente de uma classe, interface para implementar o perfil de veterinário para acessar a ordem de serviço e registrar evolução do paciente (animal).

**Cliente-Pet** criada com o intuito de vincular os serviços, evolução e dados financeiros

**Serviço:** representa os serviços oferecidos, como por exemplo, banho, tosa e atendimento clínico veterinário. Irá receber o serviço vendido para um cliente, sendo nessa classe a especificação de quando ele será realizado, sendo possível explicitar também se foi para algum cliente cadastrado ou não. Aqui, será permitido para atendimentos veterinários o preenchimento pelo veterinário as informações relacionadas ao tratamento realizado.

**Financeiro:** classe direcionada para a ebcerramento do serviço pela a clínica.


<h2>📝 Pré-requisito</h2>

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas: 
<ul>
	<li><a href="https://www.oracle.com/java/technologies/downloads/">Java JDK</a></li>
	<li><a href="https://git-scm.com/">Git</li>
</ul>
<a>Além disto é bom ter um editor para trabalhar com o código como Eclipse IDE for Java Developers ou VSCode.</a>

<h2>⚙ Funcionalidades</h2>

- [ ] Cadastrar Cliente-Paciente;
- [ ] Atualizar as informações básicas de um usuário, visando manter todas as informações do mesmo atualizada;
- [ ] Cadastrar novos Clientes;
- [ ] Cadastrar Serviços;
- [ ] Cadastrar Veterinário;
- [ ] Víncular serviço ao cliente;
- [ ] Fechamento financeiro;

<h2>🛠 Tecnologias</h2>

As seguintes ferramentas foram usadas na construção do projeto:
<ul>
	<li><a href="https://www.oracle.com/java/technologies/downloads/">Java JDK</a></li>
	<li><a href="https://www.java.com/pt-BR/">Java</li>
	<li>UML</li>
</ul>

<h2>👥 Autores</h2>
	
<a href="https://www.linkedin.com/in/davi-lisias-aa72b4141/">Davi Lisias</a>	

<a href="https://www.linkedin.com/in/jonathan-duarte-62331582/">Jonathan Duarte</a>	

♥ <a href="https://www.linkedin.com/in/luanactpinto/">Luana Pinto</a>♥

Luiz Junior

<a href="https://www.linkedin.com/in/marcoslira91/">Marcos Lira</a>
