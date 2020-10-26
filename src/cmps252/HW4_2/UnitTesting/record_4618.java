package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("25")
class Record_4618 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4618: FirstName is Rosita")
	void FirstNameOfRecord4618() {
		assertEquals("Rosita", customers.get(4617).getFirstName());
	}

	@Test
	@DisplayName("Record 4618: LastName is Hinger")
	void LastNameOfRecord4618() {
		assertEquals("Hinger", customers.get(4617).getLastName());
	}

	@Test
	@DisplayName("Record 4618: Company is Costenbader, Francis J Esq")
	void CompanyOfRecord4618() {
		assertEquals("Costenbader, Francis J Esq", customers.get(4617).getCompany());
	}

	@Test
	@DisplayName("Record 4618: Address is 205 Broadway St")
	void AddressOfRecord4618() {
		assertEquals("205 Broadway St", customers.get(4617).getAddress());
	}

	@Test
	@DisplayName("Record 4618: City is Rock Springs")
	void CityOfRecord4618() {
		assertEquals("Rock Springs", customers.get(4617).getCity());
	}

	@Test
	@DisplayName("Record 4618: County is Sweetwater")
	void CountyOfRecord4618() {
		assertEquals("Sweetwater", customers.get(4617).getCounty());
	}

	@Test
	@DisplayName("Record 4618: State is WY")
	void StateOfRecord4618() {
		assertEquals("WY", customers.get(4617).getState());
	}

	@Test
	@DisplayName("Record 4618: ZIP is 82901")
	void ZIPOfRecord4618() {
		assertEquals("82901", customers.get(4617).getZIP());
	}

	@Test
	@DisplayName("Record 4618: Phone is 307-382-9429")
	void PhoneOfRecord4618() {
		assertEquals("307-382-9429", customers.get(4617).getPhone());
	}

	@Test
	@DisplayName("Record 4618: Fax is 307-382-9808")
	void FaxOfRecord4618() {
		assertEquals("307-382-9808", customers.get(4617).getFax());
	}

	@Test
	@DisplayName("Record 4618: Email is rosita@hinger.com")
	void EmailOfRecord4618() {
		assertEquals("rosita@hinger.com", customers.get(4617).getEmail());
	}

	@Test
	@DisplayName("Record 4618: Web is http://www.rositahinger.com")
	void WebOfRecord4618() {
		assertEquals("http://www.rositahinger.com", customers.get(4617).getWeb());
	}
}
