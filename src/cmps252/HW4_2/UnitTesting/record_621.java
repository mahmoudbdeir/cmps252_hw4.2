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

@Tag("19")
class Record_621 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 621: FirstName is Titus")
	void FirstNameOfRecord621() {
		assertEquals("Titus", customers.get(620).getFirstName());
	}

	@Test
	@DisplayName("Record 621: LastName is Swindall")
	void LastNameOfRecord621() {
		assertEquals("Swindall", customers.get(620).getLastName());
	}

	@Test
	@DisplayName("Record 621: Company is Kettering Memorial Hospital")
	void CompanyOfRecord621() {
		assertEquals("Kettering Memorial Hospital", customers.get(620).getCompany());
	}

	@Test
	@DisplayName("Record 621: Address is 163 Pittsburg St")
	void AddressOfRecord621() {
		assertEquals("163 Pittsburg St", customers.get(620).getAddress());
	}

	@Test
	@DisplayName("Record 621: City is Dallas")
	void CityOfRecord621() {
		assertEquals("Dallas", customers.get(620).getCity());
	}

	@Test
	@DisplayName("Record 621: County is Dallas")
	void CountyOfRecord621() {
		assertEquals("Dallas", customers.get(620).getCounty());
	}

	@Test
	@DisplayName("Record 621: State is TX")
	void StateOfRecord621() {
		assertEquals("TX", customers.get(620).getState());
	}

	@Test
	@DisplayName("Record 621: ZIP is 75207")
	void ZIPOfRecord621() {
		assertEquals("75207", customers.get(620).getZIP());
	}

	@Test
	@DisplayName("Record 621: Phone is 214-748-6789")
	void PhoneOfRecord621() {
		assertEquals("214-748-6789", customers.get(620).getPhone());
	}

	@Test
	@DisplayName("Record 621: Fax is 214-748-6465")
	void FaxOfRecord621() {
		assertEquals("214-748-6465", customers.get(620).getFax());
	}

	@Test
	@DisplayName("Record 621: Email is titus@swindall.com")
	void EmailOfRecord621() {
		assertEquals("titus@swindall.com", customers.get(620).getEmail());
	}

	@Test
	@DisplayName("Record 621: Web is http://www.titusswindall.com")
	void WebOfRecord621() {
		assertEquals("http://www.titusswindall.com", customers.get(620).getWeb());
	}
}
