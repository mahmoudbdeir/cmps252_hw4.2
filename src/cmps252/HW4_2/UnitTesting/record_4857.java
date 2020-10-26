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

@Tag("46")
class Record_4857 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4857: FirstName is Nell")
	void FirstNameOfRecord4857() {
		assertEquals("Nell", customers.get(4856).getFirstName());
	}

	@Test
	@DisplayName("Record 4857: LastName is Blechman")
	void LastNameOfRecord4857() {
		assertEquals("Blechman", customers.get(4856).getLastName());
	}

	@Test
	@DisplayName("Record 4857: Company is Lavorato, John E")
	void CompanyOfRecord4857() {
		assertEquals("Lavorato, John E", customers.get(4856).getCompany());
	}

	@Test
	@DisplayName("Record 4857: Address is 30 E Central Pky")
	void AddressOfRecord4857() {
		assertEquals("30 E Central Pky", customers.get(4856).getAddress());
	}

	@Test
	@DisplayName("Record 4857: City is Cincinnati")
	void CityOfRecord4857() {
		assertEquals("Cincinnati", customers.get(4856).getCity());
	}

	@Test
	@DisplayName("Record 4857: County is Hamilton")
	void CountyOfRecord4857() {
		assertEquals("Hamilton", customers.get(4856).getCounty());
	}

	@Test
	@DisplayName("Record 4857: State is OH")
	void StateOfRecord4857() {
		assertEquals("OH", customers.get(4856).getState());
	}

	@Test
	@DisplayName("Record 4857: ZIP is 45202")
	void ZIPOfRecord4857() {
		assertEquals("45202", customers.get(4856).getZIP());
	}

	@Test
	@DisplayName("Record 4857: Phone is 513-421-4536")
	void PhoneOfRecord4857() {
		assertEquals("513-421-4536", customers.get(4856).getPhone());
	}

	@Test
	@DisplayName("Record 4857: Fax is 513-421-8624")
	void FaxOfRecord4857() {
		assertEquals("513-421-8624", customers.get(4856).getFax());
	}

	@Test
	@DisplayName("Record 4857: Email is nell@blechman.com")
	void EmailOfRecord4857() {
		assertEquals("nell@blechman.com", customers.get(4856).getEmail());
	}

	@Test
	@DisplayName("Record 4857: Web is http://www.nellblechman.com")
	void WebOfRecord4857() {
		assertEquals("http://www.nellblechman.com", customers.get(4856).getWeb());
	}
}
