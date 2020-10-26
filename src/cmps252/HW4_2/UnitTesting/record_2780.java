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

@Tag("4")
class Record_2780 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2780: FirstName is Duane")
	void FirstNameOfRecord2780() {
		assertEquals("Duane", customers.get(2779).getFirstName());
	}

	@Test
	@DisplayName("Record 2780: LastName is Almon")
	void LastNameOfRecord2780() {
		assertEquals("Almon", customers.get(2779).getLastName());
	}

	@Test
	@DisplayName("Record 2780: Company is Kenneth Wells & Assoc")
	void CompanyOfRecord2780() {
		assertEquals("Kenneth Wells & Assoc", customers.get(2779).getCompany());
	}

	@Test
	@DisplayName("Record 2780: Address is Box #-8247")
	void AddressOfRecord2780() {
		assertEquals("Box #-8247", customers.get(2779).getAddress());
	}

	@Test
	@DisplayName("Record 2780: City is Van Nuys")
	void CityOfRecord2780() {
		assertEquals("Van Nuys", customers.get(2779).getCity());
	}

	@Test
	@DisplayName("Record 2780: County is Los Angeles")
	void CountyOfRecord2780() {
		assertEquals("Los Angeles", customers.get(2779).getCounty());
	}

	@Test
	@DisplayName("Record 2780: State is CA")
	void StateOfRecord2780() {
		assertEquals("CA", customers.get(2779).getState());
	}

	@Test
	@DisplayName("Record 2780: ZIP is 91409")
	void ZIPOfRecord2780() {
		assertEquals("91409", customers.get(2779).getZIP());
	}

	@Test
	@DisplayName("Record 2780: Phone is 818-781-7007")
	void PhoneOfRecord2780() {
		assertEquals("818-781-7007", customers.get(2779).getPhone());
	}

	@Test
	@DisplayName("Record 2780: Fax is 818-781-7895")
	void FaxOfRecord2780() {
		assertEquals("818-781-7895", customers.get(2779).getFax());
	}

	@Test
	@DisplayName("Record 2780: Email is duane@almon.com")
	void EmailOfRecord2780() {
		assertEquals("duane@almon.com", customers.get(2779).getEmail());
	}

	@Test
	@DisplayName("Record 2780: Web is http://www.duanealmon.com")
	void WebOfRecord2780() {
		assertEquals("http://www.duanealmon.com", customers.get(2779).getWeb());
	}
}
