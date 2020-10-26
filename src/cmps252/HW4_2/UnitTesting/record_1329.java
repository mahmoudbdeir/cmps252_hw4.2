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

@Tag("26")
class Record_1329 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1329: FirstName is Ruben")
	void FirstNameOfRecord1329() {
		assertEquals("Ruben", customers.get(1328).getFirstName());
	}

	@Test
	@DisplayName("Record 1329: LastName is Rause")
	void LastNameOfRecord1329() {
		assertEquals("Rause", customers.get(1328).getLastName());
	}

	@Test
	@DisplayName("Record 1329: Company is Brown & Sellnow")
	void CompanyOfRecord1329() {
		assertEquals("Brown & Sellnow", customers.get(1328).getCompany());
	}

	@Test
	@DisplayName("Record 1329: Address is 1031 Us Highway 22")
	void AddressOfRecord1329() {
		assertEquals("1031 Us Highway 22", customers.get(1328).getAddress());
	}

	@Test
	@DisplayName("Record 1329: City is Bridgewater")
	void CityOfRecord1329() {
		assertEquals("Bridgewater", customers.get(1328).getCity());
	}

	@Test
	@DisplayName("Record 1329: County is Somerset")
	void CountyOfRecord1329() {
		assertEquals("Somerset", customers.get(1328).getCounty());
	}

	@Test
	@DisplayName("Record 1329: State is NJ")
	void StateOfRecord1329() {
		assertEquals("NJ", customers.get(1328).getState());
	}

	@Test
	@DisplayName("Record 1329: ZIP is 8807")
	void ZIPOfRecord1329() {
		assertEquals("8807", customers.get(1328).getZIP());
	}

	@Test
	@DisplayName("Record 1329: Phone is 908-722-1336")
	void PhoneOfRecord1329() {
		assertEquals("908-722-1336", customers.get(1328).getPhone());
	}

	@Test
	@DisplayName("Record 1329: Fax is 908-722-7711")
	void FaxOfRecord1329() {
		assertEquals("908-722-7711", customers.get(1328).getFax());
	}

	@Test
	@DisplayName("Record 1329: Email is ruben@rause.com")
	void EmailOfRecord1329() {
		assertEquals("ruben@rause.com", customers.get(1328).getEmail());
	}

	@Test
	@DisplayName("Record 1329: Web is http://www.rubenrause.com")
	void WebOfRecord1329() {
		assertEquals("http://www.rubenrause.com", customers.get(1328).getWeb());
	}
}
