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

@Tag("46")
class Record_369 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 369: FirstName is Lucio")
	void FirstNameOfRecord369() {
		assertEquals("Lucio", customers.get(368).getFirstName());
	}

	@Test
	@DisplayName("Record 369: LastName is Reyome")
	void LastNameOfRecord369() {
		assertEquals("Reyome", customers.get(368).getLastName());
	}

	@Test
	@DisplayName("Record 369: Company is Mccutchan Publishing Corp")
	void CompanyOfRecord369() {
		assertEquals("Mccutchan Publishing Corp", customers.get(368).getCompany());
	}

	@Test
	@DisplayName("Record 369: Address is 745599 Luhia St  #-f")
	void AddressOfRecord369() {
		assertEquals("745599 Luhia St  #-f", customers.get(368).getAddress());
	}

	@Test
	@DisplayName("Record 369: City is Kailua Kona")
	void CityOfRecord369() {
		assertEquals("Kailua Kona", customers.get(368).getCity());
	}

	@Test
	@DisplayName("Record 369: County is Hawaii")
	void CountyOfRecord369() {
		assertEquals("Hawaii", customers.get(368).getCounty());
	}

	@Test
	@DisplayName("Record 369: State is HI")
	void StateOfRecord369() {
		assertEquals("HI", customers.get(368).getState());
	}

	@Test
	@DisplayName("Record 369: ZIP is 96740")
	void ZIPOfRecord369() {
		assertEquals("96740", customers.get(368).getZIP());
	}

	@Test
	@DisplayName("Record 369: Phone is 808-334-5651")
	void PhoneOfRecord369() {
		assertEquals("808-334-5651", customers.get(368).getPhone());
	}

	@Test
	@DisplayName("Record 369: Fax is 808-334-1938")
	void FaxOfRecord369() {
		assertEquals("808-334-1938", customers.get(368).getFax());
	}

	@Test
	@DisplayName("Record 369: Email is lucio@reyome.com")
	void EmailOfRecord369() {
		assertEquals("lucio@reyome.com", customers.get(368).getEmail());
	}

	@Test
	@DisplayName("Record 369: Web is http://www.lucioreyome.com")
	void WebOfRecord369() {
		assertEquals("http://www.lucioreyome.com", customers.get(368).getWeb());
	}
}
