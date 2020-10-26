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

@Tag("34")
class Record_2054 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2054: FirstName is Lacy")
	void FirstNameOfRecord2054() {
		assertEquals("Lacy", customers.get(2053).getFirstName());
	}

	@Test
	@DisplayName("Record 2054: LastName is Dewindt")
	void LastNameOfRecord2054() {
		assertEquals("Dewindt", customers.get(2053).getLastName());
	}

	@Test
	@DisplayName("Record 2054: Company is Morris Brignone & Pickering")
	void CompanyOfRecord2054() {
		assertEquals("Morris Brignone & Pickering", customers.get(2053).getCompany());
	}

	@Test
	@DisplayName("Record 2054: Address is 200 Commerce Dr")
	void AddressOfRecord2054() {
		assertEquals("200 Commerce Dr", customers.get(2053).getAddress());
	}

	@Test
	@DisplayName("Record 2054: City is Mount Vernon")
	void CityOfRecord2054() {
		assertEquals("Mount Vernon", customers.get(2053).getCity());
	}

	@Test
	@DisplayName("Record 2054: County is Knox")
	void CountyOfRecord2054() {
		assertEquals("Knox", customers.get(2053).getCounty());
	}

	@Test
	@DisplayName("Record 2054: State is OH")
	void StateOfRecord2054() {
		assertEquals("OH", customers.get(2053).getState());
	}

	@Test
	@DisplayName("Record 2054: ZIP is 43050")
	void ZIPOfRecord2054() {
		assertEquals("43050", customers.get(2053).getZIP());
	}

	@Test
	@DisplayName("Record 2054: Phone is 740-397-8934")
	void PhoneOfRecord2054() {
		assertEquals("740-397-8934", customers.get(2053).getPhone());
	}

	@Test
	@DisplayName("Record 2054: Fax is 740-397-8565")
	void FaxOfRecord2054() {
		assertEquals("740-397-8565", customers.get(2053).getFax());
	}

	@Test
	@DisplayName("Record 2054: Email is lacy@dewindt.com")
	void EmailOfRecord2054() {
		assertEquals("lacy@dewindt.com", customers.get(2053).getEmail());
	}

	@Test
	@DisplayName("Record 2054: Web is http://www.lacydewindt.com")
	void WebOfRecord2054() {
		assertEquals("http://www.lacydewindt.com", customers.get(2053).getWeb());
	}
}
