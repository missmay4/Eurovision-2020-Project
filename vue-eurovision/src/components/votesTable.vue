<template>
  <div>
    <h1 class="title display-4">Votos</h1>
    <div class="row no-gutters">
      <FinalVotes
        v-for="usuario in usuarios"
        :usuario="usuario"
        v-bind:key="usuario.id"
      />
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
