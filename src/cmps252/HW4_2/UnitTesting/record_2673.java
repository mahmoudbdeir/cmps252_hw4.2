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

@Tag("19")
class Record_2673 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2673: FirstName is Earnest")
	void FirstNameOfRecord2673() {
		assertEquals("Earnest", customers.get(2672).getFirstName());
	}

	@Test
	@DisplayName("Record 2673: LastName is Wiltberger")
	void LastNameOfRecord2673() {
		assertEquals("Wiltberger", customers.get(2672).getLastName());
	}

	@Test
	@DisplayName("Record 2673: Company is Coughlin & Gehart")
	void CompanyOfRecord2673() {
		assertEquals("Coughlin & Gehart", customers.get(2672).getCompany());
	}

	@Test
	@DisplayName("Record 2673: Address is 8436 N Nebraska Ave")
	void AddressOfRecord2673() {
		assertEquals("8436 N Nebraska Ave", customers.get(2672).getAddress());
	}

	@Test
	@DisplayName("Record 2673: City is Tampa")
	void CityOfRecord2673() {
		assertEquals("Tampa", customers.get(2672).getCity());
	}

	@Test
	@DisplayName("Record 2673: County is Hillsborough")
	void CountyOfRecord2673() {
		assertEquals("Hillsborough", customers.get(2672).getCounty());
	}

	@Test
	@DisplayName("Record 2673: State is FL")
	void StateOfRecord2673() {
		assertEquals("FL", customers.get(2672).getState());
	}

	@Test
	@DisplayName("Record 2673: ZIP is 33604")
	void ZIPOfRecord2673() {
		assertEquals("33604", customers.get(2672).getZIP());
	}

	@Test
	@DisplayName("Record 2673: Phone is 813-933-1622")
	void PhoneOfRecord2673() {
		assertEquals("813-933-1622", customers.get(2672).getPhone());
	}

	@Test
	@DisplayName("Record 2673: Fax is 813-933-0475")
	void FaxOfRecord2673() {
		assertEquals("813-933-0475", customers.get(2672).getFax());
	}

	@Test
	@DisplayName("Record 2673: Email is earnest@wiltberger.com")
	void EmailOfRecord2673() {
		assertEquals("earnest@wiltberger.com", customers.get(2672).getEmail());
	}

	@Test
	@DisplayName("Record 2673: Web is http://www.earnestwiltberger.com")
	void WebOfRecord2673() {
		assertEquals("http://www.earnestwiltberger.com", customers.get(2672).getWeb());
	}
}
