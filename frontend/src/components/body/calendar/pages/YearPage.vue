<template>
	<div>
		<h2>{{year}}</h2>
		<Year v-bind:year="year"/>
	</div>
</template>

<script>
import Year from "../objects/Year";

export default {
	props: {
		year: {
			type:Number,
			required: true
		}
	},
	name: "YearPage",
	components: {
		Year
	}
}
</script>

<style scoped>

</style>