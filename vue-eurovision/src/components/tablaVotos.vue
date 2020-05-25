<template>
  <div>
    <h1>Voting</h1>
    <table class="table">
      <thead>
        <tr>
          <th scope="col" class="nombre">Name</th>
          <th scope="col">Gala</th>
          <th scope="col">Option 1</th>
          <th scope="col">Option 2</th>
          <th scope="col">Option 3</th>
        </tr>
      </thead>
      <tbody>
        <FinalVotes
          v-for="usuario in usuarios"
          :usuario="usuario"
          v-bind:key="usuario.name"
        />
      </tbody>
    </table>
  </div>
</template>

<script>
import FinalVotes from "@/components/FinalVotes.vue";
import axios from "axios";

export default {
  name: "tablaVotos",
  data() {
    return {
      usuarios: [],
      participants: [],
    };
  },
  mounted() {
    axios.get("http://localhost:8080/user/").then((response) => {
      this.usuarios = response.data;
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
