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

@Tag("3")
class Record_1787 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1787: FirstName is Maggie")
	void FirstNameOfRecord1787() {
		assertEquals("Maggie", customers.get(1786).getFirstName());
	}

	@Test
	@DisplayName("Record 1787: LastName is Vanderberg")
	void LastNameOfRecord1787() {
		assertEquals("Vanderberg", customers.get(1786).getLastName());
	}

	@Test
	@DisplayName("Record 1787: Company is Spahn, Gay A Esq")
	void CompanyOfRecord1787() {
		assertEquals("Spahn, Gay A Esq", customers.get(1786).getCompany());
	}

	@Test
	@DisplayName("Record 1787: Address is 2005 Market St")
	void AddressOfRecord1787() {
		assertEquals("2005 Market St", customers.get(1786).getAddress());
	}

	@Test
	@DisplayName("Record 1787: City is Philadelphia")
	void CityOfRecord1787() {
		assertEquals("Philadelphia", customers.get(1786).getCity());
	}

	@Test
	@DisplayName("Record 1787: County is Philadelphia")
	void CountyOfRecord1787() {
		assertEquals("Philadelphia", customers.get(1786).getCounty());
	}

	@Test
	@DisplayName("Record 1787: State is PA")
	void StateOfRecord1787() {
		assertEquals("PA", customers.get(1786).getState());
	}

	@Test
	@DisplayName("Record 1787: ZIP is 19103")
	void ZIPOfRecord1787() {
		assertEquals("19103", customers.get(1786).getZIP());
	}

	@Test
	@DisplayName("Record 1787: Phone is 215-981-3886")
	void PhoneOfRecord1787() {
		assertEquals("215-981-3886", customers.get(1786).getPhone());
	}

	@Test
	@DisplayName("Record 1787: Fax is 215-981-2536")
	void FaxOfRecord1787() {
		assertEquals("215-981-2536", customers.get(1786).getFax());
	}

	@Test
	@DisplayName("Record 1787: Email is maggie@vanderberg.com")
	void EmailOfRecord1787() {
		assertEquals("maggie@vanderberg.com", customers.get(1786).getEmail());
	}

	@Test
	@DisplayName("Record 1787: Web is http://www.maggievanderberg.com")
	void WebOfRecord1787() {
		assertEquals("http://www.maggievanderberg.com", customers.get(1786).getWeb());
	}
}
