




int sum = txns.stream()
	.filter(t -> t.getBuyer().getStae().equals("NY"))
	.reduce(0,(i,t)->i+t.getPrice());

-- FAUX : mapToInt
