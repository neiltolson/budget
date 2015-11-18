var SCREEN_BUDGET = {
	data: {},
	
	init: function() {
		$.get("/rest/budget", function(result) {
			SCREEN_BUDGET.data = result;
			SCREEN_BUDGET.render();
		});
	},
	
	render: function() {
		var PageHeader = React.createClass({
			render : function() {
				return React.createElement("h1", null, this.props.title + ' ',
								React.createElement("small", null, this.props.timeDesc));
			}
		});
		
		var BudgetDataRow = React.createClass({
			displayName : "BudgetDataRow",
			render : function() {
				return React.createElement("div", {className:"row highlight-row"},
					React.createElement("div", {className:"col-sm-4"},
						React.createElement(this.props.labelElt, null, this.props.label)),
					React.createElement("div", {className:"col-sm-2 col-xs-6 text-right"},
						React.createElement("input", {type:"text", className:"form-control text-right", defaultValue:this.props.amounts.budget})),
					React.createElement("div", {className:"col-sm-2 col-xs-6 text-right"}, this.props.amounts.actual),
					React.createElement("div", {className:"col-sm-2 text-right hidden-xs"}, this.props.amounts.prevBudget),
					React.createElement("div", {className:"col-sm-2 text-right hidden-xs"}, this.props.amounts.prevActual)
				);
			}
		});
		
		var BudgetTotalRow = React.createClass({
			displayName : "BudgetTotalRow",
			render : function() {
				return React.createElement("div", {className:"row highlight-row"},
					React.createElement("div", {className:"col-sm-4"},
						React.createElement(this.props.labelElt, null, this.props.label)),
					React.createElement("div", {className:"col-sm-2 col-xs-6 text-right margin-top-20"}, this.props.amounts.budget),
					React.createElement("div", {className:"col-sm-2 col-xs-6 text-right margin-top-20"}, this.props.amounts.actual),
					React.createElement("div", {className:"col-sm-2 text-right hidden-xs margin-top-20"}, this.props.amounts.prevBudget),
					React.createElement("div", {className:"col-sm-2 text-right hidden-xs margin-top-20"}, this.props.amounts.prevActual)
				);
			}
		});
		var BudgetExpenses = React.createClass({
			displayName : "BudgetExpenses",
			render : function() {
				var cats = $.map(SCREEN_BUDGET.data.expenses, function(e) {
					var rows = $.map(e.categories, function(c) {
						return React.createElement(BudgetDataRow, {
							labelElt : "div",
							label : c.name,
							amounts : c,
						})
					});

					return React.createElement("div", null, 
							React.createElement("div", {className:"row"},
								React.createElement("h4", {className:"col-xs-12"}, 
									React.createElement("span", {className:"label label-default col-sm-3 col-xs-6"}, e.group))),
							rows);
				});

				return React.createElement("div", null, cats);
			}
		});

		var pageHeader = $('#screen-budget #page-header').get(0);
		ReactDOM.render(React.createElement(PageHeader, {
			title : "Budget",
			timeDesc : SCREEN_BUDGET.data.timeDesc
		}), pageHeader);
		
		ReactDOM.render(React.createElement(BudgetDataRow, {
			labelElt : "h4",
			label : "Carry Over / Prior Month",
			amounts : SCREEN_BUDGET.data.carryOver
		}), $('#budget-carry-over').get(0));
		
		ReactDOM.render(React.createElement(BudgetDataRow, {
			labelElt : "h4",
			label : "Income",
			amounts : SCREEN_BUDGET.data.income
		}), $('#budget-income').get(0));

		ReactDOM.render(React.createElement(BudgetExpenses),
				$('#budget-expenses').get(0));

		ReactDOM.render(React.createElement(BudgetTotalRow, {
			labelElt : "h3",
			label : "Total Expenses",
			amounts : SCREEN_BUDGET.data.totalExpenses
		}), $('#budget-total-expenses').get(0));
		
		ReactDOM.render(React.createElement(BudgetTotalRow, {
			labelElt : "h3",
			label : "Balance",
			amounts : SCREEN_BUDGET.data.balance
		}), $('#budget-total-balance').get(0));
	}
}