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

@Tag("45")
class Record_2804 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2804: FirstName is Willa")
	void FirstNameOfRecord2804() {
		assertEquals("Willa", customers.get(2803).getFirstName());
	}

	@Test
	@DisplayName("Record 2804: LastName is Amorin")
	void LastNameOfRecord2804() {
		assertEquals("Amorin", customers.get(2803).getLastName());
	}

	@Test
	@DisplayName("Record 2804: Company is Copy Systems Inc")
	void CompanyOfRecord2804() {
		assertEquals("Copy Systems Inc", customers.get(2803).getCompany());
	}

	@Test
	@DisplayName("Record 2804: Address is 100 Delsea Dr S")
	void AddressOfRecord2804() {
		assertEquals("100 Delsea Dr S", customers.get(2803).getAddress());
	}

	@Test
	@DisplayName("Record 2804: City is Glassboro")
	void CityOfRecord2804() {
		assertEquals("Glassboro", customers.get(2803).getCity());
	}

	@Test
	@DisplayName("Record 2804: County is Gloucester")
	void CountyOfRecord2804() {
		assertEquals("Gloucester", customers.get(2803).getCounty());
	}

	@Test
	@DisplayName("Record 2804: State is NJ")
	void StateOfRecord2804() {
		assertEquals("NJ", customers.get(2803).getState());
	}

	@Test
	@DisplayName("Record 2804: ZIP is 8028")
	void ZIPOfRecord2804() {
		assertEquals("8028", customers.get(2803).getZIP());
	}

	@Test
	@DisplayName("Record 2804: Phone is 856-863-0863")
	void PhoneOfRecord2804() {
		assertEquals("856-863-0863", customers.get(2803).getPhone());
	}

	@Test
	@DisplayName("Record 2804: Fax is 856-863-6132")
	void FaxOfRecord2804() {
		assertEquals("856-863-6132", customers.get(2803).getFax());
	}

	@Test
	@DisplayName("Record 2804: Email is willa@amorin.com")
	void EmailOfRecord2804() {
		assertEquals("willa@amorin.com", customers.get(2803).getEmail());
	}

	@Test
	@DisplayName("Record 2804: Web is http://www.willaamorin.com")
	void WebOfRecord2804() {
		assertEquals("http://www.willaamorin.com", customers.get(2803).getWeb());
	}
}
