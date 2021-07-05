<template>
	<div>
		<Month v-for="(days, index) in monthsDaysCount" :key="days" v-bind:days-count="days" v-bind:month-label="monthsLabels[index]"/>
	</div>
</template>

<script>
import Month from "./Month";

export default {
	props: {
		year: {
			type: Number,
			required: true
		}
	},
	name: "Year",
	components: {
		Month
	},
	data() {
		return {
			monthsDaysCount: [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31],
			monthsLabels: ["Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь",
				"Ноябрь", "Декабрь"]
		}
	},
	methods: {
		isLeap: function (year) {
			return (year && ((year % 4 === 0) && (year % 100 !== 0) || (year % 400 === 0)));
		}
	},
	beforeMount() {
		if (this.isLeap(this.year)) {
			this.monthsDaysCount[1] = 29;
		}
	}
}
</script>

<style scoped>
	div {
		margin: 10px;
	}

	.year {
		margin-top: 30px;
		width: 100%;
	}
</style>