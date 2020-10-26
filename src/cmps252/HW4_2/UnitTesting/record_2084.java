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

@Tag("6")
class Record_2084 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2084: FirstName is Hector")
	void FirstNameOfRecord2084() {
		assertEquals("Hector", customers.get(2083).getFirstName());
	}

	@Test
	@DisplayName("Record 2084: LastName is Ahumada")
	void LastNameOfRecord2084() {
		assertEquals("Ahumada", customers.get(2083).getLastName());
	}

	@Test
	@DisplayName("Record 2084: Company is National Cable Television Inst")
	void CompanyOfRecord2084() {
		assertEquals("National Cable Television Inst", customers.get(2083).getCompany());
	}

	@Test
	@DisplayName("Record 2084: Address is Memorial Dr")
	void AddressOfRecord2084() {
		assertEquals("Memorial Dr", customers.get(2083).getAddress());
	}

	@Test
	@DisplayName("Record 2084: City is Saint Johnsbury")
	void CityOfRecord2084() {
		assertEquals("Saint Johnsbury", customers.get(2083).getCity());
	}

	@Test
	@DisplayName("Record 2084: County is Caledonia")
	void CountyOfRecord2084() {
		assertEquals("Caledonia", customers.get(2083).getCounty());
	}

	@Test
	@DisplayName("Record 2084: State is VT")
	void StateOfRecord2084() {
		assertEquals("VT", customers.get(2083).getState());
	}

	@Test
	@DisplayName("Record 2084: ZIP is 5819")
	void ZIPOfRecord2084() {
		assertEquals("5819", customers.get(2083).getZIP());
	}

	@Test
	@DisplayName("Record 2084: Phone is 802-334-2943")
	void PhoneOfRecord2084() {
		assertEquals("802-334-2943", customers.get(2083).getPhone());
	}

	@Test
	@DisplayName("Record 2084: Fax is 802-334-1564")
	void FaxOfRecord2084() {
		assertEquals("802-334-1564", customers.get(2083).getFax());
	}

	@Test
	@DisplayName("Record 2084: Email is hector@ahumada.com")
	void EmailOfRecord2084() {
		assertEquals("hector@ahumada.com", customers.get(2083).getEmail());
	}

	@Test
	@DisplayName("Record 2084: Web is http://www.hectorahumada.com")
	void WebOfRecord2084() {
		assertEquals("http://www.hectorahumada.com", customers.get(2083).getWeb());
	}
}
