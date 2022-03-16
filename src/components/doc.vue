<template >
  <div>
    <p v-if="esta_trabalhando"> Estou trabalhando muito</p>
    <p v-else>Estou em busca de novas oportunidades</p>
    <p> Trabalhando com seguintes tecnologias</p>
    <ul>
        <li>Python</li>
        <li>Spring boot</li>
    </ul>
    <div>
      <button @click="showEmail"> Mostrar e-mail</button>
    </div>
    <p v-show="mostrar_email"> Mande um mensagem para {{ email}} </p>
    <p> para acessar meu portifolio <a v-bind:href="meu_link"> basta clicar aqui</a></p>
    <Picture/>
  </div>
</template>

<script>
import Picture from "./Picture.vue"
export default{
    name: "Doc",
    data() {
        return {
            esta_trabalhando: false,
            mostra_email: false,
            email: "thiago@teste.com",
            meu_link: "https://google.com"
        };
    },
    components: { Picture },
    methods:{
      showEmail(){
        this.mostra_email = !this.mostra_email
      }
    }
}

</script>