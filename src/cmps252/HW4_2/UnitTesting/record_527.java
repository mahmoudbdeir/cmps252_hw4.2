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

@Tag("2")
class Record_527 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 527: FirstName is Mabel")
	void FirstNameOfRecord527() {
		assertEquals("Mabel", customers.get(526).getFirstName());
	}

	@Test
	@DisplayName("Record 527: LastName is Muss")
	void LastNameOfRecord527() {
		assertEquals("Muss", customers.get(526).getLastName());
	}

	@Test
	@DisplayName("Record 527: Company is Kownacki, David P Esq")
	void CompanyOfRecord527() {
		assertEquals("Kownacki, David P Esq", customers.get(526).getCompany());
	}

	@Test
	@DisplayName("Record 527: Address is 219 Randolph Rd")
	void AddressOfRecord527() {
		assertEquals("219 Randolph Rd", customers.get(526).getAddress());
	}

	@Test
	@DisplayName("Record 527: City is Scotch Plains")
	void CityOfRecord527() {
		assertEquals("Scotch Plains", customers.get(526).getCity());
	}

	@Test
	@DisplayName("Record 527: County is Union")
	void CountyOfRecord527() {
		assertEquals("Union", customers.get(526).getCounty());
	}

	@Test
	@DisplayName("Record 527: State is NJ")
	void StateOfRecord527() {
		assertEquals("NJ", customers.get(526).getState());
	}

	@Test
	@DisplayName("Record 527: ZIP is 7076")
	void ZIPOfRecord527() {
		assertEquals("7076", customers.get(526).getZIP());
	}

	@Test
	@DisplayName("Record 527: Phone is 908-322-9329")
	void PhoneOfRecord527() {
		assertEquals("908-322-9329", customers.get(526).getPhone());
	}

	@Test
	@DisplayName("Record 527: Fax is 908-322-7883")
	void FaxOfRecord527() {
		assertEquals("908-322-7883", customers.get(526).getFax());
	}

	@Test
	@DisplayName("Record 527: Email is mabel@muss.com")
	void EmailOfRecord527() {
		assertEquals("mabel@muss.com", customers.get(526).getEmail());
	}

	@Test
	@DisplayName("Record 527: Web is http://www.mabelmuss.com")
	void WebOfRecord527() {
		assertEquals("http://www.mabelmuss.com", customers.get(526).getWeb());
	}
}
