package main

import (
	"net"
	"fmt"
	"os"
)

const (
	CONN_HOST = "localhost"
	CONN_PORT = "8080"
	CONN_TYPE = "tcp"
)


func main() {
	ln, err := net.Listen(CONN_TYPE, CONN_HOST+":"+CONN_PORT)
	if err != nil {
		fmt.Println("Error trying to listen : ", err.Error())
		os.Exit(1)
	}
	defer ln.Close()
	fmt.Println("Listening on port "+CONN_PORT)
	for {
		conn, err := ln.Accept()
		if err != nil {
			fmt.Println("Error trying to accept : ", err.Error())
			os.Exit(1)
		}
		go handleConnection(conn)
	}
}

func handleConnection(conn net.Conn) {
	buf := make([]byte, 1024)
	n, err := conn.Read(buf)
	if err != nil {
		fmt.Println("Error reading:", err.Error())
	}
	fmt.Println(n)
	conn.Write([]byte("Message received."))
	conn.Close()
}
