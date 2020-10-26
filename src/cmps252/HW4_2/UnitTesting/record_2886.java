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

@Tag("34")
class Record_2886 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2886: FirstName is Maya")
	void FirstNameOfRecord2886() {
		assertEquals("Maya", customers.get(2885).getFirstName());
	}

	@Test
	@DisplayName("Record 2886: LastName is Shewmaker")
	void LastNameOfRecord2886() {
		assertEquals("Shewmaker", customers.get(2885).getLastName());
	}

	@Test
	@DisplayName("Record 2886: Company is Terrace Villas")
	void CompanyOfRecord2886() {
		assertEquals("Terrace Villas", customers.get(2885).getCompany());
	}

	@Test
	@DisplayName("Record 2886: Address is 10217 Donway Pl")
	void AddressOfRecord2886() {
		assertEquals("10217 Donway Pl", customers.get(2885).getAddress());
	}

	@Test
	@DisplayName("Record 2886: City is El Paso")
	void CityOfRecord2886() {
		assertEquals("El Paso", customers.get(2885).getCity());
	}

	@Test
	@DisplayName("Record 2886: County is El Paso")
	void CountyOfRecord2886() {
		assertEquals("El Paso", customers.get(2885).getCounty());
	}

	@Test
	@DisplayName("Record 2886: State is TX")
	void StateOfRecord2886() {
		assertEquals("TX", customers.get(2885).getState());
	}

	@Test
	@DisplayName("Record 2886: ZIP is 79925")
	void ZIPOfRecord2886() {
		assertEquals("79925", customers.get(2885).getZIP());
	}

	@Test
	@DisplayName("Record 2886: Phone is 915-590-4038")
	void PhoneOfRecord2886() {
		assertEquals("915-590-4038", customers.get(2885).getPhone());
	}

	@Test
	@DisplayName("Record 2886: Fax is 915-590-0436")
	void FaxOfRecord2886() {
		assertEquals("915-590-0436", customers.get(2885).getFax());
	}

	@Test
	@DisplayName("Record 2886: Email is maya@shewmaker.com")
	void EmailOfRecord2886() {
		assertEquals("maya@shewmaker.com", customers.get(2885).getEmail());
	}

	@Test
	@DisplayName("Record 2886: Web is http://www.mayashewmaker.com")
	void WebOfRecord2886() {
		assertEquals("http://www.mayashewmaker.com", customers.get(2885).getWeb());
	}
}
