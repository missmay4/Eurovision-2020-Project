<template>
  <div class="home">
    <ListCountryVotes/>
  </div>
</template>

<script>
// @ is an alias to /src
import ListCountryVotes from "@/components/listCountryVotes.vue";

export default {
  name: "participants",
  components: {
    ListCountryVotes
  }
};
</script>