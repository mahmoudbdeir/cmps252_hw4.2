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

@Tag("32")
class Record_478 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 478: FirstName is Hester")
	void FirstNameOfRecord478() {
		assertEquals("Hester", customers.get(477).getFirstName());
	}

	@Test
	@DisplayName("Record 478: LastName is Alnas")
	void LastNameOfRecord478() {
		assertEquals("Alnas", customers.get(477).getLastName());
	}

	@Test
	@DisplayName("Record 478: Company is Elliot Katt Books On Perf Arts")
	void CompanyOfRecord478() {
		assertEquals("Elliot Katt Books On Perf Arts", customers.get(477).getCompany());
	}

	@Test
	@DisplayName("Record 478: Address is 215 N Long Beach Blvd")
	void AddressOfRecord478() {
		assertEquals("215 N Long Beach Blvd", customers.get(477).getAddress());
	}

	@Test
	@DisplayName("Record 478: City is Long Beach")
	void CityOfRecord478() {
		assertEquals("Long Beach", customers.get(477).getCity());
	}

	@Test
	@DisplayName("Record 478: County is Los Angeles")
	void CountyOfRecord478() {
		assertEquals("Los Angeles", customers.get(477).getCounty());
	}

	@Test
	@DisplayName("Record 478: State is CA")
	void StateOfRecord478() {
		assertEquals("CA", customers.get(477).getState());
	}

	@Test
	@DisplayName("Record 478: ZIP is 90802")
	void ZIPOfRecord478() {
		assertEquals("90802", customers.get(477).getZIP());
	}

	@Test
	@DisplayName("Record 478: Phone is 562-436-9783")
	void PhoneOfRecord478() {
		assertEquals("562-436-9783", customers.get(477).getPhone());
	}

	@Test
	@DisplayName("Record 478: Fax is 562-436-9058")
	void FaxOfRecord478() {
		assertEquals("562-436-9058", customers.get(477).getFax());
	}

	@Test
	@DisplayName("Record 478: Email is hester@alnas.com")
	void EmailOfRecord478() {
		assertEquals("hester@alnas.com", customers.get(477).getEmail());
	}

	@Test
	@DisplayName("Record 478: Web is http://www.hesteralnas.com")
	void WebOfRecord478() {
		assertEquals("http://www.hesteralnas.com", customers.get(477).getWeb());
	}
}
