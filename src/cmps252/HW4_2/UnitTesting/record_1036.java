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

@Tag("23")
class Record_1036 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1036: FirstName is Kathi")
	void FirstNameOfRecord1036() {
		assertEquals("Kathi", customers.get(1035).getFirstName());
	}

	@Test
	@DisplayName("Record 1036: LastName is Cuva")
	void LastNameOfRecord1036() {
		assertEquals("Cuva", customers.get(1035).getLastName());
	}

	@Test
	@DisplayName("Record 1036: Company is Ditullio, Stephen A Esq")
	void CompanyOfRecord1036() {
		assertEquals("Ditullio, Stephen A Esq", customers.get(1035).getCompany());
	}

	@Test
	@DisplayName("Record 1036: Address is 1450 W 21st St")
	void AddressOfRecord1036() {
		assertEquals("1450 W 21st St", customers.get(1035).getAddress());
	}

	@Test
	@DisplayName("Record 1036: City is Erie")
	void CityOfRecord1036() {
		assertEquals("Erie", customers.get(1035).getCity());
	}

	@Test
	@DisplayName("Record 1036: County is Erie")
	void CountyOfRecord1036() {
		assertEquals("Erie", customers.get(1035).getCounty());
	}

	@Test
	@DisplayName("Record 1036: State is PA")
	void StateOfRecord1036() {
		assertEquals("PA", customers.get(1035).getState());
	}

	@Test
	@DisplayName("Record 1036: ZIP is 16502")
	void ZIPOfRecord1036() {
		assertEquals("16502", customers.get(1035).getZIP());
	}

	@Test
	@DisplayName("Record 1036: Phone is 814-456-5075")
	void PhoneOfRecord1036() {
		assertEquals("814-456-5075", customers.get(1035).getPhone());
	}

	@Test
	@DisplayName("Record 1036: Fax is 814-456-7502")
	void FaxOfRecord1036() {
		assertEquals("814-456-7502", customers.get(1035).getFax());
	}

	@Test
	@DisplayName("Record 1036: Email is kathi@cuva.com")
	void EmailOfRecord1036() {
		assertEquals("kathi@cuva.com", customers.get(1035).getEmail());
	}

	@Test
	@DisplayName("Record 1036: Web is http://www.kathicuva.com")
	void WebOfRecord1036() {
		assertEquals("http://www.kathicuva.com", customers.get(1035).getWeb());
	}
}
