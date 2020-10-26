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

@Tag("49")
class Record_4316 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4316: FirstName is Basil")
	void FirstNameOfRecord4316() {
		assertEquals("Basil", customers.get(4315).getFirstName());
	}

	@Test
	@DisplayName("Record 4316: LastName is Grossman")
	void LastNameOfRecord4316() {
		assertEquals("Grossman", customers.get(4315).getLastName());
	}

	@Test
	@DisplayName("Record 4316: Company is Near East Foundation")
	void CompanyOfRecord4316() {
		assertEquals("Near East Foundation", customers.get(4315).getCompany());
	}

	@Test
	@DisplayName("Record 4316: Address is 39 Hudson St")
	void AddressOfRecord4316() {
		assertEquals("39 Hudson St", customers.get(4315).getAddress());
	}

	@Test
	@DisplayName("Record 4316: City is Hackensack")
	void CityOfRecord4316() {
		assertEquals("Hackensack", customers.get(4315).getCity());
	}

	@Test
	@DisplayName("Record 4316: County is Bergen")
	void CountyOfRecord4316() {
		assertEquals("Bergen", customers.get(4315).getCounty());
	}

	@Test
	@DisplayName("Record 4316: State is NJ")
	void StateOfRecord4316() {
		assertEquals("NJ", customers.get(4315).getState());
	}

	@Test
	@DisplayName("Record 4316: ZIP is 7601")
	void ZIPOfRecord4316() {
		assertEquals("7601", customers.get(4315).getZIP());
	}

	@Test
	@DisplayName("Record 4316: Phone is 201-489-7131")
	void PhoneOfRecord4316() {
		assertEquals("201-489-7131", customers.get(4315).getPhone());
	}

	@Test
	@DisplayName("Record 4316: Fax is 201-489-9698")
	void FaxOfRecord4316() {
		assertEquals("201-489-9698", customers.get(4315).getFax());
	}

	@Test
	@DisplayName("Record 4316: Email is basil@grossman.com")
	void EmailOfRecord4316() {
		assertEquals("basil@grossman.com", customers.get(4315).getEmail());
	}

	@Test
	@DisplayName("Record 4316: Web is http://www.basilgrossman.com")
	void WebOfRecord4316() {
		assertEquals("http://www.basilgrossman.com", customers.get(4315).getWeb());
	}
}
