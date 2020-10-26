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
class Record_1171 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1171: FirstName is Misty")
	void FirstNameOfRecord1171() {
		assertEquals("Misty", customers.get(1170).getFirstName());
	}

	@Test
	@DisplayName("Record 1171: LastName is Petr")
	void LastNameOfRecord1171() {
		assertEquals("Petr", customers.get(1170).getLastName());
	}

	@Test
	@DisplayName("Record 1171: Company is Simon, Steven A")
	void CompanyOfRecord1171() {
		assertEquals("Simon, Steven A", customers.get(1170).getCompany());
	}

	@Test
	@DisplayName("Record 1171: Address is 2200 Stephenson Hwy")
	void AddressOfRecord1171() {
		assertEquals("2200 Stephenson Hwy", customers.get(1170).getAddress());
	}

	@Test
	@DisplayName("Record 1171: City is Troy")
	void CityOfRecord1171() {
		assertEquals("Troy", customers.get(1170).getCity());
	}

	@Test
	@DisplayName("Record 1171: County is Oakland")
	void CountyOfRecord1171() {
		assertEquals("Oakland", customers.get(1170).getCounty());
	}

	@Test
	@DisplayName("Record 1171: State is MI")
	void StateOfRecord1171() {
		assertEquals("MI", customers.get(1170).getState());
	}

	@Test
	@DisplayName("Record 1171: ZIP is 48083")
	void ZIPOfRecord1171() {
		assertEquals("48083", customers.get(1170).getZIP());
	}

	@Test
	@DisplayName("Record 1171: Phone is 248-689-7182")
	void PhoneOfRecord1171() {
		assertEquals("248-689-7182", customers.get(1170).getPhone());
	}

	@Test
	@DisplayName("Record 1171: Fax is 248-689-2768")
	void FaxOfRecord1171() {
		assertEquals("248-689-2768", customers.get(1170).getFax());
	}

	@Test
	@DisplayName("Record 1171: Email is misty@petr.com")
	void EmailOfRecord1171() {
		assertEquals("misty@petr.com", customers.get(1170).getEmail());
	}

	@Test
	@DisplayName("Record 1171: Web is http://www.mistypetr.com")
	void WebOfRecord1171() {
		assertEquals("http://www.mistypetr.com", customers.get(1170).getWeb());
	}
}
