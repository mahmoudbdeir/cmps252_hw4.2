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

@Tag("10")
class Record_3506 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3506: FirstName is Silas")
	void FirstNameOfRecord3506() {
		assertEquals("Silas", customers.get(3505).getFirstName());
	}

	@Test
	@DisplayName("Record 3506: LastName is Haarstad")
	void LastNameOfRecord3506() {
		assertEquals("Haarstad", customers.get(3505).getLastName());
	}

	@Test
	@DisplayName("Record 3506: Company is Independent Telecom Corp")
	void CompanyOfRecord3506() {
		assertEquals("Independent Telecom Corp", customers.get(3505).getCompany());
	}

	@Test
	@DisplayName("Record 3506: Address is 3150 E Highway 44")
	void AddressOfRecord3506() {
		assertEquals("3150 E Highway 44", customers.get(3505).getAddress());
	}

	@Test
	@DisplayName("Record 3506: City is Rapid City")
	void CityOfRecord3506() {
		assertEquals("Rapid City", customers.get(3505).getCity());
	}

	@Test
	@DisplayName("Record 3506: County is Pennington")
	void CountyOfRecord3506() {
		assertEquals("Pennington", customers.get(3505).getCounty());
	}

	@Test
	@DisplayName("Record 3506: State is SD")
	void StateOfRecord3506() {
		assertEquals("SD", customers.get(3505).getState());
	}

	@Test
	@DisplayName("Record 3506: ZIP is 57701")
	void ZIPOfRecord3506() {
		assertEquals("57701", customers.get(3505).getZIP());
	}

	@Test
	@DisplayName("Record 3506: Phone is 605-393-5117")
	void PhoneOfRecord3506() {
		assertEquals("605-393-5117", customers.get(3505).getPhone());
	}

	@Test
	@DisplayName("Record 3506: Fax is 605-393-7523")
	void FaxOfRecord3506() {
		assertEquals("605-393-7523", customers.get(3505).getFax());
	}

	@Test
	@DisplayName("Record 3506: Email is silas@haarstad.com")
	void EmailOfRecord3506() {
		assertEquals("silas@haarstad.com", customers.get(3505).getEmail());
	}

	@Test
	@DisplayName("Record 3506: Web is http://www.silashaarstad.com")
	void WebOfRecord3506() {
		assertEquals("http://www.silashaarstad.com", customers.get(3505).getWeb());
	}
}
