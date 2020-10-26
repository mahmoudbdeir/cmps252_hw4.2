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

@Tag("32")
class Record_4170 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4170: FirstName is Bob")
	void FirstNameOfRecord4170() {
		assertEquals("Bob", customers.get(4169).getFirstName());
	}

	@Test
	@DisplayName("Record 4170: LastName is ycher")
	void LastNameOfRecord4170() {
		assertEquals("ycher", customers.get(4169).getLastName());
	}

	@Test
	@DisplayName("Record 4170: Company is Monteleone, J Michael Esq")
	void CompanyOfRecord4170() {
		assertEquals("Monteleone, J Michael Esq", customers.get(4169).getCompany());
	}

	@Test
	@DisplayName("Record 4170: Address is 1101 W Cross St")
	void AddressOfRecord4170() {
		assertEquals("1101 W Cross St", customers.get(4169).getAddress());
	}

	@Test
	@DisplayName("Record 4170: City is Baltimore")
	void CityOfRecord4170() {
		assertEquals("Baltimore", customers.get(4169).getCity());
	}

	@Test
	@DisplayName("Record 4170: County is Baltimore City")
	void CountyOfRecord4170() {
		assertEquals("Baltimore City", customers.get(4169).getCounty());
	}

	@Test
	@DisplayName("Record 4170: State is MD")
	void StateOfRecord4170() {
		assertEquals("MD", customers.get(4169).getState());
	}

	@Test
	@DisplayName("Record 4170: ZIP is 21230")
	void ZIPOfRecord4170() {
		assertEquals("21230", customers.get(4169).getZIP());
	}

	@Test
	@DisplayName("Record 4170: Phone is 410-234-9070")
	void PhoneOfRecord4170() {
		assertEquals("410-234-9070", customers.get(4169).getPhone());
	}

	@Test
	@DisplayName("Record 4170: Fax is 410-234-7536")
	void FaxOfRecord4170() {
		assertEquals("410-234-7536", customers.get(4169).getFax());
	}

	@Test
	@DisplayName("Record 4170: Email is bob@ycher.com")
	void EmailOfRecord4170() {
		assertEquals("bob@ycher.com", customers.get(4169).getEmail());
	}

	@Test
	@DisplayName("Record 4170: Web is http://www.bobycher.com")
	void WebOfRecord4170() {
		assertEquals("http://www.bobycher.com", customers.get(4169).getWeb());
	}
}
