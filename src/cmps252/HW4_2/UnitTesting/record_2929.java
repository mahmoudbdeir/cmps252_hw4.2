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
class Record_2929 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2929: FirstName is Vance")
	void FirstNameOfRecord2929() {
		assertEquals("Vance", customers.get(2928).getFirstName());
	}

	@Test
	@DisplayName("Record 2929: LastName is Wylam")
	void LastNameOfRecord2929() {
		assertEquals("Wylam", customers.get(2928).getLastName());
	}

	@Test
	@DisplayName("Record 2929: Company is Tozour Energy Systems")
	void CompanyOfRecord2929() {
		assertEquals("Tozour Energy Systems", customers.get(2928).getCompany());
	}

	@Test
	@DisplayName("Record 2929: Address is 1378 Us Highway 206")
	void AddressOfRecord2929() {
		assertEquals("1378 Us Highway 206", customers.get(2928).getAddress());
	}

	@Test
	@DisplayName("Record 2929: City is Skillman")
	void CityOfRecord2929() {
		assertEquals("Skillman", customers.get(2928).getCity());
	}

	@Test
	@DisplayName("Record 2929: County is Somerset")
	void CountyOfRecord2929() {
		assertEquals("Somerset", customers.get(2928).getCounty());
	}

	@Test
	@DisplayName("Record 2929: State is NJ")
	void StateOfRecord2929() {
		assertEquals("NJ", customers.get(2928).getState());
	}

	@Test
	@DisplayName("Record 2929: ZIP is 8558")
	void ZIPOfRecord2929() {
		assertEquals("8558", customers.get(2928).getZIP());
	}

	@Test
	@DisplayName("Record 2929: Phone is 609-683-0445")
	void PhoneOfRecord2929() {
		assertEquals("609-683-0445", customers.get(2928).getPhone());
	}

	@Test
	@DisplayName("Record 2929: Fax is 609-683-9312")
	void FaxOfRecord2929() {
		assertEquals("609-683-9312", customers.get(2928).getFax());
	}

	@Test
	@DisplayName("Record 2929: Email is vance@wylam.com")
	void EmailOfRecord2929() {
		assertEquals("vance@wylam.com", customers.get(2928).getEmail());
	}

	@Test
	@DisplayName("Record 2929: Web is http://www.vancewylam.com")
	void WebOfRecord2929() {
		assertEquals("http://www.vancewylam.com", customers.get(2928).getWeb());
	}
}
