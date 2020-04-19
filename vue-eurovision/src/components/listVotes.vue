<template>
  <div>
    <div class="row">
      <CountryVote v-for="participant in participants" :participant="participant"/>
    </div>
  </div>
</template>

<script>
import CountryVote from "@/components/CountryVote.vue";

export default {
  name: "listParticipants",
  data() {
    return {
      participants: []
    };
  },
  mounted() {
    axios.get("http://localhost:8080/participant/").then(response => {
      let data = response.data;
      data.sort((a, b) => a.country.name.localeCompare(b.country.name));
      this.participants = data;
    });
  },
  components: {
    CountryVote
  }
};
</script>

<style scoped>
</style>