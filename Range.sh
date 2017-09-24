#!/bin/bash

seed="$1"

if [ "$seed" = "" ]; then
	echo "USAGE: ./Range.sh <Numerical Seed>"
	echo -e "\e[31;1mPlease Specifiy a Seed!\e[0m"
	exit 1
fi

PosX="-31"

until [ "$PosX" = "32" ]; do
	PosZ="-31"

	until [ "$PosZ" = "32" ]; do
		echo "$((PosX * 16)) $((PosZ * 16)): $(java SlimeFind "$seed" "$PosX" "$PosZ")" | grep -v "false" | cut -d':' -f 1
		PosZ="$((PosZ + 1))"
	done
	
	PosX="$((PosX + 1))"
done
