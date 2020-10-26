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

@Tag("29")
class Record_3037 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3037: FirstName is Ricardo")
	void FirstNameOfRecord3037() {
		assertEquals("Ricardo", customers.get(3036).getFirstName());
	}

	@Test
	@DisplayName("Record 3037: LastName is Korab")
	void LastNameOfRecord3037() {
		assertEquals("Korab", customers.get(3036).getLastName());
	}

	@Test
	@DisplayName("Record 3037: Company is Integrated Technology Corp")
	void CompanyOfRecord3037() {
		assertEquals("Integrated Technology Corp", customers.get(3036).getCompany());
	}

	@Test
	@DisplayName("Record 3037: Address is 2300 Wirt Rd")
	void AddressOfRecord3037() {
		assertEquals("2300 Wirt Rd", customers.get(3036).getAddress());
	}

	@Test
	@DisplayName("Record 3037: City is Houston")
	void CityOfRecord3037() {
		assertEquals("Houston", customers.get(3036).getCity());
	}

	@Test
	@DisplayName("Record 3037: County is Harris")
	void CountyOfRecord3037() {
		assertEquals("Harris", customers.get(3036).getCounty());
	}

	@Test
	@DisplayName("Record 3037: State is TX")
	void StateOfRecord3037() {
		assertEquals("TX", customers.get(3036).getState());
	}

	@Test
	@DisplayName("Record 3037: ZIP is 77055")
	void ZIPOfRecord3037() {
		assertEquals("77055", customers.get(3036).getZIP());
	}

	@Test
	@DisplayName("Record 3037: Phone is 713-956-2436")
	void PhoneOfRecord3037() {
		assertEquals("713-956-2436", customers.get(3036).getPhone());
	}

	@Test
	@DisplayName("Record 3037: Fax is 713-956-9313")
	void FaxOfRecord3037() {
		assertEquals("713-956-9313", customers.get(3036).getFax());
	}

	@Test
	@DisplayName("Record 3037: Email is ricardo@korab.com")
	void EmailOfRecord3037() {
		assertEquals("ricardo@korab.com", customers.get(3036).getEmail());
	}

	@Test
	@DisplayName("Record 3037: Web is http://www.ricardokorab.com")
	void WebOfRecord3037() {
		assertEquals("http://www.ricardokorab.com", customers.get(3036).getWeb());
	}
}
