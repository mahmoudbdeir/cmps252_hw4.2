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
class Record_1607 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1607: FirstName is Dorris")
	void FirstNameOfRecord1607() {
		assertEquals("Dorris", customers.get(1606).getFirstName());
	}

	@Test
	@DisplayName("Record 1607: LastName is Dragoo")
	void LastNameOfRecord1607() {
		assertEquals("Dragoo", customers.get(1606).getLastName());
	}

	@Test
	@DisplayName("Record 1607: Company is Bills Pharmacy")
	void CompanyOfRecord1607() {
		assertEquals("Bills Pharmacy", customers.get(1606).getCompany());
	}

	@Test
	@DisplayName("Record 1607: Address is 128 Edwardia Dr")
	void AddressOfRecord1607() {
		assertEquals("128 Edwardia Dr", customers.get(1606).getAddress());
	}

	@Test
	@DisplayName("Record 1607: City is Greensboro")
	void CityOfRecord1607() {
		assertEquals("Greensboro", customers.get(1606).getCity());
	}

	@Test
	@DisplayName("Record 1607: County is Guilford")
	void CountyOfRecord1607() {
		assertEquals("Guilford", customers.get(1606).getCounty());
	}

	@Test
	@DisplayName("Record 1607: State is NC")
	void StateOfRecord1607() {
		assertEquals("NC", customers.get(1606).getState());
	}

	@Test
	@DisplayName("Record 1607: ZIP is 27409")
	void ZIPOfRecord1607() {
		assertEquals("27409", customers.get(1606).getZIP());
	}

	@Test
	@DisplayName("Record 1607: Phone is 336-691-9040")
	void PhoneOfRecord1607() {
		assertEquals("336-691-9040", customers.get(1606).getPhone());
	}

	@Test
	@DisplayName("Record 1607: Fax is 336-691-7011")
	void FaxOfRecord1607() {
		assertEquals("336-691-7011", customers.get(1606).getFax());
	}

	@Test
	@DisplayName("Record 1607: Email is dorris@dragoo.com")
	void EmailOfRecord1607() {
		assertEquals("dorris@dragoo.com", customers.get(1606).getEmail());
	}

	@Test
	@DisplayName("Record 1607: Web is http://www.dorrisdragoo.com")
	void WebOfRecord1607() {
		assertEquals("http://www.dorrisdragoo.com", customers.get(1606).getWeb());
	}
}
