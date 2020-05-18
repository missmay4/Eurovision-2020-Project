<template>
  <tr>
    <th scope="row celda-derecha">
      <p class="voto">{{vote}}</p>
    </th>
    <!-- Numero de veces que se repite el voto -->
  </tr>
</template>

<script>
export default {
  name: "VotosFinales2",
  props: {
    vote: Number
  }
};
</script>

<style>
th {
  background-color: #ffffff;
}
/* .voto {
  margin-bottom: 1.6rem !important;
} */
</style>