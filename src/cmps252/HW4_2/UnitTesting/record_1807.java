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

@Tag("11")
class Record_1807 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1807: FirstName is Gay")
	void FirstNameOfRecord1807() {
		assertEquals("Gay", customers.get(1806).getFirstName());
	}

	@Test
	@DisplayName("Record 1807: LastName is Anciso")
	void LastNameOfRecord1807() {
		assertEquals("Anciso", customers.get(1806).getLastName());
	}

	@Test
	@DisplayName("Record 1807: Company is Shemins Nurseries Inc")
	void CompanyOfRecord1807() {
		assertEquals("Shemins Nurseries Inc", customers.get(1806).getCompany());
	}

	@Test
	@DisplayName("Record 1807: Address is 112 Columbia Ave")
	void AddressOfRecord1807() {
		assertEquals("112 Columbia Ave", customers.get(1806).getAddress());
	}

	@Test
	@DisplayName("Record 1807: City is Ballston Spa")
	void CityOfRecord1807() {
		assertEquals("Ballston Spa", customers.get(1806).getCity());
	}

	@Test
	@DisplayName("Record 1807: County is Saratoga")
	void CountyOfRecord1807() {
		assertEquals("Saratoga", customers.get(1806).getCounty());
	}

	@Test
	@DisplayName("Record 1807: State is NY")
	void StateOfRecord1807() {
		assertEquals("NY", customers.get(1806).getState());
	}

	@Test
	@DisplayName("Record 1807: ZIP is 12020")
	void ZIPOfRecord1807() {
		assertEquals("12020", customers.get(1806).getZIP());
	}

	@Test
	@DisplayName("Record 1807: Phone is 518-885-2798")
	void PhoneOfRecord1807() {
		assertEquals("518-885-2798", customers.get(1806).getPhone());
	}

	@Test
	@DisplayName("Record 1807: Fax is 518-885-8438")
	void FaxOfRecord1807() {
		assertEquals("518-885-8438", customers.get(1806).getFax());
	}

	@Test
	@DisplayName("Record 1807: Email is gay@anciso.com")
	void EmailOfRecord1807() {
		assertEquals("gay@anciso.com", customers.get(1806).getEmail());
	}

	@Test
	@DisplayName("Record 1807: Web is http://www.gayanciso.com")
	void WebOfRecord1807() {
		assertEquals("http://www.gayanciso.com", customers.get(1806).getWeb());
	}
}
