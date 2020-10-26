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
class Record_381 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 381: FirstName is Alta")
	void FirstNameOfRecord381() {
		assertEquals("Alta", customers.get(380).getFirstName());
	}

	@Test
	@DisplayName("Record 381: LastName is Catucci")
	void LastNameOfRecord381() {
		assertEquals("Catucci", customers.get(380).getLastName());
	}

	@Test
	@DisplayName("Record 381: Company is T B F Graphics")
	void CompanyOfRecord381() {
		assertEquals("T B F Graphics", customers.get(380).getCompany());
	}

	@Test
	@DisplayName("Record 381: Address is 7225 Canoga Ave")
	void AddressOfRecord381() {
		assertEquals("7225 Canoga Ave", customers.get(380).getAddress());
	}

	@Test
	@DisplayName("Record 381: City is Canoga Park")
	void CityOfRecord381() {
		assertEquals("Canoga Park", customers.get(380).getCity());
	}

	@Test
	@DisplayName("Record 381: County is Los Angeles")
	void CountyOfRecord381() {
		assertEquals("Los Angeles", customers.get(380).getCounty());
	}

	@Test
	@DisplayName("Record 381: State is CA")
	void StateOfRecord381() {
		assertEquals("CA", customers.get(380).getState());
	}

	@Test
	@DisplayName("Record 381: ZIP is 91303")
	void ZIPOfRecord381() {
		assertEquals("91303", customers.get(380).getZIP());
	}

	@Test
	@DisplayName("Record 381: Phone is 818-716-6014")
	void PhoneOfRecord381() {
		assertEquals("818-716-6014", customers.get(380).getPhone());
	}

	@Test
	@DisplayName("Record 381: Fax is 818-716-6517")
	void FaxOfRecord381() {
		assertEquals("818-716-6517", customers.get(380).getFax());
	}

	@Test
	@DisplayName("Record 381: Email is alta@catucci.com")
	void EmailOfRecord381() {
		assertEquals("alta@catucci.com", customers.get(380).getEmail());
	}

	@Test
	@DisplayName("Record 381: Web is http://www.altacatucci.com")
	void WebOfRecord381() {
		assertEquals("http://www.altacatucci.com", customers.get(380).getWeb());
	}
}
