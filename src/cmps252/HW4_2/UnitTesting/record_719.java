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

@Tag("35")
class Record_719 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 719: FirstName is Patty")
	void FirstNameOfRecord719() {
		assertEquals("Patty", customers.get(718).getFirstName());
	}

	@Test
	@DisplayName("Record 719: LastName is Yarzabal")
	void LastNameOfRecord719() {
		assertEquals("Yarzabal", customers.get(718).getLastName());
	}

	@Test
	@DisplayName("Record 719: Company is Observer Evening")
	void CompanyOfRecord719() {
		assertEquals("Observer Evening", customers.get(718).getCompany());
	}

	@Test
	@DisplayName("Record 719: Address is 3960 W 16th Ave")
	void AddressOfRecord719() {
		assertEquals("3960 W 16th Ave", customers.get(718).getAddress());
	}

	@Test
	@DisplayName("Record 719: City is Hialeah")
	void CityOfRecord719() {
		assertEquals("Hialeah", customers.get(718).getCity());
	}

	@Test
	@DisplayName("Record 719: County is Miami-Dade")
	void CountyOfRecord719() {
		assertEquals("Miami-Dade", customers.get(718).getCounty());
	}

	@Test
	@DisplayName("Record 719: State is FL")
	void StateOfRecord719() {
		assertEquals("FL", customers.get(718).getState());
	}

	@Test
	@DisplayName("Record 719: ZIP is 33012")
	void ZIPOfRecord719() {
		assertEquals("33012", customers.get(718).getZIP());
	}

	@Test
	@DisplayName("Record 719: Phone is 305-827-0279")
	void PhoneOfRecord719() {
		assertEquals("305-827-0279", customers.get(718).getPhone());
	}

	@Test
	@DisplayName("Record 719: Fax is 305-827-3909")
	void FaxOfRecord719() {
		assertEquals("305-827-3909", customers.get(718).getFax());
	}

	@Test
	@DisplayName("Record 719: Email is patty@yarzabal.com")
	void EmailOfRecord719() {
		assertEquals("patty@yarzabal.com", customers.get(718).getEmail());
	}

	@Test
	@DisplayName("Record 719: Web is http://www.pattyyarzabal.com")
	void WebOfRecord719() {
		assertEquals("http://www.pattyyarzabal.com", customers.get(718).getWeb());
	}
}
