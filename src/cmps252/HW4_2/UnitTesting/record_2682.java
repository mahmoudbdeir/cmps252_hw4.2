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

@Tag("22")
class Record_2682 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2682: FirstName is Nanette")
	void FirstNameOfRecord2682() {
		assertEquals("Nanette", customers.get(2681).getFirstName());
	}

	@Test
	@DisplayName("Record 2682: LastName is Spycher")
	void LastNameOfRecord2682() {
		assertEquals("Spycher", customers.get(2681).getLastName());
	}

	@Test
	@DisplayName("Record 2682: Company is Texarkana Machine Inc")
	void CompanyOfRecord2682() {
		assertEquals("Texarkana Machine Inc", customers.get(2681).getCompany());
	}

	@Test
	@DisplayName("Record 2682: Address is 7676 Hazard Center Dr  #-450")
	void AddressOfRecord2682() {
		assertEquals("7676 Hazard Center Dr  #-450", customers.get(2681).getAddress());
	}

	@Test
	@DisplayName("Record 2682: City is San Diego")
	void CityOfRecord2682() {
		assertEquals("San Diego", customers.get(2681).getCity());
	}

	@Test
	@DisplayName("Record 2682: County is San Diego")
	void CountyOfRecord2682() {
		assertEquals("San Diego", customers.get(2681).getCounty());
	}

	@Test
	@DisplayName("Record 2682: State is CA")
	void StateOfRecord2682() {
		assertEquals("CA", customers.get(2681).getState());
	}

	@Test
	@DisplayName("Record 2682: ZIP is 92108")
	void ZIPOfRecord2682() {
		assertEquals("92108", customers.get(2681).getZIP());
	}

	@Test
	@DisplayName("Record 2682: Phone is 619-296-3758")
	void PhoneOfRecord2682() {
		assertEquals("619-296-3758", customers.get(2681).getPhone());
	}

	@Test
	@DisplayName("Record 2682: Fax is 619-296-9249")
	void FaxOfRecord2682() {
		assertEquals("619-296-9249", customers.get(2681).getFax());
	}

	@Test
	@DisplayName("Record 2682: Email is nanette@spycher.com")
	void EmailOfRecord2682() {
		assertEquals("nanette@spycher.com", customers.get(2681).getEmail());
	}

	@Test
	@DisplayName("Record 2682: Web is http://www.nanettespycher.com")
	void WebOfRecord2682() {
		assertEquals("http://www.nanettespycher.com", customers.get(2681).getWeb());
	}
}
