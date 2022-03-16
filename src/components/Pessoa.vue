<template>
<div>
  <h2>Esta é descriçao da pessoa : {{ nome }}</h2>
  <Doc/>
  <Form/>
  </div>
</template>

<script>
import Doc from "./doc.vue"
import Form from "./Form.vue"

export default {
    name: "Pessoa",
    components: { 
        Doc ,
        Form
    },
    data() {
        return {
            nome: "Matheus"
        };
    }
    
}
</script>

<style>

</style>