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

@Tag("40")
class Record_4733 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4733: FirstName is Cedric")
	void FirstNameOfRecord4733() {
		assertEquals("Cedric", customers.get(4732).getFirstName());
	}

	@Test
	@DisplayName("Record 4733: LastName is Kaufman")
	void LastNameOfRecord4733() {
		assertEquals("Kaufman", customers.get(4732).getLastName());
	}

	@Test
	@DisplayName("Record 4733: Company is Pad Kel Mold")
	void CompanyOfRecord4733() {
		assertEquals("Pad Kel Mold", customers.get(4732).getCompany());
	}

	@Test
	@DisplayName("Record 4733: Address is 1333 Hays St")
	void AddressOfRecord4733() {
		assertEquals("1333 Hays St", customers.get(4732).getAddress());
	}

	@Test
	@DisplayName("Record 4733: City is San Leandro")
	void CityOfRecord4733() {
		assertEquals("San Leandro", customers.get(4732).getCity());
	}

	@Test
	@DisplayName("Record 4733: County is Alameda")
	void CountyOfRecord4733() {
		assertEquals("Alameda", customers.get(4732).getCounty());
	}

	@Test
	@DisplayName("Record 4733: State is CA")
	void StateOfRecord4733() {
		assertEquals("CA", customers.get(4732).getState());
	}

	@Test
	@DisplayName("Record 4733: ZIP is 94577")
	void ZIPOfRecord4733() {
		assertEquals("94577", customers.get(4732).getZIP());
	}

	@Test
	@DisplayName("Record 4733: Phone is 510-357-5344")
	void PhoneOfRecord4733() {
		assertEquals("510-357-5344", customers.get(4732).getPhone());
	}

	@Test
	@DisplayName("Record 4733: Fax is 510-357-1905")
	void FaxOfRecord4733() {
		assertEquals("510-357-1905", customers.get(4732).getFax());
	}

	@Test
	@DisplayName("Record 4733: Email is cedric@kaufman.com")
	void EmailOfRecord4733() {
		assertEquals("cedric@kaufman.com", customers.get(4732).getEmail());
	}

	@Test
	@DisplayName("Record 4733: Web is http://www.cedrickaufman.com")
	void WebOfRecord4733() {
		assertEquals("http://www.cedrickaufman.com", customers.get(4732).getWeb());
	}
}
