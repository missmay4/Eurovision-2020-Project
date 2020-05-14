<template>
  <div>
    <h1 class="display-4">More Voted of our APP</h1>
    <table class="table">
      <thead>
        <tr>
          <th scope="col" class="nombre">Country</th>
          <th scope="col">Total votes</th>
        </tr>
      </thead>
      <tbody>
        <winnersTable v-for=" usuario in usuarios" :usuario="usuario" />
      </tbody>
    </table>
  </div>
</template>

<script>
import winnersTable from "@/components/winnersTable.vue";

export default {
  name: "tablaMasVotados",
  data() {
    return {
      usuarios: [],
      participants: []
    };
  },
  mounted() {
    axios.get("http://localhost:8080/user/").then(response => {
      this.usuarios = response.data;
      let json = response.data;
      //console.log(json);
      let totalVotos = [];
      json.forEach(element => {
        let votos = element.votos;
        //console.log(votos);
        votos.forEach(el => {
          let participant = el.participant_id;
          //console.log(participant);
          totalVotos.push(participant);
        });
      });

      console.log(totalVotos);
    });
  },
  components: {
    winnersTable
  }
};
</script>

<style lang="css" scoped>
.nombre {
  color: #273b75;
}
</style>