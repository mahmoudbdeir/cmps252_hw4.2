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

@Tag("31")
class Record_2802 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2802: FirstName is Jennifer")
	void FirstNameOfRecord2802() {
		assertEquals("Jennifer", customers.get(2801).getFirstName());
	}

	@Test
	@DisplayName("Record 2802: LastName is Fuentez")
	void LastNameOfRecord2802() {
		assertEquals("Fuentez", customers.get(2801).getLastName());
	}

	@Test
	@DisplayName("Record 2802: Company is Malman, Myles H Esq")
	void CompanyOfRecord2802() {
		assertEquals("Malman, Myles H Esq", customers.get(2801).getCompany());
	}

	@Test
	@DisplayName("Record 2802: Address is 1701 Grand Ave")
	void AddressOfRecord2802() {
		assertEquals("1701 Grand Ave", customers.get(2801).getAddress());
	}

	@Test
	@DisplayName("Record 2802: City is Phoenix")
	void CityOfRecord2802() {
		assertEquals("Phoenix", customers.get(2801).getCity());
	}

	@Test
	@DisplayName("Record 2802: County is Maricopa")
	void CountyOfRecord2802() {
		assertEquals("Maricopa", customers.get(2801).getCounty());
	}

	@Test
	@DisplayName("Record 2802: State is AZ")
	void StateOfRecord2802() {
		assertEquals("AZ", customers.get(2801).getState());
	}

	@Test
	@DisplayName("Record 2802: ZIP is 85007")
	void ZIPOfRecord2802() {
		assertEquals("85007", customers.get(2801).getZIP());
	}

	@Test
	@DisplayName("Record 2802: Phone is 602-254-3286")
	void PhoneOfRecord2802() {
		assertEquals("602-254-3286", customers.get(2801).getPhone());
	}

	@Test
	@DisplayName("Record 2802: Fax is 602-254-9947")
	void FaxOfRecord2802() {
		assertEquals("602-254-9947", customers.get(2801).getFax());
	}

	@Test
	@DisplayName("Record 2802: Email is jennifer@fuentez.com")
	void EmailOfRecord2802() {
		assertEquals("jennifer@fuentez.com", customers.get(2801).getEmail());
	}

	@Test
	@DisplayName("Record 2802: Web is http://www.jenniferfuentez.com")
	void WebOfRecord2802() {
		assertEquals("http://www.jenniferfuentez.com", customers.get(2801).getWeb());
	}
}
