<template>
  <div class="home">
    <CountryVote/>
  </div>
</template>

<script>
// @ is an alias to /src
import CountryVote from "@/components/CountryVote.vue";

export default {
  name: "participants",
  components: {
    CountryVote
  }
};
</script>
