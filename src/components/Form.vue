<template>
<div>
  <h2>Meu formulario !</h2>
</div>
<div>
  <form action="">
    <div><InputText2/></div>
    <div><InputText2/></div>
    <div><Submit2/></div>
  </form>
</div>
</template>

<script>


import InputText2 from "./form/InputText2.vue"
import Submit2 from "./form/Submit2.vue" 

export default {
    name: "Form",
    components: {
   
    InputText2,
    Submit2
}
}
</script>

<style>

</style>