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

@Tag("41")
class Record_3662 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3662: FirstName is Tessa")
	void FirstNameOfRecord3662() {
		assertEquals("Tessa", customers.get(3661).getFirstName());
	}

	@Test
	@DisplayName("Record 3662: LastName is Rojas")
	void LastNameOfRecord3662() {
		assertEquals("Rojas", customers.get(3661).getLastName());
	}

	@Test
	@DisplayName("Record 3662: Company is Colonial Offset Printing")
	void CompanyOfRecord3662() {
		assertEquals("Colonial Offset Printing", customers.get(3661).getCompany());
	}

	@Test
	@DisplayName("Record 3662: Address is 3141 N Sheffield Ave")
	void AddressOfRecord3662() {
		assertEquals("3141 N Sheffield Ave", customers.get(3661).getAddress());
	}

	@Test
	@DisplayName("Record 3662: City is Chicago")
	void CityOfRecord3662() {
		assertEquals("Chicago", customers.get(3661).getCity());
	}

	@Test
	@DisplayName("Record 3662: County is Cook")
	void CountyOfRecord3662() {
		assertEquals("Cook", customers.get(3661).getCounty());
	}

	@Test
	@DisplayName("Record 3662: State is IL")
	void StateOfRecord3662() {
		assertEquals("IL", customers.get(3661).getState());
	}

	@Test
	@DisplayName("Record 3662: ZIP is 60657")
	void ZIPOfRecord3662() {
		assertEquals("60657", customers.get(3661).getZIP());
	}

	@Test
	@DisplayName("Record 3662: Phone is 773-935-3003")
	void PhoneOfRecord3662() {
		assertEquals("773-935-3003", customers.get(3661).getPhone());
	}

	@Test
	@DisplayName("Record 3662: Fax is 773-935-4405")
	void FaxOfRecord3662() {
		assertEquals("773-935-4405", customers.get(3661).getFax());
	}

	@Test
	@DisplayName("Record 3662: Email is tessa@rojas.com")
	void EmailOfRecord3662() {
		assertEquals("tessa@rojas.com", customers.get(3661).getEmail());
	}

	@Test
	@DisplayName("Record 3662: Web is http://www.tessarojas.com")
	void WebOfRecord3662() {
		assertEquals("http://www.tessarojas.com", customers.get(3661).getWeb());
	}
}
