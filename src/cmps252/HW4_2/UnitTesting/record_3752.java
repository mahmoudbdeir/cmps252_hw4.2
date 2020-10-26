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

@Tag("23")
class Record_3752 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3752: FirstName is Wilford")
	void FirstNameOfRecord3752() {
		assertEquals("Wilford", customers.get(3751).getFirstName());
	}

	@Test
	@DisplayName("Record 3752: LastName is Moder")
	void LastNameOfRecord3752() {
		assertEquals("Moder", customers.get(3751).getLastName());
	}

	@Test
	@DisplayName("Record 3752: Company is A G S")
	void CompanyOfRecord3752() {
		assertEquals("A G S", customers.get(3751).getCompany());
	}

	@Test
	@DisplayName("Record 3752: Address is 234 Bush St")
	void AddressOfRecord3752() {
		assertEquals("234 Bush St", customers.get(3751).getAddress());
	}

	@Test
	@DisplayName("Record 3752: City is San Francisco")
	void CityOfRecord3752() {
		assertEquals("San Francisco", customers.get(3751).getCity());
	}

	@Test
	@DisplayName("Record 3752: County is San Francisco")
	void CountyOfRecord3752() {
		assertEquals("San Francisco", customers.get(3751).getCounty());
	}

	@Test
	@DisplayName("Record 3752: State is CA")
	void StateOfRecord3752() {
		assertEquals("CA", customers.get(3751).getState());
	}

	@Test
	@DisplayName("Record 3752: ZIP is 94104")
	void ZIPOfRecord3752() {
		assertEquals("94104", customers.get(3751).getZIP());
	}

	@Test
	@DisplayName("Record 3752: Phone is 415-391-1418")
	void PhoneOfRecord3752() {
		assertEquals("415-391-1418", customers.get(3751).getPhone());
	}

	@Test
	@DisplayName("Record 3752: Fax is 415-391-1843")
	void FaxOfRecord3752() {
		assertEquals("415-391-1843", customers.get(3751).getFax());
	}

	@Test
	@DisplayName("Record 3752: Email is wilford@moder.com")
	void EmailOfRecord3752() {
		assertEquals("wilford@moder.com", customers.get(3751).getEmail());
	}

	@Test
	@DisplayName("Record 3752: Web is http://www.wilfordmoder.com")
	void WebOfRecord3752() {
		assertEquals("http://www.wilfordmoder.com", customers.get(3751).getWeb());
	}
}
