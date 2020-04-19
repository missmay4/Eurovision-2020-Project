<template>
  <div class="home">
    <listParticipants/>
  </div>
</template>

<script>
// @ is an alias to /src
import listParticipants from "@/components/listParticipants.vue";

export default {
  name: "participants",
  components: {
    listParticipants
  }
};
</script>
