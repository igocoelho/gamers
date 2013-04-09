databaseChangeLog = {

	changeSet(author: "igocoelho (generated)", id: "1365087631550-1") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "avatar", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "email", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "facebook", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "login", type: "varchar(20)") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "password", type: "varchar(10)") {
				constraints(nullable: "false")
			}

			column(name: "twitter", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "igocoelho (generated)", id: "1365087631550-2") {
		createIndex(indexName: "login_uniq_1365087631526", tableName: "user", unique: "true") {
			column(name: "login")
		}
	}
}