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

@Tag("12")
class Record_1358 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1358: FirstName is Colleen")
	void FirstNameOfRecord1358() {
		assertEquals("Colleen", customers.get(1357).getFirstName());
	}

	@Test
	@DisplayName("Record 1358: LastName is Smolnicky")
	void LastNameOfRecord1358() {
		assertEquals("Smolnicky", customers.get(1357).getLastName());
	}

	@Test
	@DisplayName("Record 1358: Company is Gyger Technic Inc")
	void CompanyOfRecord1358() {
		assertEquals("Gyger Technic Inc", customers.get(1357).getCompany());
	}

	@Test
	@DisplayName("Record 1358: Address is 433 Hackensack Ave")
	void AddressOfRecord1358() {
		assertEquals("433 Hackensack Ave", customers.get(1357).getAddress());
	}

	@Test
	@DisplayName("Record 1358: City is Hackensack")
	void CityOfRecord1358() {
		assertEquals("Hackensack", customers.get(1357).getCity());
	}

	@Test
	@DisplayName("Record 1358: County is Bergen")
	void CountyOfRecord1358() {
		assertEquals("Bergen", customers.get(1357).getCounty());
	}

	@Test
	@DisplayName("Record 1358: State is NJ")
	void StateOfRecord1358() {
		assertEquals("NJ", customers.get(1357).getState());
	}

	@Test
	@DisplayName("Record 1358: ZIP is 7601")
	void ZIPOfRecord1358() {
		assertEquals("7601", customers.get(1357).getZIP());
	}

	@Test
	@DisplayName("Record 1358: Phone is 201-996-0244")
	void PhoneOfRecord1358() {
		assertEquals("201-996-0244", customers.get(1357).getPhone());
	}

	@Test
	@DisplayName("Record 1358: Fax is 201-996-2065")
	void FaxOfRecord1358() {
		assertEquals("201-996-2065", customers.get(1357).getFax());
	}

	@Test
	@DisplayName("Record 1358: Email is colleen@smolnicky.com")
	void EmailOfRecord1358() {
		assertEquals("colleen@smolnicky.com", customers.get(1357).getEmail());
	}

	@Test
	@DisplayName("Record 1358: Web is http://www.colleensmolnicky.com")
	void WebOfRecord1358() {
		assertEquals("http://www.colleensmolnicky.com", customers.get(1357).getWeb());
	}
}
