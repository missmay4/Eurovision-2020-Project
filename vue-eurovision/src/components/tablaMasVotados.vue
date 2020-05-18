<template>
  <div>
    <h1 class="display-4">Total votes of our APP</h1>
    <div class="row">
      <table class="table col-md-6">
        <thead>
          <tr>
            <th scope="col" class="nombre">Country</th>
            <!-- <th scope="col">Total votes</th> -->
          </tr>
        </thead>
        <tbody>
          <winnersTable v-for=" name in names" :name="name" />
          <!--<winnersTable v-for=" vote in totalVotes" :vote="vote" /> -->
        </tbody>
      </table>
      <table class="table col-md-6">
        <thead>
          <tr>
            <!-- <th scope="col" class="nombre">Country</th> -->
            <th scope="col">Total votes</th>
          </tr>
        </thead>
        <tbody>
          <!-- <winnersTable v-for=" code in codes" :code="code" /> -->
          <winnersTable2 v-for=" vote in totalVotes" :vote="vote" />
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import winnersTable from "@/components/winnersTable.vue";
import winnersTable2 from "@/components/winnersTable2.vue";

export default {
  name: "tablaMasVotados",
  data() {
    return {
      usuarios: [],
      participants: [],
      names: [],
      totalVotes: []
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
          let participant = el.participant.country.name;
          //console.log(participant);
          totalVotos.push(participant);
        });
      });

      //console.log(totalVotos);

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

      function asc(arr) {
        arr.sort(function(a, b) {
          return b - a;
        });
        return arr;
      }

      var result = repeated(totalVotos);
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
    winnersTable2
  }
};
</script>

<style lang="css" scoped>
.nombre {
  color: #273b75;
}
</style>