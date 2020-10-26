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

@Tag("37")
class Record_2147 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2147: FirstName is Gerardo")
	void FirstNameOfRecord2147() {
		assertEquals("Gerardo", customers.get(2146).getFirstName());
	}

	@Test
	@DisplayName("Record 2147: LastName is Fune")
	void LastNameOfRecord2147() {
		assertEquals("Fune", customers.get(2146).getLastName());
	}

	@Test
	@DisplayName("Record 2147: Company is Ashley Mccormick Co")
	void CompanyOfRecord2147() {
		assertEquals("Ashley Mccormick Co", customers.get(2146).getCompany());
	}

	@Test
	@DisplayName("Record 2147: Address is 64 N Main St")
	void AddressOfRecord2147() {
		assertEquals("64 N Main St", customers.get(2146).getAddress());
	}

	@Test
	@DisplayName("Record 2147: City is Saint Albans")
	void CityOfRecord2147() {
		assertEquals("Saint Albans", customers.get(2146).getCity());
	}

	@Test
	@DisplayName("Record 2147: County is Franklin")
	void CountyOfRecord2147() {
		assertEquals("Franklin", customers.get(2146).getCounty());
	}

	@Test
	@DisplayName("Record 2147: State is VT")
	void StateOfRecord2147() {
		assertEquals("VT", customers.get(2146).getState());
	}

	@Test
	@DisplayName("Record 2147: ZIP is 5478")
	void ZIPOfRecord2147() {
		assertEquals("5478", customers.get(2146).getZIP());
	}

	@Test
	@DisplayName("Record 2147: Phone is 802-524-1599")
	void PhoneOfRecord2147() {
		assertEquals("802-524-1599", customers.get(2146).getPhone());
	}

	@Test
	@DisplayName("Record 2147: Fax is 802-524-3955")
	void FaxOfRecord2147() {
		assertEquals("802-524-3955", customers.get(2146).getFax());
	}

	@Test
	@DisplayName("Record 2147: Email is gerardo@fune.com")
	void EmailOfRecord2147() {
		assertEquals("gerardo@fune.com", customers.get(2146).getEmail());
	}

	@Test
	@DisplayName("Record 2147: Web is http://www.gerardofune.com")
	void WebOfRecord2147() {
		assertEquals("http://www.gerardofune.com", customers.get(2146).getWeb());
	}
}
