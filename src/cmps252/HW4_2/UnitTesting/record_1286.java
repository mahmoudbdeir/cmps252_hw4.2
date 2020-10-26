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

@Tag("22")
class Record_1286 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1286: FirstName is Enid")
	void FirstNameOfRecord1286() {
		assertEquals("Enid", customers.get(1285).getFirstName());
	}

	@Test
	@DisplayName("Record 1286: LastName is Medici")
	void LastNameOfRecord1286() {
		assertEquals("Medici", customers.get(1285).getLastName());
	}

	@Test
	@DisplayName("Record 1286: Company is Kalt Manufacturing Company")
	void CompanyOfRecord1286() {
		assertEquals("Kalt Manufacturing Company", customers.get(1285).getCompany());
	}

	@Test
	@DisplayName("Record 1286: Address is 213 Silver Beach Ave")
	void AddressOfRecord1286() {
		assertEquals("213 Silver Beach Ave", customers.get(1285).getAddress());
	}

	@Test
	@DisplayName("Record 1286: City is Daytona Beach")
	void CityOfRecord1286() {
		assertEquals("Daytona Beach", customers.get(1285).getCity());
	}

	@Test
	@DisplayName("Record 1286: County is Volusia")
	void CountyOfRecord1286() {
		assertEquals("Volusia", customers.get(1285).getCounty());
	}

	@Test
	@DisplayName("Record 1286: State is FL")
	void StateOfRecord1286() {
		assertEquals("FL", customers.get(1285).getState());
	}

	@Test
	@DisplayName("Record 1286: ZIP is 32118")
	void ZIPOfRecord1286() {
		assertEquals("32118", customers.get(1285).getZIP());
	}

	@Test
	@DisplayName("Record 1286: Phone is 386-257-0797")
	void PhoneOfRecord1286() {
		assertEquals("386-257-0797", customers.get(1285).getPhone());
	}

	@Test
	@DisplayName("Record 1286: Fax is 386-257-9186")
	void FaxOfRecord1286() {
		assertEquals("386-257-9186", customers.get(1285).getFax());
	}

	@Test
	@DisplayName("Record 1286: Email is enid@medici.com")
	void EmailOfRecord1286() {
		assertEquals("enid@medici.com", customers.get(1285).getEmail());
	}

	@Test
	@DisplayName("Record 1286: Web is http://www.enidmedici.com")
	void WebOfRecord1286() {
		assertEquals("http://www.enidmedici.com", customers.get(1285).getWeb());
	}
}
