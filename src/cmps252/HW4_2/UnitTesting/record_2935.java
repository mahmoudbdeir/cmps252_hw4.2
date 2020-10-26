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

@Tag("18")
class Record_2935 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2935: FirstName is Tameka")
	void FirstNameOfRecord2935() {
		assertEquals("Tameka", customers.get(2934).getFirstName());
	}

	@Test
	@DisplayName("Record 2935: LastName is Frankenryter")
	void LastNameOfRecord2935() {
		assertEquals("Frankenryter", customers.get(2934).getLastName());
	}

	@Test
	@DisplayName("Record 2935: Company is Midlantic Ind Cntrctng Inc")
	void CompanyOfRecord2935() {
		assertEquals("Midlantic Ind Cntrctng Inc", customers.get(2934).getCompany());
	}

	@Test
	@DisplayName("Record 2935: Address is 5639 W Barstow Ave")
	void AddressOfRecord2935() {
		assertEquals("5639 W Barstow Ave", customers.get(2934).getAddress());
	}

	@Test
	@DisplayName("Record 2935: City is Fresno")
	void CityOfRecord2935() {
		assertEquals("Fresno", customers.get(2934).getCity());
	}

	@Test
	@DisplayName("Record 2935: County is Fresno")
	void CountyOfRecord2935() {
		assertEquals("Fresno", customers.get(2934).getCounty());
	}

	@Test
	@DisplayName("Record 2935: State is CA")
	void StateOfRecord2935() {
		assertEquals("CA", customers.get(2934).getState());
	}

	@Test
	@DisplayName("Record 2935: ZIP is 93722")
	void ZIPOfRecord2935() {
		assertEquals("93722", customers.get(2934).getZIP());
	}

	@Test
	@DisplayName("Record 2935: Phone is 559-275-2519")
	void PhoneOfRecord2935() {
		assertEquals("559-275-2519", customers.get(2934).getPhone());
	}

	@Test
	@DisplayName("Record 2935: Fax is 559-275-7433")
	void FaxOfRecord2935() {
		assertEquals("559-275-7433", customers.get(2934).getFax());
	}

	@Test
	@DisplayName("Record 2935: Email is tameka@frankenryter.com")
	void EmailOfRecord2935() {
		assertEquals("tameka@frankenryter.com", customers.get(2934).getEmail());
	}

	@Test
	@DisplayName("Record 2935: Web is http://www.tamekafrankenryter.com")
	void WebOfRecord2935() {
		assertEquals("http://www.tamekafrankenryter.com", customers.get(2934).getWeb());
	}
}
