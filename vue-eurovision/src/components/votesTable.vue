<template>
  <div>
    <h1 class="title display-4">Votos</h1>
    <div class="table-responsive">
      <table class="table">
        <thead>
          <tr>
            <th scope="col" class="nombre">Nombre</th>
            <th scope="col">Gala</th>
            <th scope="col">Opción 1</th>
            <th scope="col">Opción 2</th>
            <th scope="col">Opción 3</th>
          </tr>
        </thead>
        <tbody>
          <FinalVotes
            v-for="usuario in usuarios"
            :usuario="usuario"
            v-bind:key="usuario.id"
          />
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import FinalVotes from "@/components/FinalVotes.vue";
import axios from "axios";

export default {
  name: "votesTable",
  data() {
    return {
      usuarios: [],
      participants: [],
    };
  },
  mounted() {
    axios.get("http://localhost:8080/user/").then((response) => {
      this.usuarios = response.data;
      //console.log(response.data);
    });
  },
  components: {
    FinalVotes,
  },
};
</script>

<style lang="css" scoped>
.nombre {
  color: #273b75;
}
</style>
