<template>
	<div>
		<Month v-bind:days-count="monthDaysCount" v-bind:month-label="monthLabel"/>
	</div>
</template>

<script>
import Month from "../objects/Month";

export default {
	props: {
		monthDaysCount: {
			type: Number,
			required: true
		},
		monthLabel: {
			type: String,
			required: true
		}
	},
	name: "MonthPage",
	components: {
		Month
	}
}
</script>

<style scoped>

</style>