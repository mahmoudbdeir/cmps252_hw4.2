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

@Tag("2")
class Record_1517 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1517: FirstName is Valarie")
	void FirstNameOfRecord1517() {
		assertEquals("Valarie", customers.get(1516).getFirstName());
	}

	@Test
	@DisplayName("Record 1517: LastName is Hadian")
	void LastNameOfRecord1517() {
		assertEquals("Hadian", customers.get(1516).getLastName());
	}

	@Test
	@DisplayName("Record 1517: Company is Ito, Burton Y Aia")
	void CompanyOfRecord1517() {
		assertEquals("Ito, Burton Y Aia", customers.get(1516).getCompany());
	}

	@Test
	@DisplayName("Record 1517: Address is 701 19th St")
	void AddressOfRecord1517() {
		assertEquals("701 19th St", customers.get(1516).getAddress());
	}

	@Test
	@DisplayName("Record 1517: City is Watervliet")
	void CityOfRecord1517() {
		assertEquals("Watervliet", customers.get(1516).getCity());
	}

	@Test
	@DisplayName("Record 1517: County is Albany")
	void CountyOfRecord1517() {
		assertEquals("Albany", customers.get(1516).getCounty());
	}

	@Test
	@DisplayName("Record 1517: State is NY")
	void StateOfRecord1517() {
		assertEquals("NY", customers.get(1516).getState());
	}

	@Test
	@DisplayName("Record 1517: ZIP is 12189")
	void ZIPOfRecord1517() {
		assertEquals("12189", customers.get(1516).getZIP());
	}

	@Test
	@DisplayName("Record 1517: Phone is 518-274-1071")
	void PhoneOfRecord1517() {
		assertEquals("518-274-1071", customers.get(1516).getPhone());
	}

	@Test
	@DisplayName("Record 1517: Fax is 518-274-5898")
	void FaxOfRecord1517() {
		assertEquals("518-274-5898", customers.get(1516).getFax());
	}

	@Test
	@DisplayName("Record 1517: Email is valarie@hadian.com")
	void EmailOfRecord1517() {
		assertEquals("valarie@hadian.com", customers.get(1516).getEmail());
	}

	@Test
	@DisplayName("Record 1517: Web is http://www.valariehadian.com")
	void WebOfRecord1517() {
		assertEquals("http://www.valariehadian.com", customers.get(1516).getWeb());
	}
}
