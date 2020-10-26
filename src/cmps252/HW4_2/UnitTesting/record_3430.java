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

@Tag("7")
class Record_3430 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3430: FirstName is Brittany")
	void FirstNameOfRecord3430() {
		assertEquals("Brittany", customers.get(3429).getFirstName());
	}

	@Test
	@DisplayName("Record 3430: LastName is Kaye")
	void LastNameOfRecord3430() {
		assertEquals("Kaye", customers.get(3429).getLastName());
	}

	@Test
	@DisplayName("Record 3430: Company is Podlesh, Mark Cpa")
	void CompanyOfRecord3430() {
		assertEquals("Podlesh, Mark Cpa", customers.get(3429).getCompany());
	}

	@Test
	@DisplayName("Record 3430: Address is 4702 2nd Ave")
	void AddressOfRecord3430() {
		assertEquals("4702 2nd Ave", customers.get(3429).getAddress());
	}

	@Test
	@DisplayName("Record 3430: City is Brooklyn")
	void CityOfRecord3430() {
		assertEquals("Brooklyn", customers.get(3429).getCity());
	}

	@Test
	@DisplayName("Record 3430: County is Kings")
	void CountyOfRecord3430() {
		assertEquals("Kings", customers.get(3429).getCounty());
	}

	@Test
	@DisplayName("Record 3430: State is NY")
	void StateOfRecord3430() {
		assertEquals("NY", customers.get(3429).getState());
	}

	@Test
	@DisplayName("Record 3430: ZIP is 11232")
	void ZIPOfRecord3430() {
		assertEquals("11232", customers.get(3429).getZIP());
	}

	@Test
	@DisplayName("Record 3430: Phone is 718-788-0718")
	void PhoneOfRecord3430() {
		assertEquals("718-788-0718", customers.get(3429).getPhone());
	}

	@Test
	@DisplayName("Record 3430: Fax is 718-788-7606")
	void FaxOfRecord3430() {
		assertEquals("718-788-7606", customers.get(3429).getFax());
	}

	@Test
	@DisplayName("Record 3430: Email is brittany@kaye.com")
	void EmailOfRecord3430() {
		assertEquals("brittany@kaye.com", customers.get(3429).getEmail());
	}

	@Test
	@DisplayName("Record 3430: Web is http://www.brittanykaye.com")
	void WebOfRecord3430() {
		assertEquals("http://www.brittanykaye.com", customers.get(3429).getWeb());
	}
}
