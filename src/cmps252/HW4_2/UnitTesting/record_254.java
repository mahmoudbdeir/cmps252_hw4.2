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
class Record_254 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 254: FirstName is Erick")
	void FirstNameOfRecord254() {
		assertEquals("Erick", customers.get(253).getFirstName());
	}

	@Test
	@DisplayName("Record 254: LastName is Gruett")
	void LastNameOfRecord254() {
		assertEquals("Gruett", customers.get(253).getLastName());
	}

	@Test
	@DisplayName("Record 254: Company is South Mountain Software Inc")
	void CompanyOfRecord254() {
		assertEquals("South Mountain Software Inc", customers.get(253).getCompany());
	}

	@Test
	@DisplayName("Record 254: Address is 1 Carding Ln")
	void AddressOfRecord254() {
		assertEquals("1 Carding Ln", customers.get(253).getAddress());
	}

	@Test
	@DisplayName("Record 254: City is Johnston")
	void CityOfRecord254() {
		assertEquals("Johnston", customers.get(253).getCity());
	}

	@Test
	@DisplayName("Record 254: County is Providence")
	void CountyOfRecord254() {
		assertEquals("Providence", customers.get(253).getCounty());
	}

	@Test
	@DisplayName("Record 254: State is RI")
	void StateOfRecord254() {
		assertEquals("RI", customers.get(253).getState());
	}

	@Test
	@DisplayName("Record 254: ZIP is 2919")
	void ZIPOfRecord254() {
		assertEquals("2919", customers.get(253).getZIP());
	}

	@Test
	@DisplayName("Record 254: Phone is 401-942-6517")
	void PhoneOfRecord254() {
		assertEquals("401-942-6517", customers.get(253).getPhone());
	}

	@Test
	@DisplayName("Record 254: Fax is 401-942-3132")
	void FaxOfRecord254() {
		assertEquals("401-942-3132", customers.get(253).getFax());
	}

	@Test
	@DisplayName("Record 254: Email is erick@gruett.com")
	void EmailOfRecord254() {
		assertEquals("erick@gruett.com", customers.get(253).getEmail());
	}

	@Test
	@DisplayName("Record 254: Web is http://www.erickgruett.com")
	void WebOfRecord254() {
		assertEquals("http://www.erickgruett.com", customers.get(253).getWeb());
	}
}
