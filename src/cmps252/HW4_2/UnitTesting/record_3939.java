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

@Tag("11")
class Record_3939 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3939: FirstName is Jaclyn")
	void FirstNameOfRecord3939() {
		assertEquals("Jaclyn", customers.get(3938).getFirstName());
	}

	@Test
	@DisplayName("Record 3939: LastName is Licause")
	void LastNameOfRecord3939() {
		assertEquals("Licause", customers.get(3938).getLastName());
	}

	@Test
	@DisplayName("Record 3939: Company is Beacon News")
	void CompanyOfRecord3939() {
		assertEquals("Beacon News", customers.get(3938).getCompany());
	}

	@Test
	@DisplayName("Record 3939: Address is 7285 E Stetson Dr  #-e")
	void AddressOfRecord3939() {
		assertEquals("7285 E Stetson Dr  #-e", customers.get(3938).getAddress());
	}

	@Test
	@DisplayName("Record 3939: City is Scottsdale")
	void CityOfRecord3939() {
		assertEquals("Scottsdale", customers.get(3938).getCity());
	}

	@Test
	@DisplayName("Record 3939: County is Maricopa")
	void CountyOfRecord3939() {
		assertEquals("Maricopa", customers.get(3938).getCounty());
	}

	@Test
	@DisplayName("Record 3939: State is AZ")
	void StateOfRecord3939() {
		assertEquals("AZ", customers.get(3938).getState());
	}

	@Test
	@DisplayName("Record 3939: ZIP is 85251")
	void ZIPOfRecord3939() {
		assertEquals("85251", customers.get(3938).getZIP());
	}

	@Test
	@DisplayName("Record 3939: Phone is 480-994-9996")
	void PhoneOfRecord3939() {
		assertEquals("480-994-9996", customers.get(3938).getPhone());
	}

	@Test
	@DisplayName("Record 3939: Fax is 480-994-7434")
	void FaxOfRecord3939() {
		assertEquals("480-994-7434", customers.get(3938).getFax());
	}

	@Test
	@DisplayName("Record 3939: Email is jaclyn@licause.com")
	void EmailOfRecord3939() {
		assertEquals("jaclyn@licause.com", customers.get(3938).getEmail());
	}

	@Test
	@DisplayName("Record 3939: Web is http://www.jaclynlicause.com")
	void WebOfRecord3939() {
		assertEquals("http://www.jaclynlicause.com", customers.get(3938).getWeb());
	}
}
