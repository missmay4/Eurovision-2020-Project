<template>
  <div>
    <VotesHeader/>
    <div class="row">
      <CountryVote
        v-for="participant in galas[gala]"
        :participant="participant"
        v-model="checked"
        :disabled="checked.length > 2 && checked.indexOf(participant.id) === -1"
      />
    </div>
    <VotesButton
      :selectedParticipants="checked"
      :participants="galas[gala]"
      :disabled="checked.length < 3"
    />
  </div>
</template>

<script>
import VotesHeader from "@/components/VotesHeader.vue";
import CountryVote from "@/components/CountryVote.vue";
import VotesButton from "@/components/VotesButton.vue";

export default {
  name: "listParticipants",
  data() {
    return {
      gala: 2,
      galas: [[], [], [], []],
      checked: []
    };
  },
  mounted() {
    axios.get("http://localhost:8080/participant/").then(response => {
      let data = response.data;
      data.sort((a, b) => a.gala.performanceOrder - b.gala.performanceOrder);

      data.forEach(participant => {
        this.galas[participant.gala.gala_id].push(participant);
      });
    });

    this.gala = parseInt(this.$router.currentRoute.hash[1], 10);
  },
  components: {
    CountryVote,
    VotesHeader,
    VotesButton
  }
};
</script>

<style scoped>
</style>