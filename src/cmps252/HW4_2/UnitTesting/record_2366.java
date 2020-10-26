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
class Record_2366 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2366: FirstName is Lea")
	void FirstNameOfRecord2366() {
		assertEquals("Lea", customers.get(2365).getFirstName());
	}

	@Test
	@DisplayName("Record 2366: LastName is Slaght")
	void LastNameOfRecord2366() {
		assertEquals("Slaght", customers.get(2365).getLastName());
	}

	@Test
	@DisplayName("Record 2366: Company is Ryburn, W Scott Esq")
	void CompanyOfRecord2366() {
		assertEquals("Ryburn, W Scott Esq", customers.get(2365).getCompany());
	}

	@Test
	@DisplayName("Record 2366: Address is 1318 W Moore Ave")
	void AddressOfRecord2366() {
		assertEquals("1318 W Moore Ave", customers.get(2365).getAddress());
	}

	@Test
	@DisplayName("Record 2366: City is Terrell")
	void CityOfRecord2366() {
		assertEquals("Terrell", customers.get(2365).getCity());
	}

	@Test
	@DisplayName("Record 2366: County is Kaufman")
	void CountyOfRecord2366() {
		assertEquals("Kaufman", customers.get(2365).getCounty());
	}

	@Test
	@DisplayName("Record 2366: State is TX")
	void StateOfRecord2366() {
		assertEquals("TX", customers.get(2365).getState());
	}

	@Test
	@DisplayName("Record 2366: ZIP is 75160")
	void ZIPOfRecord2366() {
		assertEquals("75160", customers.get(2365).getZIP());
	}

	@Test
	@DisplayName("Record 2366: Phone is 972-524-0267")
	void PhoneOfRecord2366() {
		assertEquals("972-524-0267", customers.get(2365).getPhone());
	}

	@Test
	@DisplayName("Record 2366: Fax is 972-524-3338")
	void FaxOfRecord2366() {
		assertEquals("972-524-3338", customers.get(2365).getFax());
	}

	@Test
	@DisplayName("Record 2366: Email is lea@slaght.com")
	void EmailOfRecord2366() {
		assertEquals("lea@slaght.com", customers.get(2365).getEmail());
	}

	@Test
	@DisplayName("Record 2366: Web is http://www.leaslaght.com")
	void WebOfRecord2366() {
		assertEquals("http://www.leaslaght.com", customers.get(2365).getWeb());
	}
}
