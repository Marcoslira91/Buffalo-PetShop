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

O **Buffalo-PetShop** é um sistema para Pet-Shop com a finalidade de gerenciar, organizar e controlar entrada e saídas de dados financeiros, de serviços e também elevação clínica de pacientes (animal).

De forma prática, simplificada e intuitiva, o sistema visa automatizar o gerenciamento de serviços e histórico clínico de clientes/pacientes, sendo possível a consulta de procedimentos realizados anteriormente, para que possa ser acompanhado de forma segura e rápida por um médico veterinário. Como também a possibilita o cadastro e o acompanhamento do cliente-paciente.

Com o sistema **Buffalo-PetShop**, é possivel cadastrar o cliente-paciente, os serviços a serem realizados, como também, cadastrar o Médico veterinário(a), atualizar cadastrados no banco, registrar prontuário e procedimentos realizados no paciente (animal).

A aplicação foi desenvolvida pela equipe da **Búffalo** e utilizada para desenvolvimento dos conhecimento obtidos utilizando os paradigmas de Programação Orientada a Objetos - POO, no último módulo do Curso de Qualificação Socioprofissional em Programação de Software, do [Instituto de Administração e Tecnologia](https://admtec.org.br/). Além disso, buscamos seguir os princípios [**SOLID**](https://blog.betrybe.com/linguagem-de-programacao/solid-cinco-principios-poo/) com objetivo de facilitar a manutençãoe extensão do projeto.
</header>

<h2>🔄 Ambiente de Desenvolvimento e Ferramentas</h2>

As seguintes ferramentas foram usadas na construção do projeto:
- Java JDK-19 (sha256)
- JavaSE-17
- Eclipse IDE 2022-06
- MySQL Workbench 8.0 CE
- [Draw.io (UML)](https://www.diagrams.net/blog/move-diagrams-net)

<h2>📝 Sumário</h2>


   * [Sobre o Projeto](#Sobre-o-Projeto)
   * [Ambiente de Desenvolvimentoe Ferramentas](#Ambiente-de-Desenvolvimentoe-Ferramentas)
   * [Interface](#Interface)
   * [Descrição da Arquitetura](#Descrição-da-Arquitetura)
   * [Diagrama de Arquitetura (UML)](#Diagrama-de-Arquitetura-(UML))
   * [Pré-Requisito](#Pré-Requisito)
   * [Funcionalidades](#Funcionalidades)
   * [Tecnologias](#Tecnologias)
   * [Autores](#Autores)
	
   
<h2>📝Interface</h2>

### Acesso de um usuário vendedor

IMAGEM

### Acesso de um usuário veterinário

[IMAGEM]

### Acesso de um usuário administrador

[IMAGEM]

<h2>🏛 Descrição da arquitetura</h2>
<p>Cada perfil de usuário desempenha um certo conjunto de atividade, sendo o <strong>Usuário Atendente</strong> um perfil de acesso integral. Na imagem abaixo, segue o diagramas indicando as tarefas para cada perfil:</p>
<p>

**DIAGRAMA DE FUNCIONADIDADES**

![DIAGRAMA DE FUNCIONADIDADES](https://user-images.githubusercontent.com/53446701/204062464-97775b85-7215-449c-bed0-10001d34521e.png)
</p>
<h2>📊 Unified Modeling Language (UML)</h2>

**DIAGRAMA CLASSES**

![Diagrama Classes](https://user-images.githubusercontent.com/53446701/204061918-abe839ed-e3d5-44a0-9bc9-1618ca1364df.png)

**DIAGRAMA DE CASO**

![DIAGRAMA DE CASO](https://user-images.githubusercontent.com/53446701/204062003-ad62ea00-46d8-4308-a0ee-fb1fe9c6cf13.png)

**DIAGRAMA DE COMPONENTES**

![image](https://user-images.githubusercontent.com/53446701/204062422-7b4ea14f-c9d5-4b33-beec-ead94df0e6ea.png)

**Vendedor:** classe responsável pelo controle geral do estabelecimento, a qual possui acesso global e contém todas as informações para o devido funcionamento do sistema.

**Veterinário:** Herda somente de uma classe, interface para implementar o perfil de veterinário para acessar a ordem de serviço e registrar evolução do paciente (animal).

**Cliente-Pet** criada com o intuito de vincular os serviços, evolução e dados financeiros

**Serviço:** representa os serviços oferecidos, como por exemplo, banho, tosa e atendimento clínico veterinário. Irá receber o serviço vendido para um cliente, sendo nessa classe a especificação de quando ele será realizado, sendo possível explicitar também se foi para algum cliente cadastrado ou não. Aqui, será permitido para atendimentos veterinários o preenchimento pelo veterinário as informações relacionadas ao tratamento realizado.

**Financeiro:** classe direcionada para a ebcerramento do serviço pela a clínica.


<h2>📝 Pré-requisito</h2>

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas: 
<ul>
	<li><a href="https://www.oracle.com/java/technologies/downloads/">Java JDK-19 (sha256)</a></li>
	<li><a href="https://www.eclipse.org/downloads/">Eclipse IDE 2022-06</a></li>
	<li><a href="https://www.mysql.com/">MySQL Workbench 8.0 CE</a></li>
	<li><a href="https://git-scm.com/">Git</li>
</ul>

<a>Além disto é bom ter um editor para trabalhar com o código como Eclipse IDE for Java Developers ou VSCode.</a>

<h2>⚙ Funcionalidades</h2>

- [x] Cadastrar Cliente/Paciente;
- [x] Atualizar as informações básicas de um cliente/paciente, serviços e médico-veterinário;
- [x] Excluir Cliente/Paciente;
- [x] Cadastrar Serviços;
- [x] Cadastrar Veterinário;
- [x] Víncular serviço ao cliente;
- [x] Fechamento financeiro;

<h2>🛠 Tecnologias</h2>

As seguintes ferramentas foram usadas na construção do projeto:
<ul>
	<li><a href="https://www.oracle.com/java/technologies/downloads/">Java JDK-19 (sha256)</a></li>
	<li><a href="https://www.eclipse.org/downloads/">Eclipse IDE 2022-06</a></li>
	<li><a href="https://www.mysql.com/">MySQL Workbench 8.0 CE</a></li>
	<li><a href="https://git-scm.com/">Git</li>
	<li><a href="https://trello.com/b/RMZFIjxL/buffalo-petshop">Trello</a></li>
	<li><a href="https://www.diagrams.net/blog/move-diagrams-net">Draw.io (UML)</a></li>
</ul>

<h2>👥 Autores</h2>
	
<a href="https://www.linkedin.com/in/davi-lisias-aa72b4141/">Davi Lisias</a>	

<a href="https://www.linkedin.com/in/jonathan-duarte-62331582/">Jonathan Duarte</a>	

<a href="https://www.linkedin.com/in/luanactpinto/">Luana Pinto</a>

Luiz Junior

<a href="https://www.linkedin.com/in/marcoslira91/">Marcos Lira</a>
