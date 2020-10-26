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

@Tag("43")
class Record_4393 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4393: FirstName is Wilhelmina")
	void FirstNameOfRecord4393() {
		assertEquals("Wilhelmina", customers.get(4392).getFirstName());
	}

	@Test
	@DisplayName("Record 4393: LastName is Pryssler")
	void LastNameOfRecord4393() {
		assertEquals("Pryssler", customers.get(4392).getLastName());
	}

	@Test
	@DisplayName("Record 4393: Company is Travelers Aid Scty Boston Inc")
	void CompanyOfRecord4393() {
		assertEquals("Travelers Aid Scty Boston Inc", customers.get(4392).getCompany());
	}

	@Test
	@DisplayName("Record 4393: Address is 500 Market St")
	void AddressOfRecord4393() {
		assertEquals("500 Market St", customers.get(4392).getAddress());
	}

	@Test
	@DisplayName("Record 4393: City is Perth Amboy")
	void CityOfRecord4393() {
		assertEquals("Perth Amboy", customers.get(4392).getCity());
	}

	@Test
	@DisplayName("Record 4393: County is Middlesex")
	void CountyOfRecord4393() {
		assertEquals("Middlesex", customers.get(4392).getCounty());
	}

	@Test
	@DisplayName("Record 4393: State is NJ")
	void StateOfRecord4393() {
		assertEquals("NJ", customers.get(4392).getState());
	}

	@Test
	@DisplayName("Record 4393: ZIP is 8861")
	void ZIPOfRecord4393() {
		assertEquals("8861", customers.get(4392).getZIP());
	}

	@Test
	@DisplayName("Record 4393: Phone is 732-826-8860")
	void PhoneOfRecord4393() {
		assertEquals("732-826-8860", customers.get(4392).getPhone());
	}

	@Test
	@DisplayName("Record 4393: Fax is 732-826-5164")
	void FaxOfRecord4393() {
		assertEquals("732-826-5164", customers.get(4392).getFax());
	}

	@Test
	@DisplayName("Record 4393: Email is wilhelmina@pryssler.com")
	void EmailOfRecord4393() {
		assertEquals("wilhelmina@pryssler.com", customers.get(4392).getEmail());
	}

	@Test
	@DisplayName("Record 4393: Web is http://www.wilhelminapryssler.com")
	void WebOfRecord4393() {
		assertEquals("http://www.wilhelminapryssler.com", customers.get(4392).getWeb());
	}
}
