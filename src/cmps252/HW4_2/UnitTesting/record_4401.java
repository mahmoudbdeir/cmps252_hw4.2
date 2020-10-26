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

@Tag("9")
class Record_4401 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4401: FirstName is Josefina")
	void FirstNameOfRecord4401() {
		assertEquals("Josefina", customers.get(4400).getFirstName());
	}

	@Test
	@DisplayName("Record 4401: LastName is Woolverton")
	void LastNameOfRecord4401() {
		assertEquals("Woolverton", customers.get(4400).getLastName());
	}

	@Test
	@DisplayName("Record 4401: Company is Rps Mouldings")
	void CompanyOfRecord4401() {
		assertEquals("Rps Mouldings", customers.get(4400).getCompany());
	}

	@Test
	@DisplayName("Record 4401: Address is 1114 Andover Park W")
	void AddressOfRecord4401() {
		assertEquals("1114 Andover Park W", customers.get(4400).getAddress());
	}

	@Test
	@DisplayName("Record 4401: City is Seattle")
	void CityOfRecord4401() {
		assertEquals("Seattle", customers.get(4400).getCity());
	}

	@Test
	@DisplayName("Record 4401: County is King")
	void CountyOfRecord4401() {
		assertEquals("King", customers.get(4400).getCounty());
	}

	@Test
	@DisplayName("Record 4401: State is WA")
	void StateOfRecord4401() {
		assertEquals("WA", customers.get(4400).getState());
	}

	@Test
	@DisplayName("Record 4401: ZIP is 98188")
	void ZIPOfRecord4401() {
		assertEquals("98188", customers.get(4400).getZIP());
	}

	@Test
	@DisplayName("Record 4401: Phone is 206-575-5803")
	void PhoneOfRecord4401() {
		assertEquals("206-575-5803", customers.get(4400).getPhone());
	}

	@Test
	@DisplayName("Record 4401: Fax is 206-575-5758")
	void FaxOfRecord4401() {
		assertEquals("206-575-5758", customers.get(4400).getFax());
	}

	@Test
	@DisplayName("Record 4401: Email is josefina@woolverton.com")
	void EmailOfRecord4401() {
		assertEquals("josefina@woolverton.com", customers.get(4400).getEmail());
	}

	@Test
	@DisplayName("Record 4401: Web is http://www.josefinawoolverton.com")
	void WebOfRecord4401() {
		assertEquals("http://www.josefinawoolverton.com", customers.get(4400).getWeb());
	}
}
