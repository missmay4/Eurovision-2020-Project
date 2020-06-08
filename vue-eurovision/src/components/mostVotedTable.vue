<template>
  <div>
    <h1 class="title display-4">Votos totales</h1>
    <p>
      Aqui, puedes ver los votos totales obtenidos por cada país dentro de
      nuestra aplicación. El numero significa las veces que un país ha sido
      votado, tanto en Semifinales como en la Final.
    </p>
    <div class="row">
      <div class="col-6">
        <ul class="list-group">
          <winnersTable v-for="name in names" :name="name" v-bind:key="name" />
        </ul>
      </div>
      <div class="col-6">
        <ul class="list-group">
          <winnersTable2
            v-for="vote in totalVotes"
            :vote="vote"
            v-bind:key="vote"
          />
        </ul>
      </div>

      <!-- <table class="table col-sm-2 col-md-6 col-lg-6">
        <thead>
          <tr>
            <th scope="col" class="nombre">País</th>
          </tr>
        </thead>
        <tbody>
          <winnersTable v-for="name in names" :name="name" v-bind:key="name" />
        </tbody>
      </table>
      <table class="table col-sm-6 col-md-6 col-lg-6">
        <thead>
          <tr>
            <th scope="col">Nº de votos</th>
          </tr>
        </thead>
        <tbody>
          <winnersTable2
            v-for="vote in totalVotes"
            :vote="vote"
            v-bind:key="vote"
          />
        </tbody>
      </table>
    </div> -->
    </div>
  </div>
</template>

<script>
import winnersTable from "@/components/winnersTable.vue";
import winnersTable2 from "@/components/winnersTable2.vue";
import axios from "axios";

export default {
  name: "mostVotedTable",
  data() {
    return {
      usuarios: [],
      participants: [],
      names: [],
      totalVotes: [],
    };
  },
  mounted() {
    axios.get("http://localhost:8080/votes/").then((response) => {
      this.usuarios = response.data;
      let json = response.data;
      console.log(json);
      let totalPaises = [];
      json.forEach((element) => {
        let participant = element.participant.country.name;
        totalPaises.push(participant);
      });

      console.log(totalPaises);

      function repeated(arr) {
        var a = [],
          b = [],
          prev;

        arr.sort();
        for (var i = 0; i < arr.length; i++) {
          if (arr[i] !== prev) {
            a.push(arr[i]);
            b.push(1);
          } else {
            b[b.length - 1]++;
          }
          prev = arr[i];
        }

        return [a, b];
      }

      var result = repeated(totalPaises);
      var names = result[0];
      var votes = result[1];
      console.log(result);
      console.log(names);
      console.log(votes);
      this.names = names;
      this.totalVotes = votes;
      //this.totalVotes = result;
    });
  },
  components: {
    winnersTable,
    winnersTable2,
  },
};
</script>

<style lang="css" scoped>
.nombre {
  color: #273b75;
}
.title {
  color: #224488;
}
</style>
