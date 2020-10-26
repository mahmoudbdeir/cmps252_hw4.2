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

@Tag("43")
class Record_2872 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2872: FirstName is Dwain")
	void FirstNameOfRecord2872() {
		assertEquals("Dwain", customers.get(2871).getFirstName());
	}

	@Test
	@DisplayName("Record 2872: LastName is Ostroski")
	void LastNameOfRecord2872() {
		assertEquals("Ostroski", customers.get(2871).getLastName());
	}

	@Test
	@DisplayName("Record 2872: Company is Brady & Associates")
	void CompanyOfRecord2872() {
		assertEquals("Brady & Associates", customers.get(2871).getCompany());
	}

	@Test
	@DisplayName("Record 2872: Address is 3810 Mansfield Hwy")
	void AddressOfRecord2872() {
		assertEquals("3810 Mansfield Hwy", customers.get(2871).getAddress());
	}

	@Test
	@DisplayName("Record 2872: City is Fort Worth")
	void CityOfRecord2872() {
		assertEquals("Fort Worth", customers.get(2871).getCity());
	}

	@Test
	@DisplayName("Record 2872: County is Tarrant")
	void CountyOfRecord2872() {
		assertEquals("Tarrant", customers.get(2871).getCounty());
	}

	@Test
	@DisplayName("Record 2872: State is TX")
	void StateOfRecord2872() {
		assertEquals("TX", customers.get(2871).getState());
	}

	@Test
	@DisplayName("Record 2872: ZIP is 76119")
	void ZIPOfRecord2872() {
		assertEquals("76119", customers.get(2871).getZIP());
	}

	@Test
	@DisplayName("Record 2872: Phone is 817-535-3095")
	void PhoneOfRecord2872() {
		assertEquals("817-535-3095", customers.get(2871).getPhone());
	}

	@Test
	@DisplayName("Record 2872: Fax is 817-535-9147")
	void FaxOfRecord2872() {
		assertEquals("817-535-9147", customers.get(2871).getFax());
	}

	@Test
	@DisplayName("Record 2872: Email is dwain@ostroski.com")
	void EmailOfRecord2872() {
		assertEquals("dwain@ostroski.com", customers.get(2871).getEmail());
	}

	@Test
	@DisplayName("Record 2872: Web is http://www.dwainostroski.com")
	void WebOfRecord2872() {
		assertEquals("http://www.dwainostroski.com", customers.get(2871).getWeb());
	}
}
