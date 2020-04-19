<template>
  <div>
    <h1 class="display-4">Votaciones</h1>
    <table class="table">
      <thead>
        <tr>
          <th scope="col" class="nombre">Nombre</th>
          <th scope="col">Opcion 1</th>
          <th scope="col">Opcion 2</th>
          <th scope="col">Opcion 3</th>
        </tr>
      </thead>
      <tbody>
        <FinalVotes v-for=" usuario in usuarios" :usuario="usuario"/>
      </tbody>
    </table>
  </div>
</template>

<script>
import FinalVotes from "@/components/FinalVotes.vue";

export default {
  name: "tablaVotos",
  data() {
    return {
      usuarios: [],
      participants: []
    };
  },
  mounted() {
    axios.get("http://localhost:8080/user/").then(response => {
      this.usuarios = response.data;
    });
  },
  components: {
    FinalVotes
  }
};
</script>

<style lang="css" scoped>
.nombre {
  color: #273b75;
}
</style>